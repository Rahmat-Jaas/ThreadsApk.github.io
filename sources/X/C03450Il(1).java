package X;

import android.content.Context;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Il  reason: invalid class name and case insensitive filesystem */
public final class C03450Il {
    public final Map A00 = new HashMap();

    private void A00(Context context, Class cls) {
        C03470In r0;
        if (cls != null && (r0 = C03460Im.A03) != null) {
            try {
                Field[] A05 = r0.A05(cls);
                if (A05 != null) {
                    for (Field field : A05) {
                        field.setAccessible(true);
                        this.A00.put(field.getName(), field);
                    }
                    A00(context, cls.getSuperclass());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C03450Il(Context context, Class cls) {
        A00(context, cls);
    }
}
