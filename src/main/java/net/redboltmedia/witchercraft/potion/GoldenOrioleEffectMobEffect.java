
package net.redboltmedia.witchercraft.potion;

import net.redboltmedia.witchercraft.procedures.GoldenOrioleEffectActiveProcedure;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;

import java.util.Set;

public class GoldenOrioleEffectMobEffect extends InstantenousMobEffect {
	public GoldenOrioleEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16777216);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
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
