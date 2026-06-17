package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.BrassBellBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class BrassBellBlockModel extends DefaultedBlockGeoModel<BrassBellBlockEntity> {
    public BrassBellBlockModel(String name) {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, name));
    }
}