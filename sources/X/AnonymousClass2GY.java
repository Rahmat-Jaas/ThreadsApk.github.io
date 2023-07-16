package X;

import android.content.Intent;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape20S0300000_1_I2;
import java.util.List;

/* renamed from: X.2GY  reason: invalid class name */
public final class AnonymousClass2GY {
    public static Object A00(AnonymousClass601 r8, C63893iY r9) {
        C109326jp r5;
        List list = r9.A00;
        String A0q = C18190wL.A0q(list, 0);
        String A0q2 = C18190wL.A0q(list, 1);
        Object A09 = C63893iY.A09(r9);
        if (A09 == null) {
            r5 = null;
        } else {
            r5 = ((C105916eC) A09).A00;
        }
        Object A0B = C63893iY.A0B(r9, 3);
        A0B.getClass();
        C109326jp r4 = ((C105916eC) A0B).A00;
        Object A0B2 = C63893iY.A0B(r9, 4);
        A0B2.getClass();
        C109326jp r3 = ((C105916eC) A0B2).A00;
        try {
            C04220Ms.A0B(r8, 0);
            Intent A00 = C61973Wo.A00(C63913ic.A05(r8), A0q, A0q2);
            C63913ic.A0Q(r8, new IDxLListenerShape20S0300000_1_I2(2, (Object) r8, (Object) r5, (Object) r4));
            C10650ih.A0E(A00, C63913ic.A01(r8), 1);
            return null;
        } catch (IllegalArgumentException | NullPointerException unused) {
            C63913ic.A0K(r8, r3, new Object[0]);
            return null;
        }
    }
}
