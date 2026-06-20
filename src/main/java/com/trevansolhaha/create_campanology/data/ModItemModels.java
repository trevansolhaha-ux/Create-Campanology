package com.trevansolhaha.create_campanology.data;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.init.ModItems;
import com.trevansolhaha.create_campanology.init.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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

//        simpleBlockItem(ModBlocks.BRASS_BELL_1.get());
        smallBellItem(ModItems.BRASS_BELL_1.get());

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

    // For future use when changing item models based on the size of bell
    // TODO: must adapt to use item instead of hard coded brass bell
    //the above thing is done but if for any reason it crashs on startup then add the json files for the medium and large bells
    //and or uncommnet the sizes 2 and 3 until they are added
    // Generates an item model for a bell item that overrides based on the size property
    // The item's registry name is used to derive the corresponding block models dynamically
    private void smallBellItem(Item item) {
        // Correctly grab the registry ID path (e.g., "brass_bell_1")
        ResourceLocation itemKey = BuiltInRegistries.ITEM.getKey(item);
        String baseName = itemKey.getPath();


        String blockPrefix = baseName.endsWith("_1") ? baseName.substring(0, baseName.length() - 2) : baseName;

        ResourceLocation propertyId = ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "size");

        // Generate the main base item model (saved as models/item/{baseName}.json)
        getBuilder(baseName)
                // Set the default small variant block model as the structural parent
                .parent(getExistingFile(modLoc("block/" + blockPrefix + "_1")))

                // Override for Medium
                .override()
                .predicate(propertyId, 1.0F)
                // Targets the corresponding medium block model
                .model(getExistingFile(modLoc("block/" + blockPrefix + "_2")))
                .end()

                // Override for Large
                .override()
                .predicate(propertyId, 2.0F)
                // Targets the corresponding large block model
                .model(getExistingFile(modLoc("block/" + blockPrefix + "_3")))
                .end();
    }
}
