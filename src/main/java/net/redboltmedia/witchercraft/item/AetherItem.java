
package net.redboltmedia.witchercraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AetherItem extends Item {
	public AetherItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
