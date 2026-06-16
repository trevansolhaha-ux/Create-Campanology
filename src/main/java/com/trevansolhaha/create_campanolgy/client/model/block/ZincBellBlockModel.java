package com.trevansolhaha.create_campanolgy.client.model.block;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import com.trevansolhaha.create_campanolgy.content.bell.ZincBellBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class ZincBellBlockModel extends DefaultedBlockGeoModel<ZincBellBlockEntity> {
    public ZincBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "zinc_bell_1"));
    }
}
