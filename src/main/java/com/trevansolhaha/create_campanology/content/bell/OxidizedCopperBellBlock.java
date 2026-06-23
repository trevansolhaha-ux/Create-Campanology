package com.trevansolhaha.create_campanology.content.bell;

import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlock;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBellSizes;
import com.trevansolhaha.create_campanology.init.ModBlockEntities;
import com.trevansolhaha.create_campanology.init.ModItems;
import com.trevansolhaha.create_campanology.init.ModShapes;
import com.trevansolhaha.create_campanology.init.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;

public class OxidizedCopperBellBlock extends ModBaseBellBlock {
    public OxidizedCopperBellBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
        return new ItemStack(ModItems.OXIDIZED_COPPER_BELL_1.get());
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return ModBlockEntities.OXIDIZED_COPPER_BELL_1.get().create(blockPos, blockState);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return ModShapes.OXIDIZED_COPPER_BELL_1.get(state.getValue(SIZE));
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
//        if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof WrenchItem || // TODO: Uncomment when medium/large models are added
//                player.getItemInHand(InteractionHand.OFF_HAND).getItem() instanceof WrenchItem) {
//            return InteractionResult.PASS;
//        }

        if (level.getBlockEntity(pos) instanceof OxidizedCopperBellBlockEntity oxidizedCopperBell) {
            Direction clickedFace = hitResult.getDirection();
            Direction bellFacing = state.getValue(FACING);

            if (oxidizedCopperBell.triggerBellAnimation(clickedFace, bellFacing)) {
                playBellSound(level, pos, state.getValue(SIZE));
            }

            return InteractionResult.sidedSuccess(level.isClientSide());
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected void onExplosionHit(BlockState blockState, Level level, BlockPos blockPos, Explosion explosion, BiConsumer<ItemStack, BlockPos> biConsumer) {
        if (explosion.canTriggerBlocks() && !level.isClientSide()) {
            if (!blockState.hasProperty(FACING)) return;

            Direction bellFacing = level.getBlockState(blockPos).getValue(FACING);
            Direction explosionSourceDirection = getExplosionSourceDirection(explosion, blockPos, bellFacing);

            BlockEntity blockEntity = level.getBlockEntity(blockPos);
            if (blockEntity instanceof OxidizedCopperBellBlockEntity oxidizedCopperBell) {
                playBellSound(level, blockPos, blockState.getValue(SIZE));
                if (explosionSourceDirection == bellFacing) {
                    oxidizedCopperBell.triggerAnim("click_controller", "trigger_click_front");
                } else {// If it's not front (including sides defaulting to back), play back
                    oxidizedCopperBell.triggerAnim("click_controller", "trigger_click_back");
                }
            }
        }
    }

    private void playBellSound(Level level, BlockPos pos, ModBellSizes size) {
        playBellSound(level, pos, size, ModSoundEvents.OXIDIZED_COPPER_BELL_USE.value());
    }
}
