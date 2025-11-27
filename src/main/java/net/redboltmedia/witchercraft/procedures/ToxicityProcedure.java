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
		double critChanceRoll = 0;
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.sumToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftToxicity;
			_vars.markSyncDirty();
		}
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WitchercraftModMobEffects.GOLDEN_ORIOLE_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumToxicity + 15;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.BLIZZARD_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumToxicity + 15;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(WitchercraftModMobEffects.SWALLOW_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumToxicity + 25;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(WitchercraftModMobEffects.FULL_MOON_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumToxicity + 25;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(WitchercraftModMobEffects.THUNDERBOLT_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumToxicity + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(WitchercraftModMobEffects.TAWNY_OWL_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumToxicity + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(WitchercraftModMobEffects.KILLER_WHALE_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumToxicity + 20;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(WitchercraftModMobEffects.PETRIS_PHILTER_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumToxicity = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumToxicity + 20;
				_vars.markSyncDirty();
			}
		}
	}
}