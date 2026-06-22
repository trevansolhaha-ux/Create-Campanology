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

public enum ModBellSizes implements StringRepresentable {
    SMALL(0, 0.5F),
    MEDIUM(1, 1.0F),
    LARGE(2, 1.5F),
    ;

    private static final ModBellSizes[] VALUES = values();
    private static final IntFunction<ModBellSizes> BY_ID = ByIdMap.sparse(ModBellSizes::getId, VALUES, SMALL);
    public static final Codec<ModBellSizes> CODEC = StringRepresentable.fromEnum(ModBellSizes::values);
    public static final StreamCodec<ByteBuf, ModBellSizes> STREAM_CODEC = ByteBufCodecs.idMapper(BY_ID, ModBellSizes::getId);

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
    public @NotNull String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public static ModBellSizes getNextSize(ModBellSizes current) {
        int nextIndex = (current.ordinal() + 1) % VALUES.length;
        return VALUES[nextIndex];
    }

    public static ModBellSizes parse(String name) {
        for (ModBellSizes size : VALUES) {
            if (size.getSerializedName().equalsIgnoreCase(name)) {
                return size;
            }
        }
        return SMALL;
    }
}
