package net.itskittyyoutube.kitty.util;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TBSBlockTags {
    //TAGS
    public static final TagKey<Block> NEEDS_STEEL_EQUIPMENT = create("needs_steel_equipment");
    public static final TagKey<Block> INCORRECT_FOR_STEEL_EQUIPMENT = create("incorrect_for_steel_equipment");
    public static final TagKey<Block> NEEDS_NETHERITE_EQUIPMENT = create("needs_netherite_equipment");
    public static final TagKey<Block> INCORRECT_FOR_NETHERITE_EQUIPMENT = create("incorrect_for_netherite_equipment");
    public static final TagKey<Block> NEEDS_BYZANTIUM_EQUIPMENT = create("needs_byzantium_equipment");
    public static final TagKey<Block> INCORRECT_FOR_BYZANTIUM_EQUIPMENT = create("incorrect_for_byzantium_equipment");
    public static final TagKey<Block> NEEDS_ENERGY_EQUIPMENT = create("needs_energy_equipment");
    public static final TagKey<Block> INCORRECT_FOR_ENERGY_EQUIPMENT = create("incorrect_for_energy_equipment");

    //EXTRA
    private TBSBlockTags() {
    }

    private static TagKey<Block> create(final String name) {
        return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name));
    }
}
