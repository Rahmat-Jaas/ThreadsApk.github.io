package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2Ch  reason: invalid class name and case insensitive filesystem */
public final class C32552Ch {
    public static void A00(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        Iterator it = hashMap.keySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            if (!z) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            String A0f = C18240wQ.A0f(A0k, hashMap);
            String str = "\"";
            sb.append(str);
            sb.append(A0k);
            sb.append("\":");
            if (A0f == null) {
                str = "null";
            } else {
                sb.append(str);
                sb.append(A0f);
            }
            sb.append(str);
            z = false;
        }
        sb.append("}");
    }
}
