package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow12Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 5500 && world.dayTime() <= 6500) {
			return true;
		}
		return false;
	}
}