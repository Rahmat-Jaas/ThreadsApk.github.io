package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import java.util.Map;

/* renamed from: X.7Jn  reason: invalid class name and case insensitive filesystem */
public final class C122017Jn {
    public static final AnonymousClass6BP A00 = AnonymousClass6BP.A07;
    public static final AnonymousClass28E A01 = AnonymousClass28E.ANDROID;
    public static final C122017Jn A02 = new C122017Jn();

    public static void A01(C89195Ch r4, AnonymousClass7EX r5) {
        C122017Jn r3 = A02;
        C13330nS r2 = r5.A02;
        C04220Ms.A05(r2);
        r3.A05(r4, r2, r5.A01.A03, AnonymousClass4WJ.A0A());
    }

    public final void A05(C89195Ch r3, C13330nS r4, String str, Map map) {
        C86104wH.A1I(AnonymousClass0wJ.A0M(r4, "client_load_appreciationgiver_success"), r3, str, map, 256);
    }

    public static C86064wD A00(AnonymousClass76R r3, C881757a r4, Integer num, Integer num2, int i) {
        C89195Ch A002 = AnonymousClass76R.A00(r3, num, num2);
        A002.A09("balance", Long.valueOf((long) i));
        A002.A0B("star_package_options", r3.A00);
        C13330nS r1 = r3.A02;
        C04220Ms.A05(r1);
        C86104wH.A1I(AnonymousClass0wJ.A0M(r1, "user_click_appreciationgiver_atomic"), A002, r3.A01.A03, AnonymousClass4WJ.A0A(), 2819);
        return r4.A04;
    }

    public static /* synthetic */ void A04(C89195Ch r4, C13330nS r5, String str, String str2, String str3, String str4) {
        Map A0A = AnonymousClass4WJ.A0A();
        C04220Ms.A0B(str2, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r5, "client_load_appreciationgiver_fail"), 254);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T(C61953Wm.A00(), str);
            A0I.A0O(A00, "product_type");
            A0I.A0O(A01, "platform");
            A0I.A0S("actual_event_time", C18200wM.A0c());
            C86114wI.A1C(A0I, r4);
            if (C86164wN.A1R(A0A)) {
                A0I.A1g(A0A);
            }
            A0I.A1J(str2);
            if (str3 != null) {
                A0I.A0T(TraceFieldType.ErrorCode, str3);
            }
            if (str4 != null) {
                A0I.A0T("error_stacktrace", str4);
            }
            A0I.Bb4();
        }
    }
}
