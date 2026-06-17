package com.trevansolhaha.create_campanology.init;

import com.trevansolhaha.create_campanology.CreateCampanology;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, CreateCampanology.MOD_ID);

    public static final Holder<SoundEvent> BLOCK_COPPER_BELL = registerSoundEvent("block.copper_bell");
    public static final Holder<SoundEvent> BLOCK_OXIDIZED_COPPER_BELL = registerSoundEvent("block.oxidized_copper_bell");
    public static final Holder<SoundEvent> BLOCK_IRON_BELL = registerSoundEvent("block.iron_bell");
    public static final Holder<SoundEvent> BLOCK_BRONZE_BELL = registerSoundEvent("block.bronze_bell");
    public static final Holder<SoundEvent> BLOCK_BRASS_BELL = registerSoundEvent("block.brass_bell");
    public static final Holder<SoundEvent> BLOCK_GOLD_BELL = registerSoundEvent("block.gold_bell");
    public static final Holder<SoundEvent> BLOCK_ZINC_BELL = registerSoundEvent("block.zinc_bell");
    public static final Holder<SoundEvent> BLOCK_ANDESITE_ALLOY_BELL = registerSoundEvent("block.andesite_alloy_bell");

    private static Holder<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
