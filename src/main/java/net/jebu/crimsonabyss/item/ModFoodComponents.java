package net.jebu.crimsonabyss.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CRIMSON_INFUSED_BREAD = new FoodComponent.Builder().nutrition(10).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,1200,1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 2), 0.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 400,1), 0.75f).build();
    public static final FoodComponent CERULEAN_INFUSED_BREAD = new FoodComponent.Builder().nutrition(10).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,1200, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 120), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 2), 0.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 400,1), 0.75f).build();

    public static final FoodComponent BLUE_POWDER = new FoodComponent.Builder().nutrition(1).alwaysEdible().saturationModifier(1)
            .snack().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 255), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100, 5),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 40, 255), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 40, 5),1f).build();


}
