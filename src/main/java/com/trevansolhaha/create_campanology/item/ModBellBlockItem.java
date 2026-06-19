package com.trevansolhaha.create_campanology.item;

import com.trevansolhaha.create_campanology.component.BellSizeComponent;
import com.trevansolhaha.create_campanology.content.bell.generic.ModBellSizes;
import com.trevansolhaha.create_campanology.init.ModDataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class ModBellBlockItem extends BlockItem {
    public ModBellBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        ModBellSizes size = stack.getOrDefault(ModDataComponents.BELL_SIZE, BellSizeComponent.getDefaultValue()).getSize();
        tooltipComponents.add(Component.translatable("create_campanology.bell_size." + size.getSerializedName())); // TODO: add translations for this

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
