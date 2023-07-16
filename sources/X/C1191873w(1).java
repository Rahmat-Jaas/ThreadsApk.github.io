package X;

import java.lang.reflect.Field;
import java.util.HashMap;

/* renamed from: X.73w  reason: invalid class name and case insensitive filesystem */
public final class C1191873w {
    public static Object A00;
    public static final HashMap A01 = AnonymousClass0wJ.A0y();

    public static final Object A00(String str, Object obj) {
        Class cls = obj.getClass();
        C58883Hw r7 = new C58883Hw(cls, str);
        HashMap hashMap = A01;
        Field field = (Field) hashMap.get(r7);
        if (field == null) {
            while (cls != null) {
                Field[] declaredFields = cls.getDeclaredFields();
                C04220Ms.A06(declaredFields);
                int i = 0;
                int length = declaredFields.length;
                while (i < length) {
                    field = declaredFields[i];
                    if (C04220Ms.A0I(field.getName(), str)) {
                        field.setAccessible(true);
                        hashMap.put(r7, field);
                    } else {
                        i++;
                    }
                }
                cls = cls.getSuperclass();
            }
            return null;
        }
        return field.get(obj);
    }
}
