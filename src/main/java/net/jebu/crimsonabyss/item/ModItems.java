package net.jebu.crimsonabyss.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jebu.crimsonabyss.CrimsonAbyss;
import net.jebu.crimsonabyss.item.custom.ModSwordBlockingItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CERULEAN_STARFLOWER = registerItem("cerulean_starflower", new Item(new Item.Settings()));
    public static final Item CRIMSON_BLOSSOM = registerItem("crimson_blossom", new Item(new Item.Settings()));
    public static final Item CRIMSON_POWDER = registerItem("crimson_powder", new Item(new Item.Settings()));
    public static final Item CERULEAN_POWDER = registerItem("cerulean_powder", new Item(new Item.Settings()));
    public static final Item CERULEAN_DOUGH = registerItem("cerulean_dough", new Item(new Item.Settings()));
    public static final Item CRIMSON_DOUGH = registerItem("crimson_dough", new Item(new Item.Settings()));

    public static final Item ABYSSAL_SHARD = registerItem("abyssal_shard", new Item(new Item.Settings()));

    public static final Item CRIMSON_INFUSED_BREAD =
            registerItem("crimson_infused_bread", new Item(new Item.Settings().food(ModFoodComponents.CRIMSON_INFUSED_BREAD)));
    public static final Item CERULEAN_INFUSED_BREAD =
            registerItem("cerulean_infused_bread", new Item(new Item.Settings().food(ModFoodComponents.CERULEAN_INFUSED_BREAD)));
    public static final Item BLUE_POWDER =
            registerItem("blue_powder", new Item(new Item.Settings().food(ModFoodComponents.BLUE_POWDER).maxCount(65)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CrimsonAbyss.MOD_ID, name), item);
    }

    public static final Item CRIMSON_SWORD = registerItem("crimson_sword",
            new SwordItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 3, -2.4f))));

    public static final Item CRIMSON_PICKAXE = registerItem("crimson_pickaxe",
            new PickaxeItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 1, -2.8f))));

    public static final Item CRIMSON_SHOVEL = registerItem("crimson_shovel",
            new ShovelItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 1.5f, -2.4f))));

    public static final Item CRIMSON_AXE = registerItem("crimson_axe",
            new AxeItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 6, -3.2f))));

    public static final Item CRIMSON_HOE = registerItem("crimson_hoe",
            new HoeItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 2, -3f))));

    // Cerulean set (currently uses CRIMSON material in your original code — keeping as-is)
    public static final Item CERULEAN_SWORD = registerItem("cerulean_sword",
            new SwordItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 3, -2.4f))));

    public static final Item CERULEAN_PICKAXE = registerItem("cerulean_pickaxe",
            new PickaxeItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 1, -2.8f))));

    public static final Item CERULEAN_SHOVEL = registerItem("cerulean_shovel",
            new ShovelItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 1.5f, -2.4f))));

    public static final Item CERULEAN_AXE = registerItem("cerulean_axe",
            new AxeItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 6, -3.2f))));

    public static final Item CERULEAN_HOE = registerItem("cerulean_hoe",
            new HoeItem(ModToolMaterials.CRIMSON, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CRIMSON, 2, -3f))));

    public static final Item ABYSSAL_LONGSWORD = registerItem("abyssal_longsword",
            new ModSwordBlockingItem(ModToolMaterials.ABYSSAL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ABYSSAL, 1, -2.4f))));

    // Armor
    public static final Item CRIMSON_HELMET = registerItem("crimson_helmet",
            new ArmorItem(ModArmorMaterials.CRIMSON_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(38))));

    public static final Item CRIMSON_CHESTPLATE = registerItem("crimson_chestplate",
            new ArmorItem(ModArmorMaterials.CRIMSON_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(38))));

    public static final Item CRIMSON_LEGGINGS = registerItem("crimson_leggings",
            new ArmorItem(ModArmorMaterials.CRIMSON_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(38))));

    public static final Item CRIMSON_BOOTS = registerItem("crimson_boots",
            new ArmorItem(ModArmorMaterials.CRIMSON_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(38))));

    public static final Item CERULEAN_HELMET = registerItem("cerulean_helmet",
            new ArmorItem(ModArmorMaterials.CERULEAN_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(38))));

    public static final Item CERULEAN_CHESTPLATE = registerItem("cerulean_chestplate",
            new ArmorItem(ModArmorMaterials.CERULEAN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(38))));

    public static final Item CERULEAN_LEGGINGS = registerItem("cerulean_leggings",
            new ArmorItem(ModArmorMaterials.CERULEAN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(38))));

    public static final Item CERULEAN_BOOTS = registerItem("cerulean_boots",
            new ArmorItem(ModArmorMaterials.CERULEAN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(38))));

    public static void registerModItems() {
        CrimsonAbyss.LOGGER.info("Registering Mod Items for " + CrimsonAbyss.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(CRIMSON_BLOSSOM);
            entries.add(CERULEAN_STARFLOWER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CRIMSON_POWDER);
            entries.add(CERULEAN_POWDER);
            entries.add(ABYSSAL_SHARD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CRIMSON_INFUSED_BREAD);
            entries.add(CERULEAN_INFUSED_BREAD);
            entries.add(CRIMSON_DOUGH);
            entries.add(CERULEAN_DOUGH);
            entries.add(BLUE_POWDER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(CRIMSON_PICKAXE);
            entries.add(CRIMSON_SHOVEL);
            entries.add(CRIMSON_AXE);
            entries.add(CRIMSON_HOE);

            entries.add(CERULEAN_PICKAXE);
            entries.add(CERULEAN_SHOVEL);
            entries.add(CERULEAN_AXE);
            entries.add(CERULEAN_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(CERULEAN_SWORD);
            entries.add(CRIMSON_SWORD);
            entries.add(ABYSSAL_LONGSWORD);
        });
    }
}