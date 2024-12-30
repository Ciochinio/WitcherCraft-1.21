package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class GourmentEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (CharacterAbilitiesExperienceCheckProcedure.execute(entity)) {
			CharacterAbilitiesExperienceRemoveProcedure.execute(entity);
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.witchercraftAbiltiesGourment = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
