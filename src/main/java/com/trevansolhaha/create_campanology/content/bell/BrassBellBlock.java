package com.trevansolhaha.create_campanology.content.bell;

import com.simibubi.create.content.equipment.wrench.WrenchItem;
import com.trevansolhaha.create_campanology.block.ModBlocks;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class BrassBellBlock extends ModBaseBellBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    private final Supplier<? extends BlockEntityType<?>> blockEntityType;
    private final Supplier<? extends Item> cloneItem;
    private final VoxelShape shape;

    public BrassBellBlock(Properties properties,
                          Supplier<? extends BlockEntityType<?>> blockEntityType,
                          Supplier<? extends Item> cloneItem,
                          VoxelShape shape) {
        super(properties);
        this.blockEntityType = blockEntityType;
        this.cloneItem = cloneItem;
        this.shape = shape;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    //Allows the bell to survive hanging in a chain or on a solid block
    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockPosAbove = pos.above();
        BlockState stateAbove = level.getBlockState(blockPosAbove);
        if (stateAbove.is(Blocks.CHAIN)) {
            return true;
        }
        return stateAbove.isFaceSturdy(level, blockPosAbove, Direction.DOWN);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (!state.canSurvive(level, pos)) {
            return Blocks.AIR.defaultBlockState();
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    //for the facing of the bells
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        if (!this.canSurvive(this.defaultBlockState(), level, pos)) {
            return null;
        }
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
        return new ItemStack(cloneItem.get());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return blockEntityType.get().create(blockPos, blockState);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return shape;
    }

    // for the wrench features
    @Override
    public InteractionResult onWrenched(BlockState state, UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();

        if (!level.isClientSide) {
            Block nextBell = Blocks.AIR;
            if (this == ModBlocks.BRASS_BELL_1.get()) {
                nextBell = ModBlocks.BRASS_BELL_2.get();
            } else if (this == ModBlocks.BRASS_BELL_2.get()) {
                nextBell = ModBlocks.BRASS_BELL_3.get();
            } else if (this == ModBlocks.BRASS_BELL_3.get()) {
                nextBell = ModBlocks.BRASS_BELL_1.get();
            }
            if (nextBell == Blocks.AIR) {
                return InteractionResult.PASS;
            }
            BlockState newState = nextBell.defaultBlockState();
            if (state.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) {
                newState = newState.setValue(BlockStateProperties.HORIZONTAL_FACING,
                        state.getValue(BlockStateProperties.HORIZONTAL_FACING));
            }
            level.removeBlockEntity(pos);
            level.setBlock(pos, newState, 3);
            level.blockUpdated(pos, nextBell);
            level.playSound(null, pos, SoundEvents.ANVIL_HIT, SoundSource.BLOCKS, 0.5f, 1.5f);
        }
        return InteractionResult.SUCCESS;
    }


    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {

        if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof WrenchItem ||
                player.getItemInHand(InteractionHand.OFF_HAND).getItem() instanceof WrenchItem) {
            return InteractionResult.PASS;
        }

        BlockEntity blockEntity = level.getBlockEntity(pos);

        if (blockEntity instanceof BrassBellBlockEntity brassBell) {
            Direction clickedFace = hitResult.getDirection();
            Direction bellFacing = state.getValue(FACING);

            brassBell.triggerBellAnimation(clickedFace, bellFacing);

            return InteractionResult.sidedSuccess(level.isClientSide());
        }
        return InteractionResult.SUCCESS;
    }

    //for the animation features (explosion)
    @Override
    protected void onExplosionHit(BlockState blockState, Level level, BlockPos blockPos, Explosion explosion, BiConsumer<ItemStack, BlockPos> biConsumer) {
        if (explosion.canTriggerBlocks() && !level.isClientSide()) {
            if (!blockState.hasProperty(FACING)) return;

            Direction bellFacing = level.getBlockState(blockPos).getValue(FACING);
            Direction explosionSourceDirection = getExplosionSourceDirection(explosion, blockPos, bellFacing);

            BlockEntity blockEntity = level.getBlockEntity(blockPos);
            if (blockEntity instanceof BrassBellBlockEntity brassBell) {
                if (explosionSourceDirection == bellFacing) {
                    brassBell.triggerAnim("click_controller", "trigger_click_front");
                } else {
                    brassBell.triggerAnim("click_controller", "trigger_click_back");
                }
            }
        }
    }
}