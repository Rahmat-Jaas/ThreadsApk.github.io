package X;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* renamed from: X.0Bk  reason: invalid class name and case insensitive filesystem */
public final class C02450Bk extends C02690Cl {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 31) {
            z = true;
        }
        A00 = z;
    }

    public final String A01() {
        JSONObject jSONObject = new JSONObject();
        if (!A00) {
            try {
                ClassLoader classLoader = this.A01;
                if (classLoader != null) {
                    A00(classLoader, "com.android.server.am.ActivityManagerService", jSONObject);
                    A00(classLoader, "com.android.server.am.ActiveServices", jSONObject);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 29) {
                        A00(classLoader, "com.android.server.wm.ActivityTaskManagerService", jSONObject);
                    }
                    if (i >= 30 && C03430Ij.A00) {
                        Field declaredField = Class.forName("android.os.InputConstants").getDeclaredField("DEFAULT_DISPATCHING_TIMEOUT_MILLIS");
                        declaredField.setAccessible(true);
                        jSONObject.put("KEY_DISPATCHING_TIMEOUT_MS", declaredField.getInt((Object) null));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONObject.toString();
    }

    public static void A00(ClassLoader classLoader, String str, JSONObject jSONObject) {
        for (Field field : classLoader.loadClass(str).getDeclaredFields()) {
            String name = field.getName();
            if (name.endsWith("_TIMEOUT") || name.endsWith("_TIMEOUT_MS")) {
                field.setAccessible(true);
                if (field.getType() == Integer.TYPE) {
                    jSONObject.put(name, field.getInt((Object) null));
                } else if (field.getType() == Long.TYPE) {
                    jSONObject.put(name, field.getLong((Object) null));
                }
            }
        }
    }

    public C02450Bk(Context context, boolean z) {
        super(context, z);
    }
}
