package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.OxidizedCopperBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.OxidizedCopperBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class OxidizedCopperBellBlockRenderer extends GeoBlockRenderer<OxidizedCopperBellBlockEntity> {
    public OxidizedCopperBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new OxidizedCopperBellBlockModel());
    }
}
