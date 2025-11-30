package net.jebu.crimsonabyss.item;

import net.jebu.crimsonabyss.CrimsonAbyss; // <-- updated
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> CRIMSON_ARMOR_MATERIAL = registerArmorMaterial("crimson",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.CRIMSON_POWDER),
                    List.of(new ArmorMaterial.Layer(Identifier.of(CrimsonAbyss.MOD_ID, "crimson"))), 3.5F, 1f));

    public static final RegistryEntry<ArmorMaterial> CERULEAN_ARMOR_MATERIAL = registerArmorMaterial("cerulean",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.CERULEAN_POWDER),
                    List.of(new ArmorMaterial.Layer(Identifier.of(CrimsonAbyss.MOD_ID, "cerulean"))), 3.5F, 0.5f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                Identifier.of(CrimsonAbyss.MOD_ID, name),
                material.get()
        );
    }
}