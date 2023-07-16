package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import com.instagram.quickpromotion.model.FilterType;

/* renamed from: X.4GC  reason: invalid class name */
public final class AnonymousClass4GC implements C82884qQ {
    public final int A00;
    public final AnonymousClass3UU A01;

    public final boolean CW4(C58743Gz r5) {
        ImmutableMap immutableMap = this.A01.A01;
        String str = (String) immutableMap.get("target_user_ids");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).length + (Boolean.parseBoolean((String) immutableMap.get(FilterType.A0L.toString())) ? 1 : 0) <= this.A00) {
            return true;
        }
        return false;
    }

    public AnonymousClass4GC(AnonymousClass3UU r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
