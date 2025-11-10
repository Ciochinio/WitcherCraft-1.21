package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.entity.Entity;

public class KillerWhaleActiveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isUnderWater()) {
			entity.setAirSupply(300);
		}
	}
}