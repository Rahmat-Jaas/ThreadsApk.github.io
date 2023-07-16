package X;

import java.util.ListIterator;

/* renamed from: X.84K  reason: invalid class name */
public abstract class AnonymousClass84K implements ListIterator, C03740Kn {
    public int A00;
    public int A01;

    public final void add(Object obj) {
        if (this instanceof AnonymousClass539) {
            AnonymousClass539 r2 = (AnonymousClass539) this;
            AnonymousClass539.A00(r2);
            AnonymousClass8AM r1 = r2.A03;
            r1.add(r2.A00, obj);
            r2.A00++;
            r2.A01 = r1.size();
            r2.A00 = r1.A0Q();
            r2.A01 = -1;
            AnonymousClass539.A01(r2);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.537} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.539} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.537} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.537} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object next() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass538
            if (r0 == 0) goto L_0x004f
            r5 = r6
            X.538 r5 = (X.AnonymousClass538) r5
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004a
            int r0 = r5.A00
            r2 = r0 & 31
            java.lang.Object[] r1 = r5.A02
            int r0 = r5.A00
            int r0 = r0 + -1
            r1 = r1[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>"
            X.C04220Ms.A0C(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r4 = r1[r2]
            int r0 = r5.A00
            r1 = 1
            int r3 = r0 + 1
            r5.A00 = r3
            int r0 = r5.A01
            if (r3 != r0) goto L_0x0030
            r5.A01 = r1
        L_0x002f:
            return r4
        L_0x0030:
            r1 = 0
            r2 = 0
        L_0x0032:
            int r0 = r3 >> r2
            r0 = r0 & 31
            if (r0 != r1) goto L_0x003b
            int r2 = r2 + 5
            goto L_0x0032
        L_0x003b:
            if (r2 <= 0) goto L_0x002f
            int r0 = r5.A00
            int r1 = r0 + -1
            int r0 = r2 / 5
            int r1 = r1 - r0
            int r0 = r1 + 1
            X.AnonymousClass538.A00(r5, r3, r0)
            return r4
        L_0x004a:
            java.util.NoSuchElementException r0 = X.C86154wM.A0u()
            throw r0
        L_0x004f:
            boolean r0 = r6 instanceof X.AnonymousClass536
            if (r0 == 0) goto L_0x006a
            r1 = r6
            X.536 r1 = (X.AnonymousClass536) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0065
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            java.lang.Object r4 = r1.A00
            return r4
        L_0x0065:
            java.util.NoSuchElementException r0 = X.C86154wM.A0u()
            throw r0
        L_0x006a:
            boolean r0 = r6 instanceof X.AnonymousClass539
            if (r0 == 0) goto L_0x00a6
            r4 = r6
            X.539 r4 = (X.AnonymousClass539) r4
            X.AnonymousClass539.A00(r4)
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a1
            int r3 = r4.A00
            r4.A01 = r3
            X.538 r2 = r4.A02
            if (r2 != 0) goto L_0x008d
            X.8AM r0 = r4.A03
            java.lang.Object[] r1 = r0.A04
            int r0 = r3 + 1
            r4.A00 = r0
            r4 = r1[r3]
            return r4
        L_0x008d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009c
            int r0 = r3 + 1
            r4.A00 = r0
            java.lang.Object r4 = r2.next()
            return r4
        L_0x009c:
            X.8AM r0 = r4.A03
            java.lang.Object[] r1 = r0.A04
            goto L_0x00ca
        L_0x00a1:
            java.util.NoSuchElementException r0 = X.C86154wM.A0u()
            throw r0
        L_0x00a6:
            boolean r0 = r6 instanceof X.AnonymousClass537
            if (r0 == 0) goto L_0x00d9
            r4 = r6
            X.537 r4 = (X.AnonymousClass537) r4
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d4
            X.538 r2 = r4.A00
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c6
            int r0 = r4.A00
            int r0 = r0 + 1
            r4.A00 = r0
            java.lang.Object r4 = r2.next()
            return r4
        L_0x00c6:
            java.lang.Object[] r1 = r4.A01
            int r3 = r4.A00
        L_0x00ca:
            int r0 = r3 + 1
            r4.A00 = r0
            int r0 = r2.A01
            int r3 = r3 - r0
            r4 = r1[r3]
            return r4
        L_0x00d4:
            java.util.NoSuchElementException r0 = X.C86154wM.A0u()
            throw r0
        L_0x00d9:
            r3 = r6
            X.535 r3 = (X.AnonymousClass535) r3
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object[] r2 = r3.A00
            int r1 = r3.A00
            int r0 = r1 + 1
            r3.A00 = r0
            r4 = r2[r1]
            return r4
        L_0x00ed:
            java.util.NoSuchElementException r0 = X.C86154wM.A0u()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass84K.next():java.lang.Object");
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final void remove() {
        if (this instanceof AnonymousClass539) {
            AnonymousClass539 r4 = (AnonymousClass539) this;
            AnonymousClass539.A00(r4);
            int i = r4.A01;
            if (i != -1) {
                AnonymousClass8AM r2 = r4.A03;
                r2.remove(i);
                int i2 = r4.A01;
                if (i2 < r4.A00) {
                    r4.A00 = i2;
                }
                r4.A01 = r2.size();
                r4.A00 = r2.A0Q();
                r4.A01 = -1;
                AnonymousClass539.A01(r4);
                return;
            }
            throw new IllegalStateException();
        }
        throw C18220wO.A0v();
    }

    public final void set(Object obj) {
        if (this instanceof AnonymousClass539) {
            AnonymousClass539 r2 = (AnonymousClass539) this;
            AnonymousClass539.A00(r2);
            int i = r2.A01;
            if (i != -1) {
                AnonymousClass8AM r0 = r2.A03;
                r0.set(i, obj);
                r2.A00 = r0.A0Q();
                AnonymousClass539.A01(r2);
                return;
            }
            throw new IllegalStateException();
        }
        throw C18220wO.A0v();
    }

    public AnonymousClass84K(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
