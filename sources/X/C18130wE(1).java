package X;

import java.util.Arrays;

/* renamed from: X.0wE  reason: invalid class name and case insensitive filesystem */
public final class C18130wE {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public String A09;
    public boolean A0A;
    public final int[] A0B = new int[3];
    public final int[] A0C = new int[3];
    public final int[] A0D = new int[3];
    public final int[] A0E = new int[3];

    public final void A00(int i, int i2) {
        int[] iArr = this.A0D;
        int[] iArr2 = this.A0E;
        int binarySearch = Arrays.binarySearch(iArr2, i2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        if (binarySearch > 0) {
            System.arraycopy(iArr2, 1, iArr2, 0, binarySearch);
            System.arraycopy(iArr, 1, iArr, 0, binarySearch);
        } else if (binarySearch < 0) {
            return;
        }
        iArr2[binarySearch] = i2;
        iArr[binarySearch] = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C18130wE r4) {
        /*
            r3 = this;
            int r0 = r4.A07
            r3.A07 = r0
            boolean r1 = r3.A0A
            boolean r0 = r4.A0A
            r1 = r1 & r0
            r3.A0A = r1
            int r1 = r3.A04
            int r0 = r4.A04
            int r1 = r1 + r0
            r3.A04 = r1
            int r1 = r3.A03
            int r0 = r4.A03
            int r1 = r1 + r0
            r3.A03 = r1
            int r1 = r3.A02
            int r0 = r4.A02
            int r1 = r1 + r0
            r3.A02 = r1
            int r1 = r3.A05
            int r0 = r4.A05
            int r1 = r1 + r0
            r3.A05 = r1
            int r1 = r3.A01
            if (r1 < 0) goto L_0x0048
            int r0 = r4.A01
            if (r0 < 0) goto L_0x0032
            int r1 = r1 + r0
        L_0x0030:
            r3.A01 = r1
        L_0x0032:
            r2 = 0
        L_0x0033:
            int[] r1 = r4.A0D
            int r0 = r1.length
            if (r2 >= r0) goto L_0x004b
            r1 = r1[r2]
            int[] r0 = r4.A0E
            r0 = r0[r2]
            if (r1 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            r3.A00(r1, r0)
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0048:
            int r1 = r4.A01
            goto L_0x0030
        L_0x004b:
            int r1 = r3.A08
            int r0 = r4.A08
            int r0 = java.lang.Math.max(r1, r0)
            r3.A08 = r0
            int r1 = r3.A06
            int r0 = r4.A06
            int r1 = r1 + r0
            r3.A06 = r1
            int r1 = r3.A00
            int r0 = r4.A00
            int r1 = r1 + r0
            r3.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130wE.A01(X.0wE):void");
    }
}
