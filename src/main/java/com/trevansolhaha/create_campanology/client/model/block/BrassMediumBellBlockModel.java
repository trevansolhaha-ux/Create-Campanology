package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.medium.BrassMediumBellBlockEntity;
import com.trevansolhaha.create_campanology.util.ModelUtil;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class BrassMediumBellBlockModel extends DefaultedBlockGeoModel<BrassMediumBellBlockEntity> {
    private static final String BASE_MODEL_NAME = "brass_bell_2";
    public BrassMediumBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, BASE_MODEL_NAME + "_1"));
    }

    @Override
    public ResourceLocation getModelResource(BrassMediumBellBlockEntity animatable) {
        return ModelUtil.getMediumBellModelResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getTextureResource(BrassMediumBellBlockEntity animatable) {
        return ModelUtil.getMediumBellTextureResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(BrassMediumBellBlockEntity animatable) {
        return ModelUtil.getMediumBellAnimationResource(BASE_MODEL_NAME, animatable);
    }
}
