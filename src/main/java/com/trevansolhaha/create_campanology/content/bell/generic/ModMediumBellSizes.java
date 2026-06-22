package com.trevansolhaha.create_campanology.content.bell.generic;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.function.IntFunction;

public enum ModMediumBellSizes implements StringRepresentable {
    ONE(0, 2.5F),
    TWO(1, 2.0F),
    THREE(2, 1.5F),
    FOUR(3, 1.0F),
    FIVE(4, 0.5F),
    ;

    private static final ModMediumBellSizes[] VALUES = values();
    private static final IntFunction<ModMediumBellSizes> BY_ID = ByIdMap.sparse(ModMediumBellSizes::getId, VALUES, ONE);
    public static final Codec<ModMediumBellSizes> CODEC = StringRepresentable.fromEnum(ModMediumBellSizes::values);
    public static final StreamCodec<ByteBuf, ModMediumBellSizes> STREAM_CODEC = ByteBufCodecs.idMapper(BY_ID, ModMediumBellSizes::getId);

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
    public @NotNull String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public static ModMediumBellSizes getNextSize(ModMediumBellSizes current) {
        int nextIndex = (current.ordinal() + 1) % VALUES.length;
        return VALUES[nextIndex];
    }

    public static ModMediumBellSizes parse(String name) {
        for (ModMediumBellSizes size : VALUES) {
            if (size.getSerializedName().equalsIgnoreCase(name)) {
                return size;
            }
        }
        return ONE;
    }
}
