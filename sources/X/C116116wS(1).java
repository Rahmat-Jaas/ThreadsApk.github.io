package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.6wS  reason: invalid class name and case insensitive filesystem */
public final class C116116wS {
    public static final void A01(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
        }
    }

    public static void A00(StringBuilder sb, int i) {
        A01(sb, i);
        sb.append(")");
        sb.append("\n");
    }
}
