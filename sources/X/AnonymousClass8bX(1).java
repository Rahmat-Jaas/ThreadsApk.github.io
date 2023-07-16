package X;

import java.util.ListIterator;

/* renamed from: X.8bX  reason: invalid class name */
public final class AnonymousClass8bX<E> extends AnonymousClass8AI<E> implements C148878sK<E> {
    public final int A00;
    public final int A01;
    public final Object[] A02;
    public final Object[] A03;

    public AnonymousClass8bX(Object[] objArr, Object[] objArr2, int i, int i2) {
        C04220Ms.A0B(objArr2, 2);
        this.A02 = objArr;
        this.A03 = objArr2;
        this.A01 = i;
        this.A00 = i2;
        if (size() > 32) {
            size();
            size();
            return;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0J("Trie-based persistent vector should have at least 33 elements, got ", size()));
    }

    public final Object get(int i) {
        Object[] objArr;
        AnonymousClass7C1.A00(i, size());
        if (((size() - 1) & -32) <= i) {
            objArr = this.A03;
        } else {
            objArr = this.A02;
            int i2 = this.A00;
            while (i2 > 0) {
                Object obj = objArr[(i >> i2) & 31];
                if (obj != null) {
                    objArr = (Object[]) obj;
                    i2 -= 5;
                } else {
                    throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        return objArr[i & 31];
    }

    public final ListIterator listIterator(int i) {
        AnonymousClass7C1.A01(i, size());
        return new AnonymousClass8bT(this.A02, this.A03, i, size(), (this.A00 / 5) + 1);
    }
}
