package net.itskittyyoutube.kitty.mixin;

import net.itskittyyoutube.kitty.item.TBSItems;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Piglin.class)
public class PiglinEquipmentMixin {

    @ModifyReturnValue(
            method = "canReplaceCurrentItem",
            at = @At("RETURN")
    )
    private boolean kitty$allowCustomPiglinEquipment(boolean original, ItemStack stack) {

        if (stack.is(TBSItems.GILDED_NETHERITE_SWORD) ||
                stack.is(TBSItems.GILDED_NETHERITE_DAGGER) ||
                stack.is(TBSItems.GILDED_NETHERITE_SCYTHE) ||
                stack.is(TBSItems.GILDED_NETHERITE_SICKLE) ||
                stack.is(TBSItems.GILDED_NETHERITE_KATANA) ||
                stack.is(TBSItems.GILDED_NETHERITE_SPEAR) ||
                stack.is(TBSItems.GILDED_NETHERITE_HELMET) ||
                stack.is(TBSItems.GILDED_NETHERITE_CHESTPLATE) ||
                stack.is(TBSItems.GILDED_NETHERITE_LEGGINGS) ||
                stack.is(TBSItems.GILDED_NETHERITE_BOOTS)) {

            return true;
        }

        return original;
    }
}