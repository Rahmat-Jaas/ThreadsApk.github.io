package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0004000_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3WM  reason: invalid class name */
public final class AnonymousClass3WM {
    public static final KtCSuperShape0S0004000_I2 A00(List list, long j) {
        C04220Ms.A0B(list, 0);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (Object A08 : list) {
            long A082 = C18190wL.A08(A08);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (A082 > j - (((long) 86400) * timeUnit.toMillis(1))) {
                i++;
            } else if (A082 <= j - (((long) 172800) * timeUnit.toMillis(1))) {
                if (A082 <= j - (((long) 432000) * timeUnit.toMillis(1))) {
                    if (A082 <= j - (((long) 604800) * timeUnit.toMillis(1))) {
                    }
                    i4++;
                }
                i3++;
                i4++;
            }
            i2++;
            i3++;
            i4++;
        }
        return new KtCSuperShape0S0004000_I2(i, i2, i3, i4, 2);
    }

    public static final List A01(String str) {
        C04220Ms.A0B(str, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (str.length() <= 0) {
            return A0v;
        }
        List A07 = C81074n3.A07(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A0w = AnonymousClass0wJ.A0w(A07);
        Iterator it = A07.iterator();
        while (it.hasNext()) {
            A0w.add(AnonymousClass0wJ.A0d(C18180wK.A0k(it)));
        }
        return C18200wM.A0s(A0w);
    }

    public static final void A02(List list, boolean z) {
        C04220Ms.A0B(list, 0);
        if (z) {
            list.add(C18200wM.A0c());
            if (list.size() > 100) {
                list.remove(0);
            }
        }
    }
}
