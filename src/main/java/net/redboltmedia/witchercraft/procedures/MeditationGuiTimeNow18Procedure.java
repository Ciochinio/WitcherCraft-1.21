package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow18Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 11500 && world.dayTime() <= 12500) {
			return true;
		}
		return false;
	}
}