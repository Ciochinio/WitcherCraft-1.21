/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import net.redboltmedia.witchercraft.procedures.PassiveStaminaRegenStartProcedure;
import net.redboltmedia.witchercraft.procedures.PassiveHealthRegenStartProcedure;
import net.redboltmedia.witchercraft.potion.YrdenSignMobEffect;
import net.redboltmedia.witchercraft.potion.WhiteRaffardsDecoctionEffectMobEffect;
import net.redboltmedia.witchercraft.potion.ThunderboltEffectMobEffect;
import net.redboltmedia.witchercraft.potion.TawnyOwlEffectMobEffect;
import net.redboltmedia.witchercraft.potion.SwallowEffectMobEffect;
import net.redboltmedia.witchercraft.potion.SchoolOfTheWolfMobEffect;
import net.redboltmedia.witchercraft.potion.SchoolOfTheViperMobEffect;
import net.redboltmedia.witchercraft.potion.SchoolOfTheManticoreMobEffect;
import net.redboltmedia.witchercraft.potion.SchoolOfTheGriffinMobEffect;
import net.redboltmedia.witchercraft.potion.SchoolOfTheCatMobEffect;
import net.redboltmedia.witchercraft.potion.SchoolOfTheBearMobEffect;
import net.redboltmedia.witchercraft.potion.QuenSignMobEffect;
import net.redboltmedia.witchercraft.potion.PassiveStaminaRegenMobEffect;
import net.redboltmedia.witchercraft.potion.PassiveHealthRegenMobEffect;
import net.redboltmedia.witchercraft.potion.KillerWhaleEffectMobEffect;
import net.redboltmedia.witchercraft.potion.IgniSignMobEffect;
import net.redboltmedia.witchercraft.potion.GoldenOrioleEffectMobEffect;
import net.redboltmedia.witchercraft.potion.FullMoonEffectMobEffect;
import net.redboltmedia.witchercraft.potion.CatEffectMobEffect;
import net.redboltmedia.witchercraft.potion.BlizzardEffectMobEffect;
import net.redboltmedia.witchercraft.potion.AxiiSignMobEffect;
import net.redboltmedia.witchercraft.potion.AardSignMobEffect;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
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
	public static final DeferredHolder<MobEffect, MobEffect> SWALLOW_EFFECT = REGISTRY.register("swallow_effect", () -> new SwallowEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TAWNY_OWL_EFFECT = REGISTRY.register("tawny_owl_effect", () -> new TawnyOwlEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PASSIVE_STAMINA_REGEN = REGISTRY.register("passive_stamina_regen", () -> new PassiveStaminaRegenMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SCHOOL_OF_THE_CAT = REGISTRY.register("school_of_the_cat", () -> new SchoolOfTheCatMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SCHOOL_OF_THE_WOLF = REGISTRY.register("school_of_the_wolf", () -> new SchoolOfTheWolfMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SCHOOL_OF_THE_BEAR = REGISTRY.register("school_of_the_bear", () -> new SchoolOfTheBearMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SCHOOL_OF_THE_VIPER = REGISTRY.register("school_of_the_viper", () -> new SchoolOfTheViperMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SCHOOL_OF_THE_MANTICORE = REGISTRY.register("school_of_the_manticore", () -> new SchoolOfTheManticoreMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SCHOOL_OF_THE_GRIFFIN = REGISTRY.register("school_of_the_griffin", () -> new SchoolOfTheGriffinMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> IGNI_SIGN = REGISTRY.register("igni_sign", () -> new IgniSignMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> YRDEN_SIGN = REGISTRY.register("yrden_sign", () -> new YrdenSignMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> AXII_SIGN = REGISTRY.register("axii_sign", () -> new AxiiSignMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> AARD_SIGN = REGISTRY.register("aard_sign", () -> new AardSignMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> QUEN_SIGN = REGISTRY.register("quen_sign", () -> new QuenSignMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(PASSIVE_HEALTH_REGEN)) {
			PassiveHealthRegenStartProcedure.execute(entity.level(), entity);
		} else if (effectInstance.getEffect().is(PASSIVE_STAMINA_REGEN)) {
			PassiveStaminaRegenStartProcedure.execute(entity.level(), entity);
		}
	}
}