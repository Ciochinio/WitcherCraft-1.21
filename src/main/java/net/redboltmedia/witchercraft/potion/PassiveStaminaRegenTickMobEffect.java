package net.redboltmedia.witchercraft.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PassiveStaminaRegenTickMobEffect extends MobEffect {
	public PassiveStaminaRegenTickMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}
}