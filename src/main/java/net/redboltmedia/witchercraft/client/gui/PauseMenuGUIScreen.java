package net.redboltmedia.witchercraft.client.gui;

import net.redboltmedia.witchercraft.world.inventory.PauseMenuGUIMenu;
import net.redboltmedia.witchercraft.network.PauseMenuGUIButtonMessage;

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

public class PauseMenuGUIScreen extends AbstractContainerScreen<PauseMenuGUIMenu> {
	private final static HashMap<String, Object> guistate = PauseMenuGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_meditation;
	Button button_character;
	Button button_alchemy;
	Button button_glossary;
	Button button_bestiary;
	Button button_skill_tree;

	public PauseMenuGUIScreen(PauseMenuGUIMenu container, Inventory inventory, Component text) {
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
		button_meditation = Button.builder(Component.translatable("gui.witchercraft.pause_menu_gui.button_meditation"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new PauseMenuGUIButtonMessage(0, x, y, z));
				PauseMenuGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 216, this.topPos + 97, 77, 20).build();
		guistate.put("button:button_meditation", button_meditation);
		this.addRenderableWidget(button_meditation);
		button_character = Button.builder(Component.translatable("gui.witchercraft.pause_menu_gui.button_character"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new PauseMenuGUIButtonMessage(1, x, y, z));
				PauseMenuGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 151, 77, 20).build();
		guistate.put("button:button_character", button_character);
		this.addRenderableWidget(button_character);
		button_alchemy = Button.builder(Component.translatable("gui.witchercraft.pause_menu_gui.button_alchemy"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new PauseMenuGUIButtonMessage(2, x, y, z));
				PauseMenuGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 97, 76, 20).build();
		guistate.put("button:button_alchemy", button_alchemy);
		this.addRenderableWidget(button_alchemy);
		button_glossary = Button.builder(Component.translatable("gui.witchercraft.pause_menu_gui.button_glossary"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new PauseMenuGUIButtonMessage(3, x, y, z));
				PauseMenuGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -114, this.topPos + 97, 77, 20).build();
		guistate.put("button:button_glossary", button_glossary);
		this.addRenderableWidget(button_glossary);
		button_bestiary = Button.builder(Component.translatable("gui.witchercraft.pause_menu_gui.button_bestiary"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new PauseMenuGUIButtonMessage(4, x, y, z));
				PauseMenuGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -32, this.topPos + 97, 77, 20).build();
		guistate.put("button:button_bestiary", button_bestiary);
		this.addRenderableWidget(button_bestiary);
		button_skill_tree = Button.builder(Component.translatable("gui.witchercraft.pause_menu_gui.button_skill_tree"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new PauseMenuGUIButtonMessage(5, x, y, z));
				PauseMenuGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 133, this.topPos + 97, 77, 20).build();
		guistate.put("button:button_skill_tree", button_skill_tree);
		this.addRenderableWidget(button_skill_tree);
	}
}
