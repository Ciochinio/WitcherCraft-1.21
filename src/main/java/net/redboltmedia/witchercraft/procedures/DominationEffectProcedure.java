package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class DominationEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesAxiiInntensiy) {
			if (CharacterAbilitesXpCheckProcedure.execute(entity)) {
				{
					WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
					_vars.witchercraftAbilitiesDominaion = true;
					_vars.markSyncDirty();
				}
				CharacterAbilitesXpRemoveProcedure.execute(entity);
			}
		}
	}
}