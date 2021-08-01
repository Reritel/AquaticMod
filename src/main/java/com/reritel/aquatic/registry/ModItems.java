package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import com.reritel.aquatic.registry.armor.item.DivingSuitBoots;
import com.reritel.aquatic.registry.armor.item.DivingSuitChestplate;
import com.reritel.aquatic.registry.armor.item.DivingSuitHelmet;
import com.reritel.aquatic.registry.armor.item.DivingSuitLeggings;
import com.reritel.aquatic.tab.CreativeTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import org.jetbrains.annotations.NotNull;
import ru.bclib.registry.ItemsRegistry;

import java.util.List;

public class ModItems extends ItemsRegistry {
//    //Items
//    public static final Item AQUAMARINE = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
//    public static final Item REDSTONE_GEM = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
//
////    public static final DivingSuitMaterial DIVING_SUIT_MATERIAL = new DivingSuitMaterial();
////    public static final Item DIVING_SUIT_HELMET = new ArmorItem(DIVING_SUIT_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(Main.ITEM_GROUP));
//
//    //tank
////    public static final OxygenCylinderMaterial OXYGEN_CYLINDER_MATERIAL = new OxygenCylinderMaterial();
////    public static final ToolItem OXYGEN_CYLINDER = new ToolItem(OXYGEN_CYLINDER_MATERIAL, new Item.Settings().tab(Main.ITEM_GROUP));
//
//
//    public static void GenerateBlockItem(String ITEM_NAME, Block BLOCK) {
//        final BlockItem BLOCK_ITEM = new BlockItem(BLOCK, new Item.Properties().tab(Main.ITEM_GROUP));
//
//        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, ITEM_NAME), BLOCK_ITEM);
//    }
//
//    public static void RegisterItems() {
//        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "aquamarine"), AQUAMARINE);
//        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "redstone_gem"), REDSTONE_GEM);
//
////        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "diving_suit_helmet"), DIVING_SUIT_HELMET);
////        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oxygen_cylinder"), OXYGEN_CYLINDER);
//    }
    //items
    public static final Item AQUAMARINE = registerModItem("aquamarine");
    public static final Item REDSTONE_GEM = registerModItem("redstone_gem");

    //Armor
    public static final Item DIVING_SUIT_HELMET = registerModItem("diving_suit_helmet", new DivingSuitHelmet());
    public static final Item DIVING_SUIT_CHESTPLATE = registerModItem("diving_suit_chestplate", new DivingSuitChestplate());
    public static final Item DIVING_SUIT_LEGGINGS = registerModItem("diving_suit_leggings", new DivingSuitLeggings());
    public static final Item DIVING_SUIT_BOOTS = registerModItem("diving_suit_boots", new DivingSuitBoots());




    private static ItemsRegistry itemRegistry;

    protected ModItems(CreativeModeTab creativeTab) {
        super(creativeTab);
    }

    public static List<Item> getModItems() {
        return getModItems(Main.MOD_ID);
    }

    public static Item registerModDisc(String name, int power, SoundEvent sound) {
        return getItemRegistry().registerDisc(name, power, sound);
    }

    public static Item registerModItem(String name) {
        return getItemRegistry().registerItem(name);
    }

    public static Item registerModItem(String name, Item item) {
        return getItemRegistry().register(Main.makeID(name), item);
    }

    public static Item registerModItem(ResourceLocation id, Item item) {
        if (item instanceof ArmorItem) {
            return registerModArmor(id, item);
        }
        getItemRegistry().register(id, item);
        return item;
    }

    private static Item registerModArmor(ResourceLocation itemId, Item item) {
        getItemRegistry().register(itemId, item);
        return item;
    }

    public static TieredItem registerModTool(String name, TieredItem item) {
        return getItemRegistry().registerTool(name, item);
    }

    public static Item registerModEgg(String name, EntityType<? extends Mob> type, int background, int dots) {
        return getItemRegistry().registerEgg(name, type, background, dots);
    }

    public static Item registerModFood(String name, int hunger, float saturation, MobEffectInstance... effects) {
        return getItemRegistry().registerFood(name, hunger, saturation, effects);
    }

    public static Item registerModFood(String name, FoodProperties foodComponent) {
        return getItemRegistry().registerFood(name, foodComponent);
    }

    public static Item registerModDrink(String name) {
        return getItemRegistry().registerDrink(name);
    }

    public static Item registerModDrink(String name, FoodProperties foodComponent) {
        return getItemRegistry().registerDrink(name, foodComponent);
    }

    public static Item registerModDrink(String name, int hunger, float saturation) {
        return getItemRegistry().registerDrink(name, hunger, saturation);
    }

    public static FabricItemSettings makeModItemSettings() {
        return itemRegistry.makeItemSettings();
    }

    @Override
    public ResourceLocation createModId(String name) {
        return Main.makeID(name);
    }

    @NotNull
    private static ItemsRegistry getItemRegistry() {
        if (itemRegistry == null) {
            itemRegistry = new ModItems(CreativeTabs.TAB_ITEMS);
        }
        return itemRegistry;
    }

    public static void register() {
    }
}
