package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow8Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 1500 && world.dayTime() <= 2500) {
			return true;
		}
		return false;
	}
}