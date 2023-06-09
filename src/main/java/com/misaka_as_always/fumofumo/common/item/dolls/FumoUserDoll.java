package com.misaka_as_always.fumofumo.common.item.dolls;

import com.misaka_as_always.fumofumo.ExampleMod;
import com.misaka_as_always.fumofumo.common.FumoCreativeTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.ObjectHolder;

public class FumoUserDoll extends Item {
    @ObjectHolder(ExampleMod.MOD_ID)
    public static class Items {
        public static final Item FAIRICH = null;
    }
    public static final ItemGroup fumoGroup = new FumoCreativeTab("fumofumo_user",
            () -> new ItemStack(Items.FAIRICH));

    public FumoUserDoll() {
        super(new Item.Properties().stacksTo(1).tab(fumoGroup));
    }
}
