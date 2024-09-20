
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ThunderboltItem extends Item {
	public ThunderboltItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
