package com.trevansolhaha.create_campanology.content.bell;

import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlock;
import com.trevansolhaha.create_campanology.init.ModBlockEntities;
import com.trevansolhaha.create_campanology.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;

public class GoldBellBlock extends ModBaseBellBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    protected static final VoxelShape SHAPE = Block.box(6.0D, 4.0D, 6.0D, 10.0D, 16.0D, 10.0D);

    public GoldBellBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockPosAbove = pos.above();
        BlockState stateAbove = level.getBlockState(blockPosAbove);
        return stateAbove.isFaceSturdy(level, blockPosAbove, Direction.DOWN);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, net.minecraft.world.level.LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (!state.canSurvive(level, pos)) {
            return net.minecraft.world.level.block.Blocks.AIR.defaultBlockState();
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

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
    public net.minecraft.world.item.ItemStack getCloneItemStack(BlockState state, net.minecraft.world.phys.HitResult target, net.minecraft.world.level.LevelReader level, BlockPos pos, Player player) {
        return new net.minecraft.world.item.ItemStack(ModItems.GOLD_BELL_1.get());
    }

    @Override
    protected void createBlockStateDefinition(net.minecraft.world.level.block.state.StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return ModBlockEntities.GOLD_BELL_1.get().create(blockPos, blockState);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            Direction clickedFace = hitResult.getDirection();
            Direction bellFacing = state.getValue(FACING);

            net.minecraft.world.level.block.entity.BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof GoldBellBlockEntity goldBell) {
                if (clickedFace == bellFacing) {
                    goldBell.triggerAnim("click_controller", "trigger_click_front");
                } else if (clickedFace == bellFacing.getOpposite()) {
                    goldBell.triggerAnim("click_controller", "trigger_click_back");
                }
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected void onExplosionHit(BlockState blockState, Level level, BlockPos blockPos, Explosion explosion, BiConsumer<ItemStack, BlockPos> biConsumer) {
        if (explosion.canTriggerBlocks() && !level.isClientSide()) {
            if (!blockState.hasProperty(FACING)) return;

            Direction bellFacing = level.getBlockState(blockPos).getValue(FACING);
            Direction explosionSourceDirection = getExplosionSourceDirection(explosion, blockPos, bellFacing);

            BlockEntity blockEntity = level.getBlockEntity(blockPos);
            if (blockEntity instanceof GoldBellBlockEntity goldBell) {
                if (explosionSourceDirection == bellFacing) {
                    goldBell.triggerAnim("click_controller", "trigger_click_front");
                } else {// If it's not front (including sides defaulting to back), play back
                    goldBell.triggerAnim("click_controller", "trigger_click_back");
                }
            }
        }
    }
}
