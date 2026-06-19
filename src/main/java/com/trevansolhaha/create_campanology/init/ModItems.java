package com.trevansolhaha.create_campanology.init;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.component.BellSizeComponent;
import com.trevansolhaha.create_campanology.item.ModBellBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static Item.Properties bell() {
        return new Item.Properties().component(ModDataComponents.BELL_SIZE, BellSizeComponent.getDefaultValue());
    }

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
            () -> new ModBellBlockItem(ModBlocks.COPPER_BELL_1.get(), bell()));
    public static final DeferredItem<BlockItem> OXIDIZED_COPPER_BELL_1 = ITEMS.register("oxidized_copper_bell_1",
            () -> new ModBellBlockItem(ModBlocks.OXIDIZED_COPPER_BELL_1.get(), bell()));
    public static final DeferredItem<BlockItem> IRON_BELL_1 = ITEMS.register("iron_bell_1",
            () -> new ModBellBlockItem(ModBlocks.IRON_BELL_1.get(), bell()));
    public static final DeferredItem<BlockItem> BRONZE_BELL_1 = ITEMS.register("bronze_bell_1",
            () -> new ModBellBlockItem(ModBlocks.BRONZE_BELL_1.get(), bell()));
    public static final DeferredItem<BlockItem> BRASS_BELL_1 = ITEMS.register("brass_bell_1",
            () -> new ModBellBlockItem(ModBlocks.BRASS_BELL_1.get(), bell()));
    public static final DeferredItem<BlockItem> GOLD_BELL_1 = ITEMS.register("gold_bell_1",
            () -> new ModBellBlockItem(ModBlocks.GOLD_BELL_1.get(), bell()));
    public static final DeferredItem<BlockItem> ZINC_BELL_1 = ITEMS.register("zinc_bell_1",
            () -> new ModBellBlockItem(ModBlocks.ZINC_BELL_1.get(), bell()));
    public static final DeferredItem<BlockItem> ANDESITE_ALLOY_BELL_1 = ITEMS.register("andesite_alloy_bell_1",
            () -> new ModBellBlockItem(ModBlocks.ANDESITE_ALLOY_BELL_1.get(), bell()));

    //clappers
    public static final DeferredItem<Item> COPPER_SMALL_CLAPPER = ITEMS.register("copper_small_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_MEDIUM_CLAPPER = ITEMS.register("copper_medium_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_BIG_CLAPPER = ITEMS.register("copper_big_clapper",
            () -> new Item(new Item.Properties()));



    public static final DeferredItem<Item> ANDESITE_SMALL_CLAPPER = ITEMS.register("andesite_small_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANDESITE_MEDIUM_CLAPPER = ITEMS.register("andesite_medium_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANDESITE_BIG_CLAPPER = ITEMS.register("andesite_big_clapper",
            () -> new Item(new Item.Properties()));



    public static final DeferredItem<Item> BRASS_SMALL_CLAPPER = ITEMS.register("brass_small_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRASS_MEDIUM_CLAPPER = ITEMS.register("brass_medium_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRASS_BIG_CLAPPER = ITEMS.register("brass_big_clapper",
            () -> new Item(new Item.Properties()));




    public static final DeferredItem<Item> GOLD_SMALL_CLAPPER = ITEMS.register("gold_small_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GOLD_MEDIUM_CLAPPER = ITEMS.register("gold_medium_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GOLD_BIG_CLAPPER = ITEMS.register("gold_big_clapper",
            () -> new Item(new Item.Properties()));



    public static final DeferredItem<Item> BRONZE_SMALL_CLAPPER = ITEMS.register("bronze_small_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRONZE_MEDIUM_CLAPPER = ITEMS.register("bronze_medium_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRONZE_BIG_CLAPPER = ITEMS.register("bronze_big_clapper",
            () -> new Item(new Item.Properties()));




    public static final DeferredItem<Item> IRON_SMALL_CLAPPER = ITEMS.register("iron_small_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRON_MEDIUM_CLAPPER = ITEMS.register("iron_medium_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRON_BIG_CLAPPER = ITEMS.register("iron_big_clapper",
            () -> new Item(new Item.Properties()));




    public static final DeferredItem<Item> ZINC_SMALL_CLAPPER = ITEMS.register("zinc_small_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ZINC_MEDIUM_CLAPPER = ITEMS.register("zinc_medium_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ZINC_BIG_CLAPPER = ITEMS.register("zinc_big_clapper",
            () -> new Item(new Item.Properties()));




    public static final DeferredItem<Item> OXIDISED_SMALL_CLAPPER = ITEMS.register("oxidised_small_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OXIDISED_MEDIUM_CLAPPER = ITEMS.register("oxidised_medium_clapper",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OXIDISED_BIG_CLAPPER = ITEMS.register("oxidised_big_clapper",
            () -> new Item(new Item.Properties()));


















    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
