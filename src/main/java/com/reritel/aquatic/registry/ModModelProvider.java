package com.reritel.aquatic.registry;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import shadow.fabric.api.client.rendering.v1.ArmorRenderingRegistry;

@Environment(EnvType.CLIENT)
public class ModModelProvider {

    public static final ModArmorProvider DIVING_SUIT = new ModArmorProvider();

    public static final void register () {
        ArmorRenderingRegistry.registerModel(DIVING_SUIT, DIVING_SUIT.getRenderedItems());
        ArmorRenderingRegistry.registerTexture(DIVING_SUIT, DIVING_SUIT.getRenderedItems());
    }
}