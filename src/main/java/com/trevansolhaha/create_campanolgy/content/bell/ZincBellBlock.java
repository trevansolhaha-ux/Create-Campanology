package com.trevansolhaha.create_campanolgy.content.bell;

import com.trevansolhaha.create_campanolgy.content.bell.generic.ModBaseBellBlock;
import com.trevansolhaha.create_campanolgy.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class ZincBellBlock extends ModBaseBellBlock {
    public ZincBellBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return ModBlockEntities.ZINC_BELL.get().create(blockPos, blockState);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            BlockEntity blockEntity = level.getBlockEntity(pos);

            if (blockEntity instanceof ZincBellBlockEntity zincBellBlockEntity) {
                zincBellBlockEntity.triggerAnim("click_controller", "trigger_click");
            }
        }
        return InteractionResult.SUCCESS;
    }
}
