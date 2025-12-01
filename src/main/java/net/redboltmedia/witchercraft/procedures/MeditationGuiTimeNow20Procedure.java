package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow20Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 13500 && world.dayTime() <= 14500) {
			return true;
		}
		return false;
	}
}