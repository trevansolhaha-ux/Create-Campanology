package com.trevansolhaha.create_campanology.content.bell.generic;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.phys.Vec3;

public interface AbstractBellBlock {
    default Direction getExplosionSourceDirection(Explosion explosion, BlockPos blockPos, Direction facing) {
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
