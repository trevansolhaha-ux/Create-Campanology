package com.trevansolhaha.create_campanology.tag;

import com.trevansolhaha.create_campanology.CreateCampanology;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags { // This class can probably be simplified
    public static class Mod {
        // for future use
        private static TagKey<Item> getModItemTagKey(String path) {
            return getItemTagKey(CreateCampanology.MOD_ID, path);
        }
        private static TagKey<Block> getModBlockTagKey(String path) {
            return getBlockTagKey(CreateCampanology.MOD_ID, path);
        }
    }

    public static class Common {
        public enum ItemTags {
            TIN_ORES(getCommonItemTagKey("ores/tin_ore")),
            ;
            private final TagKey<Item> tag;
            ItemTags(TagKey<Item> tag) {
                this.tag = tag;
            }
            public TagKey<Item> getTag() {
                return tag;
            }
        }
        public enum BlockTags {
            TIN_ORES(getCommonBlockTagKey("ores/tin_ore")),
            TIN_STORAGE_BLOCKS(getCommonBlockTagKey("storage_blocks/tin")),
            ;
            private final TagKey<Block> tag;
            BlockTags(TagKey<Block> tag) {
                this.tag = tag;
            }
            public TagKey<Block> getTag() {
                return tag;
            }
        }
        private static TagKey<Item> getCommonItemTagKey(String path) {
            return getItemTagKey("c", path);
        }
        private static TagKey<Block> getCommonBlockTagKey(String path) {
            return getBlockTagKey("c", path);
        }
    }

    protected static TagKey<Item> getItemTagKey(String modid, String path) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(modid, path));
    }
    private static TagKey<Block> getBlockTagKey(String modid, String path) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(modid, path));
    }
}
