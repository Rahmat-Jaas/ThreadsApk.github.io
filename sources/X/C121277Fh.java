package X;

import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebook.redex.IDxObserverShape99S0200000_2_I2;
import java.util.List;

/* renamed from: X.7Fh  reason: invalid class name and case insensitive filesystem */
public final class C121277Fh {
    public static final void A01(AnonymousClass066 r2, M5J m5j, C143158gC r4) {
        C04220Ms.A0B(r4, 2);
        IDxObserverShape99S0200000_2_I2 iDxObserverShape99S0200000_2_I2 = new IDxObserverShape99S0200000_2_I2(m5j, r4, 33);
        if (r2 == null) {
            m5j.A0E(iDxObserverShape99S0200000_2_I2);
        } else {
            m5j.A0C(r2, iDxObserverShape99S0200000_2_I2);
        }
    }

    public static final void A03(M5J m5j, C143158gC r3) {
        C04220Ms.A0B(m5j, 0);
        m5j.A0E(new IDxObserverShape99S0200000_2_I2(m5j, r3, 32));
    }

    public static final M5J A00(List list) {
        C880756q A01 = C880756q.A01();
        if (list.isEmpty()) {
            AnonymousClass7JD.A02(A01, C18180wK.A0Y());
        } else {
            AnonymousClass0MZ r5 = new AnonymousClass0MZ();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A02((M5J) list.get(i), A01, new IDxObserverShape55S0300000_2_I2(24, (Object) A01, (Object) list, (Object) r5));
            }
        }
        return A01;
    }

    public static final void A02(M5J m5j, C880756q r3, C143158gC r4) {
        AnonymousClass0wJ.A1N(r3, m5j);
        r3.A0K(m5j, new IDxObserverShape55S0300000_2_I2(23, (Object) r3, (Object) m5j, (Object) r4));
    }
}
