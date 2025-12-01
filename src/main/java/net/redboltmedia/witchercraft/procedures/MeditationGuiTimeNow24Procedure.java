package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MeditationGuiTimeNow24Procedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 17500 && world.dayTime() <= 18500) {
			return true;
		}
		return false;
	}
}