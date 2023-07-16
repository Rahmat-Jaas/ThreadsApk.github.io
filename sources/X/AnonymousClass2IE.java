package X;

import com.facebook.redex.IDxEListenerShape312S0200000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.2IE  reason: invalid class name */
public final class AnonymousClass2IE {
    public static final Object A00(AnonymousClass601 r13, C63893iY r14) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        boolean z = true;
        List list = r14.A00;
        String A0q = C18190wL.A0q(list, A1Z ? 1 : 0);
        String A0q2 = C18190wL.A0q(list, 2);
        String A0q3 = C18190wL.A0q(list, 3);
        C109326jp A06 = C63893iY.A06(r14, 4);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r13));
        if (C63803iN.A0E(AnonymousClass0TJ.A05, A02, 36315116718786933L)) {
            AnonymousClass0wJ.A19(C62883b4.A02().A04(C35394Iu2.A0T, new IDxEListenerShape312S0200000_1_I2(r13, A06, 0), A0q, A0q2, A0q3), C63913ic.A05(r13), A02);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
