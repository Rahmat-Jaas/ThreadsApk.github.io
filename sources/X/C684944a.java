package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Map;

/* renamed from: X.44a  reason: invalid class name and case insensitive filesystem */
public final class C684944a implements C11630kW, AnonymousClass0i1 {
    public static final String __redex_internal_original_name = "BadgingAnalyticsLoggerImpl";
    public final C84184sh A00;
    public final AnonymousClass35I A01;

    public C684944a(AnonymousClass35I r2, C84184sh r3) {
        C04220Ms.A0B(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    public final void A01(AnonymousClass25P r8, AnonymousClass25R r9, AnonymousClass17J r10) {
        AnonymousClass0wJ.A1O(r9, r8);
        A00(this, r8, r9, r10, (Integer) null, "click", (Map) null);
    }

    public final void A02(AnonymousClass25P r9, AnonymousClass25R r10, AnonymousClass17J r11) {
        AnonymousClass25P r2 = r9;
        AnonymousClass25R r3 = r10;
        AnonymousClass0wJ.A1O(r10, r9);
        AnonymousClass17J r4 = r11;
        if (this.A00.CsX(r9, r10, r11)) {
            A00(this, r2, r3, r4, (Integer) null, "impression", (Map) null);
        }
    }

    public final void A03(AnonymousClass25P r9, AnonymousClass25R r10, AnonymousClass17J r11, Integer num) {
        AnonymousClass25P r2 = r9;
        AnonymousClass25R r3 = r10;
        AnonymousClass0wJ.A1O(r10, r9);
        AnonymousClass17J r4 = r11;
        Integer num2 = num;
        if (this.A00.CsW(r9, r10, r11, num)) {
            A00(this, r2, r3, r4, num2, "impression", (Map) null);
        }
    }

    public final String getModuleName() {
        return "badging";
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static final void A00(C684944a r2, AnonymousClass25P r3, AnonymousClass25R r4, AnonymousClass17J r5, Integer num, String str, Map map) {
        String A002;
        String obj;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r2, r2.A01.A00), "badging_event"), 73);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("event_type", str);
            A0I.A0T("use_case_id", r5.A03.toString());
            A0I.A0S("badge_value", C18230wP.A0f(r5.A01 + r5.A00));
            if (!(r4 == null || (obj = r4.toString()) == null)) {
                A0I.A0T("badge_position", obj);
            }
            String obj2 = r3.toString();
            if (obj2 != null) {
                A0I.A0T("badge_display_style", obj2);
            }
            if (!(num == null || (A002 = C36392Rd.A00(num)) == null)) {
                A0I.A0T("surface", A002);
            }
            if (map != null) {
                A0I.A1g(map);
            }
            A0I.Bb4();
        }
    }
}
