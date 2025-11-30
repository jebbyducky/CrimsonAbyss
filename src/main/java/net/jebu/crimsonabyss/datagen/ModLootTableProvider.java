package net.jebu.crimsonabyss.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.jebu.crimsonabyss.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CERULEAN_POWERBLOCK);
        addDrop(ModBlocks.CRIMSON_POWERBLOCK);
        addDrop(ModBlocks.CRIMSON_LAMP);
        addDrop(ModBlocks.CERULEAN_LAMP);
    }
}
