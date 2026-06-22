package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseMediumBellBlockEntity;
import com.trevansolhaha.create_campanology.util.ModelUtil;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class ModMediumBellBlockModel extends DefaultedBlockGeoModel<ModBaseMediumBellBlockEntity> {
    private final String baseModelName;
    public ModMediumBellBlockModel(String baseModelName) {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, baseModelName));
        this.baseModelName = baseModelName;
    }

    @Override
    public ResourceLocation getModelResource(ModBaseMediumBellBlockEntity animatable) {
        return ModelUtil.getMediumBellModelResource(baseModelName, animatable);
    }

    @Override
    public ResourceLocation getTextureResource(ModBaseMediumBellBlockEntity animatable) {
        return ModelUtil.getMediumBellTextureResource(baseModelName, animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(ModBaseMediumBellBlockEntity animatable) {
        return ModelUtil.getMediumBellAnimationResource(baseModelName, animatable);
    }
}
