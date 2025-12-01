package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow10Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 3500 && world.dayTime() <= 4500) {
			return true;
		}
		return false;
	}
}