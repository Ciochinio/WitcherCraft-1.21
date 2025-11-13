package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class ToxicityOverdoseStartProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double sumPassiveHealthRegeneration = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.TOXICITY_OVERDOSE_TICK)) {
			WitchercraftMod.queueServerWork(40, () -> {
				if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumToxicity >= entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).ToxicityOverdoseThreshold) {
					entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 1);
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.TOXICITY_OVERDOSE_TICK, 1, 0));
			});
		}
	}
}