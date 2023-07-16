package X;

/* renamed from: X.6w7  reason: invalid class name and case insensitive filesystem */
public final class C115916w7 {
    public static final int A00(C147538pV r2) {
        int i = 1;
        if (r2 instanceof C147528pU) {
            i = 3;
        }
        if (r2 instanceof C147418pJ) {
            i |= 4;
        }
        if (r2 instanceof C147408pI) {
            i |= 8;
        }
        if (r2 instanceof C147428pK) {
            i |= 16;
        }
        if ((r2 instanceof C147488pQ) || (r2 instanceof C147498pR)) {
            i |= 32;
        }
        if (r2 instanceof C147438pL) {
            i |= 256;
        }
        if (r2 instanceof C147468pO) {
            i |= 64;
        }
        if ((r2 instanceof C147448pM) || (r2 instanceof C147458pN)) {
            return i | 128;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass7YG r7, int r8) {
        /*
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0115
            r2 = 2
            int r0 = r7.A01
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0028
            boolean r0 = r7 instanceof X.C147768ps
            if (r0 == 0) goto L_0x0028
            X.7Y3 r0 = X.C121847Ik.A01(r7)
            r3 = 0
            r0.A0P(r3)
            if (r8 != r2) goto L_0x0028
            X.54T r1 = X.C121847Ik.A02(r7, r2)
            r0 = 1
            r1.A0D = r0
            X.8mb r0 = r1.A08
            if (r0 == 0) goto L_0x0028
            r0 = 0
            X.AnonymousClass54T.A07(r1, r0, r3)
        L_0x0028:
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r7.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x003b
            boolean r0 = r7 instanceof X.C147668pi
            if (r0 == 0) goto L_0x003b
            X.7Y3 r1 = X.C121847Ik.A01(r7)
            r0 = 0
            r1.A0P(r0)
        L_0x003b:
            int r0 = r7.A01
            r0 = r0 & 4
            if (r0 == 0) goto L_0x004b
            boolean r0 = r7 instanceof X.C147748pq
            if (r0 == 0) goto L_0x004b
            r0 = r7
            X.8pq r0 = (X.C147748pq) r0
            X.C98286Ex.A00(r0)
        L_0x004b:
            int r0 = r7.A01
            r0 = r0 & 8
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7 instanceof X.C147738pp
            if (r0 == 0) goto L_0x005c
            X.8nO r0 = X.C121847Ik.A03(r7)
            r0.CJp()
        L_0x005c:
            int r0 = r7.A01
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0071
            boolean r0 = r7 instanceof X.C147718pn
            if (r0 == 0) goto L_0x0071
            X.7Y3 r0 = X.C121847Ik.A01(r7)
            X.6sU r0 = r0.A0Y
            X.54J r1 = r0.A08
            r0 = 1
            r1.A06 = r0
        L_0x0071:
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = r7.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0081
            boolean r0 = r7 instanceof X.C875353d
            if (r0 == 0) goto L_0x0081
            if (r8 != r2) goto L_0x00e4
            r7.A04()
        L_0x0081:
            r1 = 2048(0x800, float:2.87E-42)
            int r0 = r7.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00fe
            boolean r0 = r7 instanceof X.C147708pm
            if (r0 == 0) goto L_0x00fe
            r4 = r7
            X.8pm r4 = (X.C147708pm) r4
            X.7Ww r1 = X.C123427Ww.A01
            r0 = 0
            X.C123427Ww.A00 = r0
            r4.BgV(r1)
            java.lang.Boolean r0 = X.C123427Ww.A00
            if (r0 == 0) goto L_0x00fe
            if (r8 != r2) goto L_0x00f5
            r6 = 1024(0x400, float:1.435E-42)
            r0 = r4
            X.7YG r0 = (X.AnonymousClass7YG) r0
            X.7YG r5 = r0.A03
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x00ee
            r0 = 16
            X.7YG[] r0 = new X.AnonymousClass7YG[r0]
            X.84X r3 = X.AnonymousClass84X.A01(r0)
            X.7YG r0 = r5.A02
            if (r0 == 0) goto L_0x00c8
            r3.A0C(r0)
        L_0x00b7:
            int r0 = r3.A00
            if (r0 == 0) goto L_0x00fe
            int r0 = r0 + -1
            java.lang.Object r5 = r3.A03(r0)
            X.7YG r5 = (X.AnonymousClass7YG) r5
            int r0 = r5.A00
            r0 = r0 & r6
            if (r0 != 0) goto L_0x00cc
        L_0x00c8:
            X.C121847Ik.A05(r3, r5)
            goto L_0x00b7
        L_0x00cc:
            int r0 = r5.A01
            r0 = r0 & r6
            if (r0 == 0) goto L_0x00df
            boolean r0 = r5 instanceof X.C875353d
            if (r0 == 0) goto L_0x00b7
            X.76Z r1 = X.C123407Wu.A00(r4)
            java.util.Set r0 = r1.A02
            X.AnonymousClass76Z.A00(r1, r5, r0)
            goto L_0x00b7
        L_0x00df:
            X.7YG r5 = r5.A02
            if (r5 == 0) goto L_0x00b7
            goto L_0x00cc
        L_0x00e4:
            X.76Z r1 = X.C123407Wu.A00(r7)
            java.util.Set r0 = r1.A02
            X.AnonymousClass76Z.A00(r1, r7, r0)
            goto L_0x0081
        L_0x00ee:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00f5:
            X.76Z r1 = X.C123407Wu.A00(r7)
            java.util.Set r0 = r1.A01
            X.AnonymousClass76Z.A00(r1, r4, r0)
        L_0x00fe:
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r7.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0114
            boolean r0 = r7 instanceof X.C147698pl
            if (r0 == 0) goto L_0x0114
            if (r8 == r2) goto L_0x0114
            X.76Z r1 = X.C123407Wu.A00(r7)
            java.util.Set r0 = r1.A00
            X.AnonymousClass76Z.A00(r1, r7, r0)
        L_0x0114:
            return
        L_0x0115:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115916w7.A01(X.7YG, int):void");
    }
}
