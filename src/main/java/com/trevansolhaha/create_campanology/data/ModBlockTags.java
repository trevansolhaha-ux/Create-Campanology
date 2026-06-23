package com.trevansolhaha.create_campanology.data;

import com.simibubi.create.AllTags;
import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.init.ModBlocks;
import com.trevansolhaha.create_campanology.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTags extends BlockTagsProvider {
    public ModBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CreateCampanology.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MUSICAL_TIN_BLOCK.get())
                .add(ModBlocks.MUSICAL_BRONZE_BLOCK.get())
                .add(ModBlocks.MUSICAL_TIN_ORE.get())
                .add(ModBlocks.MUSICAL_ZINC_BLOCK.get())
                .add(ModBlocks.MUSICAL_COPPER_BLOCK.get())
                .add(ModBlocks.MUSICAL_ANDESITE_BLOCK.get())
                .add(ModBlocks.MUSICAL_BRASS_BLOCK.get())
                .add(ModBlocks.MUSICAL_GOLD_BLOCK.get())
                .add(ModBlocks.MUSICAL_IRON_BLOCK.get())
                .add(ModBlocks.OXIDISED_MUSICAL_BLOCK.get())
                .add(ModBlocks.RAW_MUSICAL_TIN_BLOCK.get())
                .add(ModBlocks.NETHER_MUSICAL_TIN_ORE.get())

                .add(ModBlocks.BRASS_BELL_1.get())
                .add(ModBlocks.ANDESITE_ALLOY_BELL_1.get())
                .add(ModBlocks.BRONZE_BELL_1.get())
                .add(ModBlocks.COPPER_BELL_1.get())
                .add(ModBlocks.GOLD_BELL_1.get())
                .add(ModBlocks.IRON_BELL_1.get())
                .add(ModBlocks.OXIDIZED_COPPER_BELL_1.get())
                .add(ModBlocks.ZINC_BELL_1.get())

                .add(ModBlocks.BRASS_BELL_2.get())

                .add(ModBlocks.BRASS_BELL_3.get())
        ;

        tag(ModTags.Common.BlockTags.TIN_ORES.getTag())
                .add(ModBlocks.MUSICAL_TIN_ORE.get())
                .add(ModBlocks.NETHER_MUSICAL_TIN_ORE.get());

        tag(ModTags.Common.BlockTags.TIN_STORAGE_BLOCKS.getTag())
                .add(ModBlocks.MUSICAL_TIN_BLOCK.get())
                .add(ModBlocks.RAW_MUSICAL_TIN_BLOCK.get());
    }
}
