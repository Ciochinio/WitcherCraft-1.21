package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.init.WitchercraftModMobEffects;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class AardSignChooseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(WitchercraftModMobEffects.AARD_SIGN, -1, 1));
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(WitchercraftModMobEffects.IGNI_SIGN);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(WitchercraftModMobEffects.YRDEN_SIGN);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(WitchercraftModMobEffects.AXII_SIGN);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(WitchercraftModMobEffects.QUEN_SIGN);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}