package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6uf  reason: invalid class name and case insensitive filesystem */
public abstract class C115196uf {
    public int A00;
    public Map.Entry A01;
    public Map.Entry A02;
    public final AnonymousClass84T A03;
    public final Iterator A04;

    public final void A00() {
        Map.Entry entry;
        this.A01 = this.A02;
        Iterator it = this.A04;
        if (it.hasNext()) {
            entry = C18180wK.A0o(it);
        } else {
            entry = null;
        }
        this.A02 = entry;
    }

    public final boolean hasNext() {
        return AnonymousClass0wJ.A1W(this.A02);
    }

    public final void remove() {
        AnonymousClass84T r2 = this.A03;
        if (r2.A00().A00 == this.A00) {
            Map.Entry entry = this.A01;
            if (entry != null) {
                r2.remove(entry.getKey());
                this.A01 = null;
                this.A00 = r2.A00().A00;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    public C115196uf(AnonymousClass84T r2, Iterator it) {
        this.A03 = r2;
        this.A04 = it;
        this.A00 = r2.A00().A00;
        A00();
    }
}
