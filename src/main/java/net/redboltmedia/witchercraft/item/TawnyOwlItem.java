
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TawnyOwlItem extends Item {
	public TawnyOwlItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
