package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow23Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 16500 && world.dayTime() <= 17500) {
			return true;
		}
		return false;
	}
}