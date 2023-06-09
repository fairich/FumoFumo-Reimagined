package com.misaka_as_always.fumofumo.common.item.dolls;

import com.misaka_as_always.fumofumo.ExampleMod;
import com.misaka_as_always.fumofumo.common.FumoCreativeTab;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
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
