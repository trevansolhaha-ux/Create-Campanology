package com.trevansolhaha.create_campanology;

import com.trevansolhaha.create_campanology.client.renderer.block.*;
import com.trevansolhaha.create_campanology.component.BellSizeComponent;
import com.trevansolhaha.create_campanology.init.ModBlockEntities;
import com.trevansolhaha.create_campanology.init.ModDataComponents;
import com.trevansolhaha.create_campanology.init.ModItems;
import net.minecraft.client.Minecraft;
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
        // Some client setup code
        CreateCampanology.LOGGER.info("HELLO FROM CLIENT SETUP");
        CreateCampanology.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        // TODO: move to a more appropriate place when more bells are added
        registerBellItemProperty(ModItems.BRASS_BELL_1.get()); // TODO: add remaining bells when medium/large models are added
    }

    private static void registerBellItemProperty(Item item) {
        ItemProperties.register(item, ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, "size"), (stack, world, entity, i) ->
                stack.getOrDefault(ModDataComponents.BELL_SIZE, BellSizeComponent.getDefaultValue()).getSize().getId());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.COPPER_BELL_1.get(), CopperBellBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.OXIDIZED_COPPER_BELL_1.get(), OxidizedCopperBellBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.IRON_BELL_1.get(), IronBellBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BRONZE_BELL_1.get(), BronzeBellBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BRASS_BELL_1.get(), BrassBellBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GOLD_BELL_1.get(), GoldBellBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ZINC_BELL_1.get(), ZincBellBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ANDESITE_ALLOY_BELL_1.get(), AndesiteBellBlockRenderer::new);
    }
}