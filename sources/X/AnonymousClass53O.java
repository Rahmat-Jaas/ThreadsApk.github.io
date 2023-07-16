package X;

import java.util.Iterator;

/* renamed from: X.53O  reason: invalid class name */
public final class AnonymousClass53O extends C115196uf implements Iterator, AnonymousClass0Wi {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53O(AnonymousClass84T r2, Iterator it) {
        super(r2, it);
        C04220Ms.A0B(it, 2);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        A00();
        if (this.A01 != null) {
            return new AnonymousClass84S(this);
        }
        throw new IllegalStateException();
    }
}
