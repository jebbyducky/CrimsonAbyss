package net.jebu.crimsonabyss;

import net.fabricmc.api.ModInitializer;
import net.jebu.crimsonabyss.block.ModBlocks;
import net.jebu.crimsonabyss.effect.ModEffects;
import net.jebu.crimsonabyss.enchantment.ModEnchantmentEffects;
import net.jebu.crimsonabyss.item.ModItemGroups;
import net.jebu.crimsonabyss.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrimsonAbyss implements ModInitializer {
    public static final String MOD_ID = "crimsonabyss";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModEffects.registerEffects();
        ModEnchantmentEffects.registerEnchantmentEffects();
    }
}