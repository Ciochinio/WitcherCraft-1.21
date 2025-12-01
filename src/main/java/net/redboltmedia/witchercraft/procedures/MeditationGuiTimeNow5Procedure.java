package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow5Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 22500 && world.dayTime() <= 23500) {
			return true;
		}
		return false;
	}
}