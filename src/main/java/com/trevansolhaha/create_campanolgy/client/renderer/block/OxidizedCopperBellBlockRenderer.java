package com.trevansolhaha.create_campanolgy.client.renderer.block;

import com.trevansolhaha.create_campanolgy.client.model.block.OxidizedCopperBellBlockModel;
import com.trevansolhaha.create_campanolgy.content.bell.OxidizedCopperBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class OxidizedCopperBellBlockRenderer extends GeoBlockRenderer<OxidizedCopperBellBlockEntity> {
    public OxidizedCopperBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new OxidizedCopperBellBlockModel());
    }
}
