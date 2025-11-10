package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class CharacterAbilitiesExperienceCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel - entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesLearned >= 1) {
			return true;
		}
		return false;
	}
}