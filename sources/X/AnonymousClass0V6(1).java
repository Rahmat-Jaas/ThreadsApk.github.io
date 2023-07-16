package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;

/* renamed from: X.0V6  reason: invalid class name */
public final class AnonymousClass0V6 {
    public static volatile boolean A00;

    public static boolean A00(int i) {
        C05680Uw r0;
        if (!A00 || (r0 = C05680Uw.A0A) == null || r0.A05(i) == null) {
            return false;
        }
        return true;
    }

    public static boolean A01(String str) {
        C05680Uw r0;
        if (!A00 || (r0 = C05680Uw.A0A) == null || (r0.A04.get() & 65534) == 0 || !TraceEvents.isEnabled(ProvidersRegistry.A00.A01(str))) {
            return false;
        }
        return true;
    }
}
