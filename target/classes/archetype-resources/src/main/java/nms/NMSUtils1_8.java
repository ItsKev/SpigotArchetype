package ${package}.nms;

import net.minecraft.server.v1_8_R3.EntityInsentient;
import net.minecraft.server.v1_8_R3.EntityTypes;

import java.lang.reflect.Field;
import java.util.Map;

public class NMSUtils1_8 {

    @SuppressWarnings("unchecked")
    public static void registerEntity(String name, int id, Class<? extends EntityInsentient> customClass) {
        try {
            ((Map) NMSUtils1_8.getPrivateField("d", EntityTypes.class)).put(customClass, name);
            ((Map) NMSUtils1_8.getPrivateField("f", EntityTypes.class)).put(customClass, id);

        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    private static Object getPrivateField(String fieldName, Class clazz) {
        Field field = null;
        try {
            field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(null);
        } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
        return field;
    }
}