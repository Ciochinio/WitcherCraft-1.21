package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GraveHagDecoctionHitProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.GRAVE_HAG_DECOCTION_EFFECT) && sourceentity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.IN_COMBAT)) {
			if (sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftGraveHagDecoctionKill < 10) {
				{
					WitchercraftModVariables.PlayerVariables _vars = sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.witchercraftGraveHagDecoctionKill = sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftGraveHagDecoctionKill + 1;
					_vars.markSyncDirty();
				}
			}
		}
	}
}