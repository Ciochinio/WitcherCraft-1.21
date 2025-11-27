package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PotionDurationProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.sumPotionDuration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftPotionDuration;
			_vars.markSyncDirty();
		}
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesGriffinSchool == true) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumPotionDuration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumPotionDuration + 20;
				_vars.markSyncDirty();
			}
		}
	}
}