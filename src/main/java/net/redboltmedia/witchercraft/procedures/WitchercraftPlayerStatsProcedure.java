package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class WitchercraftPlayerStatsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Health" + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftHealth)), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Movement Speed " + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftMovementSpeed)), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Armor" + (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0))), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Attack Speed" + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAttackSpeed)), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Crit Rate" + (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritChance + "%"))), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Crit Damage" + (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritDamage + "%"))), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Passive Health Regeneration" + (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftPassiveHealthRegeneration + "Hp/2s"))), false);
	}
}
