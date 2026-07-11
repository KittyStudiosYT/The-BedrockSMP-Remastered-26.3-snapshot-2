package net.itskittyyoutube.kitty;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.itskittyyoutube.kitty.data.*;
import net.minecraft.core.RegistrySetBuilder;

public class TBSDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();

        pack.addProvider(TBSLootTableProvider::new);
        pack.addProvider(TBSModelProvider::new);
        pack.addProvider(TBSRegistryDataGenerator::new);
    }
    @Override
    public void buildRegistry(RegistrySetBuilder registrySetBuilder) {
    }
}