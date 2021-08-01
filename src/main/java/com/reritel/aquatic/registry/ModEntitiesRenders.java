package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import com.reritel.aquatic.registry.armor.models.DivingHelmetModel;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

public class ModEntitiesRenders {
    public static final ModelLayerLocation DIVING_SUIT_HELMET = registerMain("diving_suit_helmet");

    public static void register() {
        EntityModelLayerRegistry.registerModelLayer(DIVING_SUIT_HELMET, DivingHelmetModel::getTexturedModelData);
    }

    private static void register(EntityType<?> type, Class<? extends MobRenderer<?, ?>> renderer) {
        EntityRendererRegistry.INSTANCE.register(type, (context) -> {
            MobRenderer render = null;
            try {
                render = renderer.getConstructor(context.getClass()).newInstance(context);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return render;
        });
    }

    private static ModelLayerLocation registerMain(String id) {
        return new ModelLayerLocation(new ResourceLocation(Main.MOD_ID, id), "main");
    }
}
