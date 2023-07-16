package X;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.0pC  reason: invalid class name and case insensitive filesystem */
public final class C14320pC {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C14330pD.A00();
        }
        long j = C02660Ch.A00;
        if (!C02660Ch.A03) {
            return false;
        }
        Method method = C02660Ch.A01;
        AnonymousClass0SJ.A00(method);
        Boolean bool = (Boolean) C02660Ch.A00(method, Long.valueOf(j));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
