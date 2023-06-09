package com.misaka_as_always.fumofumo.common;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class FumoCreativeTab extends ItemGroup {
    private final Supplier<ItemStack> iconSupplier;

    public FumoCreativeTab(final String label, final Supplier<ItemStack> iconSupplier) {
        super(label);
        this.iconSupplier = iconSupplier;
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return iconSupplier.get();
    }
}
