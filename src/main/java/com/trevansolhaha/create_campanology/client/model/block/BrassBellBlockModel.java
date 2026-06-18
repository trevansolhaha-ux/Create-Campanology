package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.BrassBellBlockEntity;
import com.trevansolhaha.create_campanology.util.ModelUtil;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class BrassBellBlockModel extends DefaultedBlockGeoModel<BrassBellBlockEntity> {
    private static final String BASE_MODEL_NAME = "brass_bell";
    public BrassBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, BASE_MODEL_NAME + "_1"));
    }

    @Override
    public ResourceLocation getModelResource(BrassBellBlockEntity animatable) {
        return ModelUtil.getModelResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getTextureResource(BrassBellBlockEntity animatable) {
        return ModelUtil.getTextureResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(BrassBellBlockEntity animatable) {
        return ModelUtil.getAnimationResource(BASE_MODEL_NAME, animatable);
    }
}