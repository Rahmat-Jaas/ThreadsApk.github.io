package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.UUID;

/* renamed from: X.726  reason: invalid class name */
public class AnonymousClass726 {
    public static final void A0B(Appendable appendable, Object obj, AnonymousClass0YY r3) {
        if (r3 != null) {
            obj = r3.invoke(obj);
        } else if (obj != null && !(obj instanceof CharSequence)) {
            if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
                return;
            }
            obj = String.valueOf(obj);
        }
        appendable.append((CharSequence) obj);
    }

    public static void A0A(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, B5H b5h, BKU bku, long j) {
        uSLEBaseShape0S0000000.A0X(b5h);
        BKN bkn = bku.A0f;
        String str = bkn.A4Y;
        C04220Ms.A06(str);
        uSLEBaseShape0S0000000.A12(AnonymousClass4n2.A02(str));
        uSLEBaseShape0S0000000.A0S(C18170wI.A00(194), Long.valueOf(j));
        uSLEBaseShape0S0000000.A0T("media_tap_token", UUID.randomUUID().toString());
        uSLEBaseShape0S0000000.A1T(bkn.A4k);
        uSLEBaseShape0S0000000.A1X(bkn.A4h);
        uSLEBaseShape0S0000000.A0S(I17.A00(733), 0L);
        uSLEBaseShape0S0000000.A1U(C103066Xr.A00.A02.A00);
        uSLEBaseShape0S0000000.Bb4();
    }
}
