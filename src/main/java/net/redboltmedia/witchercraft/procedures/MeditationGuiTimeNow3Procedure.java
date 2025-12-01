package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow3Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 20500 && world.dayTime() <= 21500) {
			return true;
		}
		return false;
	}
}