package net.redboltmedia.witchercraft.procedures;

import net.redboltmedia.witchercraft.init.WitchercraftModMenus;
import net.redboltmedia.witchercraft.init.WitchercraftModItems;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CraftOilProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack21 = new ItemStack(WitchercraftModItems.INSECTOID_OIL.get()).copy();
				_setstack21.setCount(3);
				_menu.getSlots().get(7).set(_setstack21);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu26 ? _menu26.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& getAmountInGUISlot(entity, 3) >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu31 ? _menu31.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& getAmountInGUISlot(entity, 5) >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu34 ? _menu34.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu36 ? _menu36.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu38 ? _menu38.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(3).remove(2);
				_menu.getSlots().get(5).remove(2);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack43 = new ItemStack(WitchercraftModItems.NECROPHAGE_OIL.get()).copy();
				_setstack43.setCount(3);
				_menu.getSlots().get(7).set(_setstack43);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& getAmountInGUISlot(entity, 4) >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu51 ? _menu51.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu53 ? _menu53.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu55 ? _menu55.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu57 ? _menu57.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu59 ? _menu59.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(4).remove(2);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack66 = new ItemStack(WitchercraftModItems.VAMPIRE_OIL.get()).copy();
				_setstack66.setCount(3);
				_menu.getSlots().get(7).set(_setstack66);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu67 ? _menu67.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu69 ? _menu69.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu71 ? _menu71.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu73 ? _menu73.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu75 ? _menu75.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu77 ? _menu77.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu79 ? _menu79.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu81 ? _menu81.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack89 = new ItemStack(WitchercraftModItems.HANGED_MANS_VENOM.get()).copy();
				_setstack89.setCount(3);
				_menu.getSlots().get(7).set(_setstack89);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu90 ? _menu90.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& getAmountInGUISlot(entity, 2) >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu93 ? _menu93.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu95 ? _menu95.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu97 ? _menu97.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu99 ? _menu99.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu101 ? _menu101.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu103 ? _menu103.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu105 ? _menu105.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(2);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack111 = new ItemStack(WitchercraftModItems.SPECTER_OIL.get()).copy();
				_setstack111.setCount(3);
				_menu.getSlots().get(7).set(_setstack111);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu112 ? _menu112.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu114 ? _menu114.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu116 ? _menu116.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu118 ? _menu118.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& getAmountInGUISlot(entity, 5) >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu121 ? _menu121.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu123 ? _menu123.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu125 ? _menu125.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu127 ? _menu127.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(5).remove(2);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack133 = new ItemStack(WitchercraftModItems.OGROID_OIL.get()).copy();
				_setstack133.setCount(3);
				_menu.getSlots().get(7).set(_setstack133);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu134 ? _menu134.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& getAmountInGUISlot(entity, 2) >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu137 ? _menu137.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu139 ? _menu139.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu141 ? _menu141.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu143 ? _menu143.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu145 ? _menu145.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu147 ? _menu147.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu149 ? _menu149.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(2).remove(2);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack155 = new ItemStack(WitchercraftModItems.BEAST_OIL.get()).copy();
				_setstack155.setCount(3);
				_menu.getSlots().get(7).set(_setstack155);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (getAmountInGUISlot(entity, 1) >= 2
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu157 ? _menu157.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu159 ? _menu159.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu161 ? _menu161.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu163 ? _menu163.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu165 ? _menu165.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu167 ? _menu167.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu169 ? _menu169.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu171 ? _menu171.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(2);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack177 = new ItemStack(WitchercraftModItems.DRACONID_OIL.get()).copy();
				_setstack177.setCount(3);
				_menu.getSlots().get(7).set(_setstack177);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu178 ? _menu178.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu180 ? _menu180.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.REBIS.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu182 ? _menu182.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu184 ? _menu184.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu186 ? _menu186.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu188 ? _menu188.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu190 ? _menu190.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu192 ? _menu192.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack199 = new ItemStack(WitchercraftModItems.RELICT_OIL.get()).copy();
				_setstack199.setCount(3);
				_menu.getSlots().get(7).set(_setstack199);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu200 ? _menu200.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VERMILION.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu202 ? _menu202.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu204 ? _menu204.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.VITRIOL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu206 ? _menu206.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.QUEBRITH.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu208 ? _menu208.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.AETHER.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu210 ? _menu210.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.HYDRAGENUM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu212 ? _menu212.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == WitchercraftModItems.TALLOW.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu214 ? _menu214.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof WitchercraftModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(0).remove(1);
				ItemStack _setstack222 = new ItemStack(WitchercraftModItems.CURSED_OIL.get()).copy();
				_setstack222.setCount(3);
				_menu.getSlots().get(7).set(_setstack222);
				_player.containerMenu.broadcastChanges();
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof WitchercraftModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}