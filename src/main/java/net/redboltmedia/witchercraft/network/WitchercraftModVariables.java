package net.redboltmedia.witchercraft.network;

import net.redboltmedia.witchercraft.WitchercraftMod;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;

import java.util.function.Supplier;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WitchercraftModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, WitchercraftMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		WitchercraftMod.addNetworkMessage(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC, PlayerVariablesSyncMessage::handleData);
	}

	@EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
			PlayerVariables clone = new PlayerVariables();
			if (!event.isWasDeath()) {
				clone.witchercraftMovementSpeed = original.witchercraftMovementSpeed;
				clone.witchercraftHealth = original.witchercraftHealth;
				clone.witchercraftArmor = original.witchercraftArmor;
				clone.witchercraftAdditionalDamage = original.witchercraftAdditionalDamage;
				clone.witchercraftCritChance = original.witchercraftCritChance;
				clone.witchercraftCritDamage = original.witchercraftCritDamage;
				clone.witchercraftAttackSpeed = original.witchercraftAttackSpeed;
				clone.sumCritChance = original.sumCritChance;
				clone.sumCritDamage = original.sumCritDamage;
				clone.witchercraftBaseMovementSpeed = original.witchercraftBaseMovementSpeed;
				clone.witchercraftBaseHealth = original.witchercraftBaseHealth;
				clone.witchercraftBaseAttackSpeed = original.witchercraftBaseAttackSpeed;
				clone.witchercraftPassiveHealthRegeneration = original.witchercraftPassiveHealthRegeneration;
				clone.witchercraftBasePassiveHealthRegeneration = original.witchercraftBasePassiveHealthRegeneration;
				clone.witchercraftPassiveStaminaRegeneration = original.witchercraftPassiveStaminaRegeneration;
				clone.witchercraftBaseStaminaRegeneration = original.witchercraftBaseStaminaRegeneration;
			}
			event.getEntity().setData(PLAYER_VARIABLES, clone);
		}
	}

	public static class PlayerVariables implements INBTSerializable<CompoundTag> {
		public double witchercraftMovementSpeed = 0.0;
		public double witchercraftHealth = 0.0;
		public double witchercraftArmor = 0.0;
		public double witchercraftAdditionalDamage = 0.0;
		public double witchercraftCritChance = 0.0;
		public double witchercraftCritDamage = 0.0;
		public double witchercraftAttackSpeed = 0;
		public double sumCritChance = 0;
		public double sumCritDamage = 0;
		public double witchercraftBaseMovementSpeed = 0;
		public double witchercraftBaseHealth = 0;
		public double witchercraftBaseAttackSpeed = 0;
		public double witchercraftPassiveHealthRegeneration = 0;
		public double witchercraftBasePassiveHealthRegeneration = 0;
		public double witchercraftPassiveStaminaRegeneration = 0;
		public double witchercraftBaseStaminaRegeneration = 0;

		@Override
		public CompoundTag serializeNBT(HolderLookup.Provider lookupProvider) {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("witchercraftMovementSpeed", witchercraftMovementSpeed);
			nbt.putDouble("witchercraftHealth", witchercraftHealth);
			nbt.putDouble("witchercraftArmor", witchercraftArmor);
			nbt.putDouble("witchercraftAdditionalDamage", witchercraftAdditionalDamage);
			nbt.putDouble("witchercraftCritChance", witchercraftCritChance);
			nbt.putDouble("witchercraftCritDamage", witchercraftCritDamage);
			nbt.putDouble("witchercraftAttackSpeed", witchercraftAttackSpeed);
			nbt.putDouble("sumCritChance", sumCritChance);
			nbt.putDouble("sumCritDamage", sumCritDamage);
			nbt.putDouble("witchercraftBaseMovementSpeed", witchercraftBaseMovementSpeed);
			nbt.putDouble("witchercraftBaseHealth", witchercraftBaseHealth);
			nbt.putDouble("witchercraftBaseAttackSpeed", witchercraftBaseAttackSpeed);
			nbt.putDouble("witchercraftPassiveHealthRegeneration", witchercraftPassiveHealthRegeneration);
			nbt.putDouble("witchercraftBasePassiveHealthRegeneration", witchercraftBasePassiveHealthRegeneration);
			nbt.putDouble("witchercraftPassiveStaminaRegeneration", witchercraftPassiveStaminaRegeneration);
			nbt.putDouble("witchercraftBaseStaminaRegeneration", witchercraftBaseStaminaRegeneration);
			return nbt;
		}

		@Override
		public void deserializeNBT(HolderLookup.Provider lookupProvider, CompoundTag nbt) {
			witchercraftMovementSpeed = nbt.getDouble("witchercraftMovementSpeed");
			witchercraftHealth = nbt.getDouble("witchercraftHealth");
			witchercraftArmor = nbt.getDouble("witchercraftArmor");
			witchercraftAdditionalDamage = nbt.getDouble("witchercraftAdditionalDamage");
			witchercraftCritChance = nbt.getDouble("witchercraftCritChance");
			witchercraftCritDamage = nbt.getDouble("witchercraftCritDamage");
			witchercraftAttackSpeed = nbt.getDouble("witchercraftAttackSpeed");
			sumCritChance = nbt.getDouble("sumCritChance");
			sumCritDamage = nbt.getDouble("sumCritDamage");
			witchercraftBaseMovementSpeed = nbt.getDouble("witchercraftBaseMovementSpeed");
			witchercraftBaseHealth = nbt.getDouble("witchercraftBaseHealth");
			witchercraftBaseAttackSpeed = nbt.getDouble("witchercraftBaseAttackSpeed");
			witchercraftPassiveHealthRegeneration = nbt.getDouble("witchercraftPassiveHealthRegeneration");
			witchercraftBasePassiveHealthRegeneration = nbt.getDouble("witchercraftBasePassiveHealthRegeneration");
			witchercraftPassiveStaminaRegeneration = nbt.getDouble("witchercraftPassiveStaminaRegeneration");
			witchercraftBaseStaminaRegeneration = nbt.getDouble("witchercraftBaseStaminaRegeneration");
		}

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.sendToPlayer(serverPlayer, new PlayerVariablesSyncMessage(this));
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WitchercraftMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec
				.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> buffer.writeNbt(message.data().serializeNBT(buffer.registryAccess())), (RegistryFriendlyByteBuf buffer) -> {
					PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
					message.data.deserializeNBT(buffer.registryAccess(), buffer.readNbt());
					return message;
				});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> context.player().getData(PLAYER_VARIABLES).deserializeNBT(context.player().registryAccess(), message.data.serializeNBT(context.player().registryAccess()))).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}
