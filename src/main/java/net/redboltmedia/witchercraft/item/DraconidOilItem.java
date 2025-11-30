package net.redboltmedia.witchercraft.item;

import net.redboltmedia.witchercraft.procedures.DraconidOilApplyProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

public class DraconidOilItem extends Item {
	public DraconidOilItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		DraconidOilApplyProcedure.execute(world, entity);
		return ar;
	}
}