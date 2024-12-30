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
			clone.witchercraftAbilitiesLearned = original.witchercraftAbilitiesLearned;
			clone.witchercraftAbiltiesGourment = original.witchercraftAbiltiesGourment;
			clone.witchercraftAbilitiesSurvivalInstinct = original.witchercraftAbilitiesSurvivalInstinct;
			clone.witchercraftAbilitiesSunAndStars = original.witchercraftAbilitiesSunAndStars;
			clone.witchercraftAbilitiesCatSchool = original.witchercraftAbilitiesCatSchool;
			clone.witchercraftAbilitiesGriffinSchool = original.witchercraftAbilitiesGriffinSchool;
			clone.witchercraftAbilitiesBearSchool = original.witchercraftAbilitiesBearSchool;
			clone.witchercraftAbilitiesRefreshment = original.witchercraftAbilitiesRefreshment;
			clone.witchercraftAbilitiesDelayedRecovery = original.witchercraftAbilitiesDelayedRecovery;
			clone.witchercraftAbilitiesSideEffects = original.witchercraftAbilitiesSideEffects;
			clone.witchercraftAbilitiesPoisonedBlades = original.witchercraftAbilitiesPoisonedBlades;
			clone.witchercraftAbilitiesProtectiveCoating = original.witchercraftAbilitiesProtectiveCoating;
			clone.witchercraftAbilitiesHunterInstincts = original.witchercraftAbilitiesHunterInstincts;
			clone.witchercraftAbilitiesPyrotechnics = original.witchercraftAbilitiesPyrotechnics;
			clone.witchercraftAbilitiesEfficency = original.witchercraftAbilitiesEfficency;
			clone.witchercraftAbilitiesClusterBombs = original.witchercraftAbilitiesClusterBombs;
			clone.witchercraftAbilitiesFarRReachingAard = original.witchercraftAbilitiesFarRReachingAard;
			clone.witchercraftAbilitiesAardIntensity = original.witchercraftAbilitiesAardIntensity;
			clone.witchercraftAbilitiesShockWave = original.witchercraftAbilitiesShockWave;
			clone.witchercraftAbilitiesFireStream = original.witchercraftAbilitiesFireStream;
			clone.witchercraftAbilitiesIgniIntensity = original.witchercraftAbilitiesIgniIntensity;
			clone.witchercraftAbilitiesPyromaic = original.witchercraftAbilitiesPyromaic;
			clone.witchercraftAbilitiesSustainedGlyphs = original.witchercraftAbilitiesSustainedGlyphs;
			clone.witchercraftAbilitiesYrdenIntensity = original.witchercraftAbilitiesYrdenIntensity;
			clone.witchercraftAbilitiesMagicTrap = original.witchercraftAbilitiesMagicTrap;
			clone.witchercraftAbilitiesExploadingShild = original.witchercraftAbilitiesExploadingShild;
			clone.witchercraftAbilitiesQuenIntensity = original.witchercraftAbilitiesQuenIntensity;
			clone.witchercraftAbilitiesQuenDischarge = original.witchercraftAbilitiesQuenDischarge;
			clone.witchercraftAbilitiesDelusion = original.witchercraftAbilitiesDelusion;
			clone.witchercraftAbilitiesAxiiInntensiy = original.witchercraftAbilitiesAxiiInntensiy;
			clone.witchercraftAbilitiesDominaion = original.witchercraftAbilitiesDominaion;
			clone.witchercraftAbilitiesMuscleMemory = original.witchercraftAbilitiesMuscleMemory;
			clone.witchercraftAbilitiesPreciseBlows = original.witchercraftAbilitiesPreciseBlows;
			clone.witchercraftAbilitiesCripplingStrikes = original.witchercraftAbilitiesCripplingStrikes;
			clone.witchercraftAbilitiesStrengthTraining = original.witchercraftAbilitiesStrengthTraining;
			clone.witchercraftAbilitiesCrushingBlows = original.witchercraftAbilitiesCrushingBlows;
			clone.witchercraftAbilitiesSunderArmor = original.witchercraftAbilitiesSunderArmor;
			clone.witchercraftAbilitiesFleetFooted = original.witchercraftAbilitiesFleetFooted;
			clone.witchercraftAbilitiesDefence = original.witchercraftAbilitiesDefence;
			clone.witchercraftAbilitiesDeadlyPresicion = original.witchercraftAbilitiesDeadlyPresicion;
			clone.witchercraftAbilitiesColdBlood = original.witchercraftAbilitiesColdBlood;
			clone.witchercraftAbilitiesAnatomicalKnowledge = original.witchercraftAbilitiesAnatomicalKnowledge;
			clone.witchercraftAbilitiesCripplingShot = original.witchercraftAbilitiesCripplingShot;
			clone.witchercraftAbilitiesFloodOfAnger = original.witchercraftAbilitiesFloodOfAnger;
			clone.witchercraftAbilitiesRazorFocus = original.witchercraftAbilitiesRazorFocus;
			clone.witchercraftAbilitiesUndying = original.witchercraftAbilitiesUndying;
			clone.wichercraftPlayerLevel = original.wichercraftPlayerLevel;
			clone.wichercraftPlayerExperience = original.wichercraftPlayerExperience;
			clone.wichercraftAbilitesExperienceRequirement = original.wichercraftAbilitesExperienceRequirement;
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
		public double sumCritDamage = 0.0;
		public double witchercraftBaseMovementSpeed = 0;
		public double witchercraftBaseHealth = 0;
		public double witchercraftBaseAttackSpeed = 0;
		public double witchercraftPassiveHealthRegeneration = 0;
		public double witchercraftBasePassiveHealthRegeneration = 0;
		public double witchercraftPassiveStaminaRegeneration = 0;
		public double witchercraftBaseStaminaRegeneration = 0;
		public double witchercraftAbilitiesLearned = 0.0;
		public boolean witchercraftAbiltiesGourment = false;
		public boolean witchercraftAbilitiesSurvivalInstinct = false;
		public boolean witchercraftAbilitiesSunAndStars = false;
		public boolean witchercraftAbilitiesCatSchool = false;
		public boolean witchercraftAbilitiesGriffinSchool = false;
		public boolean witchercraftAbilitiesBearSchool = false;
		public boolean witchercraftAbilitiesRefreshment = false;
		public boolean witchercraftAbilitiesDelayedRecovery = false;
		public boolean witchercraftAbilitiesSideEffects = false;
		public boolean witchercraftAbilitiesPoisonedBlades = false;
		public boolean witchercraftAbilitiesProtectiveCoating = false;
		public boolean witchercraftAbilitiesHunterInstincts = false;
		public boolean witchercraftAbilitiesPyrotechnics = false;
		public boolean witchercraftAbilitiesEfficency = false;
		public boolean witchercraftAbilitiesClusterBombs = false;
		public boolean witchercraftAbilitiesFarRReachingAard = false;
		public boolean witchercraftAbilitiesAardIntensity = false;
		public boolean witchercraftAbilitiesShockWave = false;
		public boolean witchercraftAbilitiesFireStream = false;
		public boolean witchercraftAbilitiesIgniIntensity = false;
		public boolean witchercraftAbilitiesPyromaic = false;
		public boolean witchercraftAbilitiesSustainedGlyphs = false;
		public boolean witchercraftAbilitiesYrdenIntensity = false;
		public boolean witchercraftAbilitiesMagicTrap = false;
		public boolean witchercraftAbilitiesExploadingShild = false;
		public boolean witchercraftAbilitiesQuenIntensity = false;
		public boolean witchercraftAbilitiesQuenDischarge = false;
		public boolean witchercraftAbilitiesDelusion = false;
		public boolean witchercraftAbilitiesAxiiInntensiy = false;
		public boolean witchercraftAbilitiesDominaion = false;
		public boolean witchercraftAbilitiesMuscleMemory = false;
		public boolean witchercraftAbilitiesPreciseBlows = false;
		public boolean witchercraftAbilitiesCripplingStrikes = false;
		public boolean witchercraftAbilitiesStrengthTraining = false;
		public boolean witchercraftAbilitiesCrushingBlows = false;
		public boolean witchercraftAbilitiesSunderArmor = false;
		public boolean witchercraftAbilitiesFleetFooted = false;
		public boolean witchercraftAbilitiesDefence = false;
		public boolean witchercraftAbilitiesDeadlyPresicion = false;
		public boolean witchercraftAbilitiesColdBlood = false;
		public boolean witchercraftAbilitiesAnatomicalKnowledge = false;
		public boolean witchercraftAbilitiesCripplingShot = false;
		public boolean witchercraftAbilitiesFloodOfAnger = false;
		public boolean witchercraftAbilitiesRazorFocus = false;
		public boolean witchercraftAbilitiesUndying = false;
		public double wichercraftPlayerLevel = 0;
		public double wichercraftPlayerExperience = 0;
		public double wichercraftAbilitesExperienceRequirement = 0.0;

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
			nbt.putDouble("witchercraftAbilitiesLearned", witchercraftAbilitiesLearned);
			nbt.putBoolean("witchercraftAbiltiesGourment", witchercraftAbiltiesGourment);
			nbt.putBoolean("witchercraftAbilitiesSurvivalInstinct", witchercraftAbilitiesSurvivalInstinct);
			nbt.putBoolean("witchercraftAbilitiesSunAndStars", witchercraftAbilitiesSunAndStars);
			nbt.putBoolean("witchercraftAbilitiesCatSchool", witchercraftAbilitiesCatSchool);
			nbt.putBoolean("witchercraftAbilitiesGriffinSchool", witchercraftAbilitiesGriffinSchool);
			nbt.putBoolean("witchercraftAbilitiesBearSchool", witchercraftAbilitiesBearSchool);
			nbt.putBoolean("witchercraftAbilitiesRefreshment", witchercraftAbilitiesRefreshment);
			nbt.putBoolean("witchercraftAbilitiesDelayedRecovery", witchercraftAbilitiesDelayedRecovery);
			nbt.putBoolean("witchercraftAbilitiesSideEffects", witchercraftAbilitiesSideEffects);
			nbt.putBoolean("witchercraftAbilitiesPoisonedBlades", witchercraftAbilitiesPoisonedBlades);
			nbt.putBoolean("witchercraftAbilitiesProtectiveCoating", witchercraftAbilitiesProtectiveCoating);
			nbt.putBoolean("witchercraftAbilitiesHunterInstincts", witchercraftAbilitiesHunterInstincts);
			nbt.putBoolean("witchercraftAbilitiesPyrotechnics", witchercraftAbilitiesPyrotechnics);
			nbt.putBoolean("witchercraftAbilitiesEfficency", witchercraftAbilitiesEfficency);
			nbt.putBoolean("witchercraftAbilitiesClusterBombs", witchercraftAbilitiesClusterBombs);
			nbt.putBoolean("witchercraftAbilitiesFarRReachingAard", witchercraftAbilitiesFarRReachingAard);
			nbt.putBoolean("witchercraftAbilitiesAardIntensity", witchercraftAbilitiesAardIntensity);
			nbt.putBoolean("witchercraftAbilitiesShockWave", witchercraftAbilitiesShockWave);
			nbt.putBoolean("witchercraftAbilitiesFireStream", witchercraftAbilitiesFireStream);
			nbt.putBoolean("witchercraftAbilitiesIgniIntensity", witchercraftAbilitiesIgniIntensity);
			nbt.putBoolean("witchercraftAbilitiesPyromaic", witchercraftAbilitiesPyromaic);
			nbt.putBoolean("witchercraftAbilitiesSustainedGlyphs", witchercraftAbilitiesSustainedGlyphs);
			nbt.putBoolean("witchercraftAbilitiesYrdenIntensity", witchercraftAbilitiesYrdenIntensity);
			nbt.putBoolean("witchercraftAbilitiesMagicTrap", witchercraftAbilitiesMagicTrap);
			nbt.putBoolean("witchercraftAbilitiesExploadingShild", witchercraftAbilitiesExploadingShild);
			nbt.putBoolean("witchercraftAbilitiesQuenIntensity", witchercraftAbilitiesQuenIntensity);
			nbt.putBoolean("witchercraftAbilitiesQuenDischarge", witchercraftAbilitiesQuenDischarge);
			nbt.putBoolean("witchercraftAbilitiesDelusion", witchercraftAbilitiesDelusion);
			nbt.putBoolean("witchercraftAbilitiesAxiiInntensiy", witchercraftAbilitiesAxiiInntensiy);
			nbt.putBoolean("witchercraftAbilitiesDominaion", witchercraftAbilitiesDominaion);
			nbt.putBoolean("witchercraftAbilitiesMuscleMemory", witchercraftAbilitiesMuscleMemory);
			nbt.putBoolean("witchercraftAbilitiesPreciseBlows", witchercraftAbilitiesPreciseBlows);
			nbt.putBoolean("witchercraftAbilitiesCripplingStrikes", witchercraftAbilitiesCripplingStrikes);
			nbt.putBoolean("witchercraftAbilitiesStrengthTraining", witchercraftAbilitiesStrengthTraining);
			nbt.putBoolean("witchercraftAbilitiesCrushingBlows", witchercraftAbilitiesCrushingBlows);
			nbt.putBoolean("witchercraftAbilitiesSunderArmor", witchercraftAbilitiesSunderArmor);
			nbt.putBoolean("witchercraftAbilitiesFleetFooted", witchercraftAbilitiesFleetFooted);
			nbt.putBoolean("witchercraftAbilitiesDefence", witchercraftAbilitiesDefence);
			nbt.putBoolean("witchercraftAbilitiesDeadlyPresicion", witchercraftAbilitiesDeadlyPresicion);
			nbt.putBoolean("witchercraftAbilitiesColdBlood", witchercraftAbilitiesColdBlood);
			nbt.putBoolean("witchercraftAbilitiesAnatomicalKnowledge", witchercraftAbilitiesAnatomicalKnowledge);
			nbt.putBoolean("witchercraftAbilitiesCripplingShot", witchercraftAbilitiesCripplingShot);
			nbt.putBoolean("witchercraftAbilitiesFloodOfAnger", witchercraftAbilitiesFloodOfAnger);
			nbt.putBoolean("witchercraftAbilitiesRazorFocus", witchercraftAbilitiesRazorFocus);
			nbt.putBoolean("witchercraftAbilitiesUndying", witchercraftAbilitiesUndying);
			nbt.putDouble("wichercraftPlayerLevel", wichercraftPlayerLevel);
			nbt.putDouble("wichercraftPlayerExperience", wichercraftPlayerExperience);
			nbt.putDouble("wichercraftAbilitesExperienceRequirement", wichercraftAbilitesExperienceRequirement);
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
			witchercraftAbilitiesLearned = nbt.getDouble("witchercraftAbilitiesLearned");
			witchercraftAbiltiesGourment = nbt.getBoolean("witchercraftAbiltiesGourment");
			witchercraftAbilitiesSurvivalInstinct = nbt.getBoolean("witchercraftAbilitiesSurvivalInstinct");
			witchercraftAbilitiesSunAndStars = nbt.getBoolean("witchercraftAbilitiesSunAndStars");
			witchercraftAbilitiesCatSchool = nbt.getBoolean("witchercraftAbilitiesCatSchool");
			witchercraftAbilitiesGriffinSchool = nbt.getBoolean("witchercraftAbilitiesGriffinSchool");
			witchercraftAbilitiesBearSchool = nbt.getBoolean("witchercraftAbilitiesBearSchool");
			witchercraftAbilitiesRefreshment = nbt.getBoolean("witchercraftAbilitiesRefreshment");
			witchercraftAbilitiesDelayedRecovery = nbt.getBoolean("witchercraftAbilitiesDelayedRecovery");
			witchercraftAbilitiesSideEffects = nbt.getBoolean("witchercraftAbilitiesSideEffects");
			witchercraftAbilitiesPoisonedBlades = nbt.getBoolean("witchercraftAbilitiesPoisonedBlades");
			witchercraftAbilitiesProtectiveCoating = nbt.getBoolean("witchercraftAbilitiesProtectiveCoating");
			witchercraftAbilitiesHunterInstincts = nbt.getBoolean("witchercraftAbilitiesHunterInstincts");
			witchercraftAbilitiesPyrotechnics = nbt.getBoolean("witchercraftAbilitiesPyrotechnics");
			witchercraftAbilitiesEfficency = nbt.getBoolean("witchercraftAbilitiesEfficency");
			witchercraftAbilitiesClusterBombs = nbt.getBoolean("witchercraftAbilitiesClusterBombs");
			witchercraftAbilitiesFarRReachingAard = nbt.getBoolean("witchercraftAbilitiesFarRReachingAard");
			witchercraftAbilitiesAardIntensity = nbt.getBoolean("witchercraftAbilitiesAardIntensity");
			witchercraftAbilitiesShockWave = nbt.getBoolean("witchercraftAbilitiesShockWave");
			witchercraftAbilitiesFireStream = nbt.getBoolean("witchercraftAbilitiesFireStream");
			witchercraftAbilitiesIgniIntensity = nbt.getBoolean("witchercraftAbilitiesIgniIntensity");
			witchercraftAbilitiesPyromaic = nbt.getBoolean("witchercraftAbilitiesPyromaic");
			witchercraftAbilitiesSustainedGlyphs = nbt.getBoolean("witchercraftAbilitiesSustainedGlyphs");
			witchercraftAbilitiesYrdenIntensity = nbt.getBoolean("witchercraftAbilitiesYrdenIntensity");
			witchercraftAbilitiesMagicTrap = nbt.getBoolean("witchercraftAbilitiesMagicTrap");
			witchercraftAbilitiesExploadingShild = nbt.getBoolean("witchercraftAbilitiesExploadingShild");
			witchercraftAbilitiesQuenIntensity = nbt.getBoolean("witchercraftAbilitiesQuenIntensity");
			witchercraftAbilitiesQuenDischarge = nbt.getBoolean("witchercraftAbilitiesQuenDischarge");
			witchercraftAbilitiesDelusion = nbt.getBoolean("witchercraftAbilitiesDelusion");
			witchercraftAbilitiesAxiiInntensiy = nbt.getBoolean("witchercraftAbilitiesAxiiInntensiy");
			witchercraftAbilitiesDominaion = nbt.getBoolean("witchercraftAbilitiesDominaion");
			witchercraftAbilitiesMuscleMemory = nbt.getBoolean("witchercraftAbilitiesMuscleMemory");
			witchercraftAbilitiesPreciseBlows = nbt.getBoolean("witchercraftAbilitiesPreciseBlows");
			witchercraftAbilitiesCripplingStrikes = nbt.getBoolean("witchercraftAbilitiesCripplingStrikes");
			witchercraftAbilitiesStrengthTraining = nbt.getBoolean("witchercraftAbilitiesStrengthTraining");
			witchercraftAbilitiesCrushingBlows = nbt.getBoolean("witchercraftAbilitiesCrushingBlows");
			witchercraftAbilitiesSunderArmor = nbt.getBoolean("witchercraftAbilitiesSunderArmor");
			witchercraftAbilitiesFleetFooted = nbt.getBoolean("witchercraftAbilitiesFleetFooted");
			witchercraftAbilitiesDefence = nbt.getBoolean("witchercraftAbilitiesDefence");
			witchercraftAbilitiesDeadlyPresicion = nbt.getBoolean("witchercraftAbilitiesDeadlyPresicion");
			witchercraftAbilitiesColdBlood = nbt.getBoolean("witchercraftAbilitiesColdBlood");
			witchercraftAbilitiesAnatomicalKnowledge = nbt.getBoolean("witchercraftAbilitiesAnatomicalKnowledge");
			witchercraftAbilitiesCripplingShot = nbt.getBoolean("witchercraftAbilitiesCripplingShot");
			witchercraftAbilitiesFloodOfAnger = nbt.getBoolean("witchercraftAbilitiesFloodOfAnger");
			witchercraftAbilitiesRazorFocus = nbt.getBoolean("witchercraftAbilitiesRazorFocus");
			witchercraftAbilitiesUndying = nbt.getBoolean("witchercraftAbilitiesUndying");
			wichercraftPlayerLevel = nbt.getDouble("wichercraftPlayerLevel");
			wichercraftPlayerExperience = nbt.getDouble("wichercraftPlayerExperience");
			wichercraftAbilitesExperienceRequirement = nbt.getDouble("wichercraftAbilitesExperienceRequirement");
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
