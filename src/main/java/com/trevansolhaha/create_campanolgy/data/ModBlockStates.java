package com.trevansolhaha.create_campanolgy.data;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import com.trevansolhaha.create_campanolgy.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
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
        cubeAll(ModBlocks.MUSICAL_ZINC_BLOCK.get());
        cubeAll(ModBlocks.MUSICAL_COPPER_BLOCK.get());
    }
}
