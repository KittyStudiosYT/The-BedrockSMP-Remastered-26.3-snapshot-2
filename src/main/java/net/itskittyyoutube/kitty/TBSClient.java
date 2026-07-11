package net.itskittyyoutube.kitty;

import net.fabricmc.api.ClientModInitializer;
import net.itskittyyoutube.kitty.util.TBSBuiltinResourcePack;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.ShelfRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntityTypes;

public final class TBSClient implements ClientModInitializer {
    public static final String PACK_ID = "small_axolotl_buckets";
    public static final String PACK_ID1 = "spooky_season";
    public static final String PACK_ID2 = "old_redwood";
    public static final String PACK_ID3 = "halloween_icons";
    public static final String PACK_ID4 = "spoopy_season";
    public static final String PACK_ID5 = "halloween_foliage";
    public static final String PACK_ID6 = "old_dye";
    public static final String PACK_ID7 = "bedrocksmp_look";
    public static final String PACK_ID8 = "bedrocksmp_icons";

    @Override
    public void onInitializeClient() {
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID,
                Component.translatable("pack.kitty.small_axolotl_buckets")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID1,
                Component.translatable("pack.kitty.spooky_season")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID2,
                Component.translatable("pack.kitty.old_redwood")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID3,
                Component.translatable("pack.kitty.halloween_icons")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID4,
                Component.translatable("pack.kitty.spoopy_season")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID5,
                Component.translatable("pack.kitty.halloween_foliage")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID6,
                Component.translatable("pack.kitty.old_dye")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID7,
                Component.translatable("pack.kitty.bedrocksmp_look")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID8,
                Component.translatable("pack.kitty.bedrocksmp_icons")
        );
    }
}
