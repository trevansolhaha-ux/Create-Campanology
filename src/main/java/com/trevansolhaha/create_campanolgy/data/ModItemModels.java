package com.trevansolhaha.create_campanolgy.data;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import com.trevansolhaha.create_campanolgy.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModels extends ItemModelProvider {
    public ModItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateCampanology.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.MUSICAL_BRONZE_INGOT.get());
        basicItem(ModItems.MUSICAL_TIN_INGOT.get());
        basicItem(ModItems.RAW_MUSICAL_TIN.get());
        basicItem(ModItems.MUSICAL_COPPER_INGOT.get());
        basicItem(ModItems.MUSICAL_ZINC_INGOT.get());
        basicItem(ModItems.MUSICAL_BRASS_INGOT.get());
    }
}
