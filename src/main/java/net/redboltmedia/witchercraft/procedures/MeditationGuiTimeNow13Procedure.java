package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow13Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 6500 && world.dayTime() <= 7500) {
			return true;
		}
		return false;
	}
}