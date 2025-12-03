package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;

public class ToxicityTickStartProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double sumPassiveHealthRegeneration = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.TOXICITY_TICK)) {
			WitchercraftMod.queueServerWork(40, () -> {
				if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftToxicity > 0) {
					{
						WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
						_vars.witchercraftToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftToxicity - 1;
						_vars.markSyncDirty();
					}
					if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.DEV_LOG)) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("tox -1"), false);
					}
				}
				if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftToxicity >= entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).ToxicityOverdoseThreshold) {
					entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)),
							1 + Math.round(entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftToxicity / entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).ToxicityOverdoseThreshold));
					if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(WitchercraftModMobEffects.DEV_LOG)) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(
									Component.literal(
											("overdose za " + (1 + Math.round(entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftToxicity / entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).ToxicityOverdoseThreshold)))),
									false);
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.TOXICITY_TICK, 1, 0));
			});
		}
	}
}