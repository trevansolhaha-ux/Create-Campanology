package com.trevansolhaha.create_campanology;

import com.trevansolhaha.create_campanology.block.ModBlocks;
import com.trevansolhaha.create_campanology.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import com.trevansolhaha.create_campanology.init.ModBlockEntities;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateCampanology.MOD_ID)
public class CreateCampanology
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "create_campanology";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // Register a creative tab for our mod
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATE_CAMPANOLOGY_TAB =
            CREATIVE_MODE_TABS.register("create_campanology_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.create_campanology"))
                            .icon(() -> new ItemStack(ModItems.MUSICAL_BRONZE_INGOT.get()))
                            .displayItems((parameters, output) -> {
                                // Add all items from ModItems
                                output.accept(ModItems.MUSICAL_TIN_INGOT.get());
                                output.accept(ModItems.MUSICAL_TIN_NUGGET.get());
                                output.accept(ModItems.RAW_MUSICAL_TIN.get());
                                output.accept(ModItems.MUSICAL_BRONZE_INGOT.get());
                                output.accept(ModItems.MUSICAL_BRONZE_NUGGET.get());
                                output.accept(ModItems.MUSICAL_COPPER_INGOT.get());
                                output.accept(ModItems.MUSICAL_COPPER_NUGGET.get());
                                output.accept(ModItems.MUSICAL_ZINC_INGOT.get());
                                output.accept(ModItems.MUSICAL_ZINC_NUGGET.get());
                                output.accept(ModItems.MUSICAL_BRASS_INGOT.get());
                                output.accept(ModItems.MUSICAL_BRASS_NUGGET.get());
                                output.accept(ModItems.MUSICAL_ANDESITE_INGOT.get());
                                output.accept(ModItems.MUSICAL_ANDESITE_NUGGET.get());
                                output.accept(ModItems.MUSICAL_GOLD_INGOT.get());
                                output.accept(ModItems.MUSICAL_GOLD_NUGGET.get());
                                output.accept(ModItems.MUSICAL_IRON_INGOT.get());
                                output.accept(ModItems.MUSICAL_IRON_NUGGET.get());
                                output.accept(ModItems.OXIDISED_MUSICAL_INGOT.get());
                                output.accept(ModItems.OXIDISED_MUSICAL_NUGGET.get());
                                output.accept(ModItems.OXIDISED_COPPER_INGOT.get());

                                // Add all blocks from ModBlocks (registered as BlockItems)
                                output.accept(ModBlocks.MUSICAL_TIN_BLOCK.get());
                                output.accept(ModBlocks.MUSICAL_TIN_ORE.get());
                                output.accept(ModBlocks.NETHER_MUSICAL_TIN_ORE.get());
                                output.accept(ModBlocks.MUSICAL_BRONZE_BLOCK.get());
                                output.accept(ModBlocks.MUSICAL_ZINC_BLOCK.get());
                                output.accept(ModBlocks.MUSICAL_COPPER_BLOCK.get());
                                output.accept(ModBlocks.MUSICAL_ANDESITE_BLOCK.get());
                                output.accept(ModBlocks.MUSICAL_BRASS_BLOCK.get());
                                output.accept(ModBlocks.MUSICAL_GOLD_BLOCK.get());
                                output.accept(ModBlocks.MUSICAL_IRON_BLOCK.get());
                                output.accept(ModBlocks.OXIDISED_MUSICAL_BLOCK.get());
                                output.accept(ModBlocks.RAW_MUSICAL_TIN_BLOCK.get());

                                output.accept(ModItems.COPPER_BELL.get());
                                output.accept(ModItems.OXIDIZED_COPPER_BELL.get());
                                output.accept(ModItems.IRON_BELL.get());
                                output.accept(ModItems.BRONZE_BELL.get());
                                output.accept(ModItems.BRASS_BELL.get());
                                output.accept(ModItems.GOLD_BELL.get());
                                output.accept(ModItems.ZINC_BELL.get());
                                output.accept(ModItems.ANDESITE_ALLOY_BELL.get());
                            })
                            .build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CreateCampanology(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        // Register the creative mode tab
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (CreateCampanology) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
