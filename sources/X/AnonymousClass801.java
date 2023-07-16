package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.801  reason: invalid class name */
public final class AnonymousClass801 implements Runnable {
    public final /* synthetic */ C1202879o A00;

    public AnonymousClass801(C1202879o r1) {
        this.A00 = r1;
    }

    public final void run() {
        C1202879o r4 = this.A00;
        Set set = r4.A03;
        if (!set.isEmpty()) {
            StringBuilder A0s = C18190wL.A0s("critical path timeout: ");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A0s.append(C18180wK.A0k(it));
                A0s.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            AnonymousClass0LU.A0D("CriticalPathManagerImpl", A0s.toString());
            set.clear();
            C1202879o.A00(r4);
        }
    }
}
