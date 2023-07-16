package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Set;

/* renamed from: X.2Lc  reason: invalid class name and case insensitive filesystem */
public final class C34842Lc {
    public static final String A00(C17719AKx aKx, Set set) {
        AnonymousClass0wJ.A1N(aKx, set);
        StringBuilder A0s = C18190wL.A0s("destination:");
        A0s.append(aKx);
        A0s.append(" tools:");
        if (set.isEmpty()) {
            A0s.append(NetInfoModule.CONNECTION_TYPE_NONE);
        } else {
            for (Object obj : set) {
                A0s.append(obj.toString());
                A0s.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
        }
        return C18190wL.A0n(A0s);
    }
}
