package net.redboltmedia.witchercraft.client.gui;

import net.redboltmedia.witchercraft.world.inventory.CharacterAbilitiesCombatGuiMenu;
import net.redboltmedia.witchercraft.procedures.UndyingShowProcedure;
import net.redboltmedia.witchercraft.procedures.SunderArmorShowProcedure;
import net.redboltmedia.witchercraft.procedures.StrengthTrainingShowProcedure;
import net.redboltmedia.witchercraft.procedures.RazorFocusShowProcedure;
import net.redboltmedia.witchercraft.procedures.PreciseBlowsShowProcedure;
import net.redboltmedia.witchercraft.procedures.MuscleMemoryShowProcedure;
import net.redboltmedia.witchercraft.procedures.FloodOfAngerShowProcedure;
import net.redboltmedia.witchercraft.procedures.FleetFootedShowProcedure;
import net.redboltmedia.witchercraft.procedures.DefenceShowProcedure;
import net.redboltmedia.witchercraft.procedures.DeadlyPresicionShowProcedure;
import net.redboltmedia.witchercraft.procedures.CrushingBlowsShowProcedure;
import net.redboltmedia.witchercraft.procedures.CrippllingStrikesShowProcedure;
import net.redboltmedia.witchercraft.procedures.CripplingShotShowProcedure;
import net.redboltmedia.witchercraft.procedures.ColdBloodShowProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterAbilitesSkillPointsProcedure;
import net.redboltmedia.witchercraft.procedures.AnatomicalKnowledgeShowProcedure;
import net.redboltmedia.witchercraft.network.CharacterAbilitiesCombatGuiButtonMessage;
import net.redboltmedia.witchercraft.init.WitchercraftModScreens;

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

import com.mojang.blaze3d.systems.RenderSystem;

