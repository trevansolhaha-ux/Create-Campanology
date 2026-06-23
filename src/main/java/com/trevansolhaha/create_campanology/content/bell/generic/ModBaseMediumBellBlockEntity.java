package com.trevansolhaha.create_campanology.content.bell.generic;

import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;
import com.simibubi.create.foundation.utility.CreateLang;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;

import java.util.List;

public class ModBaseMediumBellBlockEntity extends SmartBlockEntity implements GeoBlockEntity {
    public ModBaseMediumBellBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public void addBehaviours(List<BlockEntityBehaviour> behaviours) {

    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }

    public void triggerBellAnimation(Direction clickedFace, Direction bellFacing) {
        if (clickedFace.getAxis() == bellFacing.getAxis()) {
            if (clickedFace == bellFacing) {
                this.triggerAnim("click_controller", "trigger_click_front");
            } else {
                this.triggerAnim("click_controller", "trigger_click_back");
            }
        }
    }

    protected void goggleTooltipInfo(List<Component> tooltip, boolean isPlayerSneaking, ModMediumBellSizes size) {
        CreateLang.translate("create_campanology.bell_size", Component.translatable("create_campanology.medium_bell_size." + size.getSerializedName()))
                        .forGoggles(tooltip); // To be improved
    }
}