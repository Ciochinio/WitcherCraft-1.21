
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import net.redboltmedia.witchercraft.potion.WhiteRaffardsDecoctionEffectMobEffect;
import net.redboltmedia.witchercraft.potion.ThunderboltEffectMobEffect;
import net.redboltmedia.witchercraft.potion.SwallowEffectMobEffect;
import net.redboltmedia.witchercraft.potion.PassiveHealthRegenMobEffect;
import net.redboltmedia.witchercraft.potion.PassiveHealthRegenCooldownMobEffect;
import net.redboltmedia.witchercraft.potion.KillerWhaleEffectMobEffect;
import net.redboltmedia.witchercraft.potion.GoldenOrioleEffectMobEffect;
import net.redboltmedia.witchercraft.potion.FullMoonEffectMobEffect;
import net.redboltmedia.witchercraft.potion.CatEffectMobEffect;
import net.redboltmedia.witchercraft.potion.BlizzardEffectMobEffect;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

public class WitchercraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, WitchercraftMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> GOLDEN_ORIOLE_EFFECT = REGISTRY.register("golden_oriole_effect", () -> new GoldenOrioleEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLIZZARD_EFFECT = REGISTRY.register("blizzard_effect", () -> new BlizzardEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CAT_EFFECT = REGISTRY.register("cat_effect", () -> new CatEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FULL_MOON_EFFECT = REGISTRY.register("full_moon_effect", () -> new FullMoonEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> THUNDERBOLT_EFFECT = REGISTRY.register("thunderbolt_effect", () -> new ThunderboltEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> WHITE_RAFFARDS_DECOCTION_EFFECT = REGISTRY.register("white_raffards_decoction_effect", () -> new WhiteRaffardsDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> KILLER_WHALE_EFFECT = REGISTRY.register("killer_whale_effect", () -> new KillerWhaleEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PASSIVE_HEALTH_REGEN = REGISTRY.register("passive_health_regen", () -> new PassiveHealthRegenMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PASSIVE_HEALTH_REGEN_COOLDOWN = REGISTRY.register("passive_health_regen_cooldown", () -> new PassiveHealthRegenCooldownMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SWALLOW_EFFECT = REGISTRY.register("swallow_effect", () -> new SwallowEffectMobEffect());
}
