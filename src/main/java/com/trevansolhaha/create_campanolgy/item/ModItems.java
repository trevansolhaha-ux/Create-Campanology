package com.trevansolhaha.create_campanolgy.item;

import com.trevansolhaha.create_campanolgy.CreateCampanology;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CreateCampanology.MOD_ID);

    public static final DeferredItem<Item> MUSICAL_BRONZE_INGOT = ITEMS.register("musical_bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_TIN_INGOT = ITEMS.register("musical_tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MUSICAL_TIN = ITEMS.register("raw_musical_tin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_COPPER_INGOT = ITEMS.register("musical_copper_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_ZINC_INGOT = ITEMS.register("musical_zinc_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MUSICAL_BRASS_INGOT = ITEMS.register("musical_brass_ingot",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
