package net.redboltmedia.witchercraft.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.redboltmedia.witchercraft.procedures.PlayerModelDisplayProcedure;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

@EventBusSubscriber(Dist.CLIENT)
public class TestmedallionOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (PlayerModelDisplayProcedure.execute(entity) instanceof LivingEntity livingEntity) {
				InventoryScreen.renderEntityInInventoryFollowsAngle(event.getGuiGraphics(), w / 2 + -1000, h - 1025, w / 2 + 1000, h - -975, 10, -livingEntity.getBbHeight() / (2.0f * livingEntity.getScale()), 0f, 0, livingEntity);
			}
		}
	}
}