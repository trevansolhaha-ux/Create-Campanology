package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.ZincBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.ZincBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ZincBellBlockRenderer extends GeoBlockRenderer<ZincBellBlockEntity> {
    public ZincBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ZincBellBlockModel());
    }
}
