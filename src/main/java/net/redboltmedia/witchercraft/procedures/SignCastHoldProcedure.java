package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SignCastHoldProcedure {
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
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftSignKeyHoldTime > 20) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 4) {
				if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.IGNI_SIGN) && entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesFireStream) {
					AltIgniCastProcedure.execute(entity);
				}
				if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(WitchercraftModMobEffects.QUEN_SIGN) && entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesExploadingShield) {
					AltQuenCastProcedure.execute(entity);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Not enough stamina"), true);
			}
		}
	}
}