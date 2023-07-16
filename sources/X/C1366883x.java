package X;

import android.content.Context;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.83x  reason: invalid class name and case insensitive filesystem */
public final class C1366883x implements Iterator, Iterable {
    public int A00 = -1;
    public int A01 = 0;
    public final Context A02;
    public final Object A03 = C86144wL.A0d();
    public final int[] A04;

    public final Iterator iterator() {
        this.A00 = 0;
        return this;
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A01, this.A04.length);
    }

    public final Object next() {
        int i = this.A01;
        int[] iArr = this.A04;
        if (i != iArr.length) {
            this.A01 = i + 1;
            this.A00 = iArr[i];
            return this;
        }
        throw new NoSuchElementException("There were no registered Plugins for this Socket/PluginList combination.");
    }

    public C1366883x(Context context) {
        this.A02 = context;
        this.A04 = new int[0];
    }

    public final void remove() {
        throw C18240wQ.A0j();
    }
}
