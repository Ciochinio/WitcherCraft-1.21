package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow21Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 14500 && world.dayTime() <= 15500) {
			return true;
		}
		return false;
	}
}