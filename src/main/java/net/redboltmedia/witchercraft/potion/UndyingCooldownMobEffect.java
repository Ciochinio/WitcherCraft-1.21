package net.redboltmedia.witchercraft.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class UndyingCooldownMobEffect extends MobEffect {
	public UndyingCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}
}