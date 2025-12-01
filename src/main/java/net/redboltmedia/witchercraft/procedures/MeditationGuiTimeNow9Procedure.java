package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow9Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 2500 && world.dayTime() <= 3500) {
			return true;
		}
		return false;
	}
}