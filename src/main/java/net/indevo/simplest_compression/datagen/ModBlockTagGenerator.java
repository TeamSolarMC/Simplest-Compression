package net.indevo.simplest_compression.datagen;

import net.indevo.simplest_compression.SimplestCompression;
import net.indevo.simplest_compression.block.ModBlocks;
import net.indevo.simplest_compression.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper ){
        super(output, lookupProvider, SimplestCompression.MOD_ID, existingFileHelper);
    }

    private static TagKey<Block> create(String p_203847_) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(p_203847_));
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider ){
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.Compressed_Cobblestone.get(),
                        ModBlocks.Compressed_Blackstone.get(),
                        ModBlocks.Compressed_Basalt.get(),
                        ModBlocks.Compressed_Calcite.get(),
                        ModBlocks.Compressed_Clay.get(),
                        ModBlocks.Compressed_Diorite.get(),
                        ModBlocks.Compressed_Dirt.get(),
                        ModBlocks.Compressed_Dripstone_Block.get(),
                        ModBlocks.Compressed_End_Stone.get(),
                        ModBlocks.Compressed_Granite.get(),
                        ModBlocks.Compressed_Netherrack.get(),
                        ModBlocks.Compressed_Sand.get(),
                        ModBlocks.Compressed_Tuff.get(),
                        ModBlocks.Compressed_Cobbled_Deepslate.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(
                        ModBlocks.Compressed_Gravel.get(),
                        ModBlocks.Compressed_Sand.get());

        this.tag(ModTags.Blocks.ADVANCED_STONE_TOOL_MATERIALS)
                .add(
                        ModBlocks.Compressed_Cobblestone.get(),
                        ModBlocks.Compressed_Blackstone.get(),
                        ModBlocks.Compressed_Basalt.get(),
                        ModBlocks.Compressed_Calcite.get(),
                        ModBlocks.Compressed_Clay.get(),
                        ModBlocks.Compressed_Diorite.get(),
                        ModBlocks.Compressed_Dirt.get(),
                        ModBlocks.Compressed_Dripstone_Block.get(),
                        ModBlocks.Compressed_End_Stone.get(),
                        ModBlocks.Compressed_Granite.get(),
                        ModBlocks.Compressed_Gravel.get(),
                        ModBlocks.Compressed_Netherrack.get(),
                        ModBlocks.Compressed_Sand.get(),
                        ModBlocks.Compressed_Tuff.get(),
                        ModBlocks.Compressed_Cobbled_Deepslate.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
