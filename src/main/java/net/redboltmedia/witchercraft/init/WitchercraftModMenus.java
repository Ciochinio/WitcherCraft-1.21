
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import net.redboltmedia.witchercraft.world.inventory.SignGuiMenu;
import net.redboltmedia.witchercraft.world.inventory.PauseMenuGUIMenu;
import net.redboltmedia.witchercraft.world.inventory.MeditationGuiMenu;
import net.redboltmedia.witchercraft.world.inventory.GlossaryMenuGuiMenu;
import net.redboltmedia.witchercraft.world.inventory.CharacterGuiMenu;
import net.redboltmedia.witchercraft.world.inventory.BestiaryMenuGuiMenu;
import net.redboltmedia.witchercraft.world.inventory.AlchemyGuiPotionsMenu;
import net.redboltmedia.witchercraft.world.inventory.AlchemyGuiMenu;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class WitchercraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, WitchercraftMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<PauseMenuGUIMenu>> PAUSE_MENU_GUI = REGISTRY.register("pause_menu_gui", () -> IMenuTypeExtension.create(PauseMenuGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MeditationGuiMenu>> MEDITATION_GUI = REGISTRY.register("meditation_gui", () -> IMenuTypeExtension.create(MeditationGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AlchemyGuiMenu>> ALCHEMY_GUI = REGISTRY.register("alchemy_gui", () -> IMenuTypeExtension.create(AlchemyGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GlossaryMenuGuiMenu>> GLOSSARY_MENU_GUI = REGISTRY.register("glossary_menu_gui", () -> IMenuTypeExtension.create(GlossaryMenuGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BestiaryMenuGuiMenu>> BESTIARY_MENU_GUI = REGISTRY.register("bestiary_menu_gui", () -> IMenuTypeExtension.create(BestiaryMenuGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CharacterGuiMenu>> CHARACTER_GUI = REGISTRY.register("character_gui", () -> IMenuTypeExtension.create(CharacterGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SignGuiMenu>> SIGN_GUI = REGISTRY.register("sign_gui", () -> IMenuTypeExtension.create(SignGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AlchemyGuiPotionsMenu>> ALCHEMY_GUI_POTIONS = REGISTRY.register("alchemy_gui_potions", () -> IMenuTypeExtension.create(AlchemyGuiPotionsMenu::new));
}
