package com.trevansolhaha.create_campanolgy.client.renderer.block;

import com.trevansolhaha.create_campanolgy.client.model.block.BrassBellBlockModel;
import com.trevansolhaha.create_campanolgy.content.bell.BrassBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BrassBellBlockRenderer extends GeoBlockRenderer<BrassBellBlockEntity> {
    public BrassBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new BrassBellBlockModel());
    }
}
