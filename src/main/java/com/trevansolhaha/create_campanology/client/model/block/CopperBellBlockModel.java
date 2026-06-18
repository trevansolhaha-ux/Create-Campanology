package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.CopperBellBlockEntity;
import com.trevansolhaha.create_campanology.util.ModelUtil;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class CopperBellBlockModel extends DefaultedBlockGeoModel<CopperBellBlockEntity> {
    private static final String BASE_MODEL_NAME = "copper_bell";
    public CopperBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, BASE_MODEL_NAME + "_1"));
    }

    @Override
    public ResourceLocation getModelResource(CopperBellBlockEntity animatable) {
        return ModelUtil.getModelResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getTextureResource(CopperBellBlockEntity animatable) {
        return ModelUtil.getTextureResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(CopperBellBlockEntity animatable) {
        return ModelUtil.getAnimationResource(BASE_MODEL_NAME, animatable);
    }
}
