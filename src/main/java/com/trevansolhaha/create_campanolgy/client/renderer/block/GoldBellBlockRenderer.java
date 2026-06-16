package com.trevansolhaha.create_campanolgy.client.renderer.block;

import com.trevansolhaha.create_campanolgy.client.model.block.GoldBellBlockModel;
import com.trevansolhaha.create_campanolgy.content.bell.GoldBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class GoldBellBlockRenderer extends GeoBlockRenderer<GoldBellBlockEntity> {
    public GoldBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new GoldBellBlockModel());
    }
}
