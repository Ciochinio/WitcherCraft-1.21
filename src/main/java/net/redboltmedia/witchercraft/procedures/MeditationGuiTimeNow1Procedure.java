package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow1Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 18500 && world.dayTime() <= 19500) {
			return true;
		}
		return false;
	}
}