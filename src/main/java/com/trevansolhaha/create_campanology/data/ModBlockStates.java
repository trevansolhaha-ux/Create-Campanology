package com.trevansolhaha.create_campanology.data;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.init.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStates extends BlockStateProvider {
    public ModBlockStates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CreateCampanology.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        cubeAll(ModBlocks.MUSICAL_TIN_BLOCK.get());
        cubeAll(ModBlocks.MUSICAL_BRONZE_BLOCK.get());
        cubeAll(ModBlocks.MUSICAL_TIN_ORE.get());
        cubeAll(ModBlocks.NETHER_MUSICAL_TIN_ORE.get());
        cubeAll(ModBlocks.MUSICAL_ZINC_BLOCK.get());
        cubeAll(ModBlocks.MUSICAL_COPPER_BLOCK.get());
        cubeAll(ModBlocks.MUSICAL_ANDESITE_BLOCK.get());
        cubeAll(ModBlocks.MUSICAL_BRASS_BLOCK.get());
        cubeAll(ModBlocks.MUSICAL_GOLD_BLOCK.get());
        cubeAll(ModBlocks.MUSICAL_IRON_BLOCK.get());
        cubeAll(ModBlocks.OXIDISED_MUSICAL_BLOCK.get());
        cubeAll(ModBlocks.RAW_MUSICAL_TIN_BLOCK.get());

        simpleParent(ModBlocks.COPPER_BELL_1.get());
        simpleParent(ModBlocks.OXIDIZED_COPPER_BELL_1.get());
        simpleParent(ModBlocks.IRON_BELL_1.get());
        simpleParent(ModBlocks.BRONZE_BELL_1.get());
        simpleParent(ModBlocks.BRASS_BELL_1.get());
        simpleParent(ModBlocks.GOLD_BELL_1.get());
        simpleParent(ModBlocks.ZINC_BELL_1.get());
        simpleParent(ModBlocks.ANDESITE_ALLOY_BELL_1.get());

        simpleParent(ModBlocks.BRASS_BELL_2.get());
    }

    private void simpleParent(Block block) {
        getVariantBuilder(block)
                .partialState()
                .setModels(new ConfiguredModel(models().getExistingFile(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "block/" + BuiltInRegistries.BLOCK.getKey(block).getPath()))));
    }
}
