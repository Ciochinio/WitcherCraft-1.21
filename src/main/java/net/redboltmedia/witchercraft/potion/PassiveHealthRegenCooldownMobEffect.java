
package net.redboltmedia.witchercraft.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PassiveHealthRegenCooldownMobEffect extends MobEffect {
	public PassiveHealthRegenCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}
}
