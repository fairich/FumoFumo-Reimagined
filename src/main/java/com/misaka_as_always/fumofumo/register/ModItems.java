package com.misaka_as_always.fumofumo.register;

import com.misaka_as_always.fumofumo.ExampleMod;
import com.misaka_as_always.fumofumo.common.FumoCreativeTab;
import com.misaka_as_always.fumofumo.common.item.FumoBox;
import com.misaka_as_always.fumofumo.common.item.Gohei;
import com.misaka_as_always.fumofumo.common.item.dolls.FumoDoll;
import com.misaka_as_always.fumofumo.common.item.dolls.FumoUserDoll;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

    private ModItems() { }
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    @ObjectHolder(ExampleMod.MOD_ID + ":gohei")
    public static final Item ITEMS_TAB_ICON = null;

    public static final ItemGroup FUMO_ITEMS = new FumoCreativeTab("fumofumo_items",
            () -> new ItemStack(ITEMS_TAB_ICON));

    public static final RegistryObject<Item> FUMO = ITEMS.register("fumo", () ->
            new FumoDoll(Rarity.COMMON));

    public static void registerItems() {
        ITEMS.register("gohei", () -> new Gohei(FUMO_ITEMS));
        ITEMS.register("fumo_box", () -> new FumoBox(FUMO_ITEMS));
    }
    private static void registerDolls() {
        // Skins
        ITEMS.register("fairich", FumoUserDoll::new);
    }

    public static void register(IEventBus eventBus) {
        registerDolls();
        registerItems();

        ITEMS.register(eventBus);
    }
}
