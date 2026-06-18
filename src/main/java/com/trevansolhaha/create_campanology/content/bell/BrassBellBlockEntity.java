package com.trevansolhaha.create_campanology.content.bell;

import com.simibubi.create.api.equipment.goggles.IHaveGoggleInformation;
import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;

public class BrassBellBlockEntity extends SmartBlockEntity implements GeoBlockEntity, IHaveGoggleInformation {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    private final RawAnimation swingFront;
    private final RawAnimation swingBack;

    private AnimationController<BrassBellBlockEntity> clickController;

    public BrassBellBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, String animationName) {
        super(type, pos, state);
        this.swingFront = RawAnimation.begin().thenPlay(animationName + ".swing_front");
        this.swingBack = RawAnimation.begin().thenPlay(animationName + ".swing_back");
    }

    @Override
    public void addBehaviours(List<BlockEntityBehaviour> behaviours) {

    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        this.clickController = new AnimationController<>(this, "click_controller", 0, state -> PlayState.STOP)
                .triggerableAnim("trigger_click_front", swingFront)
                .triggerableAnim("trigger_click_back", swingBack);

        controllers.add(this.clickController);
    }

    @Override
    public void triggerAnim(String controllerName, String animName) {
        if ("click_controller".equals(controllerName) && this.clickController != null) {
            this.clickController.forceAnimationReset();
        }
        GeoBlockEntity.super.triggerAnim(controllerName, animName);
    }

    public void triggerBellAnimation(net.minecraft.core.Direction clickedFace, net.minecraft.core.Direction bellFacing) {
        if (clickedFace.getAxis() == bellFacing.getAxis()) {
            if (clickedFace == bellFacing) {
                this.triggerAnim("click_controller", "trigger_click_front");
            } else {
                this.triggerAnim("click_controller", "trigger_click_back");
            }
        }
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}