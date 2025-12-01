package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow11Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 4500 && world.dayTime() <= 5500) {
			return true;
		}
		return false;
	}
}