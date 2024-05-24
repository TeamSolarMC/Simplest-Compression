package net.indevo.simplest_compression.datagen;

import net.indevo.simplest_compression.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {
        //BLOCKS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Cobblestone.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.COBBLESTONE)
                .unlockedBy("has_cobblestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COBBLESTONE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Blackstone.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.BLACKSTONE)
                .unlockedBy("has_blackstone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BLACKSTONE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Cobbled_Deepslate.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.COBBLED_DEEPSLATE)
                .unlockedBy("has_cobbled_deepslate", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COBBLED_DEEPSLATE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Basalt.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.BASALT)
                .unlockedBy("has_basalt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BASALT).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Calcite.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CALCITE)
                .unlockedBy("has_calcite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CALCITE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Clay.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CLAY)
                .unlockedBy("has_clay", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CLAY).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Diorite.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DIORITE)
                .unlockedBy("has_diorite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIORITE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Dirt.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DIRT)
                .unlockedBy("has_dirt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIRT).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Dripstone_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DRIPSTONE_BLOCK)
                .unlockedBy("has_dripstone_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DRIPSTONE_BLOCK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_End_Stone.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.END_STONE)
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.END_STONE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Granite.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.GRANITE)
                .unlockedBy("has_granite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GRANITE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Gravel.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.GRAVEL)
                .unlockedBy("has_gravel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GRAVEL).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Netherrack.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.NETHERRACK)
                .unlockedBy("has_netherrack", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERRACK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Sand.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.SAND)
                .unlockedBy("has_sand", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SAND).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Tuff.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.TUFF)
                .unlockedBy("has_tuff", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.TUFF).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Andesite.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.ANDESITE)
                .unlockedBy("has_andesite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ANDESITE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Sandstone.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.SANDSTONE)
                .unlockedBy("has_sandstone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SANDSTONE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Red_Sand.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.RED_SAND)
                .unlockedBy("has_red_sand", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.RED_SAND).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Red_Sandstone.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.RED_SANDSTONE)
                .unlockedBy("has_red_sandstone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.RED_SANDSTONE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Deepslate.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DEEPSLATE)
                .unlockedBy("has_deepslate", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DEEPSLATE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Soul_Sand.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.SOUL_SAND)
                .unlockedBy("has_soul_sand", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SOUL_SAND).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Soul_Soil.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.SOUL_SOIL)
                .unlockedBy("has_soul_soil", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SOUL_SOIL).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Prismarine.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.PRISMARINE)
                .unlockedBy("has_prismarine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.PRISMARINE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Snow_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.SNOW_BLOCK)
                .unlockedBy("has_snow_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SNOW_BLOCK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Stone.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.STONE)
                .unlockedBy("has_stone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STONE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Smooth_Basalt.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.SMOOTH_BASALT)
                .unlockedBy("has_smooth_basalt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SMOOTH_BASALT).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Magma_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.MAGMA_BLOCK)
                .unlockedBy("has_magma_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MAGMA_BLOCK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Obsidian.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OBSIDIAN)
                .unlockedBy("has_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OBSIDIAN).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Mud.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.MUD)
                .unlockedBy("has_mud", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MUD).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Packed_Mud.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.PACKED_MUD)
                .unlockedBy("has_packed_mud", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.PACKED_MUD).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Moss_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.MOSS_BLOCK)
                .unlockedBy("has_moss_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MOSS_BLOCK).build()))
                .save(p_251297_);

        //COMPRESSED FROM BLOCKS

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.BASALT, 9)
                .requires(ModBlocks.Compressed_Basalt.get())
                .unlockedBy("has_compressed_basalt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Basalt.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.BLACKSTONE, 9)
                .requires(ModBlocks.Compressed_Blackstone.get())
                .unlockedBy("has_compressed_blackstone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Blackstone.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.CALCITE, 9)
                .requires(ModBlocks.Compressed_Calcite.get())
                .unlockedBy("has_compressed_calcite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Calcite.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.CLAY, 9)
                .requires(ModBlocks.Compressed_Clay.get())
                .unlockedBy("has_compressed_clay", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Clay.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.COBBLED_DEEPSLATE, 9)
                .requires(ModBlocks.Compressed_Cobbled_Deepslate.get())
                .unlockedBy("has_compressed_cobbled_deepslate", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Cobbled_Deepslate.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.COBBLESTONE, 9)
                .requires(ModBlocks.Compressed_Cobblestone.get())
                .unlockedBy("has_compressed_cobblestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Cobblestone.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.DIORITE, 9)
                .requires(ModBlocks.Compressed_Diorite.get())
                .unlockedBy("has_compressed_diorite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Diorite.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.DIRT, 9)
                .requires(ModBlocks.Compressed_Dirt.get())
                .unlockedBy("has_compressed_dirt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Dirt.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.DRIPSTONE_BLOCK, 9)
                .requires(ModBlocks.Compressed_Dripstone_Block.get())
                .unlockedBy("has_compressed_dripstone_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Dripstone_Block.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.END_STONE, 9)
                .requires(ModBlocks.Compressed_End_Stone.get())
                .unlockedBy("has_compressed_end_stone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_End_Stone.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.GRANITE, 9)
                .requires(ModBlocks.Compressed_Granite.get())
                .unlockedBy("has_compressed_granite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Granite.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.GRAVEL, 9)
                .requires(ModBlocks.Compressed_Gravel.get())
                .unlockedBy("has_compressed_gravel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Gravel.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.NETHERRACK, 9)
                .requires(ModBlocks.Compressed_Netherrack.get())
                .unlockedBy("has_compressed_netherrack", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Netherrack.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.SAND, 9)
                .requires(ModBlocks.Compressed_Sand.get())
                .unlockedBy("has_compressed_sand", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Sand.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.TUFF, 9)
                .requires(ModBlocks.Compressed_Tuff.get())
                .unlockedBy("has_compressed_tuff", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Tuff.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.ANDESITE, 9)
                .requires(ModBlocks.Compressed_Andesite.get())
                .unlockedBy("has_compressed_andesite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Andesite.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.SANDSTONE, 9)
                .requires(ModBlocks.Compressed_Sandstone.get())
                .unlockedBy("has_compressed_sandstone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Sandstone.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.RED_SAND, 9)
                .requires(ModBlocks.Compressed_Red_Sand.get())
                .unlockedBy("has_compressed_red_sand", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Red_Sand.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.RED_SANDSTONE, 9)
                .requires(ModBlocks.Compressed_Red_Sandstone.get())
                .unlockedBy("has_compressed_red_sandstone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Red_Sandstone.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.DEEPSLATE, 9)
                .requires(ModBlocks.Compressed_Deepslate.get())
                .unlockedBy("has_compressed_deepslate", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Deepslate.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.SOUL_SAND, 9)
                .requires(ModBlocks.Compressed_Soul_Sand.get())
                .unlockedBy("has_compressed_soul_sand", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Soul_Sand.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.SOUL_SOIL, 9)
                .requires(ModBlocks.Compressed_Soul_Soil.get())
                .unlockedBy("has_compressed_soul_soil", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Soul_Soil.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.PRISMARINE, 9)
                .requires(ModBlocks.Compressed_Prismarine.get())
                .unlockedBy("has_compressed_prismarine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Prismarine.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.SNOW_BLOCK, 9)
                .requires(ModBlocks.Compressed_Snow_Block.get())
                .unlockedBy("has_compressed_snow_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Snow_Block.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.STONE, 9)
                .requires(ModBlocks.Compressed_Stone.get())
                .unlockedBy("has_compressed_stone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Stone.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.SMOOTH_BASALT, 9)
                .requires(ModBlocks.Compressed_Smooth_Basalt.get())
                .unlockedBy("has_compressed_smooth_basalt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Smooth_Basalt.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.MAGMA_BLOCK, 9)
                .requires(ModBlocks.Compressed_Magma_Block.get())
                .unlockedBy("has_compressed_magma_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Magma_Block.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.OBSIDIAN, 9)
                .requires(ModBlocks.Compressed_Obsidian.get())
                .unlockedBy("has_compressed_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Obsidian.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.MUD, 9)
                .requires(ModBlocks.Compressed_Mud.get())
                .unlockedBy("has_compressed_mud", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Mud.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.PACKED_MUD, 9)
                .requires(ModBlocks.Compressed_Packed_Mud.get())
                .unlockedBy("has_compressed_packed_mud", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Packed_Mud.get()).build()))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.MOSS_BLOCK, 9)
                .requires(ModBlocks.Compressed_Moss_Block.get())
                .unlockedBy("has_compressed_moss_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Compressed_Moss_Block.get()).build()))
                .save(p_251297_);
    }
}
