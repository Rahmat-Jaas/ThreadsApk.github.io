package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.1hO  reason: invalid class name */
public final class AnonymousClass1hO extends C63873iU {
    public final /* synthetic */ C695849e A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass1hO(C695849e r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }

    public final void onFail(AnonymousClass3XX r7) {
        C85814vo r2;
        int A002 = AnonymousClass0wJ.A00(-253246210, r7);
        UserSession userSession = this.A00.A02;
        HashMap A012 = C60333Op.A01(userSession);
        Object obj = r7.A00;
        String str = null;
        if (AnonymousClass0wJ.A1W(obj) && (r2 = (C85814vo) obj) != null) {
            str = r2.getErrorMessage();
        }
        A012.put("error_message", str);
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        C18190wL.A1H(A0P, userSession, "server_update_failure");
        C18210wN.A1B(A0P, this.A01);
        A0P.A0Q("user_interaction", Boolean.valueOf(this.A02));
        A0P.A0T("target_destination_type", "fb_user");
        C18220wO.A1G(A0P, A012);
        C14030oh.A0A(-1179823779, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1900017188);
        int A032 = C14030oh.A03(568130803);
        C695849e r13 = this.A00;
        UserSession userSession = r13.A02;
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        A0P.A0T("event_name", "server_update_success");
        A0P.A0T("ig_account_type", C04660Oo.A02(userSession));
        String str = this.A01;
        A0P.A0T("entry_point", str);
        boolean z = this.A02;
        A0P.A0Q("user_interaction", Boolean.valueOf(z));
        A0P.A0T("target_destination_type", "fb_user");
        A0P.A0V("debug_test_data", C60333Op.A01(userSession));
        A0P.Bb4();
        if (z) {
            USLEBaseShape0S0000000 A0P2 = C18200wM.A0P(userSession);
            C63873iU.A0B(A0P2, userSession, "destination_picker_flag_reset");
            A0P2.A0Q("user_interaction", C18190wL.A0Z(A0P2, "entry_point", str, true));
            A0P2.A0T("target_destination_type", "fb_user");
            A0P2.A0V("debug_test_data", C60333Op.A01(userSession));
            A0P2.Bb4();
            C62953bC.A03(userSession, false);
            r13.A00 = false;
        }
        C695849e.A00(r13, "", "", "", str, z);
        r13.A01.A0L(userSession, true);
        C14030oh.A0A(-1947599312, A032);
        C14030oh.A0A(601144256, A03);
    }
}
