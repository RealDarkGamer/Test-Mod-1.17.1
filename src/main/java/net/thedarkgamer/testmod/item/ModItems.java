package net.thedarkgamer.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thedarkgamer.testmod.TestMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> ETHER_INGOT = ITEMS.register("ether_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAIN_TAB)));
    public static final RegistryObject<Item> ETHER_NUGGET = ITEMS.register("ether_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAIN_TAB)));
    public static final RegistryObject<Item> RAW_ETHER = ITEMS.register("raw_ether", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAIN_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
