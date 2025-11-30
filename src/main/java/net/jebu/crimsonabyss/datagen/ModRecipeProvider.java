package net.jebu.crimsonabyss.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jebu.crimsonabyss.block.ModBlocks;
import net.jebu.crimsonabyss.item.ModItems;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> CRIMSON_BREAD_SMELTABLES = List.of(ModItems.CRIMSON_DOUGH);
        List<ItemConvertible> CERULEAN_BREAD_SMELTABLES = List.of(ModItems.CERULEAN_DOUGH);
        List<ItemConvertible> CERULEAN_LAMP_SMELTABLES = List.of(ModItems.CERULEAN_POWDER);
        List<ItemConvertible> CRIMSON_LAMP_SMELTABLES = List.of(ModItems.CRIMSON_POWDER);

        offerSmelting(recipeExporter, CERULEAN_BREAD_SMELTABLES, RecipeCategory.FOOD, ModItems.CERULEAN_INFUSED_BREAD, 0.1f, 200, "cerulean_bread");
        offerSmelting(recipeExporter, CRIMSON_BREAD_SMELTABLES, RecipeCategory.FOOD, ModItems.CRIMSON_INFUSED_BREAD, 0.1f, 200, "crimson_bread");
        offerSmelting(recipeExporter, CERULEAN_LAMP_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_LAMP, 0.3f, 200, "cerulean_lamp");
        offerSmelting(recipeExporter, CRIMSON_LAMP_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_LAMP, 0.3f, 200, "crimson_lamp");

        CookingRecipeJsonBuilder.createSmoking(
                        Ingredient.ofItems(ModItems.CERULEAN_DOUGH),
                        RecipeCategory.FOOD,
                        ModItems.CERULEAN_INFUSED_BREAD,
                        0.1f,
                        100
                )
                .criterion("has_cerulean_dough", conditionsFromItem(ModItems.CERULEAN_DOUGH))
                .offerTo(recipeExporter);

        CookingRecipeJsonBuilder.createSmoking(
                        Ingredient.ofItems(ModItems.CRIMSON_DOUGH),
                        RecipeCategory.FOOD,
                        ModItems.CRIMSON_INFUSED_BREAD,
                        0.1f,
                        100
                )
                .criterion("has_crimson_dough", conditionsFromItem(ModItems.CRIMSON_DOUGH))
                .offerTo(recipeExporter);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CRIMSON_POWDER, RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_POWERBLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CERULEAN_POWDER, RecipeCategory.DECORATIONS, ModBlocks.CERULEAN_POWERBLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CERULEAN_DOUGH)
                .input('R', ModItems.CERULEAN_POWDER)
                .input('8', Items.WHEAT)
                .pattern("RRR")
                .pattern("R8R")
                .pattern("RRR")
                .criterion(hasItem(ModItems.CERULEAN_POWDER), conditionsFromItem(ModItems.CERULEAN_POWDER))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CRIMSON_DOUGH)
                .input('R', ModItems.CRIMSON_POWDER)
                .input('8', Items.WHEAT)
                .pattern("RRR")
                .pattern("R8R")
                .pattern("RRR")
                .criterion(hasItem(ModItems.CRIMSON_POWDER), conditionsFromItem(ModItems.CRIMSON_POWDER))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ABYSSAL_LONGSWORD)
                .input('R', ModItems.ABYSSAL_SHARD)
                .input('8', Items.STICK)
                .pattern("R")
                .pattern("R")
                .pattern("8")
                .criterion(hasItem(ModItems.ABYSSAL_SHARD), conditionsFromItem(ModItems.ABYSSAL_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ABYSSAL_SHARD)
                .input(Items.AMETHYST_SHARD)
                .input(Items.INK_SAC)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(hasItem(Items.INK_SAC), conditionsFromItem(Items.INK_SAC))
                .offerTo(recipeExporter);
    }
}