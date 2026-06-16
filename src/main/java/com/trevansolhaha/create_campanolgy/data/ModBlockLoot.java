package com.trevansolhaha.create_campanology.data;

import com.trevansolhaha.create_campanology.block.ModBlocks;
import com.trevansolhaha.create_campanology.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ModifyContainerContents;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.fml.common.Mod;
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
        dropSelf(ModBlocks.MUSICAL_ZINC_BLOCK.get());
        dropSelf(ModBlocks.MUSICAL_COPPER_BLOCK.get());
        dropSelf(ModBlocks.MUSICAL_ANDESITE_BLOCK.get());
        dropSelf(ModBlocks.MUSICAL_BRASS_BLOCK.get());
        dropSelf(ModBlocks.MUSICAL_GOLD_BLOCK.get());
        dropSelf(ModBlocks.MUSICAL_IRON_BLOCK.get());
        dropSelf(ModBlocks.OXIDISED_MUSICAL_BLOCK.get());
        dropSelf(ModBlocks.RAW_MUSICAL_TIN_BLOCK.get());

        dropSelf(ModBlocks.COPPER_BELL.get());
        dropSelf(ModBlocks.OXIDIZED_COPPER_BELL.get());
        dropSelf(ModBlocks.IRON_BELL.get());
        dropSelf(ModBlocks.BRONZE_BELL.get());
        dropSelf(ModBlocks.BRASS_BELL.get());
        dropSelf(ModBlocks.GOLD_BELL.get());
        dropSelf(ModBlocks.ZINC_BELL.get());
        dropSelf(ModBlocks.ANDESITE_ALLOY_BELL.get());

        this.add(ModBlocks.MUSICAL_TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.MUSICAL_TIN_ORE.get(),ModItems.RAW_MUSICAL_TIN.get()));

        this.add(ModBlocks.NETHER_MUSICAL_TIN_ORE.get(),
                block -> createNetherNuggetOreDrop(block, ModItems.MUSICAL_TIN_NUGGET.get()));
    }
    protected LootTable.Builder createNetherNuggetOreDrop(Block block, Item nugget) {
        return createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block,
                        LootItem.lootTableItem(nugget)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 6.0F))) // between 2 or 6 nuggets
                                .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
                );


    }
}
