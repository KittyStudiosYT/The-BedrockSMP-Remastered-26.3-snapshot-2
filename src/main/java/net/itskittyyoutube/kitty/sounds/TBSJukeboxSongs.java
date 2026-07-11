package net.itskittyyoutube.kitty.sounds;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Util;
import net.minecraft.world.item.JukeboxSong;

public interface TBSJukeboxSongs {
    ResourceKey<JukeboxSong> TEMPLATE = of("template_disc");
    ResourceKey<JukeboxSong> TOOTHLESS = of("the_tale_of_toothless");
    ResourceKey<JukeboxSong> JUSTIN = of("bye_justin_hi_justin");
    ResourceKey<JukeboxSong> STEVE = of("steve_lava_chicken");
    ResourceKey<JukeboxSong> TEARSSTEP = of("lava_tearsstep");
    ResourceKey<JukeboxSong> TERRIFYING = of("terrifying_tears");
    ResourceKey<JukeboxSong> ULTRA = of("ultra_terrifying_tears");
    ResourceKey<JukeboxSong> BETTERSIDE = of("betterside");
    ResourceKey<JukeboxSong> TWELVE = of("12");
    ResourceKey<JukeboxSong> REMASTERED = of("bye_justin_hi_justin_remastered");
    ResourceKey<JukeboxSong> EXPLORER = of("explorer");
    ResourceKey<JukeboxSong> ALREADY = of("already_ahead");
    ResourceKey<JukeboxSong> DARK = of("dark_inside");
    ResourceKey<JukeboxSong> TOOTHLESS2 = of("reversed_the_tale_of_toothless");
    ResourceKey<JukeboxSong> JUSTIN2 = of("reversed_bye_justin_hi_justin");
    ResourceKey<JukeboxSong> STEVE2 = of("reversed_steve_lava_chicken");
    ResourceKey<JukeboxSong> TEARSSTEP2 = of("reversed_lava_tearsstep");
    ResourceKey<JukeboxSong> TERRIFYING2 = of("reversed_terrifying_tears");
    ResourceKey<JukeboxSong> ULTRA2 = of("reversed_ultra_terrifying_tears");
    ResourceKey<JukeboxSong> BETTERSIDE2 = of("reversed_betterside");
    ResourceKey<JukeboxSong> TWELVE2 = of("reversed_12");
    ResourceKey<JukeboxSong> REMASTERED2 = of("reversed_bye_justin_hi_justin_remastered");
    ResourceKey<JukeboxSong> EXPLORER2 = of("reversed_explorer");
    ResourceKey<JukeboxSong> ALREADY2 = of("reversed_already_ahead");
    ResourceKey<JukeboxSong> DARK2 = of("reversed_dark_inside");

    ResourceKey<JukeboxSong> PANCAKE = of("pancake");
    ResourceKey<JukeboxSong> WAFFLE = of("waffle");
    ResourceKey<JukeboxSong> PANCAKE2 = of("reversed_pancake");
    ResourceKey<JukeboxSong> WAFFLE2 = of("reversed_waffle");

    private static ResourceKey<JukeboxSong> of(String path) {
        return ResourceKey.create(
                Registries.JUKEBOX_SONG,
                Identifier.fromNamespaceAndPath(TBS.MOD_ID, path)
        );
    }


    private static void register(
            final BootstrapContext<JukeboxSong> context,
            final ResourceKey<JukeboxSong> registryKey,
            final Holder.Reference<SoundEvent> soundEvent,
            final int lengthInSeconds,
            final int comparatorOutput
    ) {
        context.register(
                registryKey,
                new JukeboxSong(soundEvent, Component.translatable(Util.makeDescriptionId("jukebox_song", registryKey.identifier())), lengthInSeconds, comparatorOutput)
        );
    }

    static void bootstrap(final BootstrapContext<JukeboxSong> context) {
        register(context, TEMPLATE, TBSSoundEvents.MUSIC_DISC_TEMPLATE, 234, 15);
        register(context, TOOTHLESS, TBSSoundEvents.MUSIC_DISC_THE_TALE_OF_TOOTHLESS, 194, 15);
        register(context, JUSTIN, TBSSoundEvents.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP, 120, 15);
        register(context, STEVE, TBSSoundEvents.MUSIC_DISC_STEVE_LAVA_CHICKEN, 51, 15);
        register(context, TEARSSTEP, TBSSoundEvents.MUSIC_DISC_LAVA_TEARSSTEP, 175, 15);
        register(context, TERRIFYING, TBSSoundEvents.MUSIC_DISC_TERRIFYING_TEARS, 210, 15);
        register(context, ULTRA, TBSSoundEvents.MUSIC_DISC_ULTRA_TERRIFYING_TEARS, 210, 15);
        register(context, BETTERSIDE, TBSSoundEvents.MUSIC_DISC_BETTERSIDE, 402, 14);
        register(context, TWELVE, TBSSoundEvents.MUSIC_DISC_12, 178, 12);
        register(context, REMASTERED, TBSSoundEvents.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, 168, 15);
        register(context, EXPLORER, TBSSoundEvents.MUSIC_DISC_EXPLORER, 215, 14);
        register(context, ALREADY, TBSSoundEvents.ALREADY_AHEAD, 189, 15);
        register(context, DARK, TBSSoundEvents.DARK_INSIDE, 2440, 15);
        register(context, TOOTHLESS2, TBSSoundEvents.MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS, 194, 15);
        register(context, JUSTIN2, TBSSoundEvents.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP, 120, 15);
        register(context, STEVE2, TBSSoundEvents.MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN, 51, 15);
        register(context, TEARSSTEP2, TBSSoundEvents.MUSIC_DISC_REVERSED_LAVA_TEARSSTEP, 175, 15);
        register(context, TERRIFYING2, TBSSoundEvents.MUSIC_DISC_REVERSED_TERRIFYING_TEARS, 210, 15);
        register(context, ULTRA2, TBSSoundEvents.MUSIC_DISC_REVERSED_ULTRA_TERRIFYING_TEARS, 210, 15);
        register(context, BETTERSIDE2, TBSSoundEvents.MUSIC_DISC_REVERSED_BETTERSIDE, 402, 14);
        register(context, TWELVE2, TBSSoundEvents.MUSIC_DISC_REVERSED_12, 178, 12);
        register(context, REMASTERED2, TBSSoundEvents.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, 168, 15);
        register(context, EXPLORER2, TBSSoundEvents.MUSIC_DISC_REVERSED_EXPLORER, 215, 14);
        register(context, ALREADY2, TBSSoundEvents.REVERSED_ALREADY_AHEAD, 189, 15);
        register(context, DARK2, TBSSoundEvents.REVERSED_DARK_INSIDE, 2440, 15);

        register(context, PANCAKE, TBSSoundEvents.PANCAKE, 217, 15);
        register(context, WAFFLE, TBSSoundEvents.WAFFLE, 3160, 15);
        register(context, PANCAKE2, TBSSoundEvents.REVERSED_PANCAKE, 217, 15);
        register(context, WAFFLE2, TBSSoundEvents.REVERSED_WAFFLE, 3160, 15);
    }
}
