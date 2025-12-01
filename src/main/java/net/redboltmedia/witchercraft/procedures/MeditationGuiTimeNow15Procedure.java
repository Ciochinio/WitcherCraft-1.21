package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow15Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 8500 && world.dayTime() <= 9500) {
			return true;
		}
		return false;
	}
}