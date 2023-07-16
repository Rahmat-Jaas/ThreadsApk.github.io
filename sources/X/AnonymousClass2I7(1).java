package X;

import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;

/* renamed from: X.2I7  reason: invalid class name */
public final class AnonymousClass2I7 {
    public static Object A00(AnonymousClass601 r12, C63893iY r13) {
        String A0N;
        Object A0B = C63893iY.A0B(r13, 0);
        A0B.getClass();
        C127397h3 r7 = (C127397h3) A0B;
        AnonymousClass3HX r6 = (AnonymousClass3HX) C63893iY.A08(r13);
        C58963Iu r5 = new C58963Iu(C63913ic.A0J(r12));
        String A0N2 = r7.A0N(38);
        String A0N3 = r7.A0N(40);
        if (!TextUtils.isEmpty(A0N2)) {
            if (!TextUtils.isEmpty(A0N3)) {
                r5.A0A(A0N2, A0N3);
            } else {
                r5.A06(A0N2);
            }
        }
        C127397h3 A0K = r7.A0K(35);
        if (!(A0K == null || (A0N = A0K.A0N(36)) == null)) {
            r5.A05(C18250wR.A0K(A0N));
        }
        C109326jp A0L = r7.A0L(41);
        if (A0L != null) {
            r5.A02 = new C70104Ck(r6, r12, A0L);
        }
        for (int i = 0; i < r7.A0R(36).size(); i++) {
            C127397h3 r11 = (C127397h3) r7.A0R(36).get(i);
            String A0N4 = r11.A0N(36);
            C109326jp A0L2 = r11.A0L(38);
            if (!(A0L2 == null || r11.A0N(40) == null)) {
                IDxCListenerShape41S0300000_1_I2 iDxCListenerShape41S0300000_1_I2 = new IDxCListenerShape41S0300000_1_I2(8, (Object) r6, (Object) r12, (Object) A0L2);
                if (A0N4 == null || !A0N4.equals("destructive")) {
                    r5.A09(r11.A0N(40), iDxCListenerShape41S0300000_1_I2);
                } else {
                    r5.A08(r11.A0N(40), iDxCListenerShape41S0300000_1_I2);
                }
            }
        }
        new C62763ag(r5).A04(r6.A00);
        return null;
    }
}
