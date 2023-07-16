package X;

import java.util.ListIterator;

/* renamed from: X.8A8  reason: invalid class name */
public final class AnonymousClass8A8 extends AnonymousClass842 implements ListIterator, C03740Kn {
    public final /* synthetic */ AnonymousClass8AJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8A8(AnonymousClass8AJ r2, int i) {
        super(r2);
        this.A00 = r2;
        C120667By.A01(i, r2.size());
        this.A00 = i;
    }

    public final boolean hasPrevious() {
        return C18180wK.A1X(this.A00);
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final void add(Object obj) {
        throw C18220wO.A0v();
    }

    public final Object previous() {
        if (hasPrevious()) {
            AnonymousClass8AJ r1 = this.A00;
            int i = this.A00 - 1;
            this.A00 = i;
            return r1.get(i);
        }
        throw C86154wM.A0u();
    }

    public final void set(Object obj) {
        throw C18220wO.A0v();
    }
}
