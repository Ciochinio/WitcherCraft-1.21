package net.redboltmedia.witchercraft.procedures;

import net.minecraft.world.entity.Entity;

public class AirProjectileHitsLivingEntityProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
	}
}