package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.IronBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.IronBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class IronBellBlockRenderer extends GeoBlockRenderer<IronBellBlockEntity> {
    public IronBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new IronBellBlockModel());
    }
}
