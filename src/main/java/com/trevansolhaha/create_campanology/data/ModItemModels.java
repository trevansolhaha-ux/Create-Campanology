package com.trevansolhaha.create_campanology.data;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.item.ModItems;
import com.trevansolhaha.create_campanology.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModels extends ItemModelProvider {
    public ModItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateCampanology.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.MUSICAL_TIN_INGOT.get());
        basicItem(ModItems.MUSICAL_TIN_NUGGET.get());
        basicItem(ModItems.RAW_MUSICAL_TIN.get());
        basicItem(ModItems.MUSICAL_BRONZE_INGOT.get());
        basicItem(ModItems.MUSICAL_BRONZE_NUGGET.get());
        basicItem(ModItems.MUSICAL_COPPER_INGOT.get());
        basicItem(ModItems.MUSICAL_COPPER_NUGGET.get());
        basicItem(ModItems.MUSICAL_ZINC_INGOT.get());
        basicItem(ModItems.MUSICAL_ZINC_NUGGET.get());
        basicItem(ModItems.MUSICAL_BRASS_INGOT.get());
        basicItem(ModItems.MUSICAL_BRASS_NUGGET.get());
        basicItem(ModItems.MUSICAL_ANDESITE_INGOT.get());
        basicItem(ModItems.MUSICAL_ANDESITE_NUGGET.get());
        basicItem(ModItems.MUSICAL_GOLD_INGOT.get());
        basicItem(ModItems.MUSICAL_GOLD_NUGGET.get());
        basicItem(ModItems.MUSICAL_IRON_INGOT.get());
        basicItem(ModItems.MUSICAL_IRON_NUGGET.get());
        basicItem(ModItems.OXIDISED_MUSICAL_INGOT.get());
        basicItem(ModItems.OXIDISED_MUSICAL_NUGGET.get());
        basicItem(ModItems.OXIDISED_COPPER_INGOT.get());

        simpleBlockItem(ModBlocks.COPPER_BELL_1.get());
        simpleBlockItem(ModBlocks.OXIDIZED_COPPER_BELL_1.get());
        simpleBlockItem(ModBlocks.IRON_BELL_1.get());
        simpleBlockItem(ModBlocks.BRONZE_BELL_1.get());

        simpleBlockItem(ModBlocks.BRASS_BELL_1.get());
        simpleBlockItem(ModBlocks.BRASS_BELL_2.get());
        simpleBlockItem(ModBlocks.BRASS_BELL_3.get());

        simpleBlockItem(ModBlocks.GOLD_BELL_1.get());
        simpleBlockItem(ModBlocks.ZINC_BELL_1.get());
        simpleBlockItem(ModBlocks.ANDESITE_ALLOY_BELL_1.get());

        basicItem(ModItems.BRASS_SMALL_CLAPPER.get());
        basicItem(ModItems.BRASS_MEDIUM_CLAPPER.get());
        basicItem(ModItems.BRASS_BIG_CLAPPER.get());
        basicItem(ModItems.IRON_SMALL_CLAPPER.get());
        basicItem(ModItems.IRON_MEDIUM_CLAPPER.get());
        basicItem(ModItems.IRON_BIG_CLAPPER.get());
        basicItem(ModItems.BRONZE_SMALL_CLAPPER.get());
        basicItem(ModItems.BRONZE_MEDIUM_CLAPPER.get());
        basicItem(ModItems.BRONZE_BIG_CLAPPER.get());
        basicItem(ModItems.ANDESITE_SMALL_CLAPPER.get());
        basicItem(ModItems.ANDESITE_MEDIUM_CLAPPER.get());
        basicItem(ModItems.ANDESITE_BIG_CLAPPER.get());
        basicItem(ModItems.COPPER_SMALL_CLAPPER.get());
        basicItem(ModItems.COPPER_MEDIUM_CLAPPER.get());
        basicItem(ModItems.COPPER_BIG_CLAPPER.get());
        basicItem(ModItems.GOLD_SMALL_CLAPPER.get());
        basicItem(ModItems.GOLD_MEDIUM_CLAPPER.get());
        basicItem(ModItems.GOLD_BIG_CLAPPER.get());
        basicItem(ModItems.ZINC_SMALL_CLAPPER.get());
        basicItem(ModItems.ZINC_MEDIUM_CLAPPER.get());
        basicItem(ModItems.ZINC_BIG_CLAPPER.get());
        basicItem(ModItems.OXIDISED_SMALL_CLAPPER.get());
        basicItem(ModItems.OXIDISED_MEDIUM_CLAPPER.get());
        basicItem(ModItems.OXIDISED_BIG_CLAPPER.get());

    }
}
