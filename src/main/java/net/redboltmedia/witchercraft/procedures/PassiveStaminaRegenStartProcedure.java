package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.network.WitchercraftModVariables;
import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class PassiveStaminaRegenStartProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
			_vars.witchercraftPassiveStaminaRegeneration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftBasePassiveStaminaRegeneration;
			_vars.markSyncDirty();
		}
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbiltiesGourmet == true) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.witchercraftPassiveStaminaRegeneration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftPassiveStaminaRegeneration + 1;
				_vars.markSyncDirty();
			}
		}
		if (entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftAbilitiesSunAndStars == true && !(world instanceof Level _lvl0 && _lvl0.isBrightOutside())) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.witchercraftPassiveStaminaRegeneration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftPassiveStaminaRegeneration + 1;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WitchercraftModMobEffects.TAWNY_OWL_EFFECT)) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.witchercraftPassiveStaminaRegeneration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftPassiveStaminaRegeneration + 1;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(WitchercraftModMobEffects.WEREWOLF_DECOCTION_EFFECT) && !world.getLevelData().isRaining() && !(world instanceof Level _lvl4 && _lvl4.isBrightOutside())) {
			{
				WitchercraftModVariables.PlayerVariables _vars = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES);
				_vars.witchercraftPassiveStaminaRegeneration = entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftPassiveStaminaRegeneration + 1;
				_vars.markSyncDirty();
			}
		}
		if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(WitchercraftModMobEffects.PASSIVE_STAMINA_REGEN_TICK)) {
			WitchercraftMod.queueServerWork(60, () -> {
				if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 20) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + entity.getData(WitchercraftModVariables.PLAYER_VARIABLES).witchercraftPassiveStaminaRegeneration));
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.PASSIVE_STAMINA_REGEN_TICK, 1, 0));
			});
		}
	}
}