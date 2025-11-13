package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class PassiveStaminaRegenStartProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double sumPassiveHealthRegeneration = 0;
		double sumPassiveStaminaRegeneration = 0;
		sumPassiveStaminaRegeneration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftBaseStaminaRegeneration;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.TAWNY_OWL_EFFECT)) {
			sumPassiveStaminaRegeneration = sumPassiveStaminaRegeneration + 1;
		}
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftPassiveStaminaRegeneration = sumPassiveStaminaRegeneration;
			_vars.markSyncDirty();
		}
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.PASSIVE_STAMINA_REGEN_TICK)) {
			WitchercraftMod.queueServerWork(40, () -> {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftPassiveStaminaRegeneration));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.PASSIVE_STAMINA_REGEN_TICK, 1, 0));
			});
		}
	}
}