package net.jebu.crimsonabyss.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jebu.crimsonabyss.CrimsonAbyss;
import net.jebu.crimsonabyss.block.custom.CeruleanLampBlock;
import net.jebu.crimsonabyss.block.custom.CrimsonLampBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CRIMSON_LAMP = registerBlock("crimson_lamp",
            new CrimsonLampBlock(AbstractBlock.Settings.create()
                    .strength(1f).requiresTool().sounds(BlockSoundGroup.GLASS)
                    .luminance(state -> state.get(CrimsonLampBlock.CLICKED) ? 15 : 0)));

    public static final Block CERULEAN_LAMP = registerBlock("cerulean_lamp",
            new CeruleanLampBlock(AbstractBlock.Settings.create()
                    .strength(1f).requiresTool().sounds(BlockSoundGroup.GLASS)
                    .luminance(state -> state.get(CeruleanLampBlock.CLICKED) ? 15 : 0)));

    public static final Block CRIMSON_POWERBLOCK = registerBlock("crimson_powerblock",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.HANGING_ROOTS).luminance(state -> 5)));
    public static final Block CERULEAN_POWERBLOCK = registerBlock("cerulean_powerblock",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.HANGING_ROOTS).luminance(state -> 5)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CrimsonAbyss.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CrimsonAbyss.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CrimsonAbyss.LOGGER.info("Registering Mod Blocks for " + CrimsonAbyss.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.CRIMSON_POWERBLOCK);
            fabricItemGroupEntries.add(ModBlocks.CERULEAN_POWERBLOCK);
            fabricItemGroupEntries.add(ModBlocks.CRIMSON_LAMP);
            fabricItemGroupEntries.add(ModBlocks.CERULEAN_LAMP);
        });
    }
}