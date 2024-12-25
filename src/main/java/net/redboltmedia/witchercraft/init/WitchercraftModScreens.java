
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import net.redboltmedia.witchercraft.client.gui.SkillTreeSignsGuiScreen;
import net.redboltmedia.witchercraft.client.gui.SkillTreeCombatGuiScreen;
import net.redboltmedia.witchercraft.client.gui.SkillTreeAlchemyGuiScreen;
import net.redboltmedia.witchercraft.client.gui.SignGuiScreen;
import net.redboltmedia.witchercraft.client.gui.PauseMenuGUIScreen;
import net.redboltmedia.witchercraft.client.gui.MeditationGuiScreen;
import net.redboltmedia.witchercraft.client.gui.GlossaryMenuGuiScreen;
import net.redboltmedia.witchercraft.client.gui.CharacterGuiScreen;
import net.redboltmedia.witchercraft.client.gui.BestiaryMenuGuiScreen;
import net.redboltmedia.witchercraft.client.gui.AlchemyGuiScreen;
import net.redboltmedia.witchercraft.client.gui.AlchemyGuiPotionsScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

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
		event.register(WitchercraftModMenus.SKILL_TREE_COMBAT_GUI.get(), SkillTreeCombatGuiScreen::new);
		event.register(WitchercraftModMenus.SKILL_TREE_ALCHEMY_GUI.get(), SkillTreeAlchemyGuiScreen::new);
		event.register(WitchercraftModMenus.SKILL_TREE_SIGNS_GUI.get(), SkillTreeSignsGuiScreen::new);
	}
}
