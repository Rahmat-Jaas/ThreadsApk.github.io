package X;

import java.util.Iterator;

/* renamed from: X.7r2  reason: invalid class name */
public final class AnonymousClass7r2 implements C144588ik {
    public final C144588ik A00;

    public AnonymousClass7r2(C144588ik r1) {
        this.A00 = r1;
    }

    public final boolean Cx4(C127397h3 r9) {
        AnonymousClass7H4 r0 = AnonymousClass794.A00().A02;
        int i = r9.A03;
        int[] A01 = r0.A01(i);
        for (int A0Q : A01) {
            Iterator it = r9.A0Q(A0Q).iterator();
            while (it.hasNext()) {
                C127397h3 A0V = C86144wL.A0V(it);
                if (A0V != null && this.A00.Cx4(A0V)) {
                    return true;
                }
            }
        }
        int[] A02 = AnonymousClass794.A00().A02.A02(i);
        for (int A0K : A02) {
            C127397h3 A0K2 = r9.A0K(A0K);
            if (A0K2 != null && this.A00.Cx4(A0K2)) {
                return true;
            }
        }
        return false;
    }
}
