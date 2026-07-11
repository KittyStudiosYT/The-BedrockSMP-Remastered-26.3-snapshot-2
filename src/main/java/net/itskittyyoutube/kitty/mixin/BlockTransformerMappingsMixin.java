package net.itskittyyoutube.kitty.mixin;

import com.google.common.collect.ImmutableList;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.world.item.component.BlockTransformerMappings;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BlockTransformerMappings.class)
public class BlockTransformerMappingsMixin {

    @Shadow
    private static BlockTransformer.BlockTransformData getStrippableBlockData(Block input, Block output) {
        throw new AssertionError(); // Mixin will replace this
    }

    // Target the static initializer or the AXE field initialization
    @Redirect(
            method = "<clinit>",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/google/common/collect/ImmutableList$Builder;build()Lcom/google/common/collect/ImmutableList;",
                    ordinal = 0
            )
    )
    private static ImmutableList<BlockTransformer.BlockTransformData> addMyCustomStrippables(ImmutableList.Builder<BlockTransformer.BlockTransformData> builder) {
        // 1. Add your custom entries to the existing builder
        builder.add(getStrippableBlockData(TBSBlocks.CHERRY_BIRCH_WOOD, TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD));
        builder.add(getStrippableBlockData(TBSBlocks.CHERRY_BIRCH_LOG, TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG));

        builder.add(getStrippableBlockData(TBSBlocks.GOLDEN_BIRCH_WOOD, TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD));
        builder.add(getStrippableBlockData(TBSBlocks.GOLDEN_BIRCH_LOG, TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG));

        // 3. Return the new list
        return builder.build();
    }
}
