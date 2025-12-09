/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import net.redboltmedia.witchercraft.client.particle.YrdenParticleParticle;
import net.redboltmedia.witchercraft.client.particle.QuenParticlesParticle;
import net.redboltmedia.witchercraft.client.particle.QuenHoldParticlesParticle;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class WitchercraftModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(WitchercraftModParticleTypes.YRDEN_PARTICLE.get(), YrdenParticleParticle::provider);
		event.registerSpriteSet(WitchercraftModParticleTypes.QUEN_HOLD_PARTICLES.get(), QuenHoldParticlesParticle::provider);
		event.registerSpriteSet(WitchercraftModParticleTypes.QUEN_PARTICLES.get(), QuenParticlesParticle::provider);
	}
}