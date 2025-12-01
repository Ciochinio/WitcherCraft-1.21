package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow2Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 19500 && world.dayTime() <= 20500) {
			return true;
		}
		return false;
	}
}