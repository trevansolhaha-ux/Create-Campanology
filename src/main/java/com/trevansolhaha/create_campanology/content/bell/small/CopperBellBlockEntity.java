package com.trevansolhaha.create_campanology.content.bell.small;

import com.simibubi.create.api.equipment.goggles.IHaveGoggleInformation;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlock;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBaseBellBlockEntity;
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

public class CopperBellBlockEntity extends ModBaseBellBlockEntity implements IHaveGoggleInformation {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    protected static final RawAnimation SWING_FRONT = RawAnimation.begin().thenPlay("copper_bell_1.swing_front");
    protected static final RawAnimation SWING_BACK = RawAnimation.begin().thenPlay("copper_bell_1.swing_back");

    private AnimationController<CopperBellBlockEntity> clickController;

    public CopperBellBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.COPPER_BELL_1.get(), pos, state);
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
        super.triggerAnim(controllerName, animName);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public boolean addToGoggleTooltip(List<Component> tooltip, boolean isPlayerSneaking) {
        goggleTooltipInfo(tooltip, isPlayerSneaking, getBlockState().getValue(ModBaseBellBlock.SIZE));
        return true;
    }
}
