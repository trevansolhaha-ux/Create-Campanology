package com.trevansolhaha.create_campanology.item;

import com.trevansolhaha.create_campanology.component.MediumBellSizeComponent;
import com.trevansolhaha.create_campanology.content.bell.generic.ModMediumBellSizes;
import com.trevansolhaha.create_campanology.init.ModDataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class ModMediumBellBlockItem extends BlockItem {
    public ModMediumBellBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        ModMediumBellSizes size = stack.getOrDefault(ModDataComponents.MEDIUM_BELL_SIZE, MediumBellSizeComponent.getDefaultValue()).getSize();
        tooltipComponents.add(Component.translatable("create_campanology.medium_bell_size." + size.getSerializedName()));

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
