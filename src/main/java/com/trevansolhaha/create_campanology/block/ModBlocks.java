package com.trevansolhaha.create_campanology.block;

import com.trevansolhaha.create_campanology.CreateCampanology;
import com.trevansolhaha.create_campanology.init.ModBlockEntities;
import com.trevansolhaha.create_campanology.item.ModItems;
import com.trevansolhaha.create_campanology.content.bell.*;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreateCampanology.MOD_ID);


    public static final DeferredBlock<Block> MUSICAL_TIN_BLOCK = registerBlock("musical_tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.COPPER)
                    .mapColor(MapColor.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,6.0f)
            ));

    public static final DeferredBlock<Block> NETHER_MUSICAL_TIN_ORE = registerBlock("nether_musical_tin_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(2,5),
                    BlockBehaviour.Properties.of()
                    .sound(SoundType.NETHER_GOLD_ORE)
                    .mapColor(MapColor.NETHER)
                    .requiresCorrectToolForDrops()
                    .strength(3.0f,3.0f)
            ));

    public static final DeferredBlock<Block> MUSICAL_TIN_ORE = registerBlock("musical_tin_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0f,3.0f)
            ));

    public static final DeferredBlock<Block> MUSICAL_BRONZE_BLOCK = registerBlock("musical_bronze_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.COPPER)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
            ));

    public static final DeferredBlock<Block> MUSICAL_ZINC_BLOCK = registerBlock("musical_zinc_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.COPPER)
                    .mapColor(MapColor.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
            ));

    public static final DeferredBlock<Block> MUSICAL_COPPER_BLOCK = registerBlock("musical_copper_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.COPPER)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
            ));

    public static final DeferredBlock<Block> MUSICAL_ANDESITE_BLOCK = registerBlock("musical_andesite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.COPPER)
                    .mapColor(MapColor.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
            ));
    public static final DeferredBlock<Block> MUSICAL_BRASS_BLOCK = registerBlock("musical_brass_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.COPPER)
                    .mapColor(MapColor.GOLD)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
            ));

    public static final DeferredBlock<Block> MUSICAL_GOLD_BLOCK = registerBlock("musical_gold_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.COPPER)
                    .mapColor(MapColor.GOLD)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
            ));

    public static final DeferredBlock<Block> MUSICAL_IRON_BLOCK = registerBlock("musical_iron_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.COPPER)
                    .mapColor(MapColor.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
            ));

    public static final DeferredBlock<Block> OXIDISED_MUSICAL_BLOCK = registerBlock("oxidised_musical_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.COPPER)
                    .mapColor(MapColor.COLOR_CYAN)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
            ));

    public static final DeferredBlock<Block> RAW_MUSICAL_TIN_BLOCK = registerBlock("raw_musical_tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
            ));

    // Bells
    public static final DeferredBlock<Block> COPPER_BELL_1 = BLOCKS.register("copper_bell_1",
            () -> new CopperBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
                    .noOcclusion()
            ));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_BELL_1 = BLOCKS.register("oxidized_copper_bell_1",
            () -> new OxidizedCopperBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.COLOR_CYAN)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
                    .noOcclusion()
            ));
    public static final DeferredBlock<Block> IRON_BELL_1 = BLOCKS.register("iron_bell_1",
            () -> new IronBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
                    .noOcclusion()
            ));
    public static final DeferredBlock<Block> BRONZE_BELL_1 = BLOCKS.register("bronze_bell_1",
            () -> new BronzeBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
                    .noOcclusion()
            ));


    //Brass bells blocks

    //small ones
    public static final DeferredBlock<Block> BRASS_BELL_1 = BLOCKS.register("brass_bell_1",
            () -> new BrassBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
                    .noOcclusion(),
                    ModBlockEntities.BRASS_BELL_1,
                    ModItems.BRASS_BELL_1,
                    Block.box(4.0D, 6.0D, 4.0D, 12.0D, 16.0D, 12.0D)
            ) {
                @Override
                public Block getNextBellVariant() {
                    return BRASS_BELL_2.get();
                }
            });
    public static final DeferredBlock<Block> BRASS_BELL_2 = BLOCKS.register("brass_bell_2",
            () -> new BrassBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .requiresCorrectToolForDrops()
                    .strength(5.5f,5.0f)
                    .noOcclusion(),
                    ModBlockEntities.BRASS_BELL_2,
                    ModItems.BRASS_BELL_1,
                    Block.box(3.0D, 3.0D, 3.0D, 13.0D, 14.0D, 13.0D)
            ) {
                @Override
                public Block getNextBellVariant() {
                    return BRASS_BELL_3.get();
                }
            });
    public static final DeferredBlock<Block> BRASS_BELL_3 = BLOCKS.register("brass_bell_3",
            () -> new BrassBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .requiresCorrectToolForDrops()
                    .strength(6.0f,5.0f)
                    .noOcclusion(),
                    ModBlockEntities.BRASS_BELL_3,
                    ModItems.BRASS_BELL_1,
                    Block.box(2.0D, 2.0D, 2.0D, 14.0D, 14.0D, 14.0D)
            ) {
                @Override
                public Block getNextBellVariant() {
                    return BRASS_BELL_1.get();
                }
            });

    public static final DeferredBlock<Block> GOLD_BELL_1 = BLOCKS.register("gold_bell_1",
            () -> new GoldBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.GOLD)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
                    .noOcclusion()
            ));
    public static final DeferredBlock<Block> ZINC_BELL_1 = BLOCKS.register("zinc_bell_1",
            () -> new ZincBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.COLOR_CYAN)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
                    .noOcclusion()
            ));
    public static final DeferredBlock<Block> ANDESITE_ALLOY_BELL_1 = BLOCKS.register("andesite_alloy_bell_1",
            () -> new AndesiteBellBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .mapColor(MapColor.COLOR_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f,5.0f)
                    .noOcclusion()
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void  registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void  register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
