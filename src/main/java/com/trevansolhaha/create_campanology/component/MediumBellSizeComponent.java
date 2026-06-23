package com.trevansolhaha.create_campanology.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.trevansolhaha.create_campanology.content.bell.generic.ModMediumBellSizes;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.StreamCodec;

public record MediumBellSizeComponent(ModMediumBellSizes size) {
    public static final Codec<MediumBellSizeComponent> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ModMediumBellSizes.CODEC.fieldOf("size").forGetter(MediumBellSizeComponent::size)
    ).apply(instance, MediumBellSizeComponent::new));

    public static final StreamCodec<ByteBuf, MediumBellSizeComponent> STREAM_CODEC = StreamCodec.composite(
            ModMediumBellSizes.STREAM_CODEC, MediumBellSizeComponent::size,
            MediumBellSizeComponent::new);

    public ModMediumBellSizes getSize() {
        return size;
    }

    public static MediumBellSizeComponent getDefaultValue() {
        return new MediumBellSizeComponent(ModMediumBellSizes.ONE);
    }
}
