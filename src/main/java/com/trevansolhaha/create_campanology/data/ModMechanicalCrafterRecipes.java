package com.trevansolhaha.create_campanology.data;

import com.simibubi.create.api.data.recipe.MechanicalCraftingRecipeBuilder;
import com.simibubi.create.api.data.recipe.MechanicalCraftingRecipeGen;
import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.CompletableFuture;

public class ModMechanicalCrafterRecipes extends MechanicalCraftingRecipeGen {

    public ModMechanicalCrafterRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, String defaultNamespace) {
        super(output, registries, defaultNamespace);
    }

    @Override
    public void buildRecipes(RecipeOutput output) {
        // Uniform 5x4 Grid Layout Matrix
        String[] pattern = {
                "  I  ",
                " III ",
                "IICII",
                " I I "
        };

        // 1. COPPER BELL
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.COPPER_BELL_1.get())
                .patternLine(pattern[0])
                .patternLine(pattern[1])
                .patternLine(pattern[2])
                .patternLine(pattern[3])
                .key('C', ModItems.COPPER_SMALL_CLAPPER.get())
                .key('I', ModItems.MUSICAL_COPPER_INGOT.get())
                .disallowMirrored()
                .build(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "mechanical_crafting/copper_bell_1"));

        // 2. BRASS BELL
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.BRASS_BELL_1.get())
                .patternLine(pattern[0])
                .patternLine(pattern[1])
                .patternLine(pattern[2])
                .patternLine(pattern[3])
                .key('C', ModItems.BRASS_SMALL_CLAPPER.get())
                .key('I', ModItems.MUSICAL_BRASS_INGOT.get())
                .disallowMirrored()
                .build(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "mechanical_crafting/brass_bell_1"));

        // 3. BRONZE BELL (Fixed Overwrite Path)
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.BRONZE_BELL_1.get())
                .patternLine(pattern[0])
                .patternLine(pattern[1])
                .patternLine(pattern[2])
                .patternLine(pattern[3])
                .key('C', ModItems.BRONZE_SMALL_CLAPPER.get())
                .key('I', ModItems.MUSICAL_BRONZE_INGOT.get())
                .disallowMirrored()
                .build(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "mechanical_crafting/bronze_bell_1"));

        // 4. GOLD BELL
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.GOLD_BELL_1.get())
                .patternLine(pattern[0])
                .patternLine(pattern[1])
                .patternLine(pattern[2])
                .patternLine(pattern[3])
                .key('C', ModItems.GOLD_SMALL_CLAPPER.get())
                .key('I', ModItems.MUSICAL_GOLD_INGOT.get())
                .disallowMirrored()
                .build(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "mechanical_crafting/gold_bell_1"));

        // 5. ANDESITE ALLOY BELL
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.ANDESITE_ALLOY_BELL_1.get())
                .patternLine(pattern[0])
                .patternLine(pattern[1])
                .patternLine(pattern[2])
                .patternLine(pattern[3])
                .key('C', ModItems.ANDESITE_SMALL_CLAPPER.get())
                .key('I', ModItems.MUSICAL_ANDESITE_INGOT.get())
                .disallowMirrored()
                .build(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "mechanical_crafting/andesite_alloy_bell_1"));

        // 6. IRON BELL
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.IRON_BELL_1.get())
                .patternLine(pattern[0])
                .patternLine(pattern[1])
                .patternLine(pattern[2])
                .patternLine(pattern[3])
                .key('C', ModItems.IRON_SMALL_CLAPPER.get())
                .key('I', ModItems.MUSICAL_IRON_INGOT.get())
                .disallowMirrored()
                .build(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "mechanical_crafting/iron_bell_1"));

        // 7. OXIDIZED COPPER BELL
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.OXIDIZED_COPPER_BELL_1.get())
                .patternLine(pattern[0])
                .patternLine(pattern[1])
                .patternLine(pattern[2])
                .patternLine(pattern[3])
                .key('C', ModItems.OXIDISED_SMALL_CLAPPER.get())
                .key('I', ModItems.OXIDISED_COPPER_INGOT.get())
                .disallowMirrored()
                .build(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "mechanical_crafting/oxidized_copper_bell_1"));

        // 8. ZINC BELL
        MechanicalCraftingRecipeBuilder.shapedRecipe(ModItems.ZINC_BELL_1.get())
                .patternLine(pattern[0])
                .patternLine(pattern[1])
                .patternLine(pattern[2])
                .patternLine(pattern[3])
                .key('C', ModItems.ZINC_SMALL_CLAPPER.get())
                .key('I', ModItems.MUSICAL_ZINC_INGOT.get())
                .disallowMirrored()
                .build(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "mechanical_crafting/zinc_bell_1"));
    }
}