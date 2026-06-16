package com.trevansolhaha.create_campanolgy.client.model.block;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import com.trevansolhaha.create_campanolgy.content.bell.OxidizedCopperBellBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class OxidizedCopperBellBlockModel extends DefaultedBlockGeoModel<OxidizedCopperBellBlockEntity> {
    public OxidizedCopperBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "oxidized_copper_bell_1"));
    }
}
