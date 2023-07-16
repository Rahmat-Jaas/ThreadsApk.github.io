package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0kN  reason: invalid class name and case insensitive filesystem */
public final class C11540kN implements Iterator {
    public int A00;
    public final /* synthetic */ C15680ri A01;

    public C11540kN(C15680ri r1) {
        this.A01 = r1;
    }

    public final boolean hasNext() {
        if (this.A00 < this.A01.A00.A00) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C11590kS r4 = this.A01.A00;
        int i = this.A00;
        int i2 = i << 1;
        C11590kS.A00(r4, i, i2);
        ArrayList arrayList = r4.A01;
        Object obj = arrayList.get(i2);
        int i3 = this.A00;
        this.A00 = i3 + 1;
        int i4 = (i3 << 1) + 1;
        C11590kS.A00(r4, i3, i4);
        return new Pair(obj, arrayList.get(i4));
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported");
    }
}
