package com.misaka_as_always.fumofumo.common.event;

import com.misaka_as_always.fumofumo.common.item.dolls.FumoDoll;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class FumoEvents {
    @SubscribeEvent
    public void useTotem(LivingDeathEvent event) {
        LivingEntity entity = event.getEntityLiving();
        World world = entity.level;
        if (entity instanceof PlayerEntity){
            PlayerEntity living = (PlayerEntity) entity;
            for (Hand hand : Hand.values()) {
                ItemStack heldItem = entity.getItemInHand(hand);
                if (heldItem.getItem() instanceof FumoDoll) {
                    FumoDoll.defaultTotemBehavior(event, living, heldItem, false);
                }
            }
        }
    }
}
