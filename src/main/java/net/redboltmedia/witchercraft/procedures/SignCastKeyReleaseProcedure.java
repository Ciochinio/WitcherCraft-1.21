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
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.SIGN_COOLDOWN))) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 4) {
				if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSignKeyHoldTime < 50 && entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(WitchercraftModMobEffects.YRDEN_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("YRDEN SHORT"), false);
					YrdenCastProcedure.execute(world, x, y, z, entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				} else if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(WitchercraftModMobEffects.IGNI_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					IgniCastProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				} else if (entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(WitchercraftModMobEffects.AXII_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					AxiiCastProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				} else if (entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(WitchercraftModMobEffects.QUEN_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					QuenCastProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				} else if (entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(WitchercraftModMobEffects.AARD_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					AardCastProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				}
				if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSignKeyHoldTime > 50 && entity instanceof LivingEntity _livEnt23 && _livEnt23.hasEffect(WitchercraftModMobEffects.YRDEN_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("YRDEN LONG"), false);
					YrdenCastProcedure.execute(world, x, y, z, entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				} else if (entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(WitchercraftModMobEffects.IGNI_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					IgniCastProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				} else if (entity instanceof LivingEntity _livEnt32 && _livEnt32.hasEffect(WitchercraftModMobEffects.AXII_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					AxiiCastProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				} else if (entity instanceof LivingEntity _livEnt36 && _livEnt36.hasEffect(WitchercraftModMobEffects.QUEN_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					QuenCastProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				} else if (entity instanceof LivingEntity _livEnt40 && _livEnt40.hasEffect(WitchercraftModMobEffects.AARD_SIGN)) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4);
					AardCastProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SIGN_COOLDOWN, 100, 1));
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Not enough stamina"), true);
			}
		}
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftSignKeyHold = false;
			_vars.witchercraftSignKeyHoldTime = 0;
			_vars.markSyncDirty();
		}
	}
}