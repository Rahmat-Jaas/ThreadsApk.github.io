package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.3Ln  reason: invalid class name and case insensitive filesystem */
public final class C59613Ln {
    public static final List A01(String str) {
        if (str == null || str.equals("")) {
            return AnonymousClass0ZV.A00;
        }
        return C81074n3.A06(str);
    }

    public static final String A00(List list) {
        if (list.isEmpty()) {
            return "";
        }
        return C18200wM.A0l(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list);
    }
}
