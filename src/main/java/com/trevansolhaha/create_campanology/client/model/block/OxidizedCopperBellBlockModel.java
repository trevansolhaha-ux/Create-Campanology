package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.OxidizedCopperBellBlockEntity;
import com.trevansolhaha.create_campanology.util.ModelUtil;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class OxidizedCopperBellBlockModel extends DefaultedBlockGeoModel<OxidizedCopperBellBlockEntity> {
    private static final String BASE_MODEL_NAME = "oxidized_copper_bell";
    public OxidizedCopperBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, BASE_MODEL_NAME + "_1"));
    }

    @Override
    public ResourceLocation getModelResource(OxidizedCopperBellBlockEntity animatable) {
        return ModelUtil.getModelResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getTextureResource(OxidizedCopperBellBlockEntity animatable) {
        return ModelUtil.getTextureResource(BASE_MODEL_NAME, animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(OxidizedCopperBellBlockEntity animatable) {
        return ModelUtil.getAnimationResource(BASE_MODEL_NAME, animatable);
    }
}
