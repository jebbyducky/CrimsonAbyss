package net.jebu.crimsonabyss.util;

import net.jebu.crimsonabyss.CrimsonAbyss;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_CRIMSON_TOOL = createTag("needs_crimson_tool");
        public static final TagKey<Block> INCORRECT_FOR_CRIMSON_TOOL = createTag("incorrect_for_crimson_tool");
        public static final TagKey<Block> INCORRECT_FOR_ABYSSAL_TOOL = createTag("incorrect_for_abyssal_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(CrimsonAbyss.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ABYSSAL_LONGSWORD = createTag("abyssal_longsword");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(CrimsonAbyss.MOD_ID, name));
        }
    }
}