package net.jebu.crimsonabyss.effect;

import net.jebu.crimsonabyss.CrimsonAbyss;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> SLUDGED = registerStatusEffect("sludged",
            new sludgedEffect(StatusEffectCategory.HARMFUL, 0x000080)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(CrimsonAbyss.MOD_ID, "sludged"), -0.15F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE,
                            Identifier.of(CrimsonAbyss.MOD_ID, "sludged"), -4.0, EntityAttributeModifier.Operation.ADD_VALUE)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED,
                            Identifier.of(CrimsonAbyss.MOD_ID, "sludged"), -0.2F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(CrimsonAbyss.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        CrimsonAbyss.LOGGER.info("Registering Mod Effects for " + CrimsonAbyss.MOD_ID);
    }
}