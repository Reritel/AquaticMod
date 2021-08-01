package com.reritel.aquatic.tab;

import com.reritel.aquatic.Main;
import com.reritel.aquatic.registry.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.stream.Collectors;

public class CreativeTabs {
//    public static final CreativeModeTab TAB_BLOCKS;
    public static final CreativeModeTab TAB_ITEMS;

    static {
//        TAB_BLOCKS = FabricItemGroupBuilder.create(BetterEnd.makeID("end_blocks")).icon(() -> new ItemStack(EndBlocks.END_MYCELIUM)).appendItems(stacks -> {
//            stacks.addAll(EndBlocks.getModBlocks().stream().map(ItemStack::new).collect(Collectors.toList()));
//        }).build();
        TAB_ITEMS = FabricItemGroupBuilder.create(Main.makeID("end_items")).icon(() -> new ItemStack(ModItems.DIVING_SUIT_HELMET)).appendItems(stacks -> {
            stacks.addAll(ModItems.getModItems().stream().map(ItemStack::new).collect(Collectors.toList()));
        }).build();
    }
}
