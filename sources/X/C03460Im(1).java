package X;

import android.content.Context;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Im  reason: invalid class name and case insensitive filesystem */
public final class C03460Im {
    public static C03460Im A02;
    public static C03470In A03;
    public final Context A00;
    public final Map A01 = new HashMap();

    public C03460Im(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public final Object A00(Object obj, String str) {
        Class<?> cls = obj.getClass();
        Map map = this.A01;
        C03450Il r1 = (C03450Il) map.get(cls);
        if (r1 == null) {
            r1 = new C03450Il(this.A00, cls);
            map.put(cls, r1);
        }
        Field field = (Field) r1.A00.get(str);
        if (field == null) {
            return null;
        }
        try {
            return field.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
