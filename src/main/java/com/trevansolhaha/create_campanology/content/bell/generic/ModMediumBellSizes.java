package com.trevansolhaha.create_campanology.content.bell.generic;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.StringRepresentable;

import java.util.Locale;

public enum ModMediumBellSizes implements StringRepresentable {
    ONE(0, 0.5F),
    TWO(1, 1.0F),
    THREE(2, 1.5F),
    FOUR(3, 2.0F),
    FIVE(4, 2.5F),
    ;

    public static final Codec<ModMediumBellSizes> CODEC = StringRepresentable.fromEnum(ModMediumBellSizes::values);
    public static final StreamCodec<ByteBuf, ModMediumBellSizes> STREAM_CODEC = ByteBufCodecs.STRING_UTF8.map(ModMediumBellSizes::parse, ModMediumBellSizes::getSerializedName);

    private final int id;
    private final float pitchModifier;

    ModMediumBellSizes(int id, float pitchModifier) {
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

    public static ModMediumBellSizes getNextSize(ModMediumBellSizes current) { // is this the most efficient?
        int nextId = (current.getId() + 1) % values().length;
        for (ModMediumBellSizes size : values()) {
            if (size.getId() == nextId) {
                return size;
            }
        }
        return ONE;
    }

    public static ModMediumBellSizes parse(String name) {
        for (ModMediumBellSizes size : values()) {
            if (size.getSerializedName().equals(name)) {
                return size;
            }
        }
        return ONE;
    }
}
