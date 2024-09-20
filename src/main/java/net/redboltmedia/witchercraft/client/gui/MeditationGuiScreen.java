package net.redboltmedia.witchercraft.client.gui;

import net.redboltmedia.witchercraft.world.inventory.MeditationGuiMenu;
import net.redboltmedia.witchercraft.network.MeditationGuiButtonMessage;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MeditationGuiScreen extends AbstractContainerScreen<MeditationGuiMenu> {
	private final static HashMap<String, Object> guistate = MeditationGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_midnight;
	Button button_sunrise;
	Button button_sunset;
	Button button_noon;
	Button button_back;

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
	public boolean isPauseScreen() {
		return true;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_midnight = Button.builder(Component.translatable("gui.witchercraft.meditation_gui.button_midnight"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new MeditationGuiButtonMessage(0, x, y, z));
				MeditationGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 52, this.topPos + 147, 67, 20).build();
		guistate.put("button:button_midnight", button_midnight);
		this.addRenderableWidget(button_midnight);
		button_sunrise = Button.builder(Component.translatable("gui.witchercraft.meditation_gui.button_sunrise"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new MeditationGuiButtonMessage(1, x, y, z));
				MeditationGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -29, this.topPos + 75, 66, 20).build();
		guistate.put("button:button_sunrise", button_sunrise);
		this.addRenderableWidget(button_sunrise);
		button_sunset = Button.builder(Component.translatable("gui.witchercraft.meditation_gui.button_sunset"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new MeditationGuiButtonMessage(2, x, y, z));
				MeditationGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 75, 66, 20).build();
		guistate.put("button:button_sunset", button_sunset);
		this.addRenderableWidget(button_sunset);
		button_noon = Button.builder(Component.translatable("gui.witchercraft.meditation_gui.button_noon"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new MeditationGuiButtonMessage(3, x, y, z));
				MeditationGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 52, this.topPos + 21, 66, 20).build();
		guistate.put("button:button_noon", button_noon);
		this.addRenderableWidget(button_noon);
		button_back = Button.builder(Component.translatable("gui.witchercraft.meditation_gui.button_back"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new MeditationGuiButtonMessage(4, x, y, z));
				MeditationGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 250, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
