package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow7Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 500 && world.dayTime() <= 1500) {
			return true;
		}
		return false;
	}
}