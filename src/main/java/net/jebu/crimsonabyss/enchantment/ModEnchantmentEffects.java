package net.jebu.crimsonabyss.enchantment;

import com.mojang.serialization.MapCodec;
import net.jebu.crimsonabyss.CrimsonAbyss;
import net.jebu.crimsonabyss.enchantment.custom.AbyssalLureEnchantmentEffect;
import net.jebu.crimsonabyss.enchantment.custom.InkingArrowsEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {
    public static final MapCodec<? extends EnchantmentEntityEffect> ABYSSAL_LURE = registerEntityEffect("abyssal_lure", AbyssalLureEnchantmentEffect.CODEC);
    public static final MapCodec<? extends EnchantmentEntityEffect> INKING_ARROWS = registerEntityEffect("inking_arrows", InkingArrowsEnchantmentEffect.CODEC);

    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec){
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(CrimsonAbyss.MOD_ID, name), codec);
    }

    public static void registerEnchantmentEffects() {
        CrimsonAbyss.LOGGER.info("Register Mod Enchantment Effects for " + CrimsonAbyss.MOD_ID);
    }
}
