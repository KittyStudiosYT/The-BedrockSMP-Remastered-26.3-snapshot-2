package net.itskittyyoutube.kitty.mixin;

import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockEntity.class)
public abstract class BlockEntityMixin {

    @Shadow public abstract BlockEntityType<?> getType();

    // 1. Remove 'static'
    // 2. validateBlockState returns void in vanilla, so use CallbackInfo instead of CallbackInfoReturnable
    @Inject(method = "validateBlockState", at = @At("HEAD"), cancellable = true)
    private void bypassShelfValidation(BlockState state, CallbackInfo ci) {
        // Check if the current BlockEntity type is a vanilla shelf, and the placed block is yours
        if (this.getType() == BlockEntityTypes.SHELF && state.is(TBSBlocks.SHELFSHELF)) {
            // Cancel the method right here, completely skipping the vanilla validation crash line
            ci.cancel();
        }
    }
}