package com.trevansolhaha.create_campanology.client.renderer.block;

import com.trevansolhaha.create_campanology.client.model.block.ModMediumBellBlockModel;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseMediumBellBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ModMediumBellBlockRenderer extends GeoBlockRenderer<ModBaseMediumBellBlockEntity> {
    public ModMediumBellBlockRenderer(BlockEntityRendererProvider.Context context, String baseModelName) {
        super(new ModMediumBellBlockModel(baseModelName));
    }
}
