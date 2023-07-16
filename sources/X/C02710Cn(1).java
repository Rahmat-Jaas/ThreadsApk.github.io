package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* renamed from: X.0Cn  reason: invalid class name and case insensitive filesystem */
public final class C02710Cn {
    public static boolean A00;

    public static String A00(Context context, String str, boolean z) {
        Field field;
        Object obj;
        Object obj2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("services_system_config", 0);
        String str2 = Build.FINGERPRINT;
        String str3 = null;
        if (!str2.equals(sharedPreferences.getString("system_fingerprint", (String) null))) {
            sharedPreferences.edit().clear().putString("system_fingerprint", str2).apply();
        } else if (1 != sharedPreferences.getInt("services_system_config_version", -1)) {
            sharedPreferences.edit().clear().putInt("services_system_config_version", 1).apply();
        } else {
            str3 = sharedPreferences.getString(str, (String) null);
        }
        if (str3 == null || "{}".equals(str3)) {
            if (str.equals("lmk_minfree_setting")) {
                AnonymousClass0Be r2 = new AnonymousClass0Be(context, z);
                ClassLoader classLoader = r2.A01;
                if (classLoader != null) {
                    Class<?> loadClass = classLoader.loadClass("com.android.server.am.ProcessList");
                    try {
                        Constructor<?> declaredConstructor = loadClass.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        obj = declaredConstructor.newInstance(new Object[0]);
                    } catch (Throwable unused) {
                        obj = null;
                    }
                    try {
                        r2.A00 = obj;
                        if (obj == null) {
                            Context context2 = r2.A05;
                            try {
                                Constructor<?> declaredConstructor2 = loadClass.getDeclaredConstructor(new Class[]{Context.class});
                                declaredConstructor2.setAccessible(true);
                                obj2 = declaredConstructor2.newInstance(new Object[]{context2});
                            } catch (Throwable unused2) {
                                obj2 = null;
                            }
                            r2.A00 = obj;
                        }
                        if (obj != null) {
                            Field declaredField = loadClass.getDeclaredField("mOomAdj");
                            r2.A01 = declaredField;
                            declaredField.setAccessible(true);
                            Field declaredField2 = loadClass.getDeclaredField("mOomMinFree");
                            r2.A02 = declaredField2;
                            declaredField2.setAccessible(true);
                            Field declaredField3 = loadClass.getDeclaredField("mOomMinFreeLow");
                            r2.A04 = declaredField3;
                            declaredField3.setAccessible(true);
                            Field declaredField4 = loadClass.getDeclaredField("mOomMinFreeHigh");
                            r2.A03 = declaredField4;
                            declaredField4.setAccessible(true);
                        }
                    } catch (Throwable unused3) {
                    }
                }
                JSONObject jSONObject = new JSONObject();
                if (!(r2.A00 == null || (field = r2.A01) == null || r2.A02 == null)) {
                    try {
                        jSONObject.put("mOomAdj", AnonymousClass0Be.A00(r2, field));
                        Field field2 = r2.A02;
                        if (field2 != null) {
                            jSONObject.put("mOomMinFree", AnonymousClass0Be.A00(r2, field2));
                        }
                        Field field3 = r2.A04;
                        if (field3 != null) {
                            jSONObject.put("mOomMinFreeLow", AnonymousClass0Be.A00(r2, field3));
                        }
                        Field field4 = r2.A03;
                        if (field4 != null) {
                            jSONObject.put("mOomMinFreeHigh", AnonymousClass0Be.A00(r2, field4));
                        }
                    } catch (Throwable unused4) {
                    }
                }
                str3 = jSONObject.toString();
            } else if (str.equals("anr_timeout_setting")) {
                str3 = new C02450Bk(context, z).A01();
            }
            if (str3 != null) {
                context.getSharedPreferences("services_system_config", 0).edit().putString(str, str3).apply();
            }
        }
        return str3;
    }
}
