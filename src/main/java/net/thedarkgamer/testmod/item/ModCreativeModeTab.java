package net.thedarkgamer.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAIN_TAB = new CreativeModeTab("testModTabMain") {
        @Override
            public ItemStack makeIcon() {
            return new ItemStack(ModItems.ETHER_INGOT.get());
        }
    };
}
