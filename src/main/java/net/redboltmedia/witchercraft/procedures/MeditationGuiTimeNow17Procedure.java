package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow17Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 10500 && world.dayTime() <= 11500) {
			return true;
		}
		return false;
	}
}