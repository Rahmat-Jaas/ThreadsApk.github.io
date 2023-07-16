package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: X.2GW  reason: invalid class name */
public final class AnonymousClass2GW {
    public static final Object A00(AnonymousClass601 r19, C63893iY r20) {
        boolean A0E;
        AnonymousClass601 r13 = r19;
        C63893iY r5 = r20;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r13);
        Object A0B = C63893iY.A0B(r5, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        String A0q = C18190wL.A0q(r5.A00, A1Z ? 1 : 0);
        long A08 = C18190wL.A08(C63893iY.A0A(r5, 2)) * ((long) 1000);
        C109326jp A06 = C63893iY.A06(r5, 3);
        C109326jp A062 = C63893iY.A06(r5, 4);
        C63893iY A05 = C63893iY.A05(AnonymousClass3VO.A00(), A0B, 0);
        C10300i6 A0F = C63913ic.A0F(r13);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        if (userSession == null) {
            A0E = false;
        } else {
            A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316121741134808L);
        }
        if (!A0E) {
            C61043Rr.A00(r13, A05, A062);
        } else {
            FragmentActivity A052 = C63913ic.A05(r13);
            if (!(A0q == null || A0q.length() == 0)) {
                Calendar instance = Calendar.getInstance();
                if (A08 <= new GregorianCalendar(instance.get(A1Z) - 13, instance.get(2), instance.get(5)).getTimeInMillis()) {
                    Calendar instance2 = Calendar.getInstance();
                    if (A08 > new GregorianCalendar(instance2.get(A1Z) - 18, instance2.get(2), instance2.get(5)).getTimeInMillis()) {
                        if (A052 != null) {
                            C25828Dsm A0W = C18190wL.A0W(A052);
                            A0W.A0L(2131838158);
                            A0W.A0K(2131838159);
                            A0W.A0O((DialogInterface.OnClickListener) null, 2131823054);
                            C18190wL.A1R(A0W, A052, userSession, 47, 2131824341);
                            AnonymousClass0wJ.A1K(A0W);
                            return null;
                        }
                    }
                }
            }
            Calendar instance3 = Calendar.getInstance();
            C04220Ms.A06(instance3);
            instance3.setTimeInMillis(A08);
            int i = instance3.get(A1Z);
            int i2 = instance3.get(2) + 1;
            int A07 = C18240wQ.A07(instance3);
            AnonymousClass06E A00 = AnonymousClass06E.A00(A052);
            C04220Ms.A0B(userSession, 0);
            H1T A0O = AnonymousClass0wJ.A0O(userSession);
            C18190wL.A1O(A0O, "age_platform/age_verification/is_eligible/", i, i2, A07);
            C32165H8c A0T = C18180wK.A0T(A0O, C22021Tb.class, AnonymousClass3JS.class);
            A0T.A00 = new C24191hd(A052, r13, A05, A062, A06, userSession, i, i2, A07);
            C31155GhB.A01(A052, A00, A0T);
            return null;
        }
        return null;
    }
}
