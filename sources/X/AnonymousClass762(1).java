package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* renamed from: X.762  reason: invalid class name */
public final class AnonymousClass762 {
    public int A00 = 0;
    public final AnonymousClass7EE A01;
    public final Map A02 = new C013306f();

    public static final String A00(AnonymousClass762 r3) {
        String string;
        AnonymousClass7EE r32 = r3.A01;
        synchronized (r32) {
            string = r32.A01.getString("topic_operation_queue", "");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    public AnonymousClass762(AnonymousClass7EE r2) {
        this.A01 = r2;
    }
}
