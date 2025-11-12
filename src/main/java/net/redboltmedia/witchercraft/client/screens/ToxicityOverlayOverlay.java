package net.redboltmedia.witchercraft.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.redboltmedia.witchercraft.procedures.Tox3Procedure;
import net.redboltmedia.witchercraft.procedures.Tox2Procedure;
import net.redboltmedia.witchercraft.procedures.Tox1Procedure;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.Minecraft;

@EventBusSubscriber(Dist.CLIENT)
public class ToxicityOverlayOverlay {
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
			if (Tox1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/arrowforword.png"), w / 2 + -118, h / 2 + 42, 0, 0, 32, 32, 32, 32);
			}
			if (Tox2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/arrowback.png"), w / 2 + -61, h / 2 + 42, 0, 0, 32, 32, 32, 32);
			}
			if (Tox3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/arrowforword.png"), w / 2 + -3, h / 2 + 39, 0, 0, 32, 32, 32, 32);
			}
		}
	}
}