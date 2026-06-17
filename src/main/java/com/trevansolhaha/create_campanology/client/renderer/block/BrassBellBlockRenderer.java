package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.BrassBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.BrassBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BrassBellBlockRenderer extends GeoBlockRenderer<BrassBellBlockEntity> {
    public BrassBellBlockRenderer(BlockEntityRendererProvider.Context context, String name) {
        super(new BrassBellBlockModel(name));
    }
}