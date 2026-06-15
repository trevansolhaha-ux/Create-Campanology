package com.trevansolhaha.create_campanolgy.data;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import com.trevansolhaha.create_campanolgy.block.ModBlocks;
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
        ;
    }
}
