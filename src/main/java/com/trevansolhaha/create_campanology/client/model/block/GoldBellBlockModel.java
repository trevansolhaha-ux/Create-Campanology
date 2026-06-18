package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.GoldBellBlockEntity;
import com.trevansolhaha.create_campanology.util.ModelUtil;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class GoldBellBlockModel extends DefaultedBlockGeoModel<GoldBellBlockEntity> {
    private static final String BASE_MODEL_NAME = "gold_bell";
    public GoldBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, BASE_MODEL_NAME + "_1"));
    }

    @Override
    public ResourceLocation getModelResource(GoldBellBlockEntity animatable) {
        return ModelUtil.getModelResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getTextureResource(GoldBellBlockEntity animatable) {
        return ModelUtil.getTextureResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(GoldBellBlockEntity animatable) {
        return ModelUtil.getAnimationResource(BASE_MODEL_NAME, animatable);
    }
}
