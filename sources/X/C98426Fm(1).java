package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.6Fm  reason: invalid class name and case insensitive filesystem */
public final class C98426Fm {
    public static final AnonymousClass7AO A00(AnonymousClass593 r3) {
        Object next;
        C146838mw A08 = AnonymousClass8bL.A08(r3.A04(r3.A00), C138938Ma.A00);
        C04220Ms.A0B(A08, 0);
        Iterator it = A08.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException(AnonymousClass000.A00(728));
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return (AnonymousClass7AO) next;
    }
}
