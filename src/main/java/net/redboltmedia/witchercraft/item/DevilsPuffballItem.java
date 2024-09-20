
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DevilsPuffballItem extends Item {
	public DevilsPuffballItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
