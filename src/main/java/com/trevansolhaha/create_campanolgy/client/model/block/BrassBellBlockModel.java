package com.trevansolhaha.create_campanolgy.client.model.block;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import com.trevansolhaha.create_campanolgy.content.bell.BrassBellBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class BrassBellBlockModel extends DefaultedBlockGeoModel<BrassBellBlockEntity> {
    public BrassBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "brass_bell_1"));
    }
}
