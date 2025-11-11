package net.redboltmedia.witchercraft.item;

import net.redboltmedia.witchercraft.procedures.FullMoonUsedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class FullMoonItem extends Item {
	public FullMoonItem(Item.Properties properties) {
		super(properties.stacksTo(3).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		FullMoonUsedProcedure.execute(entity);
		return retval;
	}
}