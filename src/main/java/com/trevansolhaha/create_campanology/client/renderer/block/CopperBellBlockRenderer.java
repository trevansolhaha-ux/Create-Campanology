package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.CopperBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.CopperBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class CopperBellBlockRenderer extends GeoBlockRenderer<CopperBellBlockEntity> {
    public CopperBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new CopperBellBlockModel());
    }
}
