package com.trevansolhaha.create_campanology.item;

import com.trevansolhaha.create_campanology.component.LargeBellSizeComponent;
import com.trevansolhaha.create_campanology.content.bell.generic.ModLargeBellSizes;
import com.trevansolhaha.create_campanology.init.ModDataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class ModLargeBellBlockItem extends BlockItem {
    public ModLargeBellBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        ModLargeBellSizes size = stack.getOrDefault(ModDataComponents.LARGE_BELL_SIZE, LargeBellSizeComponent.getDefaultValue()).getSize();
        tooltipComponents.add(Component.translatable("create_campanology.large_bell_size." + size.getSerializedName()));

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
