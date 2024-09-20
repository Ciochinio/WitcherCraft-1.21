
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GrapeshotItem extends Item {
	public GrapeshotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
