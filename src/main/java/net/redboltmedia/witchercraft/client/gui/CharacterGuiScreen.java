package net.redboltmedia.witchercraft.client.gui;

import org.joml.Vector3f;
import org.joml.Quaternionf;

import net.redboltmedia.witchercraft.world.inventory.CharacterGuiMenu;
import net.redboltmedia.witchercraft.procedures.PlayerModelDisplayProcedure;
import net.redboltmedia.witchercraft.procedures.CharaterLevelProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterGuiMovementSpeedProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterGuiHealthProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterGuiCritDamageProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterGuiCritChanceProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterGuiAttackSpeedProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterExperienceProcedure;
import net.redboltmedia.witchercraft.network.CharacterGuiButtonMessage;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CharacterGuiScreen extends AbstractContainerScreen<CharacterGuiMenu> {
	private final static HashMap<String, Object> guistate = CharacterGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public CharacterGuiScreen(CharacterGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("witchercraft:textures/screens/character_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (PlayerModelDisplayProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			this.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -65, this.topPos + 81, 30, 0f + (float) Math.atan((this.leftPos + -65 - mouseX) / 40.0), (float) Math.atan((this.topPos + 32 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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

				CharacterGuiMovementSpeedProcedure.execute(entity), 87, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.witchercraft.character_gui.label_movement_speed"), 6, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.witchercraft.character_gui.label_attack_speed"), 6, 25, -12829636, false);
		guiGraphics.drawString(this.font,

				CharacterGuiAttackSpeedProcedure.execute(entity), 87, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.witchercraft.character_gui.label_crit_chance"), 6, 34, -12829636, false);
		guiGraphics.drawString(this.font,

				CharacterGuiCritChanceProcedure.execute(entity), 87, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.witchercraft.character_gui.label_crit_damage"), 6, 43, -12829636, false);
		guiGraphics.drawString(this.font,

				CharacterGuiCritDamageProcedure.execute(entity), 87, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.witchercraft.character_gui.label_health"), 6, 52, -12829636, false);
		guiGraphics.drawString(this.font,

				CharacterGuiHealthProcedure.execute(entity), 87, 52, -12829636, false);
		guiGraphics.drawString(this.font,

				CharaterLevelProcedure.execute(entity), 6, 142, -12829636, false);
		guiGraphics.drawString(this.font,

				CharacterExperienceProcedure.execute(entity), 6, 151, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.witchercraft.character_gui.button_back"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new CharacterGuiButtonMessage(0, x, y, z));
				CharacterGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 249, this.topPos + 169, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}

	private void renderEntityInInventoryFollowsAngle(GuiGraphics guiGraphics, int x, int y, int scale, float angleXComponent, float angleYComponent, LivingEntity entity) {
		Quaternionf pose = new Quaternionf().rotateZ((float) Math.PI);
		Quaternionf cameraOrientation = new Quaternionf().rotateX(angleYComponent * 20 * ((float) Math.PI / 180F));
		pose.mul(cameraOrientation);
		float f2 = entity.yBodyRot;
		float f3 = entity.getYRot();
		float f4 = entity.getXRot();
		float f5 = entity.yHeadRotO;
		float f6 = entity.yHeadRot;
		entity.yBodyRot = 180.0F + angleXComponent * 20.0F;
		entity.setYRot(180.0F + angleXComponent * 40.0F);
		entity.setXRot(-angleYComponent * 20.0F);
		entity.yHeadRot = entity.getYRot();
		entity.yHeadRotO = entity.getYRot();
		InventoryScreen.renderEntityInInventory(guiGraphics, x, y, scale, new Vector3f(0, 0, 0), pose, cameraOrientation, entity);
		entity.yBodyRot = f2;
		entity.setYRot(f3);
		entity.setXRot(f4);
		entity.yHeadRotO = f5;
		entity.yHeadRot = f6;
	}
}
