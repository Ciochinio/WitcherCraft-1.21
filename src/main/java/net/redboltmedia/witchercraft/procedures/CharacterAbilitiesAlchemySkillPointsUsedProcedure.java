package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class CharacterAbilitiesAlchemySkillPointsUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftAbilitiesAlchemySkillPointsUsed = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesAlchemySkillPointsUsed + 1;
			_vars.witchercraftAbilitiesLearned = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesLearned + 1;
			_vars.markSyncDirty();
		}
	}
}