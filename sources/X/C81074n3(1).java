package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.4n3  reason: invalid class name and case insensitive filesystem */
public class C81074n3 extends AnonymousClass4n4 {
    public static final Double A04(String str) {
        C04220Ms.A0B(str, 0);
        try {
            if (AnonymousClass31Z.A00.A04(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Float A05(String str) {
        C04220Ms.A0B(str, 0);
        try {
            if (AnonymousClass31Z.A00.A04(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static List A06(CharSequence charSequence) {
        return AnonymousClass8bP.A0f(charSequence, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0, 6);
    }

    public static List A07(CharSequence charSequence, String str, int i) {
        return AnonymousClass8bP.A0f(charSequence, new String[]{str}, i, 6);
    }
}
