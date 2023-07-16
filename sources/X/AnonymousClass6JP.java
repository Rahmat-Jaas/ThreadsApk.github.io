package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashSet;

/* renamed from: X.6JP  reason: invalid class name */
public final class AnonymousClass6JP {
    public static final String A00(int[] iArr) {
        if (C18180wK.A1W(r2)) {
            return null;
        }
        HashSet A0u = C18200wM.A0u();
        for (int valueOf : iArr) {
            A0u.add(String.valueOf(valueOf));
        }
        if (A0u.size() <= 5) {
            return TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0u.toArray(new String[0]));
        }
        C10450iM.A02("IgSaltUserFlowLoggerUtil", AnonymousClass006.A00, AnonymousClass00U.A0L("Error, too many active UserFlows! ", A0u.toString()));
        return null;
    }
}
