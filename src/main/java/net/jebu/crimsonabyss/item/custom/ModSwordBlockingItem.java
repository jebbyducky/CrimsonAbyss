package net.jebu.crimsonabyss.item.custom;


import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.UseAction;

public class ModSwordBlockingItem extends SwordItem {


    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BLOCK;
    }
    public ModSwordBlockingItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 40;
    }

}
