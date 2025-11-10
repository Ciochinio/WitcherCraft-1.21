package net.redboltmedia.witchercraft.potion;

import net.redboltmedia.witchercraft.procedures.KillerWhaleActiveProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class KillerWhaleEffectMobEffect extends MobEffect {
	public KillerWhaleEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		KillerWhaleActiveProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}