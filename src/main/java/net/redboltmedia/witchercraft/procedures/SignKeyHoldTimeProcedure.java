package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SignKeyHoldTimeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static String execute(Entity entity) {
		return execute(null, entity);
	}

	private static String execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return "";
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSignKeyHold == true) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.witchercraftSignKeyHoldTime = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSignKeyHoldTime + 1;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.SIGN_COOLDOWN)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WitchercraftModMobEffects.SIGN_HOLD);
		}
		return new java.text.DecimalFormat("##.##").format(entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSignKeyHoldTime);
	}
}