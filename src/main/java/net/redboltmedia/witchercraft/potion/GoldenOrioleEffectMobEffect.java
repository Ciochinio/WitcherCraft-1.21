package net.redboltmedia.witchercraft.potion;

import net.redboltmedia.witchercraft.procedures.GoldenOrioleEffectActiveProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;

public class GoldenOrioleEffectMobEffect extends InstantenousMobEffect {
	public GoldenOrioleEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16777216);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		GoldenOrioleEffectActiveProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}