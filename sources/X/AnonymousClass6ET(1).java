package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.6ET  reason: invalid class name */
public final class AnonymousClass6ET {
    public static /* synthetic */ String A00(List list) {
        C04220Ms.A0B(list, 0);
        StringBuilder A0r = C18200wM.A0r();
        A0r.append("");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i++;
            if (i > 1) {
                A0r.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    A0r.append(((Character) obj).charValue());
                } else {
                    obj = String.valueOf(obj);
                }
            }
            A0r.append((CharSequence) obj);
        }
        A0r.append("");
        return C18190wL.A0n(A0r);
    }
}
