package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AdditionalDamageProcedure {
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
		double sumAdditionalDamage = 0;
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesMuscleMemory == true) {
			sumAdditionalDamage = sumAdditionalDamage + 3;
		}
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesColdBlood == true && entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftEnemyNearby == false) {
			sumAdditionalDamage = sumAdditionalDamage + 5;
		}
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesFloodOfAnger == true && entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftEnemyNearby == true) {
			sumAdditionalDamage = sumAdditionalDamage + 5;
		}
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftAdditionalDamage = sumAdditionalDamage;
			_vars.markSyncDirty();
		}
	}
}