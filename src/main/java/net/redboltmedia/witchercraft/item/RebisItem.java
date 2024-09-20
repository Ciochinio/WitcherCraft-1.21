
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RebisItem extends Item {
	public RebisItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
