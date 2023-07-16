package X;

import java.util.List;

/* renamed from: X.8AK  reason: invalid class name */
public final class AnonymousClass8AK<T> extends AnonymousClass89L<T> {
    public final List A00;

    public final void add(int i, Object obj) {
        List list = this.A00;
        if (AnonymousClass8bH.A02(0, size()).A06(i)) {
            list.add(C86144wL.A0C(this, i), obj);
            return;
        }
        StringBuilder A0s = C18190wL.A0s("Position index ");
        A0s.append(i);
        A0s.append(" must be in range [");
        A0s.append(AnonymousClass8bH.A02(0, size()));
        throw new IndexOutOfBoundsException(C18180wK.A0i("].", A0s));
    }

    public final void clear() {
        this.A00.clear();
    }

    public final Object get(int i) {
        return this.A00.get(AnonymousClass00Z.A0n(this, i));
    }

    public final Object set(int i, Object obj) {
        return this.A00.set(AnonymousClass00Z.A0n(this, i), obj);
    }

    public AnonymousClass8AK(List list) {
        this.A00 = list;
    }
}
