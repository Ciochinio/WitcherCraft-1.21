package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class ExpfixProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerExperience >= entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftAbilitesExperienceRequirement) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.wichercraftPlayerExperience = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerExperience - entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftAbilitesExperienceRequirement;
				_vars.wichercraftPlayerLevel = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel + 1;
				_vars.markSyncDirty();
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("poziom  " + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel)), false);
			if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel >= 21) {
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.wichercraftAbilitesExperienceRequirement = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftAbilitesExperienceRequirement + 100;
					_vars.markSyncDirty();
				}
			} else if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel <= 20 && entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel > 10) {
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.wichercraftAbilitesExperienceRequirement = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftAbilitesExperienceRequirement + 50;
					_vars.markSyncDirty();
				}
			} else if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel <= 10) {
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.wichercraftAbilitesExperienceRequirement = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftAbilitesExperienceRequirement + 25;
					_vars.markSyncDirty();
				}
			}
		}
	}
}