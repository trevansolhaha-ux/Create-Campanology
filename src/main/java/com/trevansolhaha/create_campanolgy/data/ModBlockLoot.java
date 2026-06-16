package com.trevansolhaha.create_campanolgy.data;

import com.trevansolhaha.create_campanolgy.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Collectors;

public class ModBlockLoot extends BlockLootSubProvider {
    public ModBlockLoot(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::value).collect(Collectors.toList());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.MUSICAL_TIN_BLOCK.get());
        dropSelf(ModBlocks.MUSICAL_BRONZE_BLOCK.get());
        dropSelf(ModBlocks.MUSICAL_TIN_ORE.get());
        dropSelf(ModBlocks.MUSICAL_ZINC_BLOCK.get());
        dropSelf(ModBlocks.MUSICAL_COPPER_BLOCK.get());

        dropSelf(ModBlocks.COPPER_BELL.get());
        dropSelf(ModBlocks.OXIDIZED_COPPER_BELL.get());
        dropSelf(ModBlocks.IRON_BELL.get());
        dropSelf(ModBlocks.BRONZE_BELL.get());
        dropSelf(ModBlocks.BRASS_BELL.get());
        dropSelf(ModBlocks.GOLD_BELL.get());
        dropSelf(ModBlocks.ZINC_BELL.get());
        dropSelf(ModBlocks.ANDESITE_ALLOY_BELL.get());
    }
}
