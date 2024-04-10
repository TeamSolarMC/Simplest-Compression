package net.indevo.simplest_compression.datagen;

import net.indevo.simplest_compression.SimplestCompression;
import net.indevo.simplest_compression.block.ModBlocks;
import net.indevo.simplest_compression.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, SimplestCompression.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.ADVANCED_STONE_TOOL_MATERIALS)
                .add(
                        ModBlocks.Compressed_Cobblestone.get().asItem(),
                        ModBlocks.Compressed_Blackstone.get().asItem(),
                        ModBlocks.Compressed_Cobbled_Deepslate.get().asItem());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
