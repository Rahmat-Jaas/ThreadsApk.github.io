package X;

import java.io.File;
import java.util.Iterator;

/* renamed from: X.0AK  reason: invalid class name */
public final class AnonymousClass0AK implements Iterator {
    public final /* synthetic */ AnonymousClass0U1 A00;
    public final /* synthetic */ Iterator A01;

    public AnonymousClass0AK(AnonymousClass0U1 r1, Iterator it) {
        this.A00 = r1;
        this.A01 = it;
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.A01((File) this.A01.next());
    }

    public final void remove() {
        this.A01.remove();
    }
}
