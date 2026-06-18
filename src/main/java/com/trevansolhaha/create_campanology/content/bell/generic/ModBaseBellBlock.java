package com.trevansolhaha.create_campanology.content.bell.generic;

import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class ModBaseBellBlock extends Block implements IWrenchable, EntityBlock {
    public ModBaseBellBlock(Properties properties) {
        super(properties);
    }

    // ==========================================
    // Beggining of the logic of the wrench
    // ==========================================
    @Override
    public InteractionResult onWrenched(BlockState state, UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Block nextBell = getNextBellVariant();

        if (nextBell != null && nextBell != this) {
            if (!level.isClientSide) {
                BlockState newState = nextBell.defaultBlockState();

                if (state.hasProperty(net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING)) {
                    newState = newState.setValue(net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING,
                            state.getValue(net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING));
                }
                level.removeBlockEntity(pos);
                level.setBlock(pos, newState, 3);
                level.blockUpdated(pos, nextBell);

                level.playSound(null, pos, net.minecraft.sounds.SoundEvents.ANVIL_HIT, net.minecraft.sounds.SoundSource.BLOCKS, 0.5f, 1.5f);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    public Block getNextBellVariant() {
        return this;
    }

    private static <T extends Comparable<T>> BlockState copyProperty(BlockState from, BlockState to, Property<T> property) {
        return to.setValue(property, from.getValue(property));
    }

    // ==========================================
    // End of the wrench logic
    // ==========================================


    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    protected Direction getExplosionSourceDirection(Explosion explosion, BlockPos blockPos, Direction facing) {
        Vec3 explosionCenter = explosion.center();
        Vec3 blockCenter = Vec3.atCenterOf(blockPos);
        double dotProduct = getDotProduct(facing, explosionCenter, blockCenter);

        if (dotProduct >= 0) {
            return facing;
        } else {
            return facing.getOpposite();
        }
    }

    private static double getDotProduct(Direction facing, Vec3 explosionCenter, Vec3 blockCenter) {
        double dx = explosionCenter.x - blockCenter.x;
        double dz = explosionCenter.z - blockCenter.z;
        int stepX = facing.getStepX();
        int stepZ = facing.getStepZ();
        return (dx * stepX) + (dz * stepZ);
    }
}