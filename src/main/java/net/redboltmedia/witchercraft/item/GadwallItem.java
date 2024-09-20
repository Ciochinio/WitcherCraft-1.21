
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GadwallItem extends Item {
	public GadwallItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
