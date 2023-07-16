package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;

/* renamed from: X.2BT  reason: invalid class name */
public final class AnonymousClass2BT {
    public static final void A00(StringBuilder sb, int i) {
        if (i > 0) {
            ArrayList A0k = C18240wQ.A0k(i);
            int i2 = 0;
            do {
                A0k.add("?");
                i2++;
            } while (i2 < i);
            sb.append(C18200wM.A0l(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0k));
        }
    }
}
