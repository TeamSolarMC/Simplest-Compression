package net.indevo.simplest_compression.datagen;

import net.indevo.simplest_compression.SimplestCompression;
import net.indevo.simplest_compression.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SimplestCompression.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.Compressed_Cobblestone);
        blockWithItem(ModBlocks.Compressed_Blackstone);
        blockWithItem(ModBlocks.Compressed_Cobbled_Deepslate);
        blockWithItem(ModBlocks.Compressed_Basalt);
        blockWithItem(ModBlocks.Compressed_Calcite);
        blockWithItem(ModBlocks.Compressed_Clay);
        blockWithItem(ModBlocks.Compressed_Diorite);
        blockWithItem(ModBlocks.Compressed_Dirt);
        blockWithItem(ModBlocks.Compressed_Dripstone_Block);
        blockWithItem(ModBlocks.Compressed_End_Stone);
        blockWithItem(ModBlocks.Compressed_Granite);
        blockWithItem(ModBlocks.Compressed_Gravel);
        blockWithItem(ModBlocks.Compressed_Netherrack);
        blockWithItem(ModBlocks.Compressed_Sand);
        blockWithItem(ModBlocks.Compressed_Tuff);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
