package com.trevansolhaha.create_campanology.init;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.content.bell.*;
import com.trevansolhaha.create_campanology.content.bell.medium.BrassMediumBellBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, CreateCampanology.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperBellBlockEntity>> COPPER_BELL_1 = BLOCK_ENTITIES.register("copper_bell",
            () -> BlockEntityType.Builder.of(CopperBellBlockEntity::new, ModBlocks.COPPER_BELL_1.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OxidizedCopperBellBlockEntity>> OXIDIZED_COPPER_BELL_1 = BLOCK_ENTITIES.register("oxidized_copper_bell",
            () -> BlockEntityType.Builder.of(OxidizedCopperBellBlockEntity::new, ModBlocks.OXIDIZED_COPPER_BELL_1.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IronBellBlockEntity>> IRON_BELL_1 = BLOCK_ENTITIES.register("iron_bell",
            () -> BlockEntityType.Builder.of(IronBellBlockEntity::new, ModBlocks.IRON_BELL_1.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BronzeBellBlockEntity>> BRONZE_BELL_1 = BLOCK_ENTITIES.register("bronze_bell",
            () -> BlockEntityType.Builder.of(BronzeBellBlockEntity::new, ModBlocks.BRONZE_BELL_1.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BrassBellBlockEntity>> BRASS_BELL_1 = BLOCK_ENTITIES.register("brass_bell",
            () -> BlockEntityType.Builder.of(BrassBellBlockEntity::new, ModBlocks.BRASS_BELL_1.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GoldBellBlockEntity>> GOLD_BELL_1 = BLOCK_ENTITIES.register("gold_bell",
            () -> BlockEntityType.Builder.of(GoldBellBlockEntity::new, ModBlocks.GOLD_BELL_1.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ZincBellBlockEntity>> ZINC_BELL_1 = BLOCK_ENTITIES.register("zinc_bell",
            () -> BlockEntityType.Builder.of(ZincBellBlockEntity::new, ModBlocks.ZINC_BELL_1.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AndesiteBellBlockEntity>> ANDESITE_ALLOY_BELL_1 = BLOCK_ENTITIES.register("andesite_bell",
            () -> BlockEntityType.Builder.of(AndesiteBellBlockEntity::new, ModBlocks.ANDESITE_ALLOY_BELL_1.get()).build(null));


    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BrassMediumBellBlockEntity>> BRASS_BELL_2 = BLOCK_ENTITIES.register("brass_bell_2",
            () -> BlockEntityType.Builder.of(BrassMediumBellBlockEntity::new, ModBlocks.BRASS_BELL_2.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}