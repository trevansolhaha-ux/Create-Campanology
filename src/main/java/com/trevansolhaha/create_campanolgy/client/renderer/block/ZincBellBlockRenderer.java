package com.trevansolhaha.create_campanolgy.client.renderer.block;

import com.trevansolhaha.create_campanolgy.client.model.block.ZincBellBlockModel;
import com.trevansolhaha.create_campanolgy.content.bell.ZincBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ZincBellBlockRenderer extends GeoBlockRenderer<ZincBellBlockEntity> {
    public ZincBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ZincBellBlockModel());
    }
}
