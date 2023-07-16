package X;

import java.util.Iterator;

/* renamed from: X.8mw  reason: invalid class name and case insensitive filesystem */
public interface C146838mw {
    Iterator iterator();

    static Object A00(AnonymousClass0YY r0, C146838mw r1) {
        Iterator it = AnonymousClass8bJ.A05(r0, r1).iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }
}
