package com.trevansolhaha.create_campanology.data;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.init.ModBlocks;
import com.trevansolhaha.create_campanology.init.ModItems;
import com.trevansolhaha.create_campanology.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTags extends ItemTagsProvider {
    public ModItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTagProvider, CreateCampanology.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.MUSICAL_TIN_INGOT.get())
                .add(ModItems.MUSICAL_BRONZE_INGOT.get())
                .add(ModItems.MUSICAL_COPPER_INGOT.get())
                .add(ModItems.MUSICAL_ZINC_INGOT.get())
                .add(ModItems.MUSICAL_BRASS_INGOT.get())
                .add(ModItems.MUSICAL_ANDESITE_INGOT.get())
                .add(ModItems.MUSICAL_GOLD_INGOT.get())
                .add(ModItems.MUSICAL_IRON_INGOT.get())
                .add(ModItems.OXIDISED_MUSICAL_INGOT.get())
        ;

        tag(ModTags.Common.ItemTags.TIN_ORES.getTag())
                .add(ModBlocks.MUSICAL_TIN_ORE.asItem())
                .add(ModBlocks.NETHER_MUSICAL_TIN_ORE.asItem());
    }
}
