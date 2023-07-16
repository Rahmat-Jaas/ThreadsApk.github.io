package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxDListenerShape185S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.2Ic  reason: invalid class name and case insensitive filesystem */
public final class C34062Ic {
    public static final Object A00(AnonymousClass601 r29, C63893iY r30) {
        C37383Jqm A03;
        Fragment r4;
        Integer num;
        AnonymousClass601 r8 = r29;
        C63893iY r1 = r30;
        boolean A1Z = AnonymousClass0wJ.A1Z(r1, r8);
        String A0D = C63893iY.A0D(r1, A1Z ? 1 : 0);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r1, 2));
        C109326jp A06 = C63893iY.A06(r1, 3);
        UserSession userSession = (UserSession) C63913ic.A0F(r8);
        FragmentActivity A05 = C63913ic.A05(r8);
        AnonymousClass3UZ r42 = AnonymousClass3UZ.A02;
        if (r42 != null) {
            AnonymousClass37X r3 = new AnonymousClass37X(r8, A06);
            int i = 0;
            if (A04 == 0) {
                A03 = AnonymousClass3Zz.A00(A05, r3, userSession, r42);
                r42.A00();
                r4 = new AnonymousClass1wP();
            } else {
                FragmentActivity A052 = C63913ic.A05(r8);
                if (A0D.equals("ig_ts_entry_point_similar_posts_nudge") || A0D.equals("ig_ts_entry_point_profile_qp")) {
                    C10300i6 A0F = C63913ic.A0F(r8);
                    Fragment A032 = C63913ic.A03(r8);
                    long A053 = C63043bN.A01.A05(userSession);
                    A03 = r42.A00().A03(A05, A052, userSession, new C71994Lo(A05, C18742Ake.A01(A05, R.drawable.instagram_clock_dotted_pano_outline_24), A032, A052, r3, A0F, userSession, A0D, A053, A1Z), 0, A1Z);
                } else {
                    A03 = r42.A00().A03(A05, A052, userSession, new IDxDListenerShape185S0200000_1_I2(0, r3, userSession), 0, A1Z);
                }
                r42.A00();
                r4 = new C29071wf(0);
            }
            C37383Jqm.A00(A05, r4, A03);
            C696349j.A03(userSession);
            long A00 = C696349j.A00();
            Integer[] A002 = AnonymousClass006.A00(13);
            int length = A002.length;
            while (true) {
                if (i >= length) {
                    num = AnonymousClass006.A04;
                    break;
                }
                num = A002[i];
                if (C54552zd.A00(num).equals(C18220wO.A0u(Locale.ROOT, A0D))) {
                    break;
                }
                i++;
            }
            C63583hq.A02(userSession, num, A00);
        }
        return null;
    }
}
