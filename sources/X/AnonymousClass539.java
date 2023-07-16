package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.539  reason: invalid class name */
public final class AnonymousClass539 extends AnonymousClass84K implements ListIterator, AnonymousClass0Wi {
    public int A00;
    public int A01 = -1;
    public AnonymousClass538 A02;
    public final AnonymousClass8AM A03;

    public static final void A00(AnonymousClass539 r2) {
        if (r2.A00 != r2.A03.A0Q()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass539 r8) {
        /*
            X.8AM r1 = r8.A03
            java.lang.Object[] r7 = r1.A03
            if (r7 != 0) goto L_0x000a
            r0 = 0
        L_0x0007:
            r8.A02 = r0
            return
        L_0x000a:
            int r0 = X.C86164wN.A05(r1)
            r6 = r0 & -32
            int r5 = r8.A00
            if (r5 <= r6) goto L_0x0015
            r5 = r6
        L_0x0015:
            int r0 = r1.A00
            int r0 = r0 / 5
            int r1 = r0 + 1
            X.538 r4 = r8.A02
            if (r4 != 0) goto L_0x0025
            X.538 r0 = new X.538
            r0.<init>(r7, r5, r6, r1)
            goto L_0x0007
        L_0x0025:
            r3 = 0
            r4.A00 = r5
            r4.A01 = r6
            r4.A00 = r1
            java.lang.Object[] r2 = r4.A02
            int r0 = r2.length
            if (r0 >= r1) goto L_0x0035
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r4.A02 = r2
        L_0x0035:
            r1 = 0
            r2[r3] = r7
            r0 = 1
            if (r5 != r6) goto L_0x003c
            r1 = 1
        L_0x003c:
            r4.A01 = r1
            int r5 = r5 - r1
            X.AnonymousClass538.A00(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass539.A01(X.539):void");
    }

    public AnonymousClass539(AnonymousClass8AM r2, int i) {
        super(i, r2.size());
        this.A03 = r2;
        this.A00 = r2.A0Q();
        A01(this);
    }

    public final Object previous() {
        Object[] objArr;
        A00(this);
        if (hasPrevious()) {
            int i = this.A00;
            int i2 = i - 1;
            this.A01 = i2;
            AnonymousClass538 r0 = this.A02;
            if (r0 == null) {
                objArr = this.A03.A04;
                this.A00 = i2;
            } else {
                int i3 = r0.A01;
                if (i > i3) {
                    objArr = this.A03.A04;
                    this.A00 = i2;
                    i2 -= i3;
                } else {
                    this.A00 = i2;
                    return r0.previous();
                }
            }
            return objArr[i2];
        }
        throw C86154wM.A0u();
    }
}
