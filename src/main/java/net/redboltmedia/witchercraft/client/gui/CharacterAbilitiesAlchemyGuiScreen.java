package net.redboltmedia.witchercraft.client.gui;

import net.redboltmedia.witchercraft.world.inventory.CharacterAbilitiesAlchemyGuiMenu;
import net.redboltmedia.witchercraft.procedures.SideEffectsShowProcedure;
import net.redboltmedia.witchercraft.procedures.RefreshmentShowProcedure;
import net.redboltmedia.witchercraft.procedures.PyrotechnicsShowProcedure;
import net.redboltmedia.witchercraft.procedures.ProtectiveCoatingShowProcedure;
import net.redboltmedia.witchercraft.procedures.PoisonedBladesShowProcedure;
import net.redboltmedia.witchercraft.procedures.HunterInstinctShowProcedure;
import net.redboltmedia.witchercraft.procedures.EfficencyShowProcedure;
import net.redboltmedia.witchercraft.procedures.DelayedRecoveryShowProcedure;
import net.redboltmedia.witchercraft.procedures.ClusterBombsShowProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterAbilitesSkillPointsProcedure;
import net.redboltmedia.witchercraft.network.CharacterAbilitiesAlchemyGuiButtonMessage;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CharacterAbilitiesAlchemyGuiScreen extends AbstractContainerScreen<CharacterAbilitiesAlchemyGuiMenu> {
	private final static HashMap<String, Object> guistate = CharacterAbilitiesAlchemyGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;
	Button button_general;
	Button button_combat;
	Button button_alchemy;
	Button button_signs;
	ImageButton imagebutton_refreshment;
	ImageButton imagebutton_delayedrecovery;
	ImageButton imagebutton_sideeffects;
	ImageButton imagebutton_poisonedblade;
	ImageButton imagebutton_protectivecoating;
	ImageButton imagebutton_hunterinstincts;
	ImageButton imagebutton_pyrotechnics;
	ImageButton imagebutton_efficency;
	ImageButton imagebutton_clusterbombs;

	public CharacterAbilitiesAlchemyGuiScreen(CharacterAbilitiesAlchemyGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("witchercraft:textures/screens/character_abilities_alchemy_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 9 && mouseX < leftPos + 33 && mouseY > topPos + 29 && mouseY < topPos + 53)
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.tooltip_each_potion_heals_10_max_hp"), mouseX, mouseY);
		if (mouseX > leftPos + 11 && mouseX < leftPos + 35 && mouseY > topPos + 75 && mouseY < topPos + 99)
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.tooltip_increases_potion_duration_time_b"), mouseX, mouseY);
		if (mouseX > leftPos + 9 && mouseX < leftPos + 33 && mouseY > topPos + 118 && mouseY < topPos + 142)
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.tooltip_imbibing_potion_gives_gives_33"), mouseX, mouseY);
		if (mouseX > leftPos + 74 && mouseX < leftPos + 98 && mouseY > topPos + 29 && mouseY < topPos + 53)
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.tooltip_oils_give_5_chance_to_poison_o"), mouseX, mouseY);
		if (mouseX > leftPos + 74 && mouseX < leftPos + 98 && mouseY > topPos + 74 && mouseY < topPos + 98)
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.tooltip_reduces_damage_taken_from_mob_ty"), mouseX, mouseY);
		if (mouseX > leftPos + 73 && mouseX < leftPos + 97 && mouseY > topPos + 119 && mouseY < topPos + 143)
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.tooltip_deals_additional_damage_to_mob"), mouseX, mouseY);
		if (mouseX > leftPos + 134 && mouseX < leftPos + 158 && mouseY > topPos + 28 && mouseY < topPos + 52)
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.tooltip_bombs_deal_additional_damage"), mouseX, mouseY);
		if (mouseX > leftPos + 136 && mouseX < leftPos + 160 && mouseY > topPos + 74 && mouseY < topPos + 98)
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.tooltip_bombs_have_chance_to_remain_in_i"), mouseX, mouseY);
		if (mouseX > leftPos + 136 && mouseX < leftPos + 160 && mouseY > topPos + 121 && mouseY < topPos + 145)
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.tooltip_bombs_have_increased_area_of_eff"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/refreshmentbought.png"), this.leftPos + 6, this.topPos + 25, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/delayedrecoverybought.png"), this.leftPos + 6, this.topPos + 70, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/sideeffectsbought.png"), this.leftPos + 6, this.topPos + 115, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/poisonedbladesbought.png"), this.leftPos + 69, this.topPos + 25, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/protectivecoatingbought.png"), this.leftPos + 69, this.topPos + 70, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/hunterinstinctsbought.png"), this.leftPos + 69, this.topPos + 115, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/pyrotechnicsbought.png"), this.leftPos + 132, this.topPos + 25, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/efficencybought.png"), this.leftPos + 132, this.topPos + 70, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/clusterbombsbought.png"), this.leftPos + 132, this.topPos + 115, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/skillpoint.png"), this.leftPos + 195, this.topPos + 7, 0, 0, 50, 25, 50, 25);

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
		guiGraphics.drawString(this.font,

				CharacterAbilitesSkillPointsProcedure.execute(entity), 195, 16, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.button_back"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(0, x, y, z));
				CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 249, this.topPos + 169, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
		button_general = Button.builder(Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.button_general"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(1, x, y, z));
				CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -66, this.topPos + -2, 61, 20).build();
		guistate.put("button:button_general", button_general);
		this.addRenderableWidget(button_general);
		button_combat = Button.builder(Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.button_combat"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(2, x, y, z));
				CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -66, this.topPos + 25, 61, 20).build();
		guistate.put("button:button_combat", button_combat);
		this.addRenderableWidget(button_combat);
		button_alchemy = Button.builder(Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.button_alchemy"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(3, x, y, z));
				CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -66, this.topPos + 52, 61, 20).build();
		guistate.put("button:button_alchemy", button_alchemy);
		this.addRenderableWidget(button_alchemy);
		button_signs = Button.builder(Component.translatable("gui.witchercraft.character_abilities_alchemy_gui.button_signs"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(4, x, y, z));
				CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -66, this.topPos + 79, 61, 20).build();
		guistate.put("button:button_signs", button_signs);
		this.addRenderableWidget(button_signs);
		imagebutton_refreshment = new ImageButton(this.leftPos + 6, this.topPos + 25, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/refreshment.png"), ResourceLocation.parse("witchercraft:textures/screens/refreshment.png")), e -> {
					if (RefreshmentShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(5, x, y, z));
						CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (RefreshmentShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_refreshment", imagebutton_refreshment);
		this.addRenderableWidget(imagebutton_refreshment);
		imagebutton_delayedrecovery = new ImageButton(this.leftPos + 6, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/delayedrecovery.png"), ResourceLocation.parse("witchercraft:textures/screens/delayedrecovery.png")), e -> {
					if (DelayedRecoveryShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(6, x, y, z));
						CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (DelayedRecoveryShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_delayedrecovery", imagebutton_delayedrecovery);
		this.addRenderableWidget(imagebutton_delayedrecovery);
		imagebutton_sideeffects = new ImageButton(this.leftPos + 6, this.topPos + 115, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/sideeffects.png"), ResourceLocation.parse("witchercraft:textures/screens/sideeffects.png")), e -> {
					if (SideEffectsShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(7, x, y, z));
						CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SideEffectsShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_sideeffects", imagebutton_sideeffects);
		this.addRenderableWidget(imagebutton_sideeffects);
		imagebutton_poisonedblade = new ImageButton(this.leftPos + 69, this.topPos + 25, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/poisonedblade.png"), ResourceLocation.parse("witchercraft:textures/screens/poisonedblade.png")), e -> {
					if (PoisonedBladesShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(8, x, y, z));
						CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (PoisonedBladesShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_poisonedblade", imagebutton_poisonedblade);
		this.addRenderableWidget(imagebutton_poisonedblade);
		imagebutton_protectivecoating = new ImageButton(this.leftPos + 69, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/protectivecoating.png"), ResourceLocation.parse("witchercraft:textures/screens/protectivecoating.png")), e -> {
					if (ProtectiveCoatingShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(9, x, y, z));
						CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 9, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ProtectiveCoatingShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_protectivecoating", imagebutton_protectivecoating);
		this.addRenderableWidget(imagebutton_protectivecoating);
		imagebutton_hunterinstincts = new ImageButton(this.leftPos + 69, this.topPos + 115, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/hunterinstincts.png"), ResourceLocation.parse("witchercraft:textures/screens/hunterinstincts.png")), e -> {
					if (HunterInstinctShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(10, x, y, z));
						CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 10, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (HunterInstinctShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_hunterinstincts", imagebutton_hunterinstincts);
		this.addRenderableWidget(imagebutton_hunterinstincts);
		imagebutton_pyrotechnics = new ImageButton(this.leftPos + 132, this.topPos + 25, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/pyrotechnics.png"), ResourceLocation.parse("witchercraft:textures/screens/pyrotechnics.png")), e -> {
					if (PyrotechnicsShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(11, x, y, z));
						CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 11, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (PyrotechnicsShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_pyrotechnics", imagebutton_pyrotechnics);
		this.addRenderableWidget(imagebutton_pyrotechnics);
		imagebutton_efficency = new ImageButton(this.leftPos + 132, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/efficency.png"), ResourceLocation.parse("witchercraft:textures/screens/efficency.png")), e -> {
					if (EfficencyShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(12, x, y, z));
						CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 12, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (EfficencyShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_efficency", imagebutton_efficency);
		this.addRenderableWidget(imagebutton_efficency);
		imagebutton_clusterbombs = new ImageButton(this.leftPos + 132, this.topPos + 115, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/clusterbombs.png"), ResourceLocation.parse("witchercraft:textures/screens/clusterbombs.png")), e -> {
					if (ClusterBombsShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesAlchemyGuiButtonMessage(13, x, y, z));
						CharacterAbilitiesAlchemyGuiButtonMessage.handleButtonAction(entity, 13, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ClusterBombsShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_clusterbombs", imagebutton_clusterbombs);
		this.addRenderableWidget(imagebutton_clusterbombs);
	}
}
