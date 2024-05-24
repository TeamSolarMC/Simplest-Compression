package net.indevo.simplest_compression.block;

import net.indevo.simplest_compression.SimplestCompression;
import net.indevo.simplest_compression.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SimplestCompression.MOD_ID);

    public static final RegistryObject<Block> Compressed_Cobblestone = registerBlock("compressed_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3.5F, 18.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> Compressed_Blackstone = registerBlock("compressed_blackstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.625F, 18.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> Compressed_Cobbled_Deepslate = registerBlock("compressed_cobbled_deepslate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5.25F, 18.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> Compressed_Basalt = registerBlock("compressed_basalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)
                    .strength(2.1875F, 12.6F).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    public static final RegistryObject<Block> Compressed_Calcite = registerBlock("compressed_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)
                    .strength(1.3125F, 2.25F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));

    public static final RegistryObject<Block> Compressed_Clay = registerBlock("compressed_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)
                    .strength(0.9F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> Compressed_Diorite = registerBlock("compressed_diorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(2.625F, 18.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Dirt = registerBlock("compressed_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .strength(0.75F, 0.5F).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> Compressed_Dripstone_Block = registerBlock("compressed_dripstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)
                    .strength(2.625F, 4.5F).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> Compressed_End_Stone = registerBlock("compressed_end_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(5.25F, 27.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Granite = registerBlock("compressed_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(2.625F, 18.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Gravel = registerBlock("compressed_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .strength(0.9F, 0.6F).sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> Compressed_Netherrack = registerBlock("compressed_netherrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(0.7F, 1.2F).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> Compressed_Sand = registerBlock("compressed_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND)
                    .strength(0.75F, 0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<Block> Compressed_Tuff = registerBlock("compressed_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(2.625F, 18.0F).requiresCorrectToolForDrops().sound(SoundType.TUFF)));

    public static final RegistryObject<Block> Compressed_Andesite = registerBlock("compressed_andesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(2.625F, 18.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Sandstone = registerBlock("compressed_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)
                    .strength(1.4F, 12.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Red_Sand = registerBlock("compressed_red_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SAND)
                    .strength(0.75F, 2.5F).requiresCorrectToolForDrops().sound(SoundType.SAND)));

    public static final RegistryObject<Block> Compressed_Red_Sandstone = registerBlock("compressed_red_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)
                    .strength(1.4F, 12.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Soul_Sand = registerBlock("compressed_soul_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)
                    .strength(0.75F, 2.5F).requiresCorrectToolForDrops().sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<Block> Compressed_Soul_Soil = registerBlock("compressed_soul_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)
                    .strength(0.75F, 2.5F).requiresCorrectToolForDrops().sound(SoundType.SOUL_SOIL)));

    public static final RegistryObject<Block> Compressed_Prismarine = registerBlock("compressed_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)
                    .strength(2.625F, 18.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Snow_Block = registerBlock("compressed_snow_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK)
                    .strength(0.3F, 1.0F).requiresCorrectToolForDrops().sound(SoundType.SNOW)));

    public static final RegistryObject<Block> Compressed_Stone = registerBlock("compressed_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.625F, 18.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Smooth_Basalt = registerBlock("compressed_smooth_basalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)
                    .strength(2.1875F, 12.6F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Magma_Block = registerBlock("compressed_magma_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)
                    .strength(0.875F, 4.5F).requiresCorrectToolForDrops().lightLevel((p_152684_) -> {
                        return 3;
                    }).strength(0.5F).isValidSpawn((p_187421_, p_187422_, p_187423_, p_187424_) -> {
                        return p_187424_.fireImmune();
                    }).hasPostProcess(ModBlocks::always).emissiveRendering(ModBlocks::always)));;

    public static final RegistryObject<Block> Compressed_Obsidian = registerBlock("compressed_obsidian",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)
                    .strength(87.5F, 3600.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Compressed_Mud = registerBlock("compressed_mud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)
                    .strength(0.75F, 0.5F).requiresCorrectToolForDrops().sound(SoundType.MUD)));

    public static final RegistryObject<Block> Compressed_Packed_Mud = registerBlock("compressed_packed_mud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));

    public static final RegistryObject<Block> Compressed_Moss_Block = registerBlock("compressed_moss_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)
                    .strength(0.15F).requiresCorrectToolForDrops().sound(SoundType.MOSS)));

    public static final RegistryObject<Block> Compressed_Deepslate = registerBlock("compressed_deepslate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5.25F, 18.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    private static boolean always(BlockState p_50775_, BlockGetter p_50776_, BlockPos p_50777_) {
        return true;
    }


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
