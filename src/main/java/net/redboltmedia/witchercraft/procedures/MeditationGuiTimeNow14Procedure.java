package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow14Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 7500 && world.dayTime() <= 8500) {
			return true;
		}
		return false;
	}
}