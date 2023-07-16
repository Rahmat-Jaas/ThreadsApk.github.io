package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Hy  reason: invalid class name and case insensitive filesystem */
public final class C34022Hy {
    public static void A00(FragmentActivity fragmentActivity, C11630kW r9, UserSession userSession, AnonymousClass25O r11, String str, int i, int i2) {
        C29009Fg4 fg4;
        String valueOf = String.valueOf(i2);
        C29009Fg4[] values = C29009Fg4.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                fg4 = null;
                break;
            }
            fg4 = values[i3];
            if (C04220Ms.A0I(fg4.A00, valueOf)) {
                break;
            }
            i3++;
        }
        String valueOf2 = String.valueOf(i);
        C37232Jmy jmy = new C37232Jmy(fragmentActivity, r9, userSession, fg4, C54452zT.A00(valueOf2), str);
        jmy.A07(r11);
        C29008Fg3 A00 = C54452zT.A00(valueOf2);
        if (A00 == C29008Fg3.A0A || A00 == C29008Fg3.A0C || A00 == C29008Fg3.A0E || A00 == C29008Fg3.A09 || A00 == C29008Fg3.A0B || A00 == C29008Fg3.A0D || A00 == C29008Fg3.A08 || A00 == C29008Fg3.A07) {
            jmy.A08 = true;
        }
        jmy.A06();
    }
}
