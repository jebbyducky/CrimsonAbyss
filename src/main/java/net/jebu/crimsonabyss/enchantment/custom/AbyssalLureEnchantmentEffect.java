package net.jebu.crimsonabyss.enchantment.custom;

import com.mojang.serialization.MapCodec;

import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;

import net.minecraft.entity.LivingEntity;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

import java.util.List;


public record AbyssalLureEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<AbyssalLureEnchantmentEffect> CODEC = MapCodec.unit(AbyssalLureEnchantmentEffect::new);



    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if (context.owner() instanceof LivingEntity attacker) {
            double radius = 2.0 + level;
            List<LivingEntity> nearby = world.getEntitiesByClass(LivingEntity.class, attacker.getBoundingBox().expand(radius), e -> e != attacker);

            for (LivingEntity entity : nearby) {
                Vec3d pullDirection = attacker.getPos().subtract(entity.getPos()).normalize();
                Vec3d scaledDirection = new Vec3d(
                        pullDirection.x * 0.5 * level,
                        pullDirection.y * 0.5 * level,
                        pullDirection.z * 0.5 * level
                );
                entity.setVelocity(scaledDirection);
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 40, level, false,false));
            }
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
