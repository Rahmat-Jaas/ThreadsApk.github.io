package X;

import android.content.Intent;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape20S0300000_1_I2;

/* renamed from: X.2GX  reason: invalid class name */
public final class AnonymousClass2GX {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        Object A0B = C63893iY.A0B(r9, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r9, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0);
        C109326jp A06 = C63893iY.A06(r9, 2);
        C109326jp A062 = C63893iY.A06(r9, 3);
        C109326jp A063 = C63893iY.A06(r9, 4);
        try {
            Intent A00 = C61973Wo.A00(C63913ic.A05(r8), str, str2);
            C63913ic.A0Q(r8, new IDxLListenerShape20S0300000_1_I2((int) A1Z, (Object) r8, (Object) A06, (Object) A062));
            C10650ih.A0E(A00, C63913ic.A01(r8), A1Z);
            return null;
        } catch (IllegalArgumentException | NullPointerException unused) {
            C63913ic.A0K(r8, A063, new Object[0]);
            return null;
        }
    }
}
