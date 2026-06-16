package com.trevansolhaha.create_campanolgy.client.model.block;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import com.trevansolhaha.create_campanolgy.content.bell.IronBellBlockEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class IronBellBlockModel extends DefaultedBlockGeoModel<IronBellBlockEntity> {
    public IronBellBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "iron_bell_1"));
    }
}
