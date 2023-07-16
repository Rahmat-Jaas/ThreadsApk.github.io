package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.wellbeing.accountstatus.impl.AccountStatusPluginImpl$IXTScreenExitCallback;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.3RM  reason: invalid class name */
public final class AnonymousClass3RM {
    public static AnonymousClass3RM A00;

    public static final C62743ad A00(FragmentActivity fragmentActivity, C11630kW r10, C40309LcG lcG, UserSession userSession, AnonymousClass3RM r13, String str, String str2, String str3) {
        C11630kW r8 = r10;
        String str4 = str;
        Pair A0p = C18180wK.A0p("ig_container_module", C18230wP.A0n(r10));
        Locale locale = Locale.US;
        C04220Ms.A08(locale);
        Pair A0p2 = C18180wK.A0p("trigger_event_type", C18190wL.A0r(locale, "IG_OPEN_ACCOUNT_STATUS"));
        if (str == null) {
            str4 = C18190wL.A0n(C03480Iw.A00());
        }
        Map A0I = AnonymousClass4WJ.A0I(A0p, A0p2, C18180wK.A0p("trigger_session_id", str4), C18180wK.A0p("ixt_initial_screen_id", C18230wP.A0h()));
        A0I.put("location", C18190wL.A0r(locale, lcG.toString()));
        if (str2 != null) {
            A0I.put("ig_group_profile_id", str2);
        }
        String str5 = str3;
        if (str3 != null) {
            A0I.put("enforcement_id", str5);
        }
        Map A0E = AnonymousClass4WJ.A0E(A0I);
        Object obj = A0E.get("location");
        String A0r = C18220wO.A0r("trigger_session_id", A0E);
        AnonymousClass01V.A0p.markerStart(387849633);
        AnonymousClass01V r2 = AnonymousClass01V.A0p;
        r2.markerAnnotate(387849633, C61953Wm.A00(), A0r);
        r2.markerAnnotate(387849633, "entry_point", String.valueOf(obj));
        C29641z0 r11 = new C29641z0(fragmentActivity, userSession, r13);
        Integer num = AnonymousClass006.A01;
        return new C62743ad(fragmentActivity, AccountStatusPluginImpl$IXTScreenExitCallback.A00, r8, (C37383Jqm) null, userSession, r11, (Boolean) null, num, "com.bloks.www.ig.ixt.triggers.screen.ig_account_status", (String) null, A0E);
    }
}
