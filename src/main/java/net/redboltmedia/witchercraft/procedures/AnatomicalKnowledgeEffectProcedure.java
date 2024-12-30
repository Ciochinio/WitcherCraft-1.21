package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class AnatomicalKnowledgeEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesColdBlood) {
			if (CharacterAbilitiesExperienceCheckProcedure.execute(entity)) {
				if (CharacterAbilitiesTier2Procedure.execute(entity)) {
					CharacterAbilitiesExperienceRemoveProcedure.execute(entity);
					{
						WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
						_vars.witchercraftAbilitiesAnatomicalKnowledge = true;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		}
	}
}
