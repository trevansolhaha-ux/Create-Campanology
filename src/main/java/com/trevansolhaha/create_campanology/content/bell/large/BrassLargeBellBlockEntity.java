package com.trevansolhaha.create_campanology.content.bell.large;

import com.simibubi.create.api.equipment.goggles.IHaveGoggleInformation;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseLargeBellBlock;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseLargeBlockEntity;
import com.trevansolhaha.create_campanology.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;

public class BrassLargeBellBlockEntity extends ModBaseLargeBlockEntity implements IHaveGoggleInformation {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    private final RawAnimation swingFront = RawAnimation.begin().thenPlay("brass_bell_3.swing_front");
    private final RawAnimation swingBack = RawAnimation.begin().thenPlay("brass_bell_3.swing_back");
    private AnimationController<BrassLargeBellBlockEntity> clickController;
    public BrassLargeBellBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BRASS_BELL_3.get(), pos, state);
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
        super.triggerAnim(controllerName, animName);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public boolean addToGoggleTooltip(List<Component> tooltip, boolean isPlayerSneaking) {
        goggleTooltipInfo(tooltip, isPlayerSneaking, getBlockState().getValue(ModBaseLargeBellBlock.SIZE));
        return true;
    }
}
