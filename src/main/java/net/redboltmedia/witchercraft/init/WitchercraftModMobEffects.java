/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import net.redboltmedia.witchercraft.procedures.ToxicityOverdoseStartProcedure;
import net.redboltmedia.witchercraft.procedures.PassiveStaminaRegenStartProcedure;
import net.redboltmedia.witchercraft.procedures.PassiveHealthRegenStartProcedure;
import net.redboltmedia.witchercraft.potion.*;
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
	public static final DeferredHolder<MobEffect, MobEffect> SWALLOW_EFFECT = REGISTRY.register("swallow_effect", () -> new SwallowEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TAWNY_OWL_EFFECT = REGISTRY.register("tawny_owl_effect", () -> new TawnyOwlEffectMobEffect());
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
	public static final DeferredHolder<MobEffect, MobEffect> DEV_LOG = REGISTRY.register("dev_log", () -> new DevLogMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TOXICITY_OVERDOSE_TICK = REGISTRY.register("toxicity_overdose_tick", () -> new ToxicityOverdoseTickMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PASSIVE_HEALTH_REGEN_TICK = REGISTRY.register("passive_health_regen_tick", () -> new PassiveHealthRegenTickMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PASSIVE_STAMINA_REGEN_TICK = REGISTRY.register("passive_stamina_regen_tick", () -> new PassiveStaminaRegenTickMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLEED = REGISTRY.register("bleed", () -> new BleedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLEED_COOLDOWN = REGISTRY.register("bleed_cooldown", () -> new BleedCooldownMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ENEMY_NEARBY = REGISTRY.register("enemy_nearby", () -> new EnemyNearbyMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> UNDYING_COOLDOWN = REGISTRY.register("undying_cooldown", () -> new UndyingCooldownMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DODGE_COOLDOWN = REGISTRY.register("dodge_cooldown", () -> new DodgeCooldownMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PETRIS_PHILTER_EFFECT = REGISTRY.register("petris_philter_effect", () -> new PetrisPhilterEffectMobEffect());

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
		if (effectInstance.getEffect().is(TOXICITY_OVERDOSE_TICK)) {
			ToxicityOverdoseStartProcedure.execute(entity.level(), entity);
		} else if (effectInstance.getEffect().is(PASSIVE_HEALTH_REGEN_TICK)) {
			PassiveHealthRegenStartProcedure.execute(entity.level(), entity);
		} else if (effectInstance.getEffect().is(PASSIVE_STAMINA_REGEN_TICK)) {
			PassiveStaminaRegenStartProcedure.execute(entity.level(), entity);
		}
	}
}