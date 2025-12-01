package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow4Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 21500 && world.dayTime() <= 22500) {
			return true;
		}
		return false;
	}
}