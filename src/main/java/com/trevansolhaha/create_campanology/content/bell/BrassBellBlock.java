package com.trevansolhaha.create_campanology.content.bell;

import com.simibubi.create.content.equipment.wrench.WrenchItem;
import com.trevansolhaha.create_campanology.component.BellSizeComponent;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlock;
import com.trevansolhaha.create_campanology.init.ModBlockEntities;
import com.trevansolhaha.create_campanology.init.ModDataComponents;
import com.trevansolhaha.create_campanology.init.ModShapes;
import com.trevansolhaha.create_campanology.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
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

public class BrassBellBlock extends ModBaseBellBlock {

    public BrassBellBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
        ItemStack stack = new ItemStack(ModItems.BRASS_BELL_1.get());
        stack.set(ModDataComponents.BELL_SIZE, new BellSizeComponent(state.getValue(SIZE)));
        return stack;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return ModBlockEntities.BRASS_BELL_1.get().create(blockPos, blockState);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return ModShapes.BRASS_BELL_1.get(state.getValue(SIZE));
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof WrenchItem ||
                player.getItemInHand(InteractionHand.OFF_HAND).getItem() instanceof WrenchItem) {
            return InteractionResult.PASS;
        }

        if (level.getBlockEntity(pos) instanceof BrassBellBlockEntity brassBell) {
            Direction clickedFace = hitResult.getDirection();
            Direction bellFacing = state.getValue(FACING);

            brassBell.triggerBellAnimation(clickedFace, bellFacing);

            return InteractionResult.sidedSuccess(level.isClientSide());
        }
        return InteractionResult.SUCCESS;
    }

    //for the animation features (explosion)
    @Override
    protected void onExplosionHit(BlockState blockState, Level level, BlockPos blockPos, Explosion explosion, BiConsumer<ItemStack, BlockPos> biConsumer) {
        if (explosion.canTriggerBlocks() && !level.isClientSide()) {
            if (!blockState.hasProperty(FACING)) return;

            Direction bellFacing = level.getBlockState(blockPos).getValue(FACING);
            Direction explosionSourceDirection = getExplosionSourceDirection(explosion, blockPos, bellFacing);

            BlockEntity blockEntity = level.getBlockEntity(blockPos);
            if (blockEntity instanceof BrassBellBlockEntity brassBell) {
                if (explosionSourceDirection == bellFacing) {
                    brassBell.triggerAnim("click_controller", "trigger_click_front");
                } else {
                    brassBell.triggerAnim("click_controller", "trigger_click_back");
                }
            }
        }
    }
}