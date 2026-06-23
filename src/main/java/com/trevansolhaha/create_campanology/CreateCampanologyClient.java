package com.trevansolhaha.create_campanology;

import com.trevansolhaha.create_campanology.client.renderer.block.ModLargeBellBlockRenderer;
import com.trevansolhaha.create_campanology.client.renderer.block.ModMediumBellBlockRenderer;
import com.trevansolhaha.create_campanology.client.renderer.block.ModSmallBellBlockRenderer;
import com.trevansolhaha.create_campanology.component.BellSizeComponent;
import com.trevansolhaha.create_campanology.component.LargeBellSizeComponent;
import com.trevansolhaha.create_campanology.component.MediumBellSizeComponent;
import com.trevansolhaha.create_campanology.init.ModBlockEntities;
import com.trevansolhaha.create_campanology.init.ModDataComponents;
import com.trevansolhaha.create_campanology.init.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = CreateCampanology.MOD_ID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = CreateCampanology.MOD_ID, value = Dist.CLIENT)
public class CreateCampanologyClient {
    public CreateCampanologyClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // TODO: move to a more appropriate place when more bells are added
        registerBellItemProperty(ModItems.COPPER_BELL_1.get());
        registerBellItemProperty(ModItems.OXIDIZED_COPPER_BELL_1.get());
        registerBellItemProperty(ModItems.IRON_BELL_1.get());
        registerBellItemProperty(ModItems.BRONZE_BELL_1.get());
        registerBellItemProperty(ModItems.BRASS_BELL_1.get());
        registerBellItemProperty(ModItems.GOLD_BELL_1.get());
        registerBellItemProperty(ModItems.ZINC_BELL_1.get());
        registerBellItemProperty(ModItems.ANDESITE_ALLOY_BELL_1.get());

        registerMediumBellItemProperty(ModItems.BRASS_BELL_2.get());

        registerLargeBellItemProperty(ModItems.BRASS_BELL_3.get());
    }

    private static void registerBellItemProperty(Item item) {
        ItemProperties.register(item, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "size"), (stack, world, entity, i) ->
                stack.getOrDefault(ModDataComponents.BELL_SIZE, BellSizeComponent.getDefaultValue()).getSize().getId());
    }

    private static void registerMediumBellItemProperty(Item item) {
        ItemProperties.register(item, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "size"), (stack, world, entity, i) ->
                stack.getOrDefault(ModDataComponents.MEDIUM_BELL_SIZE, MediumBellSizeComponent.getDefaultValue()).getSize().getId());
    }

    private static void registerLargeBellItemProperty(Item item) {
        ItemProperties.register(item, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "size"), (stack, world, entity, i) ->
                stack.getOrDefault(ModDataComponents.LARGE_BELL_SIZE, LargeBellSizeComponent.getDefaultValue()).getSize().getId());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.COPPER_BELL_1.get(), context -> new ModSmallBellBlockRenderer(context, "copper_bell_1"));
        event.registerBlockEntityRenderer(ModBlockEntities.OXIDIZED_COPPER_BELL_1.get(), context -> new ModSmallBellBlockRenderer(context, "oxidized_copper_bell_1"));
        event.registerBlockEntityRenderer(ModBlockEntities.IRON_BELL_1.get(), context -> new ModSmallBellBlockRenderer(context, "iron_bell_1"));
        event.registerBlockEntityRenderer(ModBlockEntities.BRONZE_BELL_1.get(), context -> new ModSmallBellBlockRenderer(context, "bronze_bell_1"));
        event.registerBlockEntityRenderer(ModBlockEntities.BRASS_BELL_1.get(), context -> new ModSmallBellBlockRenderer(context, "brass_bell_1"));
        event.registerBlockEntityRenderer(ModBlockEntities.GOLD_BELL_1.get(), context -> new ModSmallBellBlockRenderer(context, "gold_bell_1"));
        event.registerBlockEntityRenderer(ModBlockEntities.ZINC_BELL_1.get(), context -> new ModSmallBellBlockRenderer(context, "zinc_bell_1"));
        event.registerBlockEntityRenderer(ModBlockEntities.ANDESITE_ALLOY_BELL_1.get(), context -> new ModSmallBellBlockRenderer(context, "andesite_alloy_bell_1"));

        event.registerBlockEntityRenderer(ModBlockEntities.BRASS_BELL_2.get(), context -> new ModMediumBellBlockRenderer(context, "brass_bell_2"));

        event.registerBlockEntityRenderer(ModBlockEntities.BRASS_BELL_3.get(), context -> new ModLargeBellBlockRenderer(context, "brass_bell_3"));
    }
}