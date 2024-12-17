package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class PassiveHealthRegenStartProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.sumPassiveHealthRegeneration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftPassiveHealthRegeneration;
			_vars.syncPlayerVariables(entity);
		}
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.SWALLOW_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumPassiveHealthRegeneration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumPassiveHealthRegeneration + 1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.PASSIVE_HEALTH_REGEN) && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 0) {
			WitchercraftMod.queueServerWork(20, () -> {
				if (!(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(WitchercraftModMobEffects.PASSIVE_HEALTH_REGEN_COOLDOWN)) && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 0) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.PASSIVE_HEALTH_REGEN_COOLDOWN, 60, 0));
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumPassiveHealthRegeneration));
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.PASSIVE_HEALTH_REGEN, 30, 0));
				PassiveHealthRegenStartProcedure.execute(world, entity);
			});
		}
	}
}
