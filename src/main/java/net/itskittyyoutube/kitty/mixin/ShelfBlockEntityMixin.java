package net.itskittyyoutube.kitty.mixin;

import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ShelfBlockEntity; // or ChiseledBookshelfBlockEntity depending on mappings
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockEntity.class) // Target the parent class where getBlockState() actually lives!
public class ShelfBlockEntityMixin {

    @Inject(method = "getBlockState", at = @At("HEAD"), cancellable = true)
    private void trickRendererWithVanillaState(CallbackInfoReturnable<BlockState> cir) {
        BlockEntity self = (BlockEntity) (Object) this;

        // 1. Only run this on the client side so we only change visuals, not server logic
        if (self.getLevel() != null && self.getLevel().isClientSide()) {

            // 2. ONLY apply this check if this specific block entity is a shelf!
            if (self instanceof ShelfBlockEntity) {
                BlockState actualState = self.getLevel().getBlockState(self.getBlockPos());

                // 3. If the block in the world is your custom shelf, fake the state for the renderer
                if (actualState.is(TBSBlocks.SHELFSHELF)) {
                    cir.setReturnValue(Blocks.PALE_OAK_SHELF.defaultBlockState()
                            .setValue(HorizontalDirectionalBlock.FACING, actualState.getValue(HorizontalDirectionalBlock.FACING)));
                }
            }
        }
    }
}