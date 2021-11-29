package com.calibermc.caliberblocks.custom.items;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

/** Custom Dragon Glass Sword Item **/
public class DragonGlassSword extends SwordItem {

    public DragonGlassSword(Properties properties) {
        super(Tiers.NETHERITE, 1, -2.8F, properties);
    }

    // Tooltip for item, adjust message in lang/en_us
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flags) {
        super.appendHoverText(stack, level, list, flags);
        int charge = stack.hasTag() ? stack.getTag().getInt("charge") : 0;  // Links to tag below to display tag result
        list.add(new TranslatableComponent("message.dragon_glass_sword", Integer.toString(10)).withStyle(ChatFormatting.BOLD));
    }

    // Creates or uses NBT tag with Int amount
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        int charge = stack.getOrCreateTag().getInt("charge");
        charge++;
        if (charge > 3) {
            charge = 0;
        }
        stack.getTag().putInt("charge", charge);
        // Gives a message to the player
        if (level.isClientSide()) {
            player.sendMessage(new TranslatableComponent("message.dragon_glass_sword", Integer.toString(charge)), Util.NIL_UUID);
        }
        return InteractionResultHolder.success(stack);
    }

    public int getCharge(ItemStack stack) {
        return stack.hasTag() ? stack.getTag().getInt("charge") : 0;
    }
}
