/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import org.joml.Vector3f;
import org.joml.Quaternionf;

import net.redboltmedia.witchercraft.client.gui.SignGuiScreen;
import net.redboltmedia.witchercraft.client.gui.RotfiendGuiScreen;
import net.redboltmedia.witchercraft.client.gui.PauseMenuGUIScreen;
import net.redboltmedia.witchercraft.client.gui.MeditationGuiScreen;
import net.redboltmedia.witchercraft.client.gui.HigherVampireGuiScreen;
import net.redboltmedia.witchercraft.client.gui.GraveirGuiScreen;
import net.redboltmedia.witchercraft.client.gui.GlossaryMenuGuiScreen;
import net.redboltmedia.witchercraft.client.gui.FogletScreen;
import net.redboltmedia.witchercraft.client.gui.DrownerGuiScreen;
import net.redboltmedia.witchercraft.client.gui.CharactersAbilietesGeneralGuiScreen;
import net.redboltmedia.witchercraft.client.gui.CharacterGuiScreen;
import net.redboltmedia.witchercraft.client.gui.CharacterAbilitiesSignsGuiScreen;
import net.redboltmedia.witchercraft.client.gui.CharacterAbilitiesCombatGuiScreen;
import net.redboltmedia.witchercraft.client.gui.CharacterAbilitiesAlchemyGuiScreen;
import net.redboltmedia.witchercraft.client.gui.BruxaGuiScreen;
import net.redboltmedia.witchercraft.client.gui.BestiaryMenuGuiScreen;
import net.redboltmedia.witchercraft.client.gui.AlchemyGuiScreen;
import net.redboltmedia.witchercraft.client.gui.AlchemyGuiPotionsScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.GuiGraphics;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WitchercraftModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(WitchercraftModMenus.PAUSE_MENU_GUI.get(), PauseMenuGUIScreen::new);
		event.register(WitchercraftModMenus.MEDITATION_GUI.get(), MeditationGuiScreen::new);
		event.register(WitchercraftModMenus.ALCHEMY_GUI.get(), AlchemyGuiScreen::new);
		event.register(WitchercraftModMenus.GLOSSARY_MENU_GUI.get(), GlossaryMenuGuiScreen::new);
		event.register(WitchercraftModMenus.BESTIARY_MENU_GUI.get(), BestiaryMenuGuiScreen::new);
		event.register(WitchercraftModMenus.CHARACTER_GUI.get(), CharacterGuiScreen::new);
		event.register(WitchercraftModMenus.SIGN_GUI.get(), SignGuiScreen::new);
		event.register(WitchercraftModMenus.ALCHEMY_GUI_POTIONS.get(), AlchemyGuiPotionsScreen::new);
		event.register(WitchercraftModMenus.CHARACTERS_ABILIETES_GENERAL_GUI.get(), CharactersAbilietesGeneralGuiScreen::new);
		event.register(WitchercraftModMenus.CHARACTER_ABILITIES_COMBAT_GUI.get(), CharacterAbilitiesCombatGuiScreen::new);
		event.register(WitchercraftModMenus.CHARACTER_ABILITIES_ALCHEMY_GUI.get(), CharacterAbilitiesAlchemyGuiScreen::new);
		event.register(WitchercraftModMenus.CHARACTER_ABILITIES_SIGNS_GUI.get(), CharacterAbilitiesSignsGuiScreen::new);
		event.register(WitchercraftModMenus.DROWNER_GUI.get(), DrownerGuiScreen::new);
		event.register(WitchercraftModMenus.ROTFIEND_GUI.get(), RotfiendGuiScreen::new);
		event.register(WitchercraftModMenus.FOGLET.get(), FogletScreen::new);
		event.register(WitchercraftModMenus.BRUXA_GUI.get(), BruxaGuiScreen::new);
		event.register(WitchercraftModMenus.GRAVEIR_GUI.get(), GraveirGuiScreen::new);
		event.register(WitchercraftModMenus.HIGHER_VAMPIRE_GUI.get(), HigherVampireGuiScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}

	public static void renderEntityInInventoryFollowsAngle(GuiGraphics guiGraphics, int x, int y, int scale, float angleXComponent, float angleYComponent, LivingEntity entity) {
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