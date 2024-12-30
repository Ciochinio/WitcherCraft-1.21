package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.neoforged.neoforge.event.entity.player.PlayerXpEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CharacterAbilitesExpirenceProcedure {
	@SubscribeEvent
	public static void onPlayerXPChange(PlayerXpEvent.XpChange event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity entity, double amount) {
		execute(null, entity, amount);
	}

	private static void execute(@Nullable Event event, Entity entity, double amount) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("xp " + amount)), false);
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.wichercraftPlayerExperience = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerExperience + amount;
			_vars.syncPlayerVariables(entity);
		}
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel <= 10) {
			if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerExperience >= 100) {
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.wichercraftPlayerExperience = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerExperience - 100;
					_vars.syncPlayerVariables(entity);
				}
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.wichercraftPlayerLevel = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel + 1;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("poziom " + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel)), false);
			}
		} else if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel > 10 && entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel <= 21) {
			if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerExperience >= 200) {
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.wichercraftPlayerExperience = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerExperience - 200;
					_vars.syncPlayerVariables(entity);
				}
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.wichercraftPlayerLevel = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel + 1;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("poziom " + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel)), false);
			}
		} else if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel > 21) {
			if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerExperience >= 500) {
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.wichercraftPlayerExperience = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerExperience - 500;
					_vars.syncPlayerVariables(entity);
				}
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.wichercraftPlayerLevel = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel + 1;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("poziom " + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel)), false);
			}
		}
	}
}
