package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow19Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 12500 && world.dayTime() <= 13500) {
			return true;
		}
		return false;
	}
}