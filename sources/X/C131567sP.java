package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.security.SecureRandom;
import org.json.JSONObject;

/* renamed from: X.7sP  reason: invalid class name and case insensitive filesystem */
public final class C131567sP implements C10390iG {
    public int A00;
    public final String A01;
    public final long A02 = new SecureRandom().nextLong();
    public final C11630kW A03;
    public final C13330nS A04;
    public final String A05;

    private final USLEBaseShape0S0000000 A00() {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A04, "lead_gen_ctc_app_state_change"), 2367);
        JSONObject A0y = C18230wP.A0y();
        A0y.put("ei", this.A01);
        A0I.A0U(I17.A00(889), C06750aI.A18(C18190wL.A0n(A0y)));
        A0I.A0S("click_session_id", Long.valueOf(this.A02));
        A0I.A0T("entry_point", AnonymousClass00U.A0L("ig_", this.A05));
        return A0I;
    }

    public static void A01(Context context, C131567sP r3, String str) {
        A02(r3, "ctc_call_initiated_directly");
        Intent data = new Intent("android.intent.action.CALL").setData(C15430rJ.A01(str));
        C04220Ms.A06(data);
        C10650ih.A01(context, data);
    }

    public C131567sP(UserSession userSession, String str, String str2) {
        this.A01 = str;
        this.A05 = str2;
        C130547qG r0 = C130547qG.A00;
        this.A03 = r0;
        this.A04 = C13330nS.A01(r0, userSession);
        this.A00 = 2;
        C691847d.A02(this);
    }

    public static final void A02(C131567sP r1, String str) {
        USLEBaseShape0S0000000 A002 = r1.A00();
        A002.A0T("app_state", str);
        A002.Bb4();
    }

    public final void A03(boolean z) {
        USLEBaseShape0S0000000 A002 = A00();
        A002.A0T("app_state", "click_to_call_clicked");
        A002.A0Q("granted_permission", Boolean.valueOf(z));
        A002.Bb4();
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(1532548339);
        A02(this, "app_did_enter_background");
        this.A00--;
        C14030oh.A0A(1980649339, A032);
    }

    public final void onAppForegrounded() {
        int A032 = C14030oh.A03(-746197616);
        A02(this, "app_did_become_active");
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            C691847d.A03(this);
        }
        C14030oh.A0A(2101259717, A032);
    }
}
