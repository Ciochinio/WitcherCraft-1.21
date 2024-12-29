
package net.redboltmedia.witchercraft.network;

import net.redboltmedia.witchercraft.world.inventory.CharacterAbilitiesSignsGuiMenu;
import net.redboltmedia.witchercraft.procedures.YrdenIntensityEffectProcedure;
import net.redboltmedia.witchercraft.procedures.SustainedGlyphsEffectProcedure;
import net.redboltmedia.witchercraft.procedures.ShockWaveEffectProcedure;
import net.redboltmedia.witchercraft.procedures.QuenIntensityEffectProcedure;
import net.redboltmedia.witchercraft.procedures.QuenDiscahrgeEffectProcedure;
import net.redboltmedia.witchercraft.procedures.PyromaniacEffectProcedure;
import net.redboltmedia.witchercraft.procedures.PauseMenuGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.MagicTrapEffectProcedure;
import net.redboltmedia.witchercraft.procedures.IgniIntensityEffectProcedure;
import net.redboltmedia.witchercraft.procedures.FirestreamEffectProcedure;
import net.redboltmedia.witchercraft.procedures.FarReachingAardEffectProcedure;
import net.redboltmedia.witchercraft.procedures.ExplodingShieldEffectProcedure;
import net.redboltmedia.witchercraft.procedures.DominationEffectProcedure;
import net.redboltmedia.witchercraft.procedures.DelusionEffectProcedure;
import net.redboltmedia.witchercraft.procedures.CharaterAbilitesGeneralGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterAbilitiesSignsGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterAbilitiesCombatGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.CharacterAbilitiesAlchemyGuiOpenProcedure;
import net.redboltmedia.witchercraft.procedures.AxiiIntensityEffectProcedure;
import net.redboltmedia.witchercraft.procedures.AardIntensityEffectProcedure;
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
public record CharacterAbilitiesSignsGuiButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<CharacterAbilitiesSignsGuiButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WitchercraftMod.MODID, "character_abilities_signs_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CharacterAbilitiesSignsGuiButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, CharacterAbilitiesSignsGuiButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new CharacterAbilitiesSignsGuiButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<CharacterAbilitiesSignsGuiButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final CharacterAbilitiesSignsGuiButtonMessage message, final IPayloadContext context) {
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
		HashMap guistate = CharacterAbilitiesSignsGuiMenu.guistate;
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

			CharacterAbilitiesCombatGuiOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			CharacterAbilitiesAlchemyGuiOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			CharacterAbilitiesSignsGuiOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			FarReachingAardEffectProcedure.execute(entity);
		}
		if (buttonID == 6) {

			AardIntensityEffectProcedure.execute(entity);
		}
		if (buttonID == 7) {

			ShockWaveEffectProcedure.execute(entity);
		}
		if (buttonID == 8) {

			FirestreamEffectProcedure.execute(entity);
		}
		if (buttonID == 9) {

			IgniIntensityEffectProcedure.execute(entity);
		}
		if (buttonID == 10) {

			PyromaniacEffectProcedure.execute(entity);
		}
		if (buttonID == 11) {

			SustainedGlyphsEffectProcedure.execute(entity);
		}
		if (buttonID == 12) {

			YrdenIntensityEffectProcedure.execute(entity);
		}
		if (buttonID == 13) {

			MagicTrapEffectProcedure.execute(entity);
		}
		if (buttonID == 14) {

			ExplodingShieldEffectProcedure.execute(entity);
		}
		if (buttonID == 15) {

			QuenIntensityEffectProcedure.execute(entity);
		}
		if (buttonID == 16) {

			QuenDiscahrgeEffectProcedure.execute(entity);
		}
		if (buttonID == 17) {

			DelusionEffectProcedure.execute(entity);
		}
		if (buttonID == 18) {

			AxiiIntensityEffectProcedure.execute(entity);
		}
		if (buttonID == 19) {

			DominationEffectProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WitchercraftMod.addNetworkMessage(CharacterAbilitiesSignsGuiButtonMessage.TYPE, CharacterAbilitiesSignsGuiButtonMessage.STREAM_CODEC, CharacterAbilitiesSignsGuiButtonMessage::handleData);
	}
}
