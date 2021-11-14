package quek.undergarden.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import quek.undergarden.registry.UGDamageSources;
import quek.undergarden.registry.UGParticleTypes;
import quek.undergarden.registry.UGTags;

import java.util.Random;

public class ShardWallTorchBlock extends WallTorchBlock {

    public ShardWallTorchBlock(Properties properties) {
        super(properties, ParticleTypes.FLAME);
    }

    @Override
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand) {
        Direction direction = stateIn.getValue(FACING);
        double x = (double)pos.getX() + 0.5D;
        double y = (double)pos.getY() + 0.7D;
        double z = (double)pos.getZ() + 0.5D;
        Direction oppositeDirection = direction.getOpposite();
        worldIn.addParticle(ParticleTypes.SMOKE, x + 0.27D * (double)oppositeDirection.getStepX(), y + 0.22D, z + 0.27D * (double)oppositeDirection.getStepZ(), 0.0D, 0.0D, 0.0D);
        worldIn.addParticle(UGParticleTypes.SHARD.get(), x + 0.27D * (double)oppositeDirection.getStepX(), y + 0.22D, z + 0.27D * (double)oppositeDirection.getStepZ(), 0.0D, 0.0D, 0.0D);
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        pLevel.getBlockTicks().scheduleTick(pPos, this, 20);
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        pLevel.getEntitiesOfClass(LivingEntity.class, new AABB(
                        pPos.getX() - 4,
                        pPos.getY() - 4,
                        pPos.getZ() - 4,
                        pPos.getX() + 4,
                        pPos.getY() + 4,
                        pPos.getZ() + 4
                ),
                entity -> entity.getType().is(UGTags.Entities.ROTSPAWN)).forEach(entity -> entity.hurt(UGDamageSources.SHARD_TORCH, 4));

        pLevel.getBlockTicks().scheduleTick(pPos, this, 20);
    }
}