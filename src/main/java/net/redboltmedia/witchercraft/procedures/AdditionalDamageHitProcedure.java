package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AdditionalDamageHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamageFlat
				+ (amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamageFlat) * sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamage * 0.01));
		if (sourceentity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(WitchercraftModMobEffects.DEV_LOG)) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Muscle Memory +" + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamageFlat)), false);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(("StrengthTraining +"
								+ (amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamageFlat) * sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamage * 0.01)),
						false);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(("Combined Additional Damage +" + (sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamageFlat
								+ (amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamageFlat) * sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamage * 0.01))),
						false);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(("Combined Damage " + (amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamageFlat
								+ (amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamageFlat) * sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamage * 0.01))),
						false);
		}
	}
}