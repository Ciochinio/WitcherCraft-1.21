/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import net.redboltmedia.witchercraft.procedures.ToxicityTickStartProcedure;
import net.redboltmedia.witchercraft.procedures.SuccubusDecoctionTickStartProcedure;
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
	public static final DeferredHolder<MobEffect, MobEffect> PASSIVE_HEALTH_REGEN_TICK = REGISTRY.register("passive_health_regen_tick", () -> new PassiveHealthRegenTickMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PASSIVE_STAMINA_REGEN_TICK = REGISTRY.register("passive_stamina_regen_tick", () -> new PassiveStaminaRegenTickMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLEED = REGISTRY.register("bleed", () -> new BleedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLEED_COOLDOWN = REGISTRY.register("bleed_cooldown", () -> new BleedCooldownMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ENEMY_NEARBY = REGISTRY.register("enemy_nearby", () -> new EnemyNearbyMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> UNDYING_COOLDOWN = REGISTRY.register("undying_cooldown", () -> new UndyingCooldownMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DODGE_COOLDOWN = REGISTRY.register("dodge_cooldown", () -> new DodgeCooldownMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PETRIS_PHILTER_EFFECT = REGISTRY.register("petris_philter_effect", () -> new PetrisPhilterEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TA_POTKA_MUSI_TU_BYC_ZEBY_GRA_WIEDZIALA_GDZIE_JEST_GRACZ = REGISTRY.register("ta_potka_musi_tu_byc_zeby_gra_wiedziala_gdzie_jest_gracz",
			() -> new TaPotkaMusiTuBycZebyGraWiedzialaGdzieJestGraczMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CORRECT_OIL = REGISTRY.register("correct_oil", () -> new CorrectOilMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> WATER_HAG_DECOCTION_EFFECT = REGISTRY.register("water_hag_decoction_effect", () -> new WaterHagDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> EKIMMARA_DECOCTION_EFFECT = REGISTRY.register("ekimmara_decoction_effect", () -> new EkimmaraDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> KATAKAN_DECOCTION_EFFECT = REGISTRY.register("katakan_decoction_effect", () -> new KatakanDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LESHEN_DECOCTION_EFFECT = REGISTRY.register("leshen_decoction_effect", () -> new LeshenDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLACK_BLOOD_EFFECT = REGISTRY.register("black_blood_effect", () -> new BlackBloodEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FOGLET_DECOCTION_EFFECT = REGISTRY.register("foglet_decoction_effect", () -> new FogletDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> NEKKER_WARRIOR_DECOCTION_EFFECT = REGISTRY.register("nekker_warrior_decoction_effect", () -> new NekkerWarriorDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TROLL_DECOCTION_EFFECT = REGISTRY.register("troll_decoction_effect", () -> new TrollDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> WRAITH_DECOCTION_EFFECT = REGISTRY.register("wraith_decoction_effect", () -> new WraithDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> WEREWOLF_DECOCTION_EFFECT = REGISTRY.register("werewolf_decoction_effect", () -> new WerewolfDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> IN_COMBAT = REGISTRY.register("in_combat", () -> new InCombatMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> WYVERN_DECOCTION_EFFECT = REGISTRY.register("wyvern_decoction_effect", () -> new WyvernDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SUCCUBUS_DECOCTION_EFFECT = REGISTRY.register("succubus_decoction_effect", () -> new SuccubusDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SUCCUBUS_DECOCTION_TICK = REGISTRY.register("succubus_decoction_tick", () -> new SuccubusDecoctionTickMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> GRAVE_HAG_DECOCTION_EFFECT = REGISTRY.register("grave_hag_decoction_effect", () -> new GraveHagDecoctionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLINDNESS = REGISTRY.register("blindness", () -> new BlindnessMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TOXICITY_TICK = REGISTRY.register("toxicity_tick", () -> new ToxicityTickMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SIGN_COOLDOWN = REGISTRY.register("sign_cooldown", () -> new SignCooldownMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SIGN_HOLD = REGISTRY.register("sign_hold", () -> new SignHoldMobEffect());

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
		if (effectInstance.getEffect().is(PASSIVE_HEALTH_REGEN_TICK)) {
			PassiveHealthRegenStartProcedure.execute(entity.level(), entity);
		} else if (effectInstance.getEffect().is(PASSIVE_STAMINA_REGEN_TICK)) {
			PassiveStaminaRegenStartProcedure.execute(entity.level(), entity);
		} else if (effectInstance.getEffect().is(SUCCUBUS_DECOCTION_TICK)) {
			SuccubusDecoctionTickStartProcedure.execute(entity.level(), entity);
		} else if (effectInstance.getEffect().is(TOXICITY_TICK)) {
			ToxicityTickStartProcedure.execute(entity.level(), entity);
		}
	}
}