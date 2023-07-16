package X;

import java.util.Iterator;

/* renamed from: X.845  reason: invalid class name */
public final class AnonymousClass845 implements Iterator, C03740Kn {
    public boolean A00;
    public final C41882MfV A01;
    public final Iterator A02;

    public final boolean hasNext() {
        if ((this.A01 == null || this.A00) && !this.A02.hasNext()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C41882MfV mfV = this.A01;
        if (mfV == null || this.A00) {
            return this.A02.next();
        }
        this.A00 = true;
        return mfV;
    }

    public AnonymousClass845(C41882MfV mfV, Iterator it) {
        this.A01 = mfV;
        this.A02 = it;
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
