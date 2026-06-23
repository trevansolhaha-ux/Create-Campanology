package com.trevansolhaha.create_campanology.init;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.component.BellSizeComponent;
import com.trevansolhaha.create_campanology.component.LargeBellSizeComponent;
import com.trevansolhaha.create_campanology.component.MediumBellSizeComponent;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.UnaryOperator;

public class ModDataComponents {
    public static final DeferredRegister.DataComponents DATA_COMPONENTS = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, CreateCampanology.MOD_ID);

    public static final DataComponentType<BellSizeComponent> BELL_SIZE = register("bell_size", builder -> builder.persistent(BellSizeComponent.CODEC).networkSynchronized(BellSizeComponent.STREAM_CODEC));
    public static final DataComponentType<MediumBellSizeComponent> MEDIUM_BELL_SIZE = register("medium_bell_size", builder -> builder.persistent(MediumBellSizeComponent.CODEC).networkSynchronized(MediumBellSizeComponent.STREAM_CODEC));
    public static final DataComponentType<LargeBellSizeComponent> LARGE_BELL_SIZE = register("large_bell_size", builder -> builder.persistent(LargeBellSizeComponent.CODEC).networkSynchronized(LargeBellSizeComponent.STREAM_CODEC));

    private static <T> DataComponentType<T> register(String name, UnaryOperator<DataComponentType.Builder<T>> builder) {
        DataComponentType<T> type = builder.apply(DataComponentType.builder()).build();
        DATA_COMPONENTS.register(name, () -> type);
        return type;
    }
    public static void register(IEventBus eventBus) {
        DATA_COMPONENTS.register(eventBus);
    }
}
