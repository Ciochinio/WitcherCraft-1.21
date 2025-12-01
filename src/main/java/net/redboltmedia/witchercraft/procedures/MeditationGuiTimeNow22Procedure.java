package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow22Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 15500 && world.dayTime() <= 16500) {
			return true;
		}
		return false;
	}
}