package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.entity.Entity;

public class GourmetEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (CharacterAbilitiesExperienceCheckProcedure.execute(entity)) {
			CharacterAbilitiesExperienceRemoveProcedure.execute(entity);
		}
	}
}