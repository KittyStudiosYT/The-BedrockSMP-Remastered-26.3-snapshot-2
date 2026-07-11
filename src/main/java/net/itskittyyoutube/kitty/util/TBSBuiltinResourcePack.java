package net.itskittyyoutube.kitty.util;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.itskittyyoutube.kitty.TBS;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import java.util.HashSet;

public class TBSBuiltinResourcePack {
    private static final HashSet<String> FORCED_IDS = new HashSet<>();

    private TBSBuiltinResourcePack() {
    }

    public static boolean register(String modId, String packId, Component packName) {
        return register(TBS.MOD_ID, packId, packName, true);
    }

    public static boolean register(String modId, String packId, Component packName, boolean forceVersionCompat) {
        Identifier id = Identifier.fromNamespaceAndPath(TBS.MOD_ID, packId);

        boolean success = FabricLoader.getInstance().getModContainer(modId).map((container) -> {
            return ResourceManagerHelper.registerBuiltinResourcePack(id, container, packName,
                    ResourcePackActivationType.NORMAL
            );
        }).orElse(false);

        if (forceVersionCompat) {
            FORCED_IDS.add(id.toString());
        }

        return success;
    }

    public static boolean shouldForceVersionCompat(String id) {
        return FORCED_IDS.contains(id);
    }
}
