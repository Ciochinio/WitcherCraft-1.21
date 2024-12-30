package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class CrippllingStrikesEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesPreciseBlows) {
			if (CharacterAbilitiesExperienceCheckProcedure.execute(entity)) {
				if (CharacterAbilitiesTier3Procedure.execute(entity)) {
					CharacterAbilitiesExperienceRemoveProcedure.execute(entity);
					{
						WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
						_vars.witchercraftAbilitiesCripplingStrikes = true;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		}
	}
}
