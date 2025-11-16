package net.redboltmedia.witchercraft.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BleedCooldownMobEffect extends MobEffect {
	public BleedCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}
}