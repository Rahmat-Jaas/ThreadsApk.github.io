package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.53Q  reason: invalid class name */
public final class AnonymousClass53Q extends C115196uf implements Iterator, AnonymousClass0Wi {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53Q(AnonymousClass84T r2, Iterator it) {
        super(r2, it);
        C04220Ms.A0B(it, 2);
    }

    public final Object next() {
        Map.Entry entry = this.A02;
        if (entry != null) {
            A00();
            return entry.getValue();
        }
        throw new IllegalStateException();
    }
}
