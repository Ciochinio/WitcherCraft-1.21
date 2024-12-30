
package net.redboltmedia.witchercraft.network;

import net.redboltmedia.witchercraft.world.inventory.CharactersAbilietesGeneralGuiMenu;
import net.redboltmedia.witchercraft.procedures.SurvivalInstinctEffectProcedure;
import net.redboltmedia.witchercraft.procedures.SunAndStarsEffectProcedure;
import net.redboltmedia.witchercraft.procedures.PauseMenuGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.GriffinSchoolEffectProcedure;
import net.redboltmedia.witchercraft.procedures.GourmentEffectProcedure;
import net.redboltmedia.witchercraft.procedures.CharaterAbilitesGeneralGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterAbilitiesSignsGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterAbilitiesCombatGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterAbilitiesAlchemyGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.CatSchoolEffectProcedure;
import net.redboltmedia.witchercraft.procedures.BearSchoolEffectProcedure;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record CharactersAbilietesGeneralGuiButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<CharactersAbilietesGeneralGuiButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WitchercraftMod.MODID, "characters_abilietes_general_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CharactersAbilietesGeneralGuiButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, CharactersAbilietesGeneralGuiButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new CharactersAbilietesGeneralGuiButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<CharactersAbilietesGeneralGuiButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final CharactersAbilietesGeneralGuiButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = CharactersAbilietesGeneralGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			PauseMenuGuiOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			CharaterAbilitesGeneralGuiOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			CharacterAbilitiesAlchemyGuiOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			CharacterAbilitiesCombatGuiOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			CharacterAbilitiesSignsGuiOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			SunAndStarsEffectProcedure.execute(entity);
		}
		if (buttonID == 6) {

			SurvivalInstinctEffectProcedure.execute(entity);
		}
		if (buttonID == 7) {

			GourmentEffectProcedure.execute(entity);
		}
		if (buttonID == 8) {

			CatSchoolEffectProcedure.execute(entity);
		}
		if (buttonID == 9) {

			GriffinSchoolEffectProcedure.execute(entity);
		}
		if (buttonID == 10) {

			BearSchoolEffectProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WitchercraftMod.addNetworkMessage(CharactersAbilietesGeneralGuiButtonMessage.TYPE, CharactersAbilietesGeneralGuiButtonMessage.STREAM_CODEC, CharactersAbilietesGeneralGuiButtonMessage::handleData);
	}
}
