package net.jebu.crimsonabyss.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jebu.crimsonabyss.CrimsonAbyss;
import net.jebu.crimsonabyss.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CRIMSON_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(CrimsonAbyss.MOD_ID, "crimson_items_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.CRIMSON_BLOSSOM))
                    .displayName(Text.translatable("itemgroup.crimsonabyss.crimson_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CRIMSON_BLOSSOM);
                        entries.add(ModItems.CRIMSON_POWDER);
                        entries.add(ModBlocks.CRIMSON_POWERBLOCK);
                        entries.add(ModItems.CRIMSON_DOUGH);
                        entries.add(ModItems.CRIMSON_INFUSED_BREAD);
                        entries.add(ModBlocks.CRIMSON_LAMP);

                        entries.add(ModItems.CERULEAN_STARFLOWER);
                        entries.add(ModItems.CERULEAN_POWDER);
                        entries.add(ModBlocks.CERULEAN_POWERBLOCK);
                        entries.add(ModItems.CERULEAN_DOUGH);
                        entries.add(ModItems.CERULEAN_INFUSED_BREAD);
                        entries.add(ModBlocks.CERULEAN_LAMP);

                        entries.add(ModItems.CRIMSON_SWORD);
                        entries.add(ModItems.CRIMSON_PICKAXE);
                        entries.add(ModItems.CRIMSON_SHOVEL);
                        entries.add(ModItems.CRIMSON_AXE);
                        entries.add(ModItems.CRIMSON_HOE);

                        entries.add(ModItems.CERULEAN_SWORD);
                        entries.add(ModItems.CERULEAN_PICKAXE);
                        entries.add(ModItems.CERULEAN_SHOVEL);
                        entries.add(ModItems.CERULEAN_AXE);
                        entries.add(ModItems.CERULEAN_HOE);

                        entries.add(ModItems.CRIMSON_HELMET);
                        entries.add(ModItems.CRIMSON_CHESTPLATE);
                        entries.add(ModItems.CRIMSON_LEGGINGS);
                        entries.add(ModItems.CRIMSON_BOOTS);

                        entries.add(ModItems.CERULEAN_HELMET);
                        entries.add(ModItems.CERULEAN_CHESTPLATE);
                        entries.add(ModItems.CERULEAN_LEGGINGS);
                        entries.add(ModItems.CERULEAN_BOOTS);

                        entries.add(ModItems.BLUE_POWDER);
                    })
                    .build()
    );

    public static final ItemGroup ABYSSAL_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(CrimsonAbyss.MOD_ID, "abyssal_items_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.ABYSSAL_SHARD))
                    .displayName(Text.translatable("itemgroup.crimsonabyss.abyssal_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ABYSSAL_SHARD);
                        entries.add(ModItems.ABYSSAL_LONGSWORD);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        CrimsonAbyss.LOGGER.info("Registering Item Groups for " + CrimsonAbyss.MOD_ID);
    }
}