package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.19l  reason: invalid class name and case insensitive filesystem */
public final class C212019l extends AnonymousClass2CL {
    public static final long A02 = C18230wP.A07();
    public final C31152Gh4 A00;
    public final C10300i6 A01;

    public static void A00(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, C58503Fx r10, C212019l r11, String str, int i, boolean z) {
        String str2;
        C31152Gh4 gh4 = r11.A00;
        int i2 = r10.A00;
        if (i >= i2) {
            str2 = "not_in_experiment";
        } else {
            str2 = r10.A05[i];
        }
        String str3 = "not_in_experiment";
        if (!str2.equals(str3) && gh4 != null) {
            if ((z || C18240wQ.A09(gh4.A08(C37112Jkn.A00(r10.A02), -1)) >= A02) && AnonymousClass0wJ.A1U(uSLEBaseShape0S0000000)) {
                String str4 = r10.A02;
                uSLEBaseShape0S0000000.A0T("exp_name", str4);
                if (i < i2) {
                    str3 = r10.A05[i];
                }
                uSLEBaseShape0S0000000.A0T("exp_group", str3);
                uSLEBaseShape0S0000000.A0T("family_device_id", str);
                uSLEBaseShape0S0000000.Bb4();
                C31029Gdw A09 = gh4.A09();
                A09.A09(C37112Jkn.A00(str4), System.currentTimeMillis());
                A09.A05();
            }
        }
    }

    public C212019l(Context context, C10300i6 r4) {
        this.A01 = r4;
        C31152Gh4 A002 = new GGF(context).A00().A00("fdid_oe_exposure_time");
        C04220Ms.A06(A002);
        this.A00 = A002;
    }

    public C212019l() {
    }
}
