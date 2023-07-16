package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.1hZ  reason: invalid class name */
public final class AnonymousClass1hZ extends C63873iU {
    public final /* synthetic */ C695849e A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public AnonymousClass1hZ(C695849e r1, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A05 = z;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final void onFailInBackground(C26743EUq eUq) {
        String str;
        int A002 = AnonymousClass0wJ.A00(-1185376370, eUq);
        UserSession userSession = this.A00.A02;
        HashMap A012 = C60333Op.A01(userSession);
        if (eUq.A06()) {
            str = ((C85814vo) eUq.A03()).getErrorMessage();
        } else {
            str = null;
        }
        A012.put("error_message", str);
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        C18190wL.A1H(A0P, userSession, "server_update_failure");
        C18210wN.A1B(A0P, this.A01);
        A0P.A0Q("user_interaction", Boolean.valueOf(this.A05));
        A0P.A0T("target_destination_type", "fb_page");
        C18220wO.A1G(A0P, A012);
        C14030oh.A0A(1113065488, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = C14030oh.A03(-563734788);
        int A033 = C14030oh.A03(-246522108);
        C695849e r14 = this.A00;
        UserSession userSession = r14.A02;
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        A0P.A0T("event_name", "server_update_success");
        A0P.A0T("ig_account_type", C04660Oo.A02(userSession));
        String str = this.A01;
        A0P.A0T("entry_point", str);
        boolean z = this.A05;
        A0P.A0Q("user_interaction", Boolean.valueOf(z));
        A0P.A0T("target_destination_type", "fb_page");
        A0P.A0V("debug_test_data", C60333Op.A01(userSession));
        A0P.Bb4();
        r14.A01.A0L(userSession, true);
        if (z) {
            USLEBaseShape0S0000000 A0P2 = C18200wM.A0P(userSession);
            C63873iU.A0B(A0P2, userSession, "destination_picker_flag_reset");
            A0P2.A0Q("user_interaction", C18190wL.A0Z(A0P2, "entry_point", str, true));
            A0P2.A0T("target_destination_type", "fb_page");
            A0P2.A0V("debug_test_data", C60333Op.A01(userSession));
            A0P2.Bb4();
            C62953bC.A03(userSession, false);
            r14.A00 = false;
        }
        String str2 = this.A02;
        String str3 = this.A03;
        String str4 = str3;
        C695849e.A00(r14, str2, str4, this.A04, str, z);
        C14030oh.A0A(1545888309, A033);
        C14030oh.A0A(-1126415341, A032);
    }
}
