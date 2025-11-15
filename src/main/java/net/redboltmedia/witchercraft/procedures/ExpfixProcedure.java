package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.entity.Entity;

public class ExpfixProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < 50; index0++) {
			CharacterExperienceCalculatorProcedure.execute(entity, 0);
		}
	}
}