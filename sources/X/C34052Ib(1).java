package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Ib  reason: invalid class name and case insensitive filesystem */
public final class C34052Ib {
    public static final Object A00(AnonymousClass601 r24, C63893iY r25) {
        AnonymousClass601 r5 = r24;
        C63893iY r3 = r25;
        boolean A1Z = AnonymousClass0wJ.A1Z(r3, r5);
        String A0E = C63893iY.A0E(r3, A1Z ? 1 : 0);
        Object A09 = C63893iY.A09(r3);
        C04220Ms.A0C(A09, "null cannot be cast to non-null type kotlin.Number");
        int A04 = AnonymousClass0wJ.A04(A09);
        Object A0B = C63893iY.A0B(r3, 3);
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Number");
        int A042 = AnonymousClass0wJ.A04(A0B);
        C10300i6 A0F = C63913ic.A0F(r5);
        UserSession userSession = (UserSession) C63913ic.A0F(r5);
        Fragment A03 = C63913ic.A03(r5);
        FragmentActivity A05 = C63913ic.A05(r5);
        FragmentActivity A052 = C63913ic.A05(r5);
        AnonymousClass3UZ r2 = AnonymousClass3UZ.A02;
        long A053 = C63043bN.A01.A05(userSession);
        Drawable A01 = C18742Ake.A01(A05, R.drawable.instagram_clock_dotted_pano_outline_24);
        if (r2 != null) {
            if (A04 == 0) {
                C37383Jqm A00 = AnonymousClass3Zz.A00(A05, (AnonymousClass37X) null, userSession, r2);
                r2.A00();
                C37383Jqm.A00(A05, new AnonymousClass1wP(), A00);
            } else {
                C37383Jqm A032 = r2.A00().A03(A05, A052, userSession, new C71994Lo(A05, A01, A03, A052, (AnonymousClass37X) null, A0F, userSession, A0E, A053, A1Z), ((long) A042) / 60, A1Z);
                r2.A00();
                C37383Jqm.A00(A05, new C29071wf(A042 / 60), A032);
            }
            C696349j.A03(userSession);
            C63583hq.A02(userSession, AnonymousClass006.A0j, C696349j.A00());
        }
        return null;
    }
}
