package net.jebu.crimsonabyss.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jebu.crimsonabyss.block.ModBlocks;
import net.jebu.crimsonabyss.block.custom.CeruleanLampBlock;
import net.jebu.crimsonabyss.block.custom.CrimsonLampBlock;
import net.jebu.crimsonabyss.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_POWERBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CERULEAN_POWERBLOCK);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.CRIMSON_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.CRIMSON_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.CRIMSON_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(CrimsonLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));

        Identifier lampOffIdentifierCerulean = TexturedModel.CUBE_ALL.upload(ModBlocks.CERULEAN_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifierCerulean = blockStateModelGenerator.createSubModel(ModBlocks.CERULEAN_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.CERULEAN_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(CeruleanLampBlock.CLICKED, lampOnIdentifierCerulean, lampOffIdentifierCerulean)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ABYSSAL_SHARD, Models.GENERATED);

        itemModelGenerator.register(ModItems.CRIMSON_BLOSSOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_POWDER, Models.GENERATED);

        itemModelGenerator.register(ModItems.CRIMSON_INFUSED_BREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_DOUGH, Models.GENERATED);

        itemModelGenerator.register(ModItems.BLUE_POWDER, Models.GENERATED);

        itemModelGenerator.register(ModItems.CERULEAN_STARFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CERULEAN_POWDER, Models.GENERATED);

        itemModelGenerator.register(ModItems.CERULEAN_DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CERULEAN_INFUSED_BREAD, Models.GENERATED);

        itemModelGenerator.register(ModItems.CRIMSON_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRIMSON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRIMSON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRIMSON_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CERULEAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CERULEAN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CERULEAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CERULEAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CERULEAN_SHOVEL, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRIMSON_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRIMSON_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRIMSON_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CRIMSON_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CERULEAN_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CERULEAN_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CERULEAN_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CERULEAN_BOOTS);
    }
}