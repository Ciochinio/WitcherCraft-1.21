package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class SideEffectsEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesDelayedRecovery) {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 5 + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesLearned) {
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.witchercraftAbilitiesSideEffects = true;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player)
					_player.giveExperienceLevels(-((int) (5 + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesLearned)));
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.witchercraftAbilitiesLearned = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesLearned + 1;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
