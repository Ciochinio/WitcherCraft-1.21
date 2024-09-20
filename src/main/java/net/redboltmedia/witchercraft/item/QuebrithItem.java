
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class QuebrithItem extends Item {
	public QuebrithItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
