package X;

import java.util.ListIterator;

/* renamed from: X.84L  reason: invalid class name */
public abstract class AnonymousClass84L implements ListIterator, C03740Kn {
    public int A00;
    public int A01;

    public final void add(Object obj) {
        if (this instanceof AnonymousClass8bV) {
            AnonymousClass8bV r2 = (AnonymousClass8bV) this;
            AnonymousClass8bV.A00(r2);
            AnonymousClass8AO r1 = r2.A03;
            r1.add(r2.A00, obj);
            r2.A00++;
            r2.A01 = r1.size();
            r2.A00 = r1.A0Q();
            r2.A01 = -1;
            AnonymousClass8bV.A01(r2);
            return;
        }
        throw C18220wO.A0v();
    }

    public final boolean hasNext() {
        return C18230wP.A1W(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return C18180wK.A1X(this.A00);
    }

    public final Object next() {
        if (this instanceof AnonymousClass8bU) {
            AnonymousClass8bU r6 = (AnonymousClass8bU) this;
            if (r6.hasNext()) {
                int i = r6.A00;
                int i2 = i & 31;
                Object[] objArr = r6.A02;
                int i3 = r6.A00 - 1;
                Object obj = objArr[i3];
                if (obj != null) {
                    Object obj2 = ((Object[]) obj)[i2];
                    int i4 = i + 1;
                    r6.A00 = i4;
                    if (i4 == r6.A01) {
                        r6.A01 = true;
                    } else {
                        int i5 = 0;
                        while (((i4 >> i5) & 31) == 0) {
                            i5 += 5;
                        }
                        if (i5 > 0) {
                            AnonymousClass8bU.A00(r6, i4, (i3 - (i5 / 5)) + 1);
                            return obj2;
                        }
                    }
                    return obj2;
                }
                throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<E>");
            }
            throw C86154wM.A0u();
        } else if (this instanceof AnonymousClass8bS) {
            AnonymousClass8bS r1 = (AnonymousClass8bS) this;
            if (r1.hasNext()) {
                r1.A00++;
                return r1.A00;
            }
            throw C86154wM.A0u();
        } else if (this instanceof AnonymousClass8bV) {
            AnonymousClass8bV r4 = (AnonymousClass8bV) this;
            AnonymousClass8bV.A00(r4);
            if (r4.hasNext()) {
                int i6 = r4.A00;
                r4.A01 = i6;
                AnonymousClass8bU r2 = r4.A02;
                if (r2 == null) {
                    Object[] objArr2 = r4.A03.A04;
                    r4.A00 = i6 + 1;
                    return objArr2[i6];
                } else if (r2.hasNext()) {
                    r4.A00 = i6 + 1;
                    return r2.next();
                } else {
                    Object[] objArr3 = r4.A03.A04;
                    r4.A00 = i6 + 1;
                    return objArr3[i6 - r2.A01];
                }
            } else {
                throw C86154wM.A0u();
            }
        } else if (this instanceof AnonymousClass8bT) {
            AnonymousClass8bT r42 = (AnonymousClass8bT) this;
            if (r42.hasNext()) {
                AnonymousClass8bU r3 = r42.A00;
                if (r3.hasNext()) {
                    r42.A00++;
                    return r3.next();
                }
                Object[] objArr4 = r42.A01;
                int i7 = r42.A00;
                r42.A00 = i7 + 1;
                return objArr4[i7 - r3.A01];
            }
            throw C86154wM.A0u();
        } else {
            AnonymousClass8bR r32 = (AnonymousClass8bR) this;
            if (r32.hasNext()) {
                Object[] objArr5 = r32.A00;
                int i8 = r32.A00;
                r32.A00 = i8 + 1;
                return objArr5[i8];
            }
            throw C86154wM.A0u();
        }
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final void remove() {
        if (this instanceof AnonymousClass8bV) {
            AnonymousClass8bV r4 = (AnonymousClass8bV) this;
            AnonymousClass8bV.A00(r4);
            int i = r4.A01;
            if (i != -1) {
                AnonymousClass8AO r2 = r4.A03;
                r2.remove(i);
                int i2 = r4.A01;
                if (i2 < r4.A00) {
                    r4.A00 = i2;
                }
                r4.A01 = r2.size();
                r4.A00 = r2.A0Q();
                r4.A01 = -1;
                AnonymousClass8bV.A01(r4);
                return;
            }
            throw new IllegalStateException();
        }
        throw C18220wO.A0v();
    }

    public final void set(Object obj) {
        if (this instanceof AnonymousClass8bV) {
            AnonymousClass8bV r2 = (AnonymousClass8bV) this;
            AnonymousClass8bV.A00(r2);
            int i = r2.A01;
            if (i != -1) {
                AnonymousClass8AO r0 = r2.A03;
                r0.set(i, obj);
                r2.A00 = r0.A0Q();
                AnonymousClass8bV.A01(r2);
                return;
            }
            throw new IllegalStateException();
        }
        throw C18220wO.A0v();
    }

    public AnonymousClass84L(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
