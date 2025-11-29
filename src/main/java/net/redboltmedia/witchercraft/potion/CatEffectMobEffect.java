package net.redboltmedia.witchercraft.potion;

import net.redboltmedia.witchercraft.procedures.CatEffectActiveProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;

public class CatEffectMobEffect extends MobEffect {
	public CatEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		CatEffectActiveProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}