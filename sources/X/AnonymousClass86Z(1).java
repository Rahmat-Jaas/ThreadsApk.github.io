package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.86Z  reason: invalid class name */
public final class AnonymousClass86Z implements C146838mw {
    public final AtomicReference A00;

    public final Iterator iterator() {
        C146838mw r0 = (C146838mw) this.A00.getAndSet((Object) null);
        if (r0 != null) {
            return r0.iterator();
        }
        throw C18180wK.A0a("This sequence can be consumed only once.");
    }

    public AnonymousClass86Z(C146838mw r2) {
        this.A00 = new AtomicReference(r2);
    }
}
