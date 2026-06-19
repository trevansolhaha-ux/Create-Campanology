package com.trevansolhaha.create_campanology.init;

import com.trevansolhaha.create_campanology.content.bell.generic.ModBellSizes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.EnumMap;
import java.util.Map;

public class ModShapes {

    public static final Map<ModBellSizes, VoxelShape> COPPER_BELL_1 = new EnumMap<>(ModBellSizes.class);
    public static final Map<ModBellSizes, VoxelShape> OXIDIZED_COPPER_BELL_1 = new EnumMap<>(ModBellSizes.class);
    public static final Map<ModBellSizes, VoxelShape> IRON_BELL_1 = new EnumMap<>(ModBellSizes.class);
    public static final Map<ModBellSizes, VoxelShape> BRONZE_BELL_1 = new EnumMap<>(ModBellSizes.class);
    public static final Map<ModBellSizes, VoxelShape> BRASS_BELL_1 = new EnumMap<>(ModBellSizes.class);
    public static final Map<ModBellSizes, VoxelShape> GOLD_BELL_1 = new EnumMap<>(ModBellSizes.class);
    public static final Map<ModBellSizes, VoxelShape> ZINC_BELL_1 = new EnumMap<>(ModBellSizes.class);
    public static final Map<ModBellSizes, VoxelShape> ANDESITE_ALLOY_BELL_1 = new EnumMap<>(ModBellSizes.class);

    static {
        COPPER_BELL_1.put(ModBellSizes.SMALL,  box(4, 5, 4, 12, 16, 12)); // TODO: finish medium and large shapes
        COPPER_BELL_1.put(ModBellSizes.MEDIUM, box(4, 5, 4, 12, 16, 12));
        COPPER_BELL_1.put(ModBellSizes.LARGE,  box(4, 5, 4, 12, 16, 12));

        OXIDIZED_COPPER_BELL_1.put(ModBellSizes.SMALL,  box(5, 3, 5, 11, 16, 11)); // TODO: finish medium and large shapes
        OXIDIZED_COPPER_BELL_1.put(ModBellSizes.MEDIUM, box(5, 3, 5, 11, 16, 11));
        OXIDIZED_COPPER_BELL_1.put(ModBellSizes.LARGE,  box(5, 3, 5, 11, 16, 11));

        IRON_BELL_1.put(ModBellSizes.SMALL,  box(5, 4, 5, 11, 16, 11)); // TODO: finish medium and large shapes
        IRON_BELL_1.put(ModBellSizes.MEDIUM, box(5, 4, 5, 11, 16, 11));
        IRON_BELL_1.put(ModBellSizes.LARGE,  box(5, 4, 5, 11, 16, 11));

        BRONZE_BELL_1.put(ModBellSizes.SMALL,  box(4, 5, 4, 12, 16, 12)); // TODO: finish medium and large shapes
        BRONZE_BELL_1.put(ModBellSizes.MEDIUM, box(4, 5, 4, 12, 16, 12));
        BRONZE_BELL_1.put(ModBellSizes.LARGE,  box(4, 5, 4, 12, 16, 12));

        BRASS_BELL_1.put(ModBellSizes.SMALL,  box(4, 6, 4, 12, 16, 12));
        BRASS_BELL_1.put(ModBellSizes.MEDIUM, box(3, 3, 3, 13, 14, 13));
        BRASS_BELL_1.put(ModBellSizes.LARGE,  box(2, 2, 2, 14, 14, 14));

        GOLD_BELL_1.put(ModBellSizes.SMALL,  box(6, 4, 6, 10, 16, 10)); // TODO: finish medium and large shapes
        GOLD_BELL_1.put(ModBellSizes.MEDIUM, box(6, 4, 6, 10, 16, 10));
        GOLD_BELL_1.put(ModBellSizes.LARGE,  box(6, 4, 6, 10, 16, 10));

        ZINC_BELL_1.put(ModBellSizes.SMALL,  box(4, 5, 4, 12, 16, 12)); // TODO: finish medium and large shapes
        ZINC_BELL_1.put(ModBellSizes.MEDIUM, box(4, 5, 4, 12, 16, 12));
        ZINC_BELL_1.put(ModBellSizes.LARGE,  box(4, 5, 4, 12, 16, 12));

        ANDESITE_ALLOY_BELL_1.put(ModBellSizes.SMALL,  box(4, 5, 4, 12, 16, 12)); // TODO: finish medium and large shapes
        ANDESITE_ALLOY_BELL_1.put(ModBellSizes.MEDIUM, box(4, 5, 4, 12, 16, 12));
        ANDESITE_ALLOY_BELL_1.put(ModBellSizes.LARGE,  box(4, 5, 4, 12, 16, 12));
    }

    private static VoxelShape box(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Block.box(x1, y1, z1, x2, y2, z2);
    }
}
