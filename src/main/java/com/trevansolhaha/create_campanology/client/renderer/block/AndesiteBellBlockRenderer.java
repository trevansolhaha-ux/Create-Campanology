package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.AndesiteBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.AndesiteBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class AndesiteBellBlockRenderer extends GeoBlockRenderer<AndesiteBellBlockEntity> {
    public AndesiteBellBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new AndesiteBellBlockModel());
    }
}
