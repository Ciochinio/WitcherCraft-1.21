package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ToxicityProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double sumToxicity = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.GOLDEN_ORIOLE_EFFECT)) {
			sumToxicity = sumToxicity + 15;
		}
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.BLIZZARD_EFFECT)) {
			sumToxicity = sumToxicity + 15;
		}
		if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(WitchercraftModMobEffects.SWALLOW_EFFECT)) {
			sumToxicity = sumToxicity + 25;
		}
		if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(WitchercraftModMobEffects.FULL_MOON_EFFECT)) {
			sumToxicity = sumToxicity + 25;
		}
		if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(WitchercraftModMobEffects.THUNDERBOLT_EFFECT)) {
			sumToxicity = sumToxicity + 20;
		}
		if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(WitchercraftModMobEffects.TAWNY_OWL_EFFECT)) {
			sumToxicity = sumToxicity + 20;
		}
		if (entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(WitchercraftModMobEffects.KILLER_WHALE_EFFECT)) {
			sumToxicity = sumToxicity + 20;
		}
		if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(WitchercraftModMobEffects.PETRIS_PHILTER_EFFECT)) {
			sumToxicity = sumToxicity + 20;
		}
		if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(WitchercraftModMobEffects.WHITE_RAFFARDS_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 20;
		}
		if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(WitchercraftModMobEffects.BLACK_BLOOD_EFFECT)) {
			sumToxicity = sumToxicity + 20;
		}
		if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(WitchercraftModMobEffects.CAT_EFFECT)) {
			sumToxicity = sumToxicity + 10;
		}
		if (entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(WitchercraftModMobEffects.WATER_HAG_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(WitchercraftModMobEffects.EKIMMARA_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(WitchercraftModMobEffects.KATAKAN_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(WitchercraftModMobEffects.LESHEN_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(WitchercraftModMobEffects.FOGLET_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(WitchercraftModMobEffects.NEKKER_WARRIOR_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(WitchercraftModMobEffects.TROLL_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(WitchercraftModMobEffects.WRAITH_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(WitchercraftModMobEffects.WEREWOLF_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(WitchercraftModMobEffects.WYVERN_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(WitchercraftModMobEffects.SUCCUBUS_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		if (entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(WitchercraftModMobEffects.GRAVE_HAG_DECOCTION_EFFECT)) {
			sumToxicity = sumToxicity + 50;
		}
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftToxicity = sumToxicity;
			_vars.markSyncDirty();
		}
	}
}