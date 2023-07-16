package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TriggerRegistry;
import com.facebook.profilo.ipc.TraceConfigExtras;
import java.util.TreeMap;

/* renamed from: X.0cO  reason: invalid class name and case insensitive filesystem */
public final class C07900cO extends AnonymousClass0V0 {
    public static final int A00 = TriggerRegistry.A00.A02("manual");
    public static final C07900cO A01 = new C07900cO();

    public final boolean A03() {
        return false;
    }

    public final boolean A04(Object obj, Object obj2, long j, long j2) {
        return obj == obj2 && j == j2;
    }

    public final int A01(Object obj, long j) {
        C05540Ud r0 = C05550Ue.A00().A00;
        if (r0 == null) {
            return 0;
        }
        return ProvidersRegistry.A00.A00(r0.A01);
    }

    public final TraceConfigExtras A02(Object obj, long j) {
        C05540Ud r0 = C05550Ue.A00().A00;
        if (r0 == null) {
            return new TraceConfigExtras((TreeMap) null, (TreeMap) null, (TreeMap) null, (TreeMap) null, (TreeMap) null);
        }
        return r0.A00;
    }
}
