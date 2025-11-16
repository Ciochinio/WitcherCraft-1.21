package net.redboltmedia.witchercraft.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EnemyNearbyMobEffect extends MobEffect {
	public EnemyNearbyMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}
}