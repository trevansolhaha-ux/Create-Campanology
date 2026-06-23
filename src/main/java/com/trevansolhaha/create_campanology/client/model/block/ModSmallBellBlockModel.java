package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlockEntity;
import com.trevansolhaha.create_campanology.util.ModelUtil;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class ModSmallBellBlockModel extends DefaultedBlockGeoModel<ModBaseBellBlockEntity> {
    private final String baseModelName;
    public ModSmallBellBlockModel(String baseModelName) {
         super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, baseModelName));
            this.baseModelName = baseModelName;
    }

    @Override
    public ResourceLocation getModelResource(ModBaseBellBlockEntity animatable) {
        return ModelUtil.getSmallBellModelResource(this.baseModelName, animatable);
    }

    @Override
    public ResourceLocation getTextureResource(ModBaseBellBlockEntity animatable) {
        return ModelUtil.getSmallBellTextureResource(this.baseModelName, animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(ModBaseBellBlockEntity animatable) {
        return ModelUtil.getSmallBellAnimationResource(this.baseModelName, animatable);
    }
}
