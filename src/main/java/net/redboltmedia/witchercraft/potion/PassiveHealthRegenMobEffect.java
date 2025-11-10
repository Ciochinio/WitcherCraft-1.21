package net.redboltmedia.witchercraft.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PassiveHealthRegenMobEffect extends MobEffect {
	public PassiveHealthRegenMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}
}