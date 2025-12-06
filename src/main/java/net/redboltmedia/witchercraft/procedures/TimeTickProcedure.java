package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@EventBusSubscriber
public class TimeTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static String execute(LevelAccessor world, Entity entity) {
		return execute(null, world, entity);
	}

	private static String execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftTick = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftTick + 1;
			_vars.markSyncDirty();
		}
		if ((entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftTick / 20) % 3 == 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("i cyk 3 sekundy"), false);
			PassiveHealthRegenStartProcedure.execute(world, entity);
			PassiveStaminaRegenStartProcedure.execute(world, entity);
			ToxicityTickStartProcedure.execute(world, entity);
		}
		return "" + (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftTick / 20) % 3;
	}
}