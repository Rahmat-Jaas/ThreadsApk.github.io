package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.2z1  reason: invalid class name and case insensitive filesystem */
public final class C54172z1 {
    public static final void A00(C10300i6 r2, Integer num, Integer num2) {
        String str;
        String str2;
        C10680ik r0 = new C10680ik(r2);
        r0.A02 = "lightweight_connections_share_profile";
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r0.A00(), "ig_lightweight_connections"), 1258);
        if (AnonymousClass0wJ.A1U(A0I)) {
            switch (num.intValue()) {
                case 0:
                    str = "entered";
                    break;
                case 1:
                    str = "share_clicked";
                    break;
                case 2:
                    str = "next_clicked";
                    break;
                case 3:
                    str = "exit_clicked";
                    break;
                case 4:
                    str = "avatar_plus_clicked";
                    break;
                default:
                    str = "avatar_updated";
                    break;
            }
            switch (C18240wQ.A05(A0I, num2, "event", str)) {
                case 1:
                    str2 = "qp_full";
                    break;
                case 2:
                    str2 = "qp_lite";
                    break;
                default:
                    str2 = "nux";
                    break;
            }
            A0I.A0T("type", str2);
            A0I.Bb4();
        }
    }
}
