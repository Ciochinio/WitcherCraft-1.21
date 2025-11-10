package net.redboltmedia.witchercraft.item;

import net.redboltmedia.witchercraft.procedures.WhiteRaffardsDecoctionUsedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class WhiteRaffardsDecoctionItem extends Item {
	public WhiteRaffardsDecoctionItem() {
		super(new Item.Properties().stacksTo(3).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).alwaysEdible().build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		WhiteRaffardsDecoctionUsedProcedure.execute(entity);
		return retval;
	}
}