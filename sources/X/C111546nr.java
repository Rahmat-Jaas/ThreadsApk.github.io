package X;

import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.service.session.UserSession;

/* renamed from: X.6nr  reason: invalid class name and case insensitive filesystem */
public final class C111546nr {
    public final Fragment A00(UserSession userSession, String str, String str2, String str3, boolean z) {
        AnonymousClass0wJ.A1M(userSession, 0, str);
        if (str3 == null) {
            str3 = C122037Js.A00();
        }
        if ("SETTINGS".equals(str)) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, userSession), "user_click_appreciationonboarding_atomic"), 2822);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0T(C61953Wm.A00(), str3);
                C86104wH.A1G(AnonymousClass6BP.A07, A0I);
                AnonymousClass5Cj r1 = new AnonymousClass5Cj();
                C86124wJ.A1K(r1, C18170wI.A00(964));
                C86134wK.A1G(r1, "gifts_on_reels");
                C86114wI.A1C(A0I, r1);
                A0I.A1g(AnonymousClass4WJ.A0A());
                A0I.Bb4();
            }
        }
        AnonymousClass62L r4 = new AnonymousClass62L();
        r4.setArguments(C98316Fa.A00(C18180wK.A0p("appreciation_logging_data", new LoggingData(str3, C86114wI.A0o(str))), C18180wK.A0p("arg_start_onboarding", Boolean.valueOf(z)), C18180wK.A0p(C18170wI.A00(565), str), C18180wK.A0p(C18170wI.A00(115), str2)));
        return r4;
    }
}
