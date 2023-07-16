package X;

import java.util.Iterator;

/* renamed from: X.849  reason: invalid class name */
public final class AnonymousClass849 implements Iterator, C03740Kn {
    public int A00 = -1;
    public AnonymousClass8bH A01;
    public int A02;
    public int A03;
    public int A04;
    public final /* synthetic */ C1371486h A05;

    public AnonymousClass849(C1371486h r3) {
        this.A05 = r3;
        int A022 = AnonymousClass8bI.A02(0, 0, r3.A01.length());
        this.A03 = A022;
        this.A04 = A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 < r1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r8 = this;
            int r7 = r8.A04
            r5 = 0
            if (r7 >= 0) goto L_0x000b
            r8.A00 = r5
            r0 = 0
            r8.A01 = r0
            return
        L_0x000b:
            X.86h r6 = r8.A05
            int r1 = r6.A00
            r2 = -1
            r3 = 1
            if (r1 <= 0) goto L_0x001b
            int r0 = r8.A02
            int r0 = r0 + 1
            r8.A02 = r0
            if (r0 >= r1) goto L_0x004f
        L_0x001b:
            java.lang.CharSequence r4 = r6.A01
            int r0 = r4.length()
            if (r7 > r0) goto L_0x004f
            X.0YP r1 = r6.A02
            int r0 = r8.A04
            java.lang.Object r1 = X.C86164wN.A0a(r4, r1, r0)
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L_0x004f
            java.lang.Object r0 = r1.A00
            int r2 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r1.A01
            int r1 = X.AnonymousClass0wJ.A04(r0)
            int r0 = r8.A03
            X.8bH r0 = X.AnonymousClass8bI.A0C(r0, r2)
            r8.A01 = r0
            int r2 = r2 + r1
            r8.A03 = r2
            if (r1 != 0) goto L_0x0049
            r5 = 1
        L_0x0049:
            int r2 = r2 + r5
        L_0x004a:
            r8.A04 = r2
            r8.A00 = r3
            return
        L_0x004f:
            int r1 = r8.A03
            java.lang.CharSequence r0 = r6.A01
            int r0 = r0.length()
            int r0 = r0 + -1
            X.8bH r0 = X.AnonymousClass8bH.A02(r1, r0)
            r8.A01 = r0
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass849.A00():void");
    }

    public final boolean hasNext() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 1) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 0) {
            AnonymousClass8bH r1 = this.A01;
            C04220Ms.A0C(r1, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.A01 = null;
            this.A00 = -1;
            return r1;
        }
        throw C86154wM.A0u();
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
