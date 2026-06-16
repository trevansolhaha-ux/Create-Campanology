package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.GoldBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.GoldBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class GoldBellBlockRenderer extends GeoBlockRenderer<GoldBellBlockEntity> {
    public GoldBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new GoldBellBlockModel());
    }
}
