package net.itskittyyoutube.kitty.block;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import net.minecraft.world.level.block.entity.ShelfBlockEntity;

import java.lang.reflect.Field;

public class TBSBlockEntities {
    public static BlockEntityType<ShelfBlockEntity> SHELFSHELF;

    public static void register() {
        // Left empty as shelf logic is handled in vanilla injection below
    }

    // This will be called AFTER TBSBlocks.registerTBSBlocks() to add our blocks to VANILLA block entity types
    public static void registerShelfBlockEntities() {
        // Find the 'blocks' field by its type (Set<Block>) instead of by name
        // This works in both dev and production without needing to know the exact field name
        try {
            Field blocksField = null;
            for (Field field : BlockEntityType.class.getDeclaredFields()) {
                // Look for a Set field that's not static and not final
                // The blocks field is an instance field that we can modify
                if (java.util.Set.class.isAssignableFrom(field.getType()) &&
                        !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    // Verify it contains blocks by checking if we can get it from a known BlockEntityType
                    try {
                        Object value = field.get(BlockEntityTypes.SHELF);
                        if (value instanceof java.util.Set) {
                            blocksField = field;
                            break;
                        }
                    } catch (Exception ignored) {
                        // Not the right field, keep looking
                    }
                }
            }

            if (blocksField == null) {
                throw new RuntimeException("Could not find blocks field in BlockEntityType");
            }

            if (TBS.DEBUG_MODE) {
                TBS.LOGGER.info("Found blocks field: {}", blocksField.getName());
            }

            // The blocks Set is immutable, so we need to create a new mutable Set with our blocks added
            @SuppressWarnings("unchecked")
            java.util.Set<net.minecraft.world.level.block.Block> originalShelfBlocks =
                    (java.util.Set<net.minecraft.world.level.block.Block>) blocksField.get(BlockEntityTypes.SHELF);
            java.util.Set<net.minecraft.world.level.block.Block> newShelfBlocks = new java.util.HashSet<>(originalShelfBlocks);
            newShelfBlocks.add(TBSBlocks.SHELFSHELF);
            blocksField.set(BlockEntityTypes.SHELF, newShelfBlocks);

            if (TBS.DEBUG_MODE) {
                TBS.LOGGER.info("Successfully added custom shelf blocks to vanilla block entity types");
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to add custom shelf blocks to vanilla block entity types", e);
        }

        // Store references to vanilla types for convenience (used by renderers on client)
        SHELFSHELF = BlockEntityTypes.SHELF;
    }
}