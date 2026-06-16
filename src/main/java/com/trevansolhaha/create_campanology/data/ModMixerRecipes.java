package com.trevansolhaha.create_campanology.data;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.api.data.recipe.StandardProcessingRecipeGen;
import com.simibubi.create.content.kinetics.mixer.MixingRecipe;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.recipe.IRecipeTypeInfo;
import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class ModMixerRecipes extends StandardProcessingRecipeGen<MixingRecipe> {


    public ModMixerRecipes(PackOutput output, CompletableFuture registries, String defaultNamespace) {
        super(output, registries, CreateCampanology.MOD_ID);
    }


    @Override
    protected IRecipeTypeInfo getRecipeType() {
        return AllRecipeTypes.MIXING;
    }



    //Musical Bronze Ingot mixing recipe
    public GeneratedRecipe MUSICAL_BRONZE_INGOT = create("musical_bronze_ingot_from_mixing",b -> b
            .withItemIngredients(
                    Ingredient.of(ModItems.MUSICAL_TIN_INGOT.get()),
                    Ingredient.of(Items.COPPER_INGOT)
            )
            .output(ModItems.MUSICAL_BRONZE_INGOT.get(), 2)
            .requiresHeat(HeatCondition.HEATED)
            .duration(100));



    //muscial brass ingot mixing recipe
    public GeneratedRecipe MUSICAL_BRASS_INGOT = create("musical_brass_ingot_from_mixing", b -> b
                    .withItemIngredients(
                            Ingredient.of(ModItems.MUSICAL_BRONZE_INGOT.get()),
                            Ingredient.of(AllItems.BRASS_INGOT),//we have to do it two times for the recipe to work
                            Ingredient.of(AllItems.BRASS_INGOT)
                    )
                    .output(ModItems.MUSICAL_BRASS_INGOT.get(), 3)
                    .requiresHeat(HeatCondition.HEATED)
                    .duration(100));



    //musical andesite ingot mixing recipe
    public GeneratedRecipe MUSICAL_ANDESITE_INGOT = create("musical_andesite_ingot_from_mixing", b -> b
            .withItemIngredients(
                    Ingredient.of(ModItems.MUSICAL_BRONZE_INGOT.get()),
                    Ingredient.of(AllItems.ANDESITE_ALLOY.get()),//we have to do it two times for the recipe to work
                    Ingredient.of(AllItems.ANDESITE_ALLOY.get())
            )
            .output(ModItems.MUSICAL_ANDESITE_INGOT.get(), 3)
            .requiresHeat(HeatCondition.HEATED)
            .duration(100));



    //musical zinc ingot mixing recipe
    public GeneratedRecipe MUSICAL_ZINC_INGOT = create("musical_zinc_ingot_from_mixing", b -> b
            .withItemIngredients(
                    Ingredient.of(ModItems.MUSICAL_BRONZE_INGOT.get()),
                    Ingredient.of(AllItems.ZINC_INGOT.get()),//we have to do it two times for the recipe to work
                    Ingredient.of(AllItems.ZINC_INGOT.get())

            )
            .output(ModItems.MUSICAL_ZINC_INGOT.get(), 3)
            .requiresHeat(HeatCondition.HEATED)
            .duration(100));



    //musical copper ingot mixing recipe
    public GeneratedRecipe MUSICAL_COPPER_INGOT = create("musical_copper_ingot_from_mixing", b -> b
            .withItemIngredients(
                    Ingredient.of(ModItems.MUSICAL_BRONZE_INGOT.get()),
                    Ingredient.of(Items.COPPER_INGOT),//we have to do it two times for the recipe to work
                    Ingredient.of(Items.COPPER_INGOT)

            )
            .output(ModItems.MUSICAL_COPPER_INGOT.get(), 3)
            .requiresHeat(HeatCondition.HEATED)
            .duration(100));



    //musical gold ingot mixing recipe
    public GeneratedRecipe MUSICAL_GOLD_INGOT  = create("musical_gold_ingot_from_mixing", b -> b
            .withItemIngredients(
                    Ingredient.of(ModItems.MUSICAL_BRONZE_INGOT.get()),
                    Ingredient.of(Items.GOLD_INGOT),//we have to do it two times for the recipe to work
                    Ingredient.of(Items.GOLD_INGOT)

            )
            .output(ModItems.MUSICAL_GOLD_INGOT.get(), 3)
            .requiresHeat(HeatCondition.HEATED)
            .duration(100));



//musical iron ingot mixing recipe
    public GeneratedRecipe MUSICAL_IRON_INGOT = create("musical_iron_ingot_from_mixing",b -> b
        .withItemIngredients(
                Ingredient.of(ModItems.MUSICAL_BRONZE_INGOT.get()),
                Ingredient.of(Items.IRON_INGOT),//we have to do it two times for the recipe to work
                Ingredient.of(Items.IRON_INGOT)

        )
        .output(ModItems.MUSICAL_IRON_INGOT.get(), 3)
        .requiresHeat(HeatCondition.HEATED)
        .duration(100));



//musical oxidised ingot mixing recipe
    public GeneratedRecipe MUSICAL_OXIDISED_INGOT = create("musical_oxidised_ingot_from_mixing", b -> b
            .withItemIngredients(
                    Ingredient.of(ModItems.MUSICAL_BRONZE_INGOT.get()),
                    Ingredient.of(ModItems.OXIDISED_COPPER_INGOT),//we have to do it two times for the recipe to work
                    Ingredient.of(ModItems.OXIDISED_COPPER_INGOT)

            )
            .output(ModItems.MUSICAL_TIN_INGOT.get(), 3)
            .requiresHeat(HeatCondition.HEATED)
            .duration(100));





}
