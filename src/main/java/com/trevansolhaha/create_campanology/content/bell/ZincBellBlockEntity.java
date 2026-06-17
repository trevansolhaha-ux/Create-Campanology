package com.trevansolhaha.create_campanology.content.bell;

import com.simibubi.create.api.equipment.goggles.IHaveGoggleInformation;
import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;
import com.trevansolhaha.create_campanology.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;

public class ZincBellBlockEntity extends SmartBlockEntity implements GeoBlockEntity, IHaveGoggleInformation {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    protected static final RawAnimation SWING_FRONT = RawAnimation.begin().thenPlay("zinc_bell_1.swing_front");
    protected static final RawAnimation SWING_BACK = RawAnimation.begin().thenPlay("zinc_bell_1.swing_back");

    private AnimationController<ZincBellBlockEntity> clickController;

    public ZincBellBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ZINC_BELL_1.get(), pos, state);
    }

    @Override
    public void addBehaviours(List<BlockEntityBehaviour> behaviours) {

    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        this.clickController = new AnimationController<>(this, "click_controller", 0, state -> PlayState.STOP)
                .triggerableAnim("trigger_click_front", SWING_FRONT)
                .triggerableAnim("trigger_click_back", SWING_BACK);

        controllers.add(this.clickController);
    }

    @Override
    public void triggerAnim(String controllerName, String animName) {
        if ("click_controller".equals(controllerName) && this.clickController != null) {
            this.clickController.forceAnimationReset();
        }
        GeoBlockEntity.super.triggerAnim(controllerName, animName);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
