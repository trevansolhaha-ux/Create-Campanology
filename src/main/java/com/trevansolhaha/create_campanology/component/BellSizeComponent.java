package com.trevansolhaha.create_campanology.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBellSizes;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.StreamCodec;

public record BellSizeComponent(ModBellSizes size) {
    public static final Codec<BellSizeComponent> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ModBellSizes.CODEC.fieldOf("size").forGetter(BellSizeComponent::size)
    ).apply(instance, BellSizeComponent::new));

    public static final StreamCodec<ByteBuf, BellSizeComponent> STREAM_CODEC = StreamCodec.composite(
            ModBellSizes.STREAM_CODEC, BellSizeComponent::size,
            BellSizeComponent::new);

    public ModBellSizes getSize() {
        return size;
    }

    public static BellSizeComponent getDefaultValue() {
        return new BellSizeComponent(ModBellSizes.SMALL);
    }
}
