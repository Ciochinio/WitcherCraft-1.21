package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class CharacterAbilitiesSignsSkillPointsUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftAbilitiesSignsSkillPointsUsed = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesSignsSkillPointsUsed + 1;
			_vars.witchercraftAbilitiesLearned = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesLearned + 1;
			_vars.markSyncDirty();
		}
	}
}