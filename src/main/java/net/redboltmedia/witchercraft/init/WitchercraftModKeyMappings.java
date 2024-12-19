
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import org.lwjgl.glfw.GLFW;

import net.redboltmedia.witchercraft.network.SignGuiKeybindMessage;
import net.redboltmedia.witchercraft.network.SignCastKeybindMessage;
import net.redboltmedia.witchercraft.network.PauseMenuKeybindPressMessage;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WitchercraftModKeyMappings {
	public static final KeyMapping PAUSE_MENU_KEYBIND_PRESS = new KeyMapping("key.witchercraft.pause_menu_keybind_press", GLFW.GLFW_KEY_B, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new PauseMenuKeybindPressMessage(0, 0));
				PauseMenuKeybindPressMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SIGN_GUI_KEYBIND = new KeyMapping("key.witchercraft.sign_gui_keybind", GLFW.GLFW_KEY_TAB, "key.categories.witchercraft") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SignGuiKeybindMessage(0, 0));
				SignGuiKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SIGN_CAST_KEYBIND = new KeyMapping("key.witchercraft.sign_cast_keybind", GLFW.GLFW_KEY_R, "key.categories.witchercraft") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SignCastKeybindMessage(0, 0));
				SignCastKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(PAUSE_MENU_KEYBIND_PRESS);
		event.register(SIGN_GUI_KEYBIND);
		event.register(SIGN_CAST_KEYBIND);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				PAUSE_MENU_KEYBIND_PRESS.consumeClick();
				SIGN_GUI_KEYBIND.consumeClick();
				SIGN_CAST_KEYBIND.consumeClick();
			}
		}
	}
}
