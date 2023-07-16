package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.2BW  reason: invalid class name */
public final class AnonymousClass2BW {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        AnonymousClass601 r4 = r8;
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        String A0E = C63893iY.A0E(r9, 0);
        C109326jp A06 = C63893iY.A06(r9, A1Z ? 1 : 0);
        C109326jp A062 = C63893iY.A06(r9, 2);
        FragmentActivity A05 = C63913ic.A05(r4);
        UserSession userSession = (UserSession) C63913ic.A0F(r4);
        C111636o4 r0 = C111636o4.A00;
        if (r0 == null) {
            C18250wR.A0k();
            throw null;
        }
        E1T A00 = r0.A00(userSession);
        KtCSuperShape0S1000000_I2 ktCSuperShape0S1000000_I2 = new KtCSuperShape0S1000000_I2("ALL_PRODUCTS", A1Z);
        C37010Jil.A00().A02(new AnonymousClass47O(r4, A062, A06, A00, A0E), A00.A00(A05, ktCSuperShape0S1000000_I2));
        return null;
    }
}
