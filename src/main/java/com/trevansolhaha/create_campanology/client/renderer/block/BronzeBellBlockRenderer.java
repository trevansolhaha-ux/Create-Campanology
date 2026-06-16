package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.BronzeBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.BronzeBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BronzeBellBlockRenderer extends GeoBlockRenderer<BronzeBellBlockEntity> {
    public BronzeBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new BronzeBellBlockModel());
    }
}
