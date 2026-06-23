package com.trevansolhaha.create_campanology.util;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.generic.*;
import net.minecraft.resources.ResourceLocation;

public class ModelUtil {

    public static ResourceLocation getSmallBellModelResource(String name, ModBaseBellBlockEntity animatable) {
        ModBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseBellBlock.SIZE)
                : ModBellSizes.SMALL;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "geo/block/" + name + "_" + (size.getId() + 1) + ".geo.json");
    }

    public static ResourceLocation getSmallBellTextureResource(String name, ModBaseBellBlockEntity animatable) {
        ModBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseBellBlock.SIZE)
                : ModBellSizes.SMALL;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "textures/block/" + name + "_" + (size.getId() + 1) + ".png");
    }

    public static ResourceLocation getSmallBellAnimationResource(String name, ModBaseBellBlockEntity animatable) {
        ModBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseBellBlock.SIZE)
                : ModBellSizes.SMALL;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "animations/block/" + name + "_" + (size.getId() + 1) + ".animation.json");
    }

    public static ResourceLocation getMediumBellModelResource(String name, ModBaseMediumBellBlockEntity animatable) {
        ModMediumBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseMediumBellBlock.SIZE)
                : ModMediumBellSizes.ONE;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "geo/block/" + name + "_" + (size.getId() + 1) + ".geo.json");
    }

    public static ResourceLocation getMediumBellTextureResource(String name, ModBaseMediumBellBlockEntity animatable) {
        ModMediumBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseMediumBellBlock.SIZE)
                : ModMediumBellSizes.ONE;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "textures/block/" + name + "_" + (size.getId() + 1) + ".png");
    }

    public static ResourceLocation getMediumBellAnimationResource(String name, ModBaseMediumBellBlockEntity animatable) {
        ModMediumBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseMediumBellBlock.SIZE)
                : ModMediumBellSizes.ONE;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "animations/block/" + name + "_" + (size.getId() + 1) + ".animation.json");
    }

    public static ResourceLocation getLargeBellModelResource(String name, ModBaseLargeBlockEntity animatable) {
        ModLargeBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseLargeBellBlock.SIZE)
                : ModLargeBellSizes.ONE;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "geo/block/" + name + "_" + (size.getId() + 1) + ".geo.json");
    }

    public static ResourceLocation getLargeBellTextureResource(String name, ModBaseLargeBlockEntity animatable) {
        ModLargeBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseLargeBellBlock.SIZE)
                : ModLargeBellSizes.ONE;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "textures/block/" + name + "_" + (size.getId() + 1) + ".png");
    }

    public static ResourceLocation getLargeBellAnimationResource(String name, ModBaseLargeBlockEntity animatable) {
        ModLargeBellSizes size = animatable.getLevel() != null
                ? animatable.getBlockState().getValue(ModBaseLargeBellBlock.SIZE)
                : ModLargeBellSizes.ONE;
        return ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "animations/block/" + name + "_" + (size.getId() + 1) + ".animation.json");
    }
}
