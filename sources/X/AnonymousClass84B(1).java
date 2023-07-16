package X;

import java.util.Iterator;

/* renamed from: X.84B  reason: invalid class name */
public final class AnonymousClass84B implements Iterator, AnonymousClass0Wi {
    public int A00 = -1;
    public boolean A01;
    public final /* synthetic */ AnonymousClass593 A02;

    public AnonymousClass84B(AnonymousClass593 r2) {
        this.A02 = r2;
    }

    public final boolean hasNext() {
        if (this.A00 + 1 >= this.A02.A03.A01()) {
            return false;
        }
        return true;
    }

    public final void remove() {
        if (this.A01) {
            C002100y r4 = this.A02.A03;
            int i = this.A00;
            ((AnonymousClass7AO) r4.A05(i)).A01 = null;
            Object[] objArr = r4.A03;
            Object obj = objArr[i];
            Object obj2 = C002100y.A04;
            if (obj != obj2) {
                objArr[i] = obj2;
                r4.A01 = true;
            }
            this.A00 = i - 1;
            this.A01 = false;
            return;
        }
        throw C18180wK.A0a("You must call next() before you can remove an element");
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.A01 = true;
            C002100y r1 = this.A02.A03;
            int i = this.A00 + 1;
            this.A00 = i;
            Object A05 = r1.A05(i);
            C04220Ms.A06(A05);
            return A05;
        }
        throw C86154wM.A0u();
    }
}
