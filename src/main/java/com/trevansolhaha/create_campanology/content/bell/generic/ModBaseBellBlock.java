package com.trevansolhaha.create_campanology.content.bell.generic;

import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class ModBaseBellBlock extends Block implements IWrenchable, EntityBlock {
    public ModBaseBellBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    /**
     * Determines whether an explosion occurred in front of or behind the block,
     * relative to the direction the block is currently facing.
     * <p>
     * This ignores the vertical (Y) axis and uses a 2D horizontal dot product.
     * If the explosion occurs exactly on the sides (perpendicular to the facing direction),
     * it defaults to returning the front direction.
     * </p>
     *
     * @param explosion       The explosion object triggering this check (e.g., a wind charge).
     * @param blockPos        The position of this block in the world.
     * @param facing          The direction the block is facing (e.g., North, South, East, West).
     * @return {@code facing} if the explosion was in the front hemisphere or dead-center sides;
     * {@code facing.getOpposite()} if it was in the rear hemisphere.
     */
    protected Direction getExplosionSourceDirection(Explosion explosion, BlockPos blockPos, Direction facing) {
        Vec3 explosionCenter = explosion.center();
        Vec3 blockCenter = Vec3.atCenterOf(blockPos);

        // Calculate the relative horizontal relationship between the explosion and the block
        double dotProduct = getDotProduct(facing, explosionCenter, blockCenter);

        if (dotProduct >= 0) {
            // The explosion came from the front hemisphere (or exactly dead-center sides)
            return facing;
        } else {
            // The explosion came from the rear hemisphere
            return facing.getOpposite();
        }
    }

    /**
     * Calculates the 2D horizontal dot product between the block's facing direction vector
     * and the directional vector pointing from the block center to the explosion center.
     *
     * @param facing          The direction the block is facing.
     * @param explosionCenter The coordinates of the explosion center.
     * @param blockCenter     The coordinates of the block center.
     * @return A positive value if the explosion is in front of the block,
     * a negative value if behind, or zero if perfectly perpendicular.
     */
    private static double getDotProduct(Direction facing, Vec3 explosionCenter, Vec3 blockCenter) {
        // Get the horizontal offset from the block to the explosion
        double dx = explosionCenter.x - blockCenter.x;
        double dz = explosionCenter.z - blockCenter.z;

        // Convert the block's facing direction into step values (e.g., North is dx=0, dz=-1)
        int stepX = facing.getStepX();
        int stepZ = facing.getStepZ();

        // Calculate the dot product along the horizontal plane (X and Z axes)
        return (dx * stepX) + (dz * stepZ);
    }
}
