package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.init.WitchercraftModMenus;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class MeditationGuiTime14Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity instanceof Player _entity0 && _entity0.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(2, "MeditationTime", 0.0) : 0.0) == 14) {
			return true;
		}
		return false;
	}
}