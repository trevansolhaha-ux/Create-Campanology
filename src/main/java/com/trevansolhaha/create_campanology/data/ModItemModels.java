package com.trevansolhaha.create_campanology.data;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.init.ModItems;
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

        smallBellItem(ModItems.COPPER_BELL_1.get());
        smallBellItem(ModItems.OXIDIZED_COPPER_BELL_1.get());
        smallBellItem(ModItems.IRON_BELL_1.get());
        smallBellItem(ModItems.BRONZE_BELL_1.get());
        smallBellItem(ModItems.BRASS_BELL_1.get());
        smallBellItem(ModItems.GOLD_BELL_1.get());
        smallBellItem(ModItems.ZINC_BELL_1.get());
        smallBellItem(ModItems.ANDESITE_ALLOY_BELL_1.get());

        mediumBellItem(ModItems.BRASS_BELL_2.get());

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

    // Generates an item model for a bell item that overrides based on the size property
    // The item's registry name is used to derive the corresponding block models dynamically
    private void smallBellItem(Item item) {
        ResourceLocation itemKey = BuiltInRegistries.ITEM.getKey(item);
        String baseName = itemKey.getPath();

        ResourceLocation propertyId = ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "size");

        // Generate the main base item model (saved as models/item/{baseName}.json)
        getBuilder(baseName)
                // Set the default small variant block model as the structural parent
                .parent(getExistingFile(modLoc("block/" + baseName + "_1")))

                // Override for Medium
                .override()
                .predicate(propertyId, 1.0F)
                // Targets the corresponding medium block model
                .model(getExistingFile(modLoc("block/" + baseName + "_2")))
                .end()

                // Override for Large
                .override()
                .predicate(propertyId, 2.0F)
                // Targets the corresponding large block model
                .model(getExistingFile(modLoc("block/" + baseName + "_3")))
                .end();
    }

    private void mediumBellItem(Item item) {
        ResourceLocation itemKey = BuiltInRegistries.ITEM.getKey(item);
        String baseName = itemKey.getPath();

        ResourceLocation propertyId = ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "size");

        // Generate the main base item model (saved as models/item/{baseName}.json)
        getBuilder(baseName)
                // Set the default small variant block model as the structural parent
                .parent(getExistingFile(modLoc("block/" + baseName + "_1")))

                // Override for 2
                .override()
                .predicate(propertyId, 1.0F)
                // Targets the corresponding medium block model
                .model(getExistingFile(modLoc("block/" + baseName + "_2")))
                .end()

                // Override for 3
                .override()
                .predicate(propertyId, 2.0F)
                // Targets the corresponding large block model
                .model(getExistingFile(modLoc("block/" + baseName + "_3")))
                .end()

                // Override for 4
                .override()
                .predicate(propertyId, 3.0F)
                // Targets the corresponding large block model
                .model(getExistingFile(modLoc("block/" + baseName + "_4")))
                .end()

                // Override for 5
                .override()
                .predicate(propertyId, 4.0F)
                // Targets the corresponding large block model
                .model(getExistingFile(modLoc("block/" + baseName + "_5")))
                .end();
    }
}
