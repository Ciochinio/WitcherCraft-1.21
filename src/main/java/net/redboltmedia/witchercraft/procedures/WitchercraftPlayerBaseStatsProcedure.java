package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.minecraft.world.entity.Entity;

public class WitchercraftPlayerBaseStatsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftBaseHealth = 20;
			_vars.witchercraftArmor = 0;
			_vars.witchercraftBaseMovementSpeed = 3;
			_vars.witchercraftAdditionalDamage = 0;
			_vars.witchercraftCritChance = 5;
			_vars.witchercraftCritDamage = 50;
			_vars.witchercraftAttackSpeed = 0;
			_vars.witchercraftPassiveHealthRegeneration = 0;
			_vars.witchercraftToxicity = 0;
			_vars.markSyncDirty();
		}
	}
}