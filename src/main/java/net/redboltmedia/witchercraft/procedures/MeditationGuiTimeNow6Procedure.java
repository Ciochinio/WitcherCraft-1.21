package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow6Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 23500 && world.dayTime() <= 23999 || world.dayTime() >= 1 && world.dayTime() <= 500) {
			return true;
		}
		return false;
	}
}