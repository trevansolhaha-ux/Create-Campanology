package com.trevansolhaha.create_campanolgy.client.model.block;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import com.trevansolhaha.create_campanolgy.content.bell.BronzeBellBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class BronzeBellBlockModel extends DefaultedBlockGeoModel<BronzeBellBlockEntity> {
    public BronzeBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "bronze_bell_1"));
    }
}
