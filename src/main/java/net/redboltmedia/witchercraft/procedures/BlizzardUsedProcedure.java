package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class BlizzardUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.WITHER)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.BLIZZARD_EFFECT, 7200, 0));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.BLIZZARD_EFFECT, 3600, 0));
		}
	}
}
