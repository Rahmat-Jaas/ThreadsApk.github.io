package X;

import com.facebook.redex.IDxFListenerShape9S1400000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2JL  reason: invalid class name */
public final class AnonymousClass2JL {
    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        AnonymousClass601 r6 = r10;
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        String A0n = C18190wL.A0n(C63893iY.A0A(r11, 0));
        C109326jp A06 = C63893iY.A06(r11, A1Z ? 1 : 0);
        C109326jp A062 = C63893iY.A06(r11, 2);
        String A0E = C63893iY.A0E(r11, 3);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r10));
        C29551yn r4 = new C29551yn(r10, A06, A062);
        User A0P = C18210wN.A0P(A02, A0n);
        if (A0P != null) {
            C63373hN.A04(C63913ic.A05(r10), M6q.A06(r10), A02, A0P, r4, A0E);
            return null;
        }
        AnonymousClass3Y8.A02.A00(A02, new IDxFListenerShape9S1400000_1_I2(r4, A062, r6, A02, A0E, 0), A0n);
        return null;
    }
}
