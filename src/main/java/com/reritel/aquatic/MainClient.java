package com.reritel.aquatic;

import com.reritel.aquatic.registry.ModEntitiesRenders;
import com.reritel.aquatic.registry.ModModelProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class MainClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
//        AquaticKeybinds.initialize();
        ModEntitiesRenders.register();
        ModModelProvider.register();
    }
}
