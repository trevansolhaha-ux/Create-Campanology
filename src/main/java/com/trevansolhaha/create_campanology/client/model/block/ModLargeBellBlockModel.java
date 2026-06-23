package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseLargeBlockEntity;
import com.trevansolhaha.create_campanology.util.ModelUtil;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class ModLargeBellBlockModel extends DefaultedBlockGeoModel<ModBaseLargeBlockEntity> {
    private final String baseModelName;
    public ModLargeBellBlockModel(String baseModelName) {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, baseModelName));
        this.baseModelName = baseModelName;
    }

    @Override
    public ResourceLocation getModelResource(ModBaseLargeBlockEntity animatable) {
        return ModelUtil.getLargeBellModelResource(baseModelName, animatable);
    }

    @Override
    public ResourceLocation getTextureResource(ModBaseLargeBlockEntity animatable) {
        return ModelUtil.getLargeBellTextureResource(baseModelName, animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(ModBaseLargeBlockEntity animatable) {
        return ModelUtil.getLargeBellAnimationResource(baseModelName, animatable);
    }
}
