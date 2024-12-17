
package net.redboltmedia.witchercraft.network;

import net.redboltmedia.witchercraft.world.inventory.SignGuiMenu;
import net.redboltmedia.witchercraft.procedures.YrdenSignChooseProcedure;
import net.redboltmedia.witchercraft.procedures.QuenSignChooseProcedure;
import net.redboltmedia.witchercraft.procedures.IgniSignChooseProcedure;
import net.redboltmedia.witchercraft.procedures.AxiiSignChooseProcedure;
import net.redboltmedia.witchercraft.procedures.AardSignChooseProcedure;
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
public record SignGuiButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<SignGuiButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WitchercraftMod.MODID, "sign_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SignGuiButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SignGuiButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new SignGuiButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<SignGuiButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final SignGuiButtonMessage message, final IPayloadContext context) {
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
		HashMap guistate = SignGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			YrdenSignChooseProcedure.execute(entity);
		}
		if (buttonID == 1) {

			QuenSignChooseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			IgniSignChooseProcedure.execute(entity);
		}
		if (buttonID == 3) {

			AxiiSignChooseProcedure.execute(entity);
		}
		if (buttonID == 4) {

			AardSignChooseProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WitchercraftMod.addNetworkMessage(SignGuiButtonMessage.TYPE, SignGuiButtonMessage.STREAM_CODEC, SignGuiButtonMessage::handleData);
	}
}
