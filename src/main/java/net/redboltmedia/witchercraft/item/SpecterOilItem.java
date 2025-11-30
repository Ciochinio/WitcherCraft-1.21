package net.redboltmedia.witchercraft.item;

import net.redboltmedia.witchercraft.procedures.SpecterOilApplyProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

public class SpecterOilItem extends Item {
	public SpecterOilItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		SpecterOilApplyProcedure.execute(world, entity);
		return ar;
	}
}