public class CharacterAbilitiesCombatGuiScreen extends AbstractContainerScreen<CharacterAbilitiesCombatGuiMenu> implements WitchercraftModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_back;
	Button button_general;
	Button button_combat;
	Button button_alchemy;
	Button button_signs;
	ImageButton imagebutton_muslememory;
	ImageButton imagebutton_preciseblows;
	ImageButton imagebutton_cripplingstrikes;
	ImageButton imagebutton_strengthtraining;
	ImageButton imagebutton_crushingblows;
	ImageButton imagebutton_sunderarmor;
	ImageButton imagebutton_fleetfooted;
	ImageButton imagebutton_defense;
	ImageButton imagebutton_deadlyprecision;
	ImageButton imagebutton_coldblood;
	ImageButton imagebutton_anatomicalknowledge;
	ImageButton imagebutton_cripplingshot;
	ImageButton imagebutton_floodofanger;
	ImageButton imagebutton_razorfocus;
	ImageButton imagebutton_undying;

	public CharacterAbilitiesCombatGuiScreen(CharacterAbilitiesCombatGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 190;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("witchercraft:textures/screens/character_abilities_combat_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 7 && mouseX < leftPos + 31 && mouseY > topPos + 20 && mouseY < topPos + 44) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_add_3_to_dmg_dealt"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 7 && mouseX < leftPos + 31 && mouseY > topPos + 74 && mouseY < topPos + 98) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_increase_crit_rate_by_12_and_cr"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 6 && mouseX < leftPos + 30 && mouseY > topPos + 118 && mouseY < topPos + 142) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_apply_bleed_effect_on_hit"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 44 && mouseX < leftPos + 68 && mouseY > topPos + 19 && mouseY < topPos + 43) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_add_10_to_dmg_dealt"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 45 && mouseX < leftPos + 69 && mouseY > topPos + 76 && mouseY < topPos + 100) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_increase_crit_rate_by_8_and_cri"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 46 && mouseX < leftPos + 70 && mouseY > topPos + 120 && mouseY < topPos + 144) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_sunder_armoradd_20_to_dmg_dea"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 76 && mouseX < leftPos + 100 && mouseY > topPos + 16 && mouseY < topPos + 40) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_add_movement_speed"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 80 && mouseX < leftPos + 104 && mouseY > topPos + 75 && mouseY < topPos + 99) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_add_4_to_max_hp"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 81 && mouseX < leftPos + 105 && mouseY > topPos + 120 && mouseY < topPos + 144) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_add_1_chance_to_insta_kill"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 115 && mouseX < leftPos + 139 && mouseY > topPos + 19 && mouseY < topPos + 43) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_if_noone_nearby5_blocks_add"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 117 && mouseX < leftPos + 141 && mouseY > topPos + 77 && mouseY < topPos + 101) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_if_main_hand_weapon_ranged_add"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 115 && mouseX < leftPos + 139 && mouseY > topPos + 120 && mouseY < topPos + 144) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_if_main_hand_weapon_ranged_add1"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 153 && mouseX < leftPos + 177 && mouseY > topPos + 21 && mouseY < topPos + 45) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_if_someone_nearby5_blocks_add"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 154 && mouseX < leftPos + 178 && mouseY > topPos + 77 && mouseY < topPos + 101) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_add_10_chance_to_dodge_attack"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 153 && mouseX < leftPos + 177 && mouseY > topPos + 120 && mouseY < topPos + 144) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.character_abilities_combat_gui.tooltip_if_killed_restore_hp_to_50_onc"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
			this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/muslemomorybought.png"), this.leftPos + 4, this.topPos + 16, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/strengtraingbought.png"), this.leftPos + 40, this.topPos + 16, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/fleetfootedbougth.png"), this.leftPos + 76, this.topPos + 16, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/coldbloodbought.png"), this.leftPos + 112, this.topPos + 16, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/floodofangerbought.png"), this.leftPos + 148, this.topPos + 16, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/precoseblowsbought.png"), this.leftPos + 4, this.topPos + 70, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/crushingblowsbought.png"), this.leftPos + 40, this.topPos + 70, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/defensebought.png"), this.leftPos + 76, this.topPos + 70, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/anatomicalknowledgebought.png"), this.leftPos + 112, this.topPos + 70, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/razorfocusbought.png"), this.leftPos + 148, this.topPos + 70, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/cripplingstrikesbought.png"), this.leftPos + 4, this.topPos + 115, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/sunderarmorbought.png"), this.leftPos + 40, this.topPos + 115, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/deadlyprecisonbought.png"), this.leftPos + 76, this.topPos + 115, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/cripplingshotbought.png"), this.leftPos + 112, this.topPos + 115, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/undyingbought.png"), this.leftPos + 148, this.topPos + 115, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/skillpoint.png"), this.leftPos + 202, this.topPos + 7, 0, 0, 50, 25, 50, 25);
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
		guiGraphics.drawString(this.font, CharacterAbilitesSkillPointsProcedure.execute(entity), 202, 16, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.witchercraft.character_abilities_combat_gui.button_back"), e -> {
			int x = CharacterAbilitiesCombatGuiScreen.this.x;
			int y = CharacterAbilitiesCombatGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(0, x, y, z));
				CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 256, this.topPos + 169, 46, 20).build();
		this.addRenderableWidget(button_back);
		button_general = Button.builder(Component.translatable("gui.witchercraft.character_abilities_combat_gui.button_general"), e -> {
			int x = CharacterAbilitiesCombatGuiScreen.this.x;
			int y = CharacterAbilitiesCombatGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(1, x, y, z));
				CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -68, this.topPos + 7, 61, 20).build();
		this.addRenderableWidget(button_general);
		button_combat = Button.builder(Component.translatable("gui.witchercraft.character_abilities_combat_gui.button_combat"), e -> {
			int x = CharacterAbilitiesCombatGuiScreen.this.x;
			int y = CharacterAbilitiesCombatGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(2, x, y, z));
				CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -68, this.topPos + 34, 61, 20).build();
		this.addRenderableWidget(button_combat);
		button_alchemy = Button.builder(Component.translatable("gui.witchercraft.character_abilities_combat_gui.button_alchemy"), e -> {
			int x = CharacterAbilitiesCombatGuiScreen.this.x;
			int y = CharacterAbilitiesCombatGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(3, x, y, z));
				CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -68, this.topPos + 61, 61, 20).build();
		this.addRenderableWidget(button_alchemy);
		button_signs = Button.builder(Component.translatable("gui.witchercraft.character_abilities_combat_gui.button_signs"), e -> {
			int x = CharacterAbilitiesCombatGuiScreen.this.x;
			int y = CharacterAbilitiesCombatGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(4, x, y, z));
				CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -68, this.topPos + 88, 61, 20).build();
		this.addRenderableWidget(button_signs);
		imagebutton_muslememory = new ImageButton(this.leftPos + 4, this.topPos + 16, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/muslememory.png"), ResourceLocation.parse("witchercraft:textures/screens/muslememory.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (MuscleMemoryShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(5, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (MuscleMemoryShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_muslememory);
		imagebutton_preciseblows = new ImageButton(this.leftPos + 4, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/preciseblows.png"), ResourceLocation.parse("witchercraft:textures/screens/preciseblows.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (PreciseBlowsShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(6, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (PreciseBlowsShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_preciseblows);
		imagebutton_cripplingstrikes = new ImageButton(this.leftPos + 4, this.topPos + 115, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/cripplingstrikes.png"), ResourceLocation.parse("witchercraft:textures/screens/cripplingstrikes.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (CrippllingStrikesShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(7, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (CrippllingStrikesShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_cripplingstrikes);
		imagebutton_strengthtraining = new ImageButton(this.leftPos + 40, this.topPos + 16, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/strengthtraining.png"), ResourceLocation.parse("witchercraft:textures/screens/strengthtraining.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (StrengthTrainingShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(8, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (StrengthTrainingShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_strengthtraining);
		imagebutton_crushingblows = new ImageButton(this.leftPos + 40, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/crushingblows.png"), ResourceLocation.parse("witchercraft:textures/screens/crushingblows.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (CrushingBlowsShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(9, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 9, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (CrushingBlowsShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_crushingblows);
		imagebutton_sunderarmor = new ImageButton(this.leftPos + 40, this.topPos + 115, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/sunderarmor.png"), ResourceLocation.parse("witchercraft:textures/screens/sunderarmor.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (SunderArmorShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(10, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 10, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SunderArmorShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_sunderarmor);
		imagebutton_fleetfooted = new ImageButton(this.leftPos + 76, this.topPos + 16, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/fleetfooted.png"), ResourceLocation.parse("witchercraft:textures/screens/fleetfooted.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (FleetFootedShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(11, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 11, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (FleetFootedShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_fleetfooted);
		imagebutton_defense = new ImageButton(this.leftPos + 76, this.topPos + 70, 32, 32, new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/defense.png"), ResourceLocation.parse("witchercraft:textures/screens/defense.png")),
				e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (DefenceShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(12, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 12, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (DefenceShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_defense);
		imagebutton_deadlyprecision = new ImageButton(this.leftPos + 76, this.topPos + 115, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/deadlyprecision.png"), ResourceLocation.parse("witchercraft:textures/screens/deadlyprecision.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (DeadlyPresicionShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(13, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 13, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (DeadlyPresicionShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_deadlyprecision);
		imagebutton_coldblood = new ImageButton(this.leftPos + 112, this.topPos + 16, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/coldblood.png"), ResourceLocation.parse("witchercraft:textures/screens/coldblood.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (ColdBloodShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(14, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 14, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (ColdBloodShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_coldblood);
		imagebutton_anatomicalknowledge = new ImageButton(this.leftPos + 112, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/anatomicalknowledge.png"), ResourceLocation.parse("witchercraft:textures/screens/anatomicalknowledge.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (AnatomicalKnowledgeShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(15, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 15, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (AnatomicalKnowledgeShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_anatomicalknowledge);
		imagebutton_cripplingshot = new ImageButton(this.leftPos + 112, this.topPos + 115, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/cripplingshot.png"), ResourceLocation.parse("witchercraft:textures/screens/cripplingshot.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (CripplingShotShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(16, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 16, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (CripplingShotShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_cripplingshot);
		imagebutton_floodofanger = new ImageButton(this.leftPos + 148, this.topPos + 16, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/floodofanger.png"), ResourceLocation.parse("witchercraft:textures/screens/floodofanger.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (FloodOfAngerShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(17, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 17, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (FloodOfAngerShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_floodofanger);
		imagebutton_razorfocus = new ImageButton(this.leftPos + 148, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/razorfocus.png"), ResourceLocation.parse("witchercraft:textures/screens/razorfocus.png")), e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (RazorFocusShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(18, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 18, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (RazorFocusShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_razorfocus);
		imagebutton_undying = new ImageButton(this.leftPos + 148, this.topPos + 115, 32, 32, new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/undying.png"), ResourceLocation.parse("witchercraft:textures/screens/undying.png")),
				e -> {
					int x = CharacterAbilitiesCombatGuiScreen.this.x;
					int y = CharacterAbilitiesCombatGuiScreen.this.y;
					if (UndyingShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharacterAbilitiesCombatGuiButtonMessage(19, x, y, z));
						CharacterAbilitiesCombatGuiButtonMessage.handleButtonAction(entity, 19, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (UndyingShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_undying);
	}
}