package net.redboltmedia.witchercraft.client.gui;

import net.redboltmedia.witchercraft.world.inventory.MeditationGuiMenu;
import net.redboltmedia.witchercraft.procedures.*;
import net.redboltmedia.witchercraft.network.MeditationGuiButtonMessage;
import net.redboltmedia.witchercraft.init.WitchercraftModScreens;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;
import net.neoforged.neoforge.client.gui.widget.ExtendedSlider;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

public class MeditationGuiScreen extends AbstractContainerScreen<MeditationGuiMenu> implements WitchercraftModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_back;
	private Button button_meditate;
	private ExtendedSlider MeditationTime;

	public MeditationGuiScreen(MeditationGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 2 && elementState instanceof Number n) {
			if (name.equals("MeditationTime"))
				MeditationTime.setValue(n.doubleValue());
		}
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		if (MeditationGuiTimeNow24Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow24.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow23Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow23.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow22Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow22.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow21Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow21.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow20Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow20.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow19Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow19.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow18Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow18.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow17Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow17.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow16Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow16.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow15Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow15.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow14Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow14.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow13Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow13.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow12Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow12.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow11Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow11.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow10Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow10.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow9Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow9.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow8Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow8.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow7Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow7.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow6Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow6.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow5Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow5.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow4Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow4.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow3Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow3.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow2Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow2.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTimeNow1Procedure.execute(world)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandnow1.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhandmiddle.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		if (MeditationGuiTime24Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand24.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime23Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand23.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime22Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand22.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime21Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand21.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime20Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand20.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime19Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand19.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime18Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand18.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime17Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand17.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime16Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand16.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime15Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand15.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime14Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand14.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime13Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand13.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime12Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand12.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime11Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand11.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime10Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand10.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime9Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand9.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime8Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand8.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime7Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand7.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime6Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand6.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime5Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand5.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime4Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand4.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime3Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand3.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime2Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand2.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		if (MeditationGuiTime1Procedure.execute(entity)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationhand1.png"), this.leftPos + 22, this.topPos + 17, 0, 0, 131, 131, 131, 131);
		}
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationguitimenight.png"), this.leftPos + 71, this.topPos + 143, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationguitimenoon.png"), this.leftPos + 72, this.topPos + -11, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationguitimedawn.png"), this.leftPos + -5, this.topPos + 67, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/meditationguitimedusk.png"), this.leftPos + 149, this.topPos + 66, 0, 0, 32, 32, 32, 32);
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public boolean mouseDragged(double mouseX, double mouseY, int button, double dragX, double dragY) {
		return (this.getFocused() != null && this.isDragging() && button == 0) ? this.getFocused().mouseDragged(mouseX, mouseY, button, dragX, dragY) : super.mouseDragged(mouseX, mouseY, button, dragX, dragY);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.witchercraft.meditation_gui.button_back"), e -> {
			int x = MeditationGuiScreen.this.x;
			int y = MeditationGuiScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new MeditationGuiButtonMessage(0, x, y, z));
				MeditationGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 250, this.topPos + 174, 46, 20).build();
		this.addRenderableWidget(button_back);
		button_meditate = Button.builder(Component.translatable("gui.witchercraft.meditation_gui.button_meditate"), e -> {
			int x = MeditationGuiScreen.this.x;
			int y = MeditationGuiScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new MeditationGuiButtonMessage(1, x, y, z));
				MeditationGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 52, this.topPos + 174, 67, 20).build();
		this.addRenderableWidget(button_meditate);
		MeditationTime = new ExtendedSlider(this.leftPos + 16, this.topPos + 156, 143, 20, Component.translatable("gui.witchercraft.meditation_gui.MeditationTime_prefix"),
				Component.translatable("gui.witchercraft.meditation_gui.MeditationTime_suffix"), 1, 24, 12, 1, 0, true) {
			@Override
			protected void applyValue() {
				if (!menuStateUpdateActive)
					menu.sendMenuStateUpdate(entity, 2, "MeditationTime", this.getValue(), false);
			}
		};
		this.addRenderableWidget(MeditationTime);
		if (!menuStateUpdateActive)
			menu.sendMenuStateUpdate(entity, 2, "MeditationTime", MeditationTime.getValue(), false);
	}
}