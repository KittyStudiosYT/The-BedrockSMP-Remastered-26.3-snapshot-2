package net.itskittyyoutube.kitty.sounds;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class TBSSoundEvents {
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_TEMPLATE = registerForHolder("music_disc.template_disc");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_THE_TALE_OF_TOOTHLESS = registerForHolder("music_disc.the_tale_of_toothless");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerForHolder("music_disc.bye_justin_hi_justin");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_STEVE_LAVA_CHICKEN = registerForHolder("music_disc.steve_lava_chicken");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_LAVA_TEARSSTEP = registerForHolder("music_disc.lava_tearsstep");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_TERRIFYING_TEARS = registerForHolder("music_disc.terrifying_tears");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_ULTRA_TERRIFYING_TEARS = registerForHolder("music_disc.ultra_terrifying_tears");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_BETTERSIDE = registerForHolder("music_disc.betterside");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_12 = registerForHolder("music_disc.12");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerForHolder("music_disc.bye_justin_hi_justin_remastered");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_EXPLORER = registerForHolder("music_disc.explorer");
    public static final Holder.Reference<SoundEvent> ALREADY_AHEAD = registerForHolder("music_disc.already_ahead");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS = registerForHolder("music_disc.reversed_the_tale_of_toothless");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerForHolder("music_disc.reversed_bye_justin_hi_justin");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN = registerForHolder("music_disc.reversed_steve_lava_chicken");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_LAVA_TEARSSTEP = registerForHolder("music_disc.reversed_lava_tearsstep");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_TERRIFYING_TEARS = registerForHolder("music_disc.reversed_terrifying_tears");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_ULTRA_TERRIFYING_TEARS = registerForHolder("music_disc.reversed_ultra_terrifying_tears");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_BETTERSIDE = registerForHolder("music_disc.reversed_betterside");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_12 = registerForHolder("music_disc.reversed_12");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerForHolder("music_disc.reversed_bye_justin_hi_justin_remastered");
    public static final Holder.Reference<SoundEvent> MUSIC_DISC_REVERSED_EXPLORER = registerForHolder("music_disc.reversed_explorer");
    public static final Holder.Reference<SoundEvent> REVERSED_ALREADY_AHEAD = registerForHolder("music_disc.reversed_already_ahead");
    public static final Holder.Reference<SoundEvent> DARK_INSIDE = registerForHolder("music_disc.dark_inside");
    public static final Holder.Reference<SoundEvent> REVERSED_DARK_INSIDE = registerForHolder("music_disc.reversed_dark_inside");

    public static final Holder.Reference<SoundEvent> PANCAKE = registerForHolder("music_disc.pancake");
    public static final Holder.Reference<SoundEvent> WAFFLE = registerForHolder("music_disc.waffle");
    public static final Holder.Reference<SoundEvent> REVERSED_PANCAKE = registerForHolder("music_disc.reversed_pancake");
    public static final Holder.Reference<SoundEvent> REVERSED_WAFFLE = registerForHolder("music_disc.reversed_waffle");

    public static final Holder<SoundEvent> ARMOR_EQUIP_BYZANTIUM = registerForHolder("item.armor.equip_byzantium");
    public static final Holder<SoundEvent> ARMOR_EQUIP_DIAMARITE = registerForHolder("item.armor.equip_diamarite");
    public static final Holder<SoundEvent> ARMOR_EQUIP_CORRUPTIONITE = registerForHolder("item.armor.equip_corruptionite");
    public static final Holder<SoundEvent> ARMOR_EQUIP_GILDED_NETHERITE = registerForHolder("item.armor.equip_gilded_netherite");

    private static Holder.Reference<SoundEvent> registerForHolder(final String path) {
        return registerForHolder(Identifier.fromNamespaceAndPath(TBS.MOD_ID, path));
    }

    private static Holder.Reference<SoundEvent> registerForHolder(final Identifier id) {
        return registerForHolder(id, id);
    }

    private static Holder.Reference<SoundEvent> registerForHolder(final Identifier id, final Identifier soundId) {
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(soundId));
    }


    public static void registerSoundEvents() {
        TBS.LOGGER.info("Registering SoundEvents for " + TBS.MOD_ID);
    }
}
