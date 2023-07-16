package X;

import com.facebook.profilo.ipc.TraceConfigExtras;
import java.util.List;

/* renamed from: X.0Ue  reason: invalid class name and case insensitive filesystem */
public final class C05550Ue {
    public static C05550Ue A02;
    public volatile C05540Ud A00;
    public volatile List A01;

    public final synchronized void A01(TraceConfigExtras traceConfigExtras, List list) {
        this.A00 = new C05540Ud(traceConfigExtras, list);
    }

    public static synchronized C05550Ue A00() {
        C05550Ue r0;
        synchronized (C05550Ue.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new C05550Ue();
                A02 = r0;
            }
        }
        return r0;
    }
}
