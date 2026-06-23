package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.ModSmallBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ModSmallBellBlockRenderer extends GeoBlockRenderer<ModBaseBellBlockEntity> {
    public ModSmallBellBlockRenderer(BlockEntityRendererProvider.Context context, String baseModelName) {
        super(new ModSmallBellBlockModel(baseModelName));
    }
}
