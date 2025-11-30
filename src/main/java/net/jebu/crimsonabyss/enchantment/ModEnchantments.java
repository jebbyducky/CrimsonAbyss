package net.jebu.crimsonabyss.enchantment;

import net.jebu.crimsonabyss.CrimsonAbyss;
import net.jebu.crimsonabyss.enchantment.custom.AbyssalLureEnchantmentEffect;
import net.jebu.crimsonabyss.enchantment.custom.InkingArrowsEnchantmentEffect;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    public static final RegistryKey<Enchantment> INKING_ARROWS =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(CrimsonAbyss.MOD_ID, "inking_arrows"));
    public static final RegistryKey<Enchantment> ABYSSAL_LURE =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(CrimsonAbyss.MOD_ID, "abyssal_lure"));

    public static void bootstrap(Registerable<Enchantment> registerable) {
        var enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        var items = registerable.getRegistryLookup(RegistryKeys.ITEM);

        register(registerable, ABYSSAL_LURE, Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
                        items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
                        5,
                        2,
                        Enchantment.leveledCost(5, 7),
                        Enchantment.leveledCost(25, 9),
                        2,
                        AttributeModifierSlot.MAINHAND))
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                        EnchantmentEffectTarget.ATTACKER, EnchantmentEffectTarget.VICTIM,
                        new AbyssalLureEnchantmentEffect())
        );

        register(registerable, INKING_ARROWS, Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ItemTags.BOW_ENCHANTABLE),
                        items.getOrThrow(ItemTags.CROSSBOW_ENCHANTABLE),
                        5,
                        2,
                        Enchantment.leveledCost(5, 7),
                        Enchantment.leveledCost(25, 9),
                        2,
                        AttributeModifierSlot.MAINHAND))
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                        EnchantmentEffectTarget.ATTACKER, EnchantmentEffectTarget.VICTIM,
                        new InkingArrowsEnchantmentEffect())
        );
    }

    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key, builder.build(key.getValue()));
    }
}
