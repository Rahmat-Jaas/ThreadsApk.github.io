package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

/* renamed from: X.3X7  reason: invalid class name */
public final class AnonymousClass3X7 {
    public static final Map A00 = AnonymousClass0wJ.A0y();

    public static Object A00(String str, Object obj) {
        Class<?> cls = obj.getClass();
        Class<Boolean> cls2 = Boolean.class;
        String str2 = str;
        if (cls == cls2) {
            if ("enabled".equals(str) || AnonymousClass3RY.A01.equals(str) || RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(str)) {
                str2 = AnonymousClass3RY.A01;
            } else {
                str2 = AnonymousClass3RY.A00;
            }
        }
        Object obj2 = null;
        if (str2 != null) {
            if (cls == cls2) {
                try {
                    obj2 = Boolean.valueOf(str2);
                } catch (ClassCastException | NumberFormatException unused) {
                }
            } else if (cls == Double.class) {
                obj2 = Double.valueOf(Double.parseDouble(str2));
            } else {
                Object obj3 = str2;
                if (cls == Long.class) {
                    obj3 = AnonymousClass0wJ.A0d(str2);
                }
                obj2 = obj3;
            }
        }
        if (obj2 != null) {
            return obj2;
        }
        return obj;
    }

    public static void A01(long j) {
        int i;
        try {
            i = C05450Tu.A00(j);
        } catch (AnonymousClass0Tc e) {
            AnonymousClass0LU.A0L("ExperimentParameterUtils", "Failed to get config key with specifier:%d", e, C18240wQ.A1b(j));
            i = -1;
        }
        C10450iM.A03("QuickExperiment", AnonymousClass00U.A01(i, C05360Tg.A00(j), "QE not initialized before ", ":"));
    }
}
