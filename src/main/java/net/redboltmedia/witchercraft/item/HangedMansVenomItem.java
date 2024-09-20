
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HangedMansVenomItem extends Item {
	public HangedMansVenomItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
