package net.jebu.crimsonabyss.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jebu.crimsonabyss.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CERULEAN_POWERBLOCK)
                .add(ModBlocks.CRIMSON_POWERBLOCK)
                .add(ModBlocks.CERULEAN_LAMP)
                .add(ModBlocks.CRIMSON_LAMP);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CRIMSON_POWERBLOCK)
                .add(ModBlocks.CERULEAN_POWERBLOCK)
                .add(ModBlocks.CERULEAN_LAMP)
                .add(ModBlocks.CRIMSON_LAMP);
    }
}
