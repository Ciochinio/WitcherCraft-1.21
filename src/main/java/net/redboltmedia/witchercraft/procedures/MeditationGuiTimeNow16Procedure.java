package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow16Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 9500 && world.dayTime() <= 10500) {
			return true;
		}
		return false;
	}
}