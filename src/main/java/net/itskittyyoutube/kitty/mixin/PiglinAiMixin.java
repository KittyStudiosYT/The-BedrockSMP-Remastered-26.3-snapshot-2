package net.itskittyyoutube.kitty.mixin;

import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.item.TBSItems;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(PiglinAi.class)
public class PiglinAiMixin {

    @Inject(method = "isBarterCurrency", at = @At("HEAD"), cancellable = true)
    private static void allowCustomBarterItem(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.is(TBSItems.GILDED_NETHERITE_INGOT)) {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "getBarterResponseItems", at = @At("HEAD"), cancellable = true)
    private static void getCustomBarterOutputList(Piglin piglin, CallbackInfoReturnable<List<ItemStack>> cir) {
        if (piglin.getOffhandItem().is(TBSItems.GILDED_NETHERITE_INGOT)) {
            Identifier customLootTable = Identifier.fromNamespaceAndPath(TBS.MOD_ID, "gameplay/piglin_trade_item");

            ServerLevel serverLevel = (ServerLevel) piglin.level();

            var parameterSet = new LootParams.Builder(serverLevel)
                    .withParameter(LootContextParams.THIS_ENTITY, piglin)
                    .withParameter(LootContextParams.ORIGIN, piglin.position())
                    .create(LootContextParamSets.PIGLIN_BARTER);

            List<ItemStack> loot = serverLevel.getServer().reloadableRegistries()
                    .getLootTable(ResourceKey.create(Registries.LOOT_TABLE, customLootTable))
                    .getRandomItems(parameterSet);

            cir.setReturnValue(loot);
        }
    }
}
