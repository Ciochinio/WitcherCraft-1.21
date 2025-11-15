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
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CritHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, damagesource, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		double critChanceRoll = 0;
		critChanceRoll = Mth.nextInt(RandomSource.create(), 1, 100);
		if (sourceentity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.DEV_LOG)) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("crit roll>>>" + critChanceRoll)), false);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("chance:" + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritChance)), false);
		}
		if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:enderdragon"))) && critChanceRoll <= sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritChance) {
			if (!damagesource.is(DamageTypes.ARROW)) {
				if (sourceentity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(WitchercraftModMobEffects.DEV_LOG)) {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("BAZA"
								+ (amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamage) * (1 + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftIncreasedDamage * 0.01))),
								false);
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("CRIT!" + ((amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamage)
								* (1 + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftIncreasedDamage * 0.01) * (1 + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritDamage * 0.01)
								- (amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamage) * (1 + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftIncreasedDamage * 0.01)))),
								false);
				}
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.PLAYER_ATTACK)),
						(float) ((amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamage) * (1 + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftIncreasedDamage * 0.01)
								* (1 + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritDamage * 0.01)
								- (amount + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAdditionalDamage) * (1 + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftIncreasedDamage * 0.01)));
			}
		}
	}
}