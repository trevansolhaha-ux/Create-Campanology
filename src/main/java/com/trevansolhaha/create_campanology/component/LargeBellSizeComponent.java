package com.trevansolhaha.create_campanology.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.trevansolhaha.create_campanology.content.bell.generic.ModLargeBellSizes;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.StreamCodec;

public record LargeBellSizeComponent(ModLargeBellSizes size) {
    public static final Codec<LargeBellSizeComponent> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ModLargeBellSizes.CODEC.fieldOf("size").forGetter(LargeBellSizeComponent::size)
    ).apply(instance, LargeBellSizeComponent::new));

    public static final StreamCodec<ByteBuf, LargeBellSizeComponent> STREAM_CODEC = StreamCodec.composite(
            ModLargeBellSizes.STREAM_CODEC, LargeBellSizeComponent::size,
            LargeBellSizeComponent::new);

    public ModLargeBellSizes getSize() {
        return size;
    }

    public static LargeBellSizeComponent getDefaultValue() {
        return new LargeBellSizeComponent(ModLargeBellSizes.ONE);
    }
}
