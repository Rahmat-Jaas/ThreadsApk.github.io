package X;

import java.util.List;

/* renamed from: X.7VH  reason: invalid class name */
public final class AnonymousClass7VH implements AnonymousClass8cc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final C120987Dn A0B;
    public final boolean A0C;

    public final C147218oz A00(int i) {
        Object B01 = ((C106736fW) this.A04.get(i)).A01.B01();
        if (B01 instanceof C147218oz) {
            return (C147218oz) B01;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        if (r0 > r7) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009d, code lost:
        if (r1 >= r0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, X.C86164wN.A0o(r4, (X.C146958n9) null, 3), r11.A08, 3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r20 = this;
            r10 = r20
            java.util.List r15 = r10.A04
            int r18 = r15.size()
            r9 = 0
        L_0x0009:
            r0 = r18
            if (r9 >= r0) goto L_0x0108
            java.lang.Object r0 = r15.get(r9)
            X.6fW r0 = (X.C106736fW) r0
            X.7Xy r8 = r0.A01
            int r7 = r10.A09
            boolean r12 = r10.A06
            if (r12 == 0) goto L_0x0104
            int r0 = r8.A00
        L_0x001d:
            int r7 = r7 - r0
            int r0 = r10.A08
            r19 = r0
            X.8oz r0 = r10.A00(r9)
            if (r0 == 0) goto L_0x00fb
            X.7Dn r11 = r10.A0B
            java.lang.Object r1 = r10.A03
            java.lang.Object r0 = r15.get(r9)
            X.6fW r0 = (X.C106736fW) r0
            long r5 = r0.A00
            java.util.Map r0 = r11.A07
            java.lang.Object r1 = r0.get(r1)
            X.6fV r1 = (X.C106726fV) r1
            if (r1 == 0) goto L_0x00aa
            java.util.List r0 = r1.A01
            java.lang.Object r4 = r0.get(r9)
            X.6kG r4 = (X.C109596kG) r4
            X.7JH r0 = r4.A02
            java.lang.Object r0 = X.AnonymousClass7JH.A01(r0)
            X.7Eg r0 = (X.C121127Eg) r0
            long r5 = r0.A00
            long r2 = r1.A00
            r17 = 32
            long r0 = r5 >> r17
            int r13 = (int) r0
            long r0 = r2 >> r17
            int r14 = (int) r0
            int r13 = r13 + r14
            int r0 = X.C86104wH.A08(r5)
            int r16 = X.C86104wH.A08(r2)
            int r0 = r0 + r16
            long r5 = X.AnonymousClass7Hh.A00(r13, r0)
            long r2 = r4.A01
            long r0 = r2 >> r17
            int r13 = (int) r0
            int r13 = r13 + r14
            int r0 = X.C86104wH.A08(r2)
            int r0 = r0 + r16
            long r13 = X.AnonymousClass7Hh.A00(r13, r0)
            X.8pE r0 = r4.A03
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 == 0) goto L_0x00aa
            boolean r2 = r11.A09
            if (r2 == 0) goto L_0x00f6
            int r1 = X.C86104wH.A08(r13)
        L_0x0089:
            if (r1 > r7) goto L_0x0093
            if (r2 == 0) goto L_0x00f1
            int r0 = X.C86104wH.A08(r5)
        L_0x0091:
            if (r0 <= r7) goto L_0x009f
        L_0x0093:
            r0 = r19
            if (r1 < r0) goto L_0x00aa
            if (r2 == 0) goto L_0x00ec
            int r1 = X.C86104wH.A08(r5)
        L_0x009d:
            if (r1 < r0) goto L_0x00aa
        L_0x009f:
            X.4qz r3 = r11.A08
            r2 = 0
            r1 = 3
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r0 = X.C86164wN.A0o(r4, r2, r1)
            X.C25237DiI.A00(r2, r2, r0, r3, r1)
        L_0x00aa:
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x00c2
            int r2 = X.C86104wH.A07(r5)
            if (r12 == 0) goto L_0x00e0
            int r0 = X.C86104wH.A08(r5)
            int r1 = r10.A07
            int r1 = r1 - r0
            int r0 = r8.A00
            int r1 = r1 - r0
        L_0x00be:
            long r5 = X.AnonymousClass7Hh.A00(r2, r1)
        L_0x00c2:
            long r0 = r10.A0A
            long r0 = X.AnonymousClass7Hh.A01(r5, r0)
            if (r12 == 0) goto L_0x00dc
            X.0YY r5 = X.AnonymousClass6ZQ.A01
            r4 = 0
            long r2 = X.C123657Xy.A08(r8)
            long r0 = X.AnonymousClass7Hh.A01(r0, r2)
            r8.A0E(r5, r4, r0)
        L_0x00d8:
            int r9 = r9 + 1
            goto L_0x0009
        L_0x00dc:
            X.C122067Jz.A03(r8, r0)
            goto L_0x00d8
        L_0x00e0:
            int r1 = r10.A07
            int r1 = r1 - r2
            int r0 = r8.A01
            int r2 = r1 - r0
            int r1 = X.C86104wH.A08(r5)
            goto L_0x00be
        L_0x00ec:
            int r1 = X.C86104wH.A07(r5)
            goto L_0x009d
        L_0x00f1:
            int r0 = X.C86104wH.A07(r5)
            goto L_0x0091
        L_0x00f6:
            int r1 = X.C86104wH.A07(r13)
            goto L_0x0089
        L_0x00fb:
            java.lang.Object r0 = r15.get(r9)
            X.6fW r0 = (X.C106736fW) r0
            long r5 = r0.A00
            goto L_0x00aa
        L_0x0104:
            int r0 = r8.A01
            goto L_0x001d
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VH.A01():void");
    }

    public AnonymousClass7VH(C120987Dn r5, Object obj, List list, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z, boolean z2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = i3;
        this.A09 = i4;
        this.A08 = i5;
        this.A06 = z;
        this.A04 = list;
        this.A0B = r5;
        this.A0A = j;
        this.A0C = z2;
        this.A07 = i6;
        int size = list.size();
        boolean z3 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            } else if (A00(i7) != null) {
                z3 = true;
                break;
            } else {
                i7++;
            }
        }
        this.A05 = z3;
    }
}
