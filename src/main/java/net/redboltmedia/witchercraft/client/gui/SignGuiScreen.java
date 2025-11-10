package net.redboltmedia.witchercraft.client.gui;

import net.redboltmedia.witchercraft.world.inventory.SignGuiMenu;
import net.redboltmedia.witchercraft.network.SignGuiButtonMessage;
import net.redboltmedia.witchercraft.init.WitchercraftModScreens;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import com.mojang.blaze3d.systems.RenderSystem;

public class SignGuiScreen extends AbstractContainerScreen<SignGuiMenu> implements WitchercraftModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_yrden;
	Button button_quen;
	Button button_igni;
	Button button_axii;
	Button button_aard;

	public SignGuiScreen(SignGuiMenu container, Inventory inventory, Component text) {
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
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/axii.png"), this.leftPos + 112, this.topPos + -14, 0, 0, 64, 64, 64, 64);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/aard.png"), this.leftPos + 172, this.topPos + 23, 0, 0, 64, 64, 64, 64);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/quen.png"), this.leftPos + -9, this.topPos + -7, 0, 0, 64, 64, 64, 64);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/yrden.png"), this.leftPos + -62, this.topPos + 31, 0, 0, 64, 64, 64, 64);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/igni.png"), this.leftPos + 52, this.topPos + -36, 0, 0, 64, 64, 64, 64);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.witchercraft.sign_gui.label_sign_menu"), 60, -11, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_yrden = Button.builder(Component.translatable("gui.witchercraft.sign_gui.button_yrden"), e -> {
			int x = SignGuiScreen.this.x;
			int y = SignGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SignGuiButtonMessage(0, x, y, z));
				SignGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -57, this.topPos + 85, 51, 20).build();
		this.addRenderableWidget(button_yrden);
		button_quen = Button.builder(Component.translatable("gui.witchercraft.sign_gui.button_quen"), e -> {
			int x = SignGuiScreen.this.x;
			int y = SignGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SignGuiButtonMessage(1, x, y, z));
				SignGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 50, 46, 20).build();
		this.addRenderableWidget(button_quen);
		button_igni = Button.builder(Component.translatable("gui.witchercraft.sign_gui.button_igni"), e -> {
			int x = SignGuiScreen.this.x;
			int y = SignGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SignGuiButtonMessage(2, x, y, z));
				SignGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 23, 46, 20).build();
		this.addRenderableWidget(button_igni);
		button_axii = Button.builder(Component.translatable("gui.witchercraft.sign_gui.button_axii"), e -> {
			int x = SignGuiScreen.this.x;
			int y = SignGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SignGuiButtonMessage(3, x, y, z));
				SignGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 47, 46, 20).build();
		this.addRenderableWidget(button_axii);
		button_aard = Button.builder(Component.translatable("gui.witchercraft.sign_gui.button_aard"), e -> {
			int x = SignGuiScreen.this.x;
			int y = SignGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SignGuiButtonMessage(4, x, y, z));
				SignGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 182, this.topPos + 81, 46, 20).build();
		this.addRenderableWidget(button_aard);
	}
}