package com.trevansolhaha.create_campanology.content.bell.generic;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.StringRepresentable;

import java.util.Locale;

public enum ModBellSizes implements StringRepresentable {
    SMALL(0, 0.5F),
    MEDIUM(1, 1.0F),
    LARGE(2, 1.5F),
    ;

    public static final Codec<ModBellSizes> CODEC = StringRepresentable.fromEnum(ModBellSizes::values);
    public static final StreamCodec<ByteBuf, ModBellSizes> STREAM_CODEC = ByteBufCodecs.STRING_UTF8.map(ModBellSizes::parse, ModBellSizes::getSerializedName);

    private final int id;
    private final float pitchModifier;


    ModBellSizes(int id, float pitchModifier) {
        this.id = id;
        this.pitchModifier = pitchModifier;
    }

    public int getId() {
        return id;
    }

    public float getPitchModifier() {
        return pitchModifier;
    }

    @Override
    public String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public static ModBellSizes parse(String name) {
        for (ModBellSizes size : values()) {
            if (size.getSerializedName().equals(name)) {
                return size;
            }
        }
        return SMALL;
    }
}
