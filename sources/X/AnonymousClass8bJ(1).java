package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8bJ  reason: invalid class name */
public final class AnonymousClass8bJ extends AnonymousClass8bK {
    public static final C146838mw A06(C146838mw r3) {
        return new C1371386g(C80624m2.A00, r3, false);
    }

    public static final List A01(C146838mw r0) {
        return C06750aI.A16(A02(r0));
    }

    public static final List A02(C146838mw r3) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object add : r3) {
            A0v.add(add);
        }
        return A0v;
    }

    public static final C146838mw A03(AnonymousClass0YY r2, C146838mw r3) {
        return new C1371386g(r2, r3, AnonymousClass0wJ.A1Z(r3, r2));
    }

    public static final C146838mw A04(AnonymousClass0YY r1, C146838mw r2) {
        AnonymousClass0wJ.A1N(r2, r1);
        return new C1371286f(r1, r2);
    }

    public static final C146838mw A05(AnonymousClass0YY r1, C146838mw r2) {
        AnonymousClass0wJ.A1N(r2, r1);
        return A06(new C1371286f(r1, r2));
    }
}
