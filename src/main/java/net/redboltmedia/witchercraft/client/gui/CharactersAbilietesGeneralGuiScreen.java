package net.redboltmedia.witchercraft.client.gui;

import net.redboltmedia.witchercraft.world.inventory.CharactersAbilietesGeneralGuiMenu;
import net.redboltmedia.witchercraft.procedures.SurvivalInstinctShowProcedure;
import net.redboltmedia.witchercraft.procedures.SunAndStarsShowProcedure;
import net.redboltmedia.witchercraft.procedures.GriffinSchoolShowProcedure;
import net.redboltmedia.witchercraft.procedures.GourmentShowIconProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterAbilitesSkillPointsProcedure;
import net.redboltmedia.witchercraft.procedures.CatSchoolShowProcedure;
import net.redboltmedia.witchercraft.procedures.BearSchoolShowProcedure;
import net.redboltmedia.witchercraft.network.CharactersAbilietesGeneralGuiButtonMessage;
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

public class CharactersAbilietesGeneralGuiScreen extends AbstractContainerScreen<CharactersAbilietesGeneralGuiMenu> implements WitchercraftModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_back;
	Button button_general;
	Button button_alchemy;
	Button button_combat;
	Button button_signs;
	ImageButton imagebutton_sunandstars;
	ImageButton imagebutton_survivalinstict;
	ImageButton imagebutton_gourment;
	ImageButton imagebutton_catschooltechniques;
	ImageButton imagebutton_griffinschool;
	ImageButton imagebutton_bearschool;

	public CharactersAbilietesGeneralGuiScreen(CharactersAbilietesGeneralGuiMenu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("witchercraft:textures/screens/characters_abilietes_general_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 10 && mouseX < leftPos + 34 && mouseY > topPos + 24 && mouseY < topPos + 53) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.characters_abilietes_general_gui.tooltip_during_day_add_1_to_health_rege"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 74 && mouseX < leftPos + 98 && mouseY > topPos + 26 && mouseY < topPos + 50) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.characters_abilietes_general_gui.tooltip_increases_max_hp_by_15"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 129 && mouseX < leftPos + 153 && mouseY > topPos + 28 && mouseY < topPos + 52) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.characters_abilietes_general_gui.tooltip_1_to_stamina_regen"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 10 && mouseX < leftPos + 34 && mouseY > topPos + 75 && mouseY < topPos + 99) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.characters_abilietes_general_gui.tooltip_while_school_of_the_cat_effect"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 74 && mouseX < leftPos + 98 && mouseY > topPos + 74 && mouseY < topPos + 98) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.characters_abilietes_general_gui.tooltip_while_school_of_the_griffin_ef"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (mouseX > leftPos + 128 && mouseX < leftPos + 152 && mouseY > topPos + 75 && mouseY < topPos + 99) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.witchercraft.characters_abilietes_general_gui.tooltip_while_school_of_the_bear_effec"), mouseX, mouseY);
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
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/sunandstarsbought.png"), this.leftPos + 6, this.topPos + 25, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/survivalinstinctsbought.png"), this.leftPos + 69, this.topPos + 25, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/gourmentbought.png"), this.leftPos + 123, this.topPos + 25, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/catschooltechniquesbought.png"), this.leftPos + 6, this.topPos + 70, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/griffinschoolbought.png"), this.leftPos + 69, this.topPos + 70, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/bearschoolbought.png"), this.leftPos + 123, this.topPos + 70, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("witchercraft:textures/screens/skillpoint.png"), this.leftPos + 186, this.topPos + -2, 0, 0, 50, 25, 50, 25);
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
		guiGraphics.drawString(this.font, CharacterAbilitesSkillPointsProcedure.execute(entity), 187, 5, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.witchercraft.characters_abilietes_general_gui.button_back"), e -> {
			int x = CharactersAbilietesGeneralGuiScreen.this.x;
			int y = CharactersAbilietesGeneralGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(0, x, y, z));
				CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 249, this.topPos + 169, 46, 20).build();
		this.addRenderableWidget(button_back);
		button_general = Button.builder(Component.translatable("gui.witchercraft.characters_abilietes_general_gui.button_general"), e -> {
			int x = CharactersAbilietesGeneralGuiScreen.this.x;
			int y = CharactersAbilietesGeneralGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(1, x, y, z));
				CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -66, this.topPos + -2, 61, 20).build();
		this.addRenderableWidget(button_general);
		button_alchemy = Button.builder(Component.translatable("gui.witchercraft.characters_abilietes_general_gui.button_alchemy"), e -> {
			int x = CharactersAbilietesGeneralGuiScreen.this.x;
			int y = CharactersAbilietesGeneralGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(2, x, y, z));
				CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -66, this.topPos + 52, 61, 20).build();
		this.addRenderableWidget(button_alchemy);
		button_combat = Button.builder(Component.translatable("gui.witchercraft.characters_abilietes_general_gui.button_combat"), e -> {
			int x = CharactersAbilietesGeneralGuiScreen.this.x;
			int y = CharactersAbilietesGeneralGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(3, x, y, z));
				CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -66, this.topPos + 25, 61, 20).build();
		this.addRenderableWidget(button_combat);
		button_signs = Button.builder(Component.translatable("gui.witchercraft.characters_abilietes_general_gui.button_signs"), e -> {
			int x = CharactersAbilietesGeneralGuiScreen.this.x;
			int y = CharactersAbilietesGeneralGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(4, x, y, z));
				CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -66, this.topPos + 79, 61, 20).build();
		this.addRenderableWidget(button_signs);
		imagebutton_sunandstars = new ImageButton(this.leftPos + 6, this.topPos + 25, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/sunandstars.png"), ResourceLocation.parse("witchercraft:textures/screens/sunandstars.png")), e -> {
					int x = CharactersAbilietesGeneralGuiScreen.this.x;
					int y = CharactersAbilietesGeneralGuiScreen.this.y;
					if (SunAndStarsShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(5, x, y, z));
						CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SunAndStarsShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_sunandstars);
		imagebutton_survivalinstict = new ImageButton(this.leftPos + 69, this.topPos + 25, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/survivalinstict.png"), ResourceLocation.parse("witchercraft:textures/screens/survivalinstict.png")), e -> {
					int x = CharactersAbilietesGeneralGuiScreen.this.x;
					int y = CharactersAbilietesGeneralGuiScreen.this.y;
					if (SurvivalInstinctShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(6, x, y, z));
						CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (SurvivalInstinctShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_survivalinstict);
		imagebutton_gourment = new ImageButton(this.leftPos + 123, this.topPos + 25, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/gourment.png"), ResourceLocation.parse("witchercraft:textures/screens/gourment.png")), e -> {
					int x = CharactersAbilietesGeneralGuiScreen.this.x;
					int y = CharactersAbilietesGeneralGuiScreen.this.y;
					if (GourmentShowIconProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(7, x, y, z));
						CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (GourmentShowIconProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_gourment);
		imagebutton_catschooltechniques = new ImageButton(this.leftPos + 6, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/catschool.png"), ResourceLocation.parse("witchercraft:textures/screens/catschool.png")), e -> {
					int x = CharactersAbilietesGeneralGuiScreen.this.x;
					int y = CharactersAbilietesGeneralGuiScreen.this.y;
					if (CatSchoolShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(8, x, y, z));
						CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 8, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (CatSchoolShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_catschooltechniques);
		imagebutton_griffinschool = new ImageButton(this.leftPos + 69, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/griffinschool.png"), ResourceLocation.parse("witchercraft:textures/screens/griffinschool.png")), e -> {
					int x = CharactersAbilietesGeneralGuiScreen.this.x;
					int y = CharactersAbilietesGeneralGuiScreen.this.y;
					if (GriffinSchoolShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(9, x, y, z));
						CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 9, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (GriffinSchoolShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_griffinschool);
		imagebutton_bearschool = new ImageButton(this.leftPos + 123, this.topPos + 70, 32, 32,
				new WidgetSprites(ResourceLocation.parse("witchercraft:textures/screens/bearschool.png"), ResourceLocation.parse("witchercraft:textures/screens/bearschool.png")), e -> {
					int x = CharactersAbilietesGeneralGuiScreen.this.x;
					int y = CharactersAbilietesGeneralGuiScreen.this.y;
					if (BearSchoolShowProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new CharactersAbilietesGeneralGuiButtonMessage(10, x, y, z));
						CharactersAbilietesGeneralGuiButtonMessage.handleButtonAction(entity, 10, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (BearSchoolShowProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		this.addRenderableWidget(imagebutton_bearschool);
	}
}