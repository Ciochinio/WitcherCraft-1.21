package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.init.WitchercraftModMenus;
import net.redboltmedia.witchercraft.init.WitchercraftModItems;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CraftBombProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.SALETPETER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(2).remove(2);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack22 = new ItemStack(WitchercraftModItems.SAMUM.get()).copy();
				_setstack22.setCount(3);
				_menu.getSlots().get(7).set(_setstack22);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu23 ? _menu23.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu25 ? _menu25.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu31 ? _menu31.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu33 ? _menu33.getSlots().get(5).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu35 ? _menu35.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu37 ? _menu37.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.SALETPETER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu39 ? _menu39.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(5).remove(2);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack45 = new ItemStack(WitchercraftModItems.DEVILS_PUFFBALL.get()).copy();
				_setstack45.setCount(3);
				_menu.getSlots().get(7).set(_setstack45);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu50 ? _menu50.getSlots().get(2).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu52 ? _menu52.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu54 ? _menu54.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu56 ? _menu56.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu58 ? _menu58.getSlots().get(5).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu60 ? _menu60.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu62 ? _menu62.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.SALETPETER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu64 ? _menu64.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(2);
				_menu.getSlots().get(5).remove(2);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack69 = new ItemStack(WitchercraftModItems.DIMERITIUM_BOMB.get()).copy();
				_setstack69.setCount(3);
				_menu.getSlots().get(7).set(_setstack69);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu70 ? _menu70.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu72 ? _menu72.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu74 ? _menu74.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu76 ? _menu76.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu78 ? _menu78.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu80 ? _menu80.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu82 ? _menu82.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.SALETPETER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu84 ? _menu84.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack90 = new ItemStack(WitchercraftModItems.GRAPESHOT.get()).copy();
				_setstack90.setCount(3);
				_menu.getSlots().get(7).set(_setstack90);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu91 ? _menu91.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu93 ? _menu93.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu95 ? _menu95.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu97 ? _menu97.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu99 ? _menu99.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu101 ? _menu101.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu103 ? _menu103.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.SALETPETER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu105 ? _menu105.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack111 = new ItemStack(WitchercraftModItems.DANCING_STAR.get()).copy();
				_setstack111.setCount(3);
				_menu.getSlots().get(7).set(_setstack111);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu112 ? _menu112.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu114 ? _menu114.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu116 ? _menu116.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu118 ? _menu118.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu120 ? _menu120.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu122 ? _menu122.getSlots().get(5).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu124 ? _menu124.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu126 ? _menu126.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.SALETPETER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu128 ? _menu128.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(5).remove(2);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack134 = new ItemStack(WitchercraftModItems.NORTHERN_WIND.get()).copy();
				_setstack134.setCount(3);
				_menu.getSlots().get(7).set(_setstack134);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}