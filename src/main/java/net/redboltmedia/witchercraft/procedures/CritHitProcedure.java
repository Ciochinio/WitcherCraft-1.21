package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
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
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		double critChanceRoll = 0;
		critChanceRoll = Mth.nextInt(RandomSource.create(), 1, 100);
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("crit roll>>>" + critChanceRoll)), false);
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("chance:" + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritChance)), false);
		if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("cybercraft:enderdragon"))) && critChanceRoll <= sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritChance) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("CRIT!" + amount * (1 + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritDamage * 0.01))), true);
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * (1 + sourceentity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritDamage * 0.01)));
		}
	}
}
