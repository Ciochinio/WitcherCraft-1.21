package net.redboltmedia.witchercraft.potion;

import net.redboltmedia.witchercraft.procedures.BleedEffectStartProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BleedMobEffect extends MobEffect {
	public BleedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		BleedEffectStartProcedure.execute(entity.level(), entity);
	}
}