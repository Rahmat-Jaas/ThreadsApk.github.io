package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2zx  reason: invalid class name and case insensitive filesystem */
public final class C54752zx {
    public static C15780rs A00() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (AnonymousClass258 r3 : C549631c.A00) {
            C15460rM r2 = r3.A00;
            HashSet A0u = C18200wM.A0u();
            if (A0y.get(r2) == null) {
                A0y.put(r2, A0u);
            }
            if (A0y.get(r2) != null) {
                ((Set) A0y.get(r2)).add(r3.A02);
            }
        }
        return new C15780rs(A0y);
    }
}
