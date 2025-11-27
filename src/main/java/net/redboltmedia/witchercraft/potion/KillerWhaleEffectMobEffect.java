package net.redboltmedia.witchercraft.potion;

import net.redboltmedia.witchercraft.procedures.KillerWhaleEffectActiveProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;

public class KillerWhaleEffectMobEffect extends MobEffect {
	public KillerWhaleEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		KillerWhaleEffectActiveProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}