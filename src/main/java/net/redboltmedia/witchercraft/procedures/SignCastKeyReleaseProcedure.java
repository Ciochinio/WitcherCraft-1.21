package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

public class SignCastKeyReleaseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.YRDEN_SIGN) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.IGNI_SIGN)
				|| entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(WitchercraftModMobEffects.AXII_SIGN) || entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(WitchercraftModMobEffects.QUEN_SIGN)
				|| entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(WitchercraftModMobEffects.AARD_SIGN)) && entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSignKeyHold == true
				&& !(entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(WitchercraftModMobEffects.SIGN_COOLDOWN))) {
			if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSignKeyHoldTime > 5) {
				if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 8) {
					if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(WitchercraftModMobEffects.YRDEN_SIGN)) {
						AltYrdenCastProcedure.execute(world, x, y, z, entity);
					} else if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(WitchercraftModMobEffects.IGNI_SIGN)) {
						AltIgniCastProcedure.execute(entity);
					} else if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(WitchercraftModMobEffects.AXII_SIGN)) {
						AltAxiiCastProcedure.execute(world, entity);
					} else if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(WitchercraftModMobEffects.QUEN_SIGN)) {
						AltQuenCastProcedure.execute(entity);
					} else if (entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(WitchercraftModMobEffects.AARD_SIGN)) {
						AltAardCastProcedure.execute(entity);
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 30, 0));
					SignCostProcedure.execute(entity);
					SignCostProcedure.execute(entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Not enough stamina for alternate sign"), true);
				}
			}
			if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSignKeyHoldTime <= 5) {
				if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 4) {
					if (entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(WitchercraftModMobEffects.YRDEN_SIGN)) {
						YrdenCastProcedure.execute(world, x, y, z, entity);
					} else if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(WitchercraftModMobEffects.IGNI_SIGN)) {
						IgniCastProcedure.execute(world, x, y, z, entity);
					} else if (entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(WitchercraftModMobEffects.AXII_SIGN)) {
						AxiiCastProcedure.execute(world, entity);
					} else if (entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(WitchercraftModMobEffects.QUEN_SIGN)) {
						QuenCastProcedure.execute(entity);
					} else if (entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(WitchercraftModMobEffects.AARD_SIGN)) {
						AardCastProcedure.execute(entity);
					}
					SignCostProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 30, 0));
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Not enough stamina"), true);
				}
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(WitchercraftModMobEffects.SIGN_HOLD);
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftSignKeyHold = false;
			_vars.witchercraftSignKeyHoldTime = 0;
			_vars.markSyncDirty();
		}
	}
}