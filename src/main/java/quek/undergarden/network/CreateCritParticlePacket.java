package quek.undergarden.network;

import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import quek.undergarden.Undergarden;

public record CreateCritParticlePacket(int entityID, int duration,
									   ParticleOptions particle) implements CustomPacketPayload {

	public static final Type<CreateCritParticlePacket> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(Undergarden.MODID, "create_crit_particle"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CreateCritParticlePacket> STREAM_CODEC = CustomPacketPayload.codec(CreateCritParticlePacket::write, CreateCritParticlePacket::new);

	public CreateCritParticlePacket(RegistryFriendlyByteBuf buf) {
		this(buf.readInt(), buf.readInt(), ParticleTypes.STREAM_CODEC.decode(buf));
	}

	public void write(RegistryFriendlyByteBuf buf) {
		buf.writeInt(this.entityID());
		buf.writeInt(this.duration());
		ParticleTypes.STREAM_CODEC.encode(buf, this.particle());
	}

	@Override
	public Type<? extends CustomPacketPayload> type() {
		return TYPE;
	}

	public static void handle(CreateCritParticlePacket packet, IPayloadContext context) {
		context.enqueueWork(() -> {
			Entity entity = Minecraft.getInstance().level.getEntity(packet.entityID());
			if (entity != null) {
				Minecraft.getInstance().particleEngine.createTrackingEmitter(entity, packet.particle(), packet.duration());
			}
		});
	}
}
