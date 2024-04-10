package net.indevo.simplest_compression.block;

import net.indevo.simplest_compression.SimplestCompression;
import net.indevo.simplest_compression.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SimplestCompression.MOD_ID);

    public static final RegistryObject<Block> Compressed_Cobblestone = registerBlock("compressed_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> Compressed_Blackstone = registerBlock("compressed_blackstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> Compressed_Cobbled_Deepslate = registerBlock("compressed_cobbled_deepslate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> Compressed_Basalt = registerBlock("compressed_basalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)
                    .strength(1.25F, 4.2F).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    public static final RegistryObject<Block> Compressed_Calcite = registerBlock("compressed_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)
                    .strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));

    public static final RegistryObject<Block> Compressed_Clay = registerBlock("compressed_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)
                    .strength(0.6F).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> Compressed_Diorite = registerBlock("compressed_diorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Dirt = registerBlock("compressed_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .strength(0.5F).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> Compressed_Dripstone_Block = registerBlock("compressed_dripstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(1.5F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> Compressed_End_Stone = registerBlock("compressed_end_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Granite = registerBlock("compressed_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Gravel = registerBlock("compressed_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .strength(0.6F).sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> Compressed_Netherrack = registerBlock("compressed_netherrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(0.4F).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> Compressed_Sand = registerBlock("compressed_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND)
                    .strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<Block> Compressed_Tuff = registerBlock("compressed_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.TUFF)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
