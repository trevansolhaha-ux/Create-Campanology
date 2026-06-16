package com.trevansolhaha.create_campanology.client.model.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.OxidizedCopperBellBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class OxidizedCopperBellBlockModel extends DefaultedBlockGeoModel<OxidizedCopperBellBlockEntity> {
    public OxidizedCopperBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "oxidized_copper_bell_1"));
    }
}
