package net.redboltmedia.witchercraft.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PassiveHealthRegenTickMobEffect extends MobEffect {
	public PassiveHealthRegenTickMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}
}