package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class CharacterAbilitesSkillPointsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Skill points aviable" + (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).wichercraftPlayerLevel - entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesLearned);
	}
}