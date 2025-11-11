package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.init.WitchercraftModMenus;
import net.redboltmedia.witchercraft.init.WitchercraftModItems;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CraftPotionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(6).remove(1);
				ItemStack _setstack23 = new ItemStack(WitchercraftModItems.GADWALL.get()).copy();
				_setstack23.setCount(3);
				_menu.getSlots().get(7).set(_setstack23);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu26 ? _menu26.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu28 ? _menu28.getSlots().get(2).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu30 ? _menu30.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu32 ? _menu32.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu34 ? _menu34.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu36 ? _menu36.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu38 ? _menu38.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu40 ? _menu40.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(2);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack46 = new ItemStack(WitchercraftModItems.SWALLOW.get()).copy();
				_setstack46.setCount(3);
				_menu.getSlots().get(7).set(_setstack46);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu47 ? _menu47.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu49 ? _menu49.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu51 ? _menu51.getSlots().get(2).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu53 ? _menu53.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu55 ? _menu55.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu57 ? _menu57.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu59 ? _menu59.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu61 ? _menu61.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu63 ? _menu63.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(2).remove(2);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack70 = new ItemStack(WitchercraftModItems.PETRIS_PHILTER.get()).copy();
				_setstack70.setCount(3);
				_menu.getSlots().get(7).set(_setstack70);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu71 ? _menu71.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu73 ? _menu73.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu75 ? _menu75.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu77 ? _menu77.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu79 ? _menu79.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu81 ? _menu81.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu83 ? _menu83.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu85 ? _menu85.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack91 = new ItemStack(WitchercraftModItems.WHITE_HONEY.get()).copy();
				_setstack91.setCount(3);
				_menu.getSlots().get(7).set(_setstack91);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu92 ? _menu92.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu94 ? _menu94.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu96 ? _menu96.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu98 ? _menu98.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu100 ? _menu100.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu102 ? _menu102.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu104 ? _menu104.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu106 ? _menu106.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack111 = new ItemStack(WitchercraftModItems.KILLER_WHALE.get()).copy();
				_setstack111.setCount(3);
				_menu.getSlots().get(7).set(_setstack111);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu112 ? _menu112.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu114 ? _menu114.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu116 ? _menu116.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu118 ? _menu118.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu120 ? _menu120.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu122 ? _menu122.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu124 ? _menu124.getSlots().get(6).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu126 ? _menu126.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu128 ? _menu128.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(6).remove(2);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack134 = new ItemStack(WitchercraftModItems.WHITE_RAFFARDS_DECOCTION.get()).copy();
				_setstack134.setCount(3);
				_menu.getSlots().get(7).set(_setstack134);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu135 ? _menu135.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu137 ? _menu137.getSlots().get(1).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu139 ? _menu139.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu141 ? _menu141.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu143 ? _menu143.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu145 ? _menu145.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu147 ? _menu147.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu149 ? _menu149.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu151 ? _menu151.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(2);
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack158 = new ItemStack(WitchercraftModItems.THUNDERBOLT.get()).copy();
				_setstack158.setCount(3);
				_menu.getSlots().get(7).set(_setstack158);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu159 ? _menu159.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu161 ? _menu161.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu163 ? _menu163.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu165 ? _menu165.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu167 ? _menu167.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu169 ? _menu169.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu171 ? _menu171.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu173 ? _menu173.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack179 = new ItemStack(WitchercraftModItems.ROOK.get()).copy();
				_setstack179.setCount(3);
				_menu.getSlots().get(7).set(_setstack179);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu180 ? _menu180.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu182 ? _menu182.getSlots().get(1).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu184 ? _menu184.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu186 ? _menu186.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu188 ? _menu188.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu190 ? _menu190.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu192 ? _menu192.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu194 ? _menu194.getSlots().get(6).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu196 ? _menu196.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu198 ? _menu198.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(2);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(6).remove(2);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack204 = new ItemStack(WitchercraftModItems.FULL_MOON.get()).copy();
				_setstack204.setCount(3);
				_menu.getSlots().get(7).set(_setstack204);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu205 ? _menu205.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu207 ? _menu207.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu209 ? _menu209.getSlots().get(2).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu211 ? _menu211.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu213 ? _menu213.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu215 ? _menu215.getSlots().get(4).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu217 ? _menu217.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu219 ? _menu219.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu221 ? _menu221.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu223 ? _menu223.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(2);
				_menu.getSlots().get(4).remove(2);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack228 = new ItemStack(WitchercraftModItems.BLIZZARD.get()).copy();
				_setstack228.setCount(3);
				_menu.getSlots().get(7).set(_setstack228);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu229 ? _menu229.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu231 ? _menu231.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu233 ? _menu233.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu235 ? _menu235.getSlots().get(3).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu237 ? _menu237.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu239 ? _menu239.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu241 ? _menu241.getSlots().get(5).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu243 ? _menu243.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu245 ? _menu245.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu247 ? _menu247.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(2);
				_menu.getSlots().get(5).remove(2);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack252 = new ItemStack(WitchercraftModItems.GOLDEN_ORIOLE.get()).copy();
				_setstack252.setCount(3);
				_menu.getSlots().get(7).set(_setstack252);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu253 ? _menu253.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu255 ? _menu255.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu257 ? _menu257.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu259 ? _menu259.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu261 ? _menu261.getSlots().get(4).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu263 ? _menu263.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu265 ? _menu265.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu267 ? _menu267.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu269 ? _menu269.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(4).remove(2);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack274 = new ItemStack(WitchercraftModItems.CAT.get()).copy();
				_setstack274.setCount(3);
				_menu.getSlots().get(7).set(_setstack274);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu275 ? _menu275.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu277 ? _menu277.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu279 ? _menu279.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu281 ? _menu281.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu283 ? _menu283.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu285 ? _menu285.getSlots().get(5).getItem() : ItemStack.EMPTY).getCount() >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu287 ? _menu287.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu289 ? _menu289.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.WHITE_GULL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu291 ? _menu291.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(5).remove(2);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack296 = new ItemStack(WitchercraftModItems.TAWNY_OWL.get()).copy();
				_setstack296.setCount(3);
				_menu.getSlots().get(7).set(_setstack296);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}