package com.trevansolhaha.create_campanology.data;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.block.ModBlocks;
import com.trevansolhaha.create_campanology.item.ModItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class ModRecipes extends RecipeProvider {
    public ModRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {


        //Musical Tin recipes//

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_MUSICAL_TIN.get()), RecipeCategory.MISC, ModItems.MUSICAL_TIN_INGOT.get(), 0.7f, 200)
                .group("tin_ingot")
                .unlockedBy("has_raw", has(ModItems.RAW_MUSICAL_TIN.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_ingot_from_smelting_raw"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.MUSICAL_TIN_ORE.get()), RecipeCategory.MISC, ModItems.MUSICAL_TIN_INGOT.get(), 0.7f, 200)
                .group("tin_ingot")
                .unlockedBy("has_ore", has(ModBlocks.MUSICAL_TIN_ORE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_ingot_from_smelting_ore"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.NETHER_MUSICAL_TIN_ORE.get()), RecipeCategory.MISC, ModItems.MUSICAL_TIN_INGOT.get(), 0.7f, 200)
                .group("tin_ingot")
                .unlockedBy("has_nether_ore", has(ModBlocks.NETHER_MUSICAL_TIN_ORE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_ingot_from_smelting_nether_ore"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_MUSICAL_TIN.get()), RecipeCategory.MISC, ModItems.MUSICAL_TIN_INGOT.get(), 0.7f, 100)
                .group("tin_ingot")
                .unlockedBy("has_raw", has(ModItems.RAW_MUSICAL_TIN.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_ingot_from_blasting_raw"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.MUSICAL_TIN_ORE.get()), RecipeCategory.MISC, ModItems.MUSICAL_TIN_INGOT.get(), 0.7f, 100)
                .group("tin_ingot")
                .unlockedBy("has_ore", has(ModBlocks.MUSICAL_TIN_ORE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_ingot_from_blasting_ore"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.NETHER_MUSICAL_TIN_ORE.get()), RecipeCategory.MISC, ModItems.MUSICAL_TIN_INGOT.get(), 0.7f, 100)
                .group("tin_ingot")
                .unlockedBy("has_nether_ore", has(ModBlocks.NETHER_MUSICAL_TIN_ORE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_ingot_from_blasting_nether_ore"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.MUSICAL_TIN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_TIN_INGOT.get())
                .unlockedBy("has_tin_ingot", has(ModItems.MUSICAL_TIN_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_block_from_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MUSICAL_TIN_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_TIN_NUGGET.get())
                .unlockedBy("has_tin_nugget", has(ModItems.MUSICAL_TIN_NUGGET.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MUSICAL_TIN_INGOT.get(), 9)
                .requires(ModBlocks.MUSICAL_TIN_BLOCK.get())
                .unlockedBy("has_tin_block", has(ModBlocks.MUSICAL_TIN_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_ingots_from_tin_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSICAL_TIN_NUGGET.get(), 9)
                .requires(ModItems.MUSICAL_TIN_INGOT.get())
                .unlockedBy("has_tin_ingot", has(ModItems.MUSICAL_TIN_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_nuggets_from_tin_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_MUSICAL_TIN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_MUSICAL_TIN.get())
                .unlockedBy("has_raw_tin", has(ModItems.RAW_MUSICAL_TIN.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_raw_tin_block_from_raw_tin"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.RAW_MUSICAL_TIN_BLOCK.get()), RecipeCategory.MISC, ModBlocks.MUSICAL_TIN_BLOCK.get(), 6.3f, 500)
                .group("tin_block")
                .unlockedBy("has_raw_block", has(ModBlocks.RAW_MUSICAL_TIN_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_block_from_smelting_raw_tin_block"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.RAW_MUSICAL_TIN_BLOCK.get()), RecipeCategory.MISC, ModBlocks.MUSICAL_TIN_BLOCK.get(), 6.3f, 250)
                .group("tin_block")
                .unlockedBy("has_raw_block", has(ModBlocks.RAW_MUSICAL_TIN_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_tin_block_from_blasting_raw_tin_block"));



        //Musical Andesite Recipes//

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.MUSICAL_ANDESITE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_ANDESITE_INGOT.get())
                .unlockedBy("has_anesite_ingot", has(ModItems.MUSICAL_ANDESITE_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_andesite_block_from_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MUSICAL_ANDESITE_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_ANDESITE_NUGGET.get())
                .unlockedBy("has_andesite_nugget", has(ModItems.MUSICAL_ANDESITE_NUGGET.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_andesite_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MUSICAL_ANDESITE_INGOT.get(), 9)
                .requires(ModBlocks.MUSICAL_ANDESITE_BLOCK.get())
                .unlockedBy("has_andesite_block", has(ModBlocks.MUSICAL_ANDESITE_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_andesite_ingots_from_andesite_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSICAL_ANDESITE_NUGGET.get(), 9)
                .requires(ModItems.MUSICAL_TIN_INGOT.get())
                .unlockedBy("has_andesite_ingot", has(ModItems.MUSICAL_ANDESITE_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_andesite_nuggets_from_tin_ingots"));



        //Musical Brass Recipes//

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.MUSICAL_BRASS_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_BRASS_INGOT.get())
                .unlockedBy("has_brass_ingot", has(ModItems.MUSICAL_BRASS_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_brass_block_from_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MUSICAL_BRASS_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_BRASS_NUGGET.get())
                .unlockedBy("has_brass_nugget", has(ModItems.MUSICAL_BRASS_NUGGET.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_brass_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MUSICAL_BRASS_INGOT.get(), 9)
                .requires(ModBlocks.MUSICAL_BRASS_BLOCK.get())
                .unlockedBy("has_brass_block", has(ModBlocks.MUSICAL_BRASS_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_brass_ingots_from_brass_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSICAL_BRASS_NUGGET.get(), 9)
                .requires(ModItems.MUSICAL_BRASS_INGOT.get())
                .unlockedBy("has_brass_ingot", has(ModItems.MUSICAL_BRASS_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_brass_nuggets_from_brass_ingots"));



        //Musical Bronze Recipes//

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.MUSICAL_BRONZE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_BRONZE_INGOT.get())
                .unlockedBy("has_bronze_ingot", has(ModItems.MUSICAL_BRONZE_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_bronze_block_from_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MUSICAL_BRONZE_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_BRONZE_NUGGET.get())
                .unlockedBy("has_bronze_nugget", has(ModItems.MUSICAL_BRONZE_NUGGET.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_bronze_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MUSICAL_BRONZE_INGOT.get(), 9)
                .requires(ModBlocks.MUSICAL_BRONZE_BLOCK.get())
                .unlockedBy("has_bronze_block", has(ModBlocks.MUSICAL_BRONZE_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_bronze_ingots_from_bronze_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSICAL_BRONZE_NUGGET.get(), 9)
                .requires(ModItems.MUSICAL_BRONZE_INGOT.get())
                .unlockedBy("has_bronze_ingot", has(ModItems.MUSICAL_BRONZE_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_bronze_nuggets_from_bronze_ingots"));



        //Musical Copper Recipes//

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.MUSICAL_COPPER_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_COPPER_INGOT.get())
                .unlockedBy("has_copper_ingot", has(ModItems.MUSICAL_COPPER_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_copper_block_from_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MUSICAL_COPPER_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_COPPER_NUGGET.get())
                .unlockedBy("has_copper_nugget", has(ModItems.MUSICAL_COPPER_NUGGET.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_copper_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MUSICAL_COPPER_INGOT.get(), 9)
                .requires(ModBlocks.MUSICAL_COPPER_BLOCK.get())
                .unlockedBy("has_copper_block", has(ModBlocks.MUSICAL_COPPER_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_copper_ingots_from_copper_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSICAL_COPPER_NUGGET.get(), 9)
                .requires(ModItems.MUSICAL_COPPER_INGOT.get())
                .unlockedBy("has_copper_ingot", has(ModItems.MUSICAL_COPPER_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_copper_nuggets_from_copper_ingots"));



        //Musical Gold Recipes//

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.MUSICAL_GOLD_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_GOLD_INGOT.get())
                .unlockedBy("has_gold_ingot", has(ModItems.MUSICAL_GOLD_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_gold_block_from_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MUSICAL_GOLD_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_GOLD_NUGGET.get())
                .unlockedBy("has_gold_nugget", has(ModItems.MUSICAL_GOLD_NUGGET.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_gold_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MUSICAL_GOLD_INGOT.get(), 9)
                .requires(ModBlocks.MUSICAL_GOLD_BLOCK.get())
                .unlockedBy("has_gold_block", has(ModBlocks.MUSICAL_GOLD_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_gold_ingots_from_gold_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSICAL_GOLD_NUGGET.get(), 9)
                .requires(ModItems.MUSICAL_GOLD_INGOT.get())
                .unlockedBy("has_gold_ingot", has(ModItems.MUSICAL_GOLD_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_gold_nuggets_from_gold_ingots"));



        //Musical Iron Recipes//

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.MUSICAL_IRON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_IRON_INGOT.get())
                .unlockedBy("has_iron_ingot", has(ModItems.MUSICAL_IRON_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_iron_block_from_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MUSICAL_IRON_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_IRON_NUGGET.get())
                .unlockedBy("has_iron_nugget", has(ModItems.MUSICAL_IRON_NUGGET.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_iron_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MUSICAL_IRON_INGOT.get(), 9)
                .requires(ModBlocks.MUSICAL_IRON_BLOCK.get())
                .unlockedBy("has_iron_block", has(ModBlocks.MUSICAL_IRON_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_iron_ingots_from_iron_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSICAL_IRON_NUGGET.get(), 9)
                .requires(ModItems.MUSICAL_IRON_INGOT.get())
                .unlockedBy("has_iron_ingot", has(ModItems.MUSICAL_IRON_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_iron_nuggets_from_iron_ingots"));



        //Musical Zinc Recipes//


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.MUSICAL_ZINC_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_ZINC_INGOT.get())
                .unlockedBy("has_zinc_ingot", has(ModItems.MUSICAL_ZINC_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_zinc_block_from_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MUSICAL_ZINC_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUSICAL_ZINC_NUGGET.get())
                .unlockedBy("has_zinc_nugget", has(ModItems.MUSICAL_ZINC_NUGGET.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_zinc_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MUSICAL_ZINC_INGOT.get(), 9)
                .requires(ModBlocks.MUSICAL_ZINC_BLOCK.get())
                .unlockedBy("has_zinc_block", has(ModBlocks.MUSICAL_ZINC_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_zinc_ingots_from_zinc_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUSICAL_ZINC_NUGGET.get(), 9)
                .requires(ModItems.MUSICAL_ZINC_INGOT.get())
                .unlockedBy("has_zinc_ingot", has(ModItems.MUSICAL_ZINC_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_zinc_nuggets_from_zinc_ingots"));



        //Oxidised Musical Copper Recipes//

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModBlocks.OXIDISED_MUSICAL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.OXIDISED_MUSICAL_INGOT.get())
                .unlockedBy("has_oxidised_musical_ingot", has(ModItems.OXIDISED_MUSICAL_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_oxidised_block_from_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.OXIDISED_MUSICAL_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.OXIDISED_MUSICAL_NUGGET.get())
                .unlockedBy("has_oxidised_musical_nugget", has(ModItems.OXIDISED_MUSICAL_NUGGET.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_oxidised_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.OXIDISED_MUSICAL_INGOT.get(), 9)
                .requires(ModBlocks.OXIDISED_MUSICAL_BLOCK.get())
                .unlockedBy("has_oxidised_musical_block", has(ModBlocks.OXIDISED_MUSICAL_BLOCK.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_oxidised_ingots_from_oxidised_musical_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OXIDISED_MUSICAL_NUGGET.get(), 9)
                .requires(ModItems.OXIDISED_MUSICAL_INGOT.get())
                .unlockedBy("has_oxidised_musical_ingot", has(ModItems.OXIDISED_MUSICAL_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "musical_oxidised_nuggets_from_oxidised_musical_ingots"));



        //Oxidised Copper Recipes//

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OXIDISED_COPPER_INGOT.get(), 4)
                .requires(Blocks.OXIDIZED_COPPER)
                .unlockedBy("has_oxidized_copper_block", has(net.minecraft.world.level.block.Blocks.OXIDIZED_COPPER))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "oxidized_copper_ingots_from_vanilla_block"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, net.minecraft.world.level.block.Blocks.OXIDIZED_COPPER)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.OXIDISED_COPPER_INGOT.get())
                .unlockedBy("has_oxidized_copper_ingot", has(ModItems.OXIDISED_COPPER_INGOT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "vanilla_oxidized_copper_block_from_ingots"));



        //Musical Zinc Recipes//


    }
}