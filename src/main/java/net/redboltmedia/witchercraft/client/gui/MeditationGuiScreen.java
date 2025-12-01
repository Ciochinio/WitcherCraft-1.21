package net.redboltmedia.witchercraft.client.gui;

import net.redboltmedia.witchercraft.world.inventory.MeditationGuiMenu;
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
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/aard.png"), this.leftPos + 52, this.topPos + -33, 0, 0, 64, 64, 64, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/axii.png"), this.leftPos + -47, this.topPos + 57, 0, 0, 64, 64, 64, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/igni.png"), this.leftPos + 160, this.topPos + 57, 0, 0, 64, 64, 64, 64);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("witchercraft:textures/screens/yrden.png"), this.leftPos + 52, this.topPos + 102, 0, 0, 64, 64, 64, 64);
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
		MeditationTime = new ExtendedSlider(this.leftPos + 7, this.topPos + 156, 162, 20, Component.translatable("gui.witchercraft.meditation_gui.MeditationTime_prefix"),
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