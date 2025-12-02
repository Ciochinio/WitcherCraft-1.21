package net.redboltmedia.witchercraft.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class InCombatMobEffect extends MobEffect {
	public InCombatMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}
}