package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0uS  reason: invalid class name and case insensitive filesystem */
public final class C17190uS {
    public final List A00;

    public final String toString() {
        return TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, this.A00.toArray());
    }

    public C17190uS(List list) {
        this.A00 = Collections.unmodifiableList(new ArrayList(list));
    }
}
