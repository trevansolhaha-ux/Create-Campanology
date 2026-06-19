package com.trevansolhaha.create_campanology.util;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlock;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlockEntity;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBellSizes;
import net.minecraft.resources.ResourceLocation;

public class ModelUtil {
    public static ResourceLocation getModelResource(String name, ModBaseBellBlockEntity animatable) {
            ModBellSizes size = animatable.getLevel() != null
                    ? animatable.getBlockState().getValue(ModBaseBellBlock.SIZE)
                    : ModBellSizes.SMALL;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "geo/block/" + name + "_" + (size.getId() + 1) + ".geo.json");
    }

    public static ResourceLocation getTextureResource(String name, ModBaseBellBlockEntity animatable) {
        ModBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseBellBlock.SIZE)
                : ModBellSizes.SMALL;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "textures/block/" + name + "_" + (size.getId() + 1) + ".png");
    }

    public static ResourceLocation getAnimationResource(String name, ModBaseBellBlockEntity animatable) {
        ModBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseBellBlock.SIZE)
                : ModBellSizes.SMALL;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "animations/block/" + name + "_" + (size.getId() + 1) + ".animation.json");
    }
}
