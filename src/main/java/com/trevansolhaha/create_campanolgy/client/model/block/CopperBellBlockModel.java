package com.trevansolhaha.create_campanolgy.client.model.block;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import com.trevansolhaha.create_campanolgy.content.bell.CopperBellBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class CopperBellBlockModel extends DefaultedBlockGeoModel<CopperBellBlockEntity> {
    public CopperBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "copper_bell_1"));
    }
}
