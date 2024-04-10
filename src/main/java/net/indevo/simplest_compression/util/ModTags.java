package net.indevo.simplest_compression.util;

import net.indevo.simplest_compression.SimplestCompression;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ADVANCED_STONE_TOOL_MATERIALS = tag("advanced_stone_tool_materials");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(SimplestCompression.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        public static final TagKey<Item> ADVANCED_STONE_TOOL_MATERIALS = tag("advanced_stone_tool_materials");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(SimplestCompression.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
