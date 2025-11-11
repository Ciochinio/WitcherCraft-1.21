package net.redboltmedia.witchercraft.client.gui;

import net.redboltmedia.witchercraft.world.inventory.AlchemyGuiPotionsMenu;
import net.redboltmedia.witchercraft.network.AlchemyGuiPotionsButtonMessage;
import net.redboltmedia.witchercraft.init.WitchercraftModScreens;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

public class AlchemyGuiPotionsScreen extends AbstractContainerScreen<AlchemyGuiPotionsMenu> implements WitchercraftModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_brew;
	private Button button_back;

	public AlchemyGuiPotionsScreen(AlchemyGuiPotionsMenu container, Inventory inventory, Component text) {
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
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("witchercraft:textures/screens/alchemy_gui_potions.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		button_brew = Button.builder(Component.translatable("gui.witchercraft.alchemy_gui_potions.button_brew"), e -> {
			int x = AlchemyGuiPotionsScreen.this.x;
			int y = AlchemyGuiPotionsScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new AlchemyGuiPotionsButtonMessage(0, x, y, z));
				AlchemyGuiPotionsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 79, this.topPos + 57, 46, 20).build();
		this.addRenderableWidget(button_brew);
		button_back = Button.builder(Component.translatable("gui.witchercraft.alchemy_gui_potions.button_back"), e -> {
			int x = AlchemyGuiPotionsScreen.this.x;
			int y = AlchemyGuiPotionsScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new AlchemyGuiPotionsButtonMessage(1, x, y, z));
				AlchemyGuiPotionsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 250, this.topPos + 174, 46, 20).build();
		this.addRenderableWidget(button_back);
	}
}