package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class FarReachingAardEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (CharacterAbilitiesExperienceCheckProcedure.execute(entity)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.witchercraftAbilitiesFarReachingAard = true;
				_vars.markSyncDirty();
			}
			CharacterAbilitiesExperienceRemoveProcedure.execute(entity);
		}
	}
}