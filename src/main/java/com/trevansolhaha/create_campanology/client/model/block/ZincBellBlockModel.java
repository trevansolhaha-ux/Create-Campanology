package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.ZincBellBlockEntity;
import com.trevansolhaha.create_campanology.util.ModelUtil;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class ZincBellBlockModel extends DefaultedBlockGeoModel<ZincBellBlockEntity> {
    private static final String BASE_MODEL_NAME = "zinc_bell";
    public ZincBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, BASE_MODEL_NAME + "_1"));
    }

    @Override
    public ResourceLocation getModelResource(ZincBellBlockEntity animatable) {
        return ModelUtil.getModelResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getTextureResource(ZincBellBlockEntity animatable) {
        return ModelUtil.getTextureResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(ZincBellBlockEntity animatable) {
        return ModelUtil.getAnimationResource(BASE_MODEL_NAME, animatable);
    }
}
