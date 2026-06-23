package com.trevansolhaha.create_campanology.init;

import com.trevansolhaha.create_campanology.CreateCampanology;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, CreateCampanology.MOD_ID);

    public static final Holder<SoundEvent> COPPER_BELL_USE = registerSoundEvent("block.copper_bell.use");
    public static final Holder<SoundEvent> OXIDIZED_COPPER_BELL_USE = registerSoundEvent("block.oxidized_copper_bell.use");
    public static final Holder<SoundEvent> IRON_BELL_USE = registerSoundEvent("block.iron_bell.use");
    public static final Holder<SoundEvent> BRONZE_BELL_USE = registerSoundEvent("block.bronze_bell.use");
    public static final Holder<SoundEvent> BRASS_BELL_USE = registerSoundEvent("block.brass_bell.use");
    public static final Holder<SoundEvent> GOLD_BELL_USE = registerSoundEvent("block.gold_bell.use");
    public static final Holder<SoundEvent> ZINC_BELL_USE = registerSoundEvent("block.zinc_bell.use");
    public static final Holder<SoundEvent> ANDESITE_ALLOY_BELL_USE = registerSoundEvent("block.andesite_alloy_bell.use");

    private static Holder<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(CreateCampanology.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
