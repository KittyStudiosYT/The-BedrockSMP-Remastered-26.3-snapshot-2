package net.itskittyyoutube.kitty.util;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TBSItemTags {
    //TAGS
    public static final TagKey<Item> CHERRY_BIRCH_LOGS = bind("cherry_birch_logs");
    public static final TagKey<Item> HEADS = bind("heads");
    public static final TagKey<Item> STEEL_EQUIPMENT_REPAIR = bind("steel_equipment_repair");
    public static final TagKey<Item> NETHERITE_EQUIPMENT_REPAIR = bind("netherite_equipment_repair");
    public static final TagKey<Item> INGOTS = bind("ingots");
    public static final TagKey<Item> AMETHYST_TOOL_MATERIALS = bind("amethyst_tool_materials");
    public static final TagKey<Item> BYZANTIUM_TOOL_MATERIALS = bind("byzantium_tool_materials");
    public static final TagKey<Item> GOLDEN_BIRCH_LOGS = bind("golden_birch_logs");
    public static final TagKey<Item> BYZANTIUM_EQUIPMENT_REPAIR = bind("byzantium_equipment_repair");
    public static final TagKey<Item> STEEL_TOOL_MATERIALS = bind("steel_tool_materials");
    public static final TagKey<Item> DIAMARITE_TOOL_MATERIALS = bind("diamarite_tool_materials");
    public static final TagKey<Item> CORRUPTIONITE_TOOL_MATERIALS = bind("corruptionite_tool_materials");
    public static final TagKey<Item> GILDED_NETHERITE_TOOL_MATERIALS = bind("gilded_netherite_tool_materials");
    public static final TagKey<Item> ENERGY_TOOL_MATERIALS = bind("energy_tool_materials");
    public static final TagKey<Item> ENERGY_EQUIPMENT_REPAIR = bind("energy_equipment_repair");
    public static final TagKey<Item> DREADITE_EQUIPMENT_REPAIR = bind("dreadite_equipment_repair");
    public static final TagKey<Item> STICK_REPAIR = bind("stick_repair");

    //EXTRA
    private TBSItemTags() {
    }

    private static TagKey<Item> bind(final String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name));
    }
}
