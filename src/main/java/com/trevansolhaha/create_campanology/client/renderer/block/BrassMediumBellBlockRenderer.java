package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.BrassMediumBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.medium.BrassMediumBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BrassMediumBellBlockRenderer extends GeoBlockRenderer<BrassMediumBellBlockEntity> {
    public BrassMediumBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new BrassMediumBellBlockModel());
    }
}
