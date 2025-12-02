package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class SuccubusDecoctionTickStartProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.SUCCUBUS_DECOCTION_TICK)) {
			WitchercraftMod.queueServerWork(40, () -> {
				if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.SUCCUBUS_DECOCTION_EFFECT) && entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(WitchercraftModMobEffects.IN_COMBAT)) {
					if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSuccubusDecoctionTick < 10) {
						{
							WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
							_vars.witchercraftSuccubusDecoctionTick = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSuccubusDecoctionTick + 1;
							_vars.markSyncDirty();
						}
					}
				} else {
					{
						WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
						_vars.witchercraftSuccubusDecoctionTick = 0;
						_vars.markSyncDirty();
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.SUCCUBUS_DECOCTION_TICK, 1, 0));
			});
		}
	}
}