package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5rr  reason: invalid class name */
public final class AnonymousClass5rr extends C115446v5 {
    public final C115446v5 A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;
    public final Set A06;

    public AnonymousClass5rr(C115446v5 r10, AnonymousClass78C r11) {
        HashSet A0u = C18200wM.A0u();
        HashSet A0u2 = C18200wM.A0u();
        HashSet A0u3 = C18200wM.A0u();
        HashSet A0u4 = C18200wM.A0u();
        HashSet A0u5 = C18200wM.A0u();
        for (AnonymousClass79T r2 : r11.A03) {
            boolean A1T = AnonymousClass0wJ.A1T(r2.A00, 2);
            Class cls = r2.A01;
            if (A1T) {
                A0u4.add(cls);
            } else {
                A0u.add(cls);
            }
        }
        Set set = r11.A05;
        if (!set.isEmpty()) {
            A0u.add(AnonymousClass8eW.class);
        }
        this.A01 = Collections.unmodifiableSet(A0u);
        this.A02 = Collections.unmodifiableSet(A0u2);
        this.A06 = Collections.unmodifiableSet(A0u3);
        this.A04 = Collections.unmodifiableSet(A0u4);
        this.A05 = Collections.unmodifiableSet(A0u5);
        this.A03 = set;
        this.A00 = r10;
    }
}
