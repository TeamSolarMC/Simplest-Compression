package net.indevo.simplest_compression.item;

import net.indevo.simplest_compression.SimplestCompression;
import net.indevo.simplest_compression.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimplestCompression.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SIMPLEST_COMPRESSION_TAB = CREATIVE_MODE_TABS.register("simplest_compression_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.Compressed_Cobblestone.get()))
                    .title(Component.translatable("creativetab.simplest_compression_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.Compressed_Cobblestone.get());
                        pOutput.accept(ModBlocks.Compressed_Blackstone.get());
                        pOutput.accept(ModBlocks.Compressed_Cobbled_Deepslate.get());
                        pOutput.accept(ModBlocks.Compressed_Basalt.get());
                        pOutput.accept(ModBlocks.Compressed_Calcite.get());
                        pOutput.accept(ModBlocks.Compressed_Clay.get());
                        pOutput.accept(ModBlocks.Compressed_Diorite.get());
                        pOutput.accept(ModBlocks.Compressed_Dirt.get());
                        pOutput.accept(ModBlocks.Compressed_Dripstone_Block.get());
                        pOutput.accept(ModBlocks.Compressed_End_Stone.get());
                        pOutput.accept(ModBlocks.Compressed_Granite.get());
                        pOutput.accept(ModBlocks.Compressed_Gravel.get());
                        pOutput.accept(ModBlocks.Compressed_Netherrack.get());
                        pOutput.accept(ModBlocks.Compressed_Sand.get());
                        pOutput.accept(ModBlocks.Compressed_Tuff.get());
                    }))
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
