package X;

import android.os.Bundle;
import com.facebook.redex.IDxEListenerShape312S0200000_1_I2;

/* renamed from: X.2IG  reason: invalid class name */
public final class AnonymousClass2IG {
    public static Object A00(AnonymousClass601 r9, C63893iY r10) {
        Object A0B = C63893iY.A0B(r10, 0);
        A0B.getClass();
        C127397h3 r3 = (C127397h3) A0B;
        String A0O = r3.A0O(35, "");
        C109326jp A0L = r3.A0L(40);
        C04220Ms.A0B(r9, 0);
        C25786Drz A0Q = C18180wK.A0Q(C63913ic.A05(r9), C63913ic.A0J(r9));
        C62883b4.A03();
        String A0O2 = r3.A0O(36, "");
        String A0O3 = r3.A0O(38, "");
        IDxEListenerShape312S0200000_1_I2 iDxEListenerShape312S0200000_1_I2 = new IDxEListenerShape312S0200000_1_I2(r9, A0L, 1);
        C04220Ms.A0B(A0O2, 0);
        AnonymousClass0wJ.A1M(A0O3, 1, A0O);
        Bundle A06 = C18180wK.A06();
        A06.putString("media_id", A0O2);
        C18210wN.A0x(A06, A0O);
        A06.putString("page_id", A0O3);
        C34586IbF ibF = new C34586IbF();
        ibF.setArguments(A06);
        ibF.A00 = iDxEListenerShape312S0200000_1_I2;
        A0Q.A03 = ibF;
        A0Q.A05();
        return null;
    }
}
