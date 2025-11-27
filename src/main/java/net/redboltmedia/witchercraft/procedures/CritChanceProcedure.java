package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CritChanceProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.sumCritChance = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftCritChance;
			_vars.markSyncDirty();
		}
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesPreciseBlows == true) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumCritChance = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritChance + 12;
				_vars.markSyncDirty();
			}
		}
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesCrushingBlows == true) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumCritChance = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritChance + 8;
				_vars.markSyncDirty();
			}
		}
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesAnatomicalKnowledge == true && ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CROSSBOW
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOW)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumCritChance = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).sumCritChance + 10;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(WitchercraftModMobEffects.THUNDERBOLT_EFFECT) && world.getLevelData().isThundering()) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.sumCritChance = 100;
				_vars.markSyncDirty();
			}
		}
	}
}