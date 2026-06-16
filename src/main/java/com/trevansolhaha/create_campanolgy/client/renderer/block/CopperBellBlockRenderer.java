package com.trevansolhaha.create_campanolgy.client.renderer.block;

import com.trevansolhaha.create_campanolgy.client.model.block.CopperBellBlockModel;
import com.trevansolhaha.create_campanolgy.content.bell.CopperBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class CopperBellBlockRenderer extends GeoBlockRenderer<CopperBellBlockEntity> {
    public CopperBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new CopperBellBlockModel());
    }
}
