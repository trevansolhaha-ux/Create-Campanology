package com.trevansolhaha.create_campanology.item;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CreateCampanology.MOD_ID);

    public static final DeferredItem<Item> MUSICAL_TIN_INGOT = ITEMS.register("musical_tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSICAL_TIN_NUGGET = ITEMS.register("musical_tin_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MUSICAL_TIN = ITEMS.register("raw_musical_tin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_BRONZE_INGOT = ITEMS.register("musical_bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSICAL_BRONZE_NUGGET = ITEMS.register("musical_bronze_nugget",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> MUSICAL_COPPER_INGOT = ITEMS.register("musical_copper_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSICAL_COPPER_NUGGET = ITEMS.register("musical_copper_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_ZINC_INGOT = ITEMS.register("musical_zinc_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSICAL_ZINC_NUGGET = ITEMS.register("musical_zinc_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_BRASS_INGOT = ITEMS.register("musical_brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSICAL_BRASS_NUGGET = ITEMS.register("musical_brass_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_ANDESITE_INGOT = ITEMS.register("musical_andesite_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSICAL_ANDESITE_NUGGET = ITEMS.register("musical_andesite_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_GOLD_INGOT = ITEMS.register("musical_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSICAL_GOLD_NUGGET = ITEMS.register("musical_gold_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_IRON_INGOT = ITEMS.register("musical_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSICAL_IRON_NUGGET = ITEMS.register("musical_iron_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OXIDISED_MUSICAL_INGOT = ITEMS.register("oxidised_musical_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OXIDISED_MUSICAL_NUGGET = ITEMS.register("oxidised_musical_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OXIDISED_COPPER_INGOT = ITEMS.register("oxidised_copper_ingot",
            () -> new Item(new Item.Properties()));

    // Bell size 1 Items //

    public static final DeferredItem<BlockItem> COPPER_BELL_1 = ITEMS.register("copper_bell_1",
            () -> new BlockItem(ModBlocks.COPPER_BELL_1.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> OXIDIZED_COPPER_BELL_1 = ITEMS.register("oxidized_copper_bell_1",
            () -> new BlockItem(ModBlocks.OXIDIZED_COPPER_BELL_1.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> IRON_BELL_1 = ITEMS.register("iron_bell_1",
            () -> new BlockItem(ModBlocks.IRON_BELL_1.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> BRONZE_BELL_1 = ITEMS.register("bronze_bell_1",
            () -> new BlockItem(ModBlocks.BRONZE_BELL_1.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> BRASS_BELL_1 = ITEMS.register("brass_bell_1",
            () -> new BlockItem(ModBlocks.BRASS_BELL_1.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> GOLD_BELL_1 = ITEMS.register("gold_bell_1",
            () -> new BlockItem(ModBlocks.GOLD_BELL_1.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> ZINC_BELL_1 = ITEMS.register("zinc_bell_1",
            () -> new BlockItem(ModBlocks.ZINC_BELL_1.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> ANDESITE_ALLOY_BELL_1 = ITEMS.register("andesite_alloy_bell_1",
            () -> new BlockItem(ModBlocks.ANDESITE_ALLOY_BELL_1.get(), new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
