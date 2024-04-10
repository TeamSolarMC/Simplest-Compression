package net.indevo.simplest_compression.datagen.loot;

import net.indevo.simplest_compression.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.Compressed_Cobblestone.get());
        this.dropSelf(ModBlocks.Compressed_Blackstone.get());
        this.dropSelf(ModBlocks.Compressed_Cobbled_Deepslate.get());
        this.dropSelf(ModBlocks.Compressed_Basalt.get());
        this.dropSelf(ModBlocks.Compressed_Calcite.get());
        this.dropSelf(ModBlocks.Compressed_Clay.get());
        this.dropSelf(ModBlocks.Compressed_Diorite.get());
        this.dropSelf(ModBlocks.Compressed_Dirt.get());
        this.dropSelf(ModBlocks.Compressed_Dripstone_Block.get());
        this.dropSelf(ModBlocks.Compressed_End_Stone.get());
        this.dropSelf(ModBlocks.Compressed_Granite.get());
        this.dropSelf(ModBlocks.Compressed_Gravel.get());
        this.dropSelf(ModBlocks.Compressed_Netherrack.get());
        this.dropSelf(ModBlocks.Compressed_Sand.get());
        this.dropSelf(ModBlocks.Compressed_Tuff.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
