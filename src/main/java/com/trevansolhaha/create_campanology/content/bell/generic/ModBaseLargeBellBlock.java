package com.trevansolhaha.create_campanology.content.bell.generic;

import com.simibubi.create.content.equipment.wrench.IWrenchable;
import com.trevansolhaha.create_campanology.component.LargeBellSizeComponent;
import com.trevansolhaha.create_campanology.init.ModDataComponents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import org.jetbrains.annotations.Nullable;

public class ModBaseLargeBellBlock extends Block implements AbstractBellBlock, IWrenchable, EntityBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<ModLargeBellSizes> SIZE = EnumProperty.create("size", ModLargeBellSizes.class);
    public ModBaseLargeBellBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SIZE, ModLargeBellSizes.ONE));
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
        ModLargeBellSizes size = context.getItemInHand().getOrDefault(ModDataComponents.LARGE_BELL_SIZE, LargeBellSizeComponent.getDefaultValue()).getSize();
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(SIZE, size);
    }

    // ==========================================
    // Beggining of the logic of the wrench
    // ==========================================
    @Override
    public InteractionResult onWrenched(BlockState state, UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        ModLargeBellSizes nextSize = ModLargeBellSizes.getNextSize(state.getValue(SIZE));

        if (nextSize != state.getValue(SIZE) && !level.isClientSide()) {
            BlockState newState = state.setValue(SIZE, nextSize);
            level.setBlock(pos, newState, 3);
            level.blockUpdated(pos, this);

            level.playSound(null, pos, SoundEvents.ANVIL_HIT, SoundSource.BLOCKS, 0.5f, 0.5f + nextSize.getPitchModifier());
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    private static <T extends Comparable<T>> BlockState copyProperty(BlockState from, BlockState to, Property<T> property) {
        return to.setValue(property, from.getValue(property));
    }

    // ==========================================
    // End of the wrench logic
    // ==========================================

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, SIZE);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    protected void playBellSound(Level level, BlockPos pos, ModLargeBellSizes size, SoundEvent soundEvent) {
        float pitch = 0.5f + size.getPitchModifier();
        level.playSound(null, pos, soundEvent, SoundSource.BLOCKS, 1.0f, pitch);
    }
}
