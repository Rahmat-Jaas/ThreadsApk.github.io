package X;

import com.facebook.redex.IDxFListenerShape9S1400000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2JM  reason: invalid class name */
public final class AnonymousClass2JM {
    public static Object A00(AnonymousClass601 r16, C63893iY r17) {
        C63893iY r3 = r17;
        String obj = C63893iY.A07(r3).toString();
        C109326jp A06 = C63893iY.A06(r3, 1);
        C109326jp A062 = C63893iY.A06(r3, 2);
        String A0q = C18190wL.A0q(r3.A00, 3);
        AnonymousClass601 r32 = r16;
        if (A0q == null) {
            C04220Ms.A0B(r32, 0);
            A0q = C63913ic.A0A(r32).getModuleName();
        }
        UserSession A0J = C63913ic.A0J(r32);
        User A0P = C18210wN.A0P(A0J, obj);
        if (A0P != null) {
            C04220Ms.A0B(r32, 0);
            C63373hN.A03(C63913ic.A05(r32), r32, A06, A062, M6q.A06(r32), A0J, A0P, C307722x.DIRECT_PROFILE, A0q);
            return null;
        }
        AnonymousClass3Y8.A02.A00(A0J, new IDxFListenerShape9S1400000_1_I2(r32, A06, A062, A0J, A0q, 1), obj);
        return null;
    }
}
