
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CatItem extends Item {
	public CatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
