
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NecrophageOilItem extends Item {
	public NecrophageOilItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
