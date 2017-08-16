package ${package}.nms;

import net.minecraft.server.v1_11_R1.Entity;
import net.minecraft.server.v1_11_R1.EntityTypes;
import net.minecraft.server.v1_11_R1.MinecraftKey;

public class NMSUtils1_11 {

    public static void registerEntity(final String entityName, final int entityId,
                                      final Class<? extends Entity> customClass) {
        MinecraftKey minecraftKey = new MinecraftKey(entityName);
        EntityTypes.d.add(minecraftKey);
        EntityTypes.b.a(entityId, minecraftKey, customClass);
    }
}