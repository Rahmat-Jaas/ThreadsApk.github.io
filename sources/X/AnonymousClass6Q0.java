package X;

import java.util.List;

/* renamed from: X.6Q0  reason: invalid class name */
public final class AnonymousClass6Q0 {
    public static void A00(AnonymousClass3HX r3, C127397h3 r4, List list) {
        String valueOf;
        if (list != null && !list.isEmpty()) {
            for (Object next : list) {
                if (next == null) {
                    valueOf = null;
                } else if (next instanceof String) {
                    valueOf = (String) next;
                } else {
                    valueOf = String.valueOf(next);
                }
                C127397h3 A00 = AnonymousClass7r5.A00(r4, valueOf);
                if (A00 != null && A00.A0J(r3) != null) {
                    A00.A0J(r3).setAccessibilityTraversalAfter(-1);
                } else {
                    return;
                }
            }
        }
    }
}
