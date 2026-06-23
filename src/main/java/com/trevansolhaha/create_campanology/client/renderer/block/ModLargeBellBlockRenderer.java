package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.ModLargeBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseLargeBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ModLargeBellBlockRenderer extends GeoBlockRenderer<ModBaseLargeBlockEntity> {
    public ModLargeBellBlockRenderer(BlockEntityRendererProvider.Context context, String baseModelName) {
        super(new ModLargeBellBlockModel(baseModelName));
    }
}
