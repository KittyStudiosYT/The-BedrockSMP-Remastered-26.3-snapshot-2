package net.itskittyyoutube.kitty.material;

import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.sounds.TBSSoundEvents;
import net.itskittyyoutube.kitty.util.TBSItemTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class TBSArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> DIAMARITE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TBS.MOD_ID, "diamarite"));
    public static final ResourceKey<EquipmentAsset> CORRUPTIONITE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TBS.MOD_ID, "corruptionite"));
    public static final ResourceKey<EquipmentAsset> BYZANTIUM_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TBS.MOD_ID, "byzantium"));
    public static final ResourceKey<EquipmentAsset> GILDED_NETHERITE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TBS.MOD_ID, "gilded_netherite"));
    public static final ResourceKey<EquipmentAsset> ENERGY_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TBS.MOD_ID, "energy"));
    public static final ResourceKey<EquipmentAsset> DREADITE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(TBS.MOD_ID, "dreadite"));

    public static final ArmorMaterial DIAMARITE = new ArmorMaterial(37,
            ArmorMaterials.makeDefense(3, 6, 8, 3, 11),
            15, TBSSoundEvents.ARMOR_EQUIP_DIAMARITE, 3.0F, 0.1F, TBSItemTags.NETHERITE_EQUIPMENT_REPAIR, DIAMARITE_KEY);

    public static final ArmorMaterial CORRUPTIONITE = new ArmorMaterial(37,
            ArmorMaterials.makeDefense(3, 6, 8, 3, 11),
            15, TBSSoundEvents.ARMOR_EQUIP_CORRUPTIONITE, 3.0F, 0.1F, TBSItemTags.NETHERITE_EQUIPMENT_REPAIR, CORRUPTIONITE_KEY);

    public static final ArmorMaterial BYZANTIUM = new ArmorMaterial(15,
            ArmorMaterials.makeDefense(2, 5, 6, 2, 5),
            9, TBSSoundEvents.ARMOR_EQUIP_BYZANTIUM, 0.0F, 0.0F, TBSItemTags.BYZANTIUM_EQUIPMENT_REPAIR, BYZANTIUM_KEY);

    public static final ArmorMaterial GILDED_NETHERITE = new ArmorMaterial(37,
            ArmorMaterials.makeDefense(3, 6, 8, 3, 11),
            15, TBSSoundEvents.ARMOR_EQUIP_GILDED_NETHERITE, 3.0F, 0.1F, TBSItemTags.NETHERITE_EQUIPMENT_REPAIR, GILDED_NETHERITE_KEY);

    public static final ArmorMaterial ENERGY = new ArmorMaterial(33,
            ArmorMaterials.makeDefense(3, 6, 8, 3, 11),
            10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, TBSItemTags.ENERGY_EQUIPMENT_REPAIR, ENERGY_KEY);

    public static final ArmorMaterial DREADITE = new ArmorMaterial(37,
            ArmorMaterials.makeDefense(3, 6, 8, 3, 11),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, TBSItemTags.DREADITE_EQUIPMENT_REPAIR, DREADITE_KEY);
}
