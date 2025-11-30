package net.jebu.crimsonabyss.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jebu.crimsonabyss.item.ModItems;
import net.jebu.crimsonabyss.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.Items.ABYSSAL_LONGSWORD)
                .add(ModItems.ABYSSAL_LONGSWORD);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.CERULEAN_SWORD)
                .add(ModItems.ABYSSAL_LONGSWORD)
                .add(ModItems.CRIMSON_SWORD);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.CERULEAN_AXE)
                .add(ModItems.CRIMSON_AXE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.CERULEAN_PICKAXE)
                .add(ModItems.CRIMSON_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.CERULEAN_SHOVEL)
                .add(ModItems.CRIMSON_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.CERULEAN_HOE)
                .add(ModItems.CRIMSON_HOE);



        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.CRIMSON_CHESTPLATE)
                .add(ModItems.CRIMSON_LEGGINGS)
                .add(ModItems.CRIMSON_BOOTS)


                .add(ModItems.CERULEAN_HELMET)
                .add(ModItems.CERULEAN_CHESTPLATE)
                .add(ModItems.CERULEAN_LEGGINGS)
                .add(ModItems.CERULEAN_BOOTS);
    }
}
