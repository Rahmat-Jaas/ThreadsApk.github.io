package X;

/* renamed from: X.6ED  reason: invalid class name */
public final class AnonymousClass6ED {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r14.ACX(r12) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r14, androidx.compose.ui.Modifier r15, float r16, float r17, int r18, int r19, long r20) {
        /*
            r9 = r17
            r8 = r16
            r12 = r20
            r7 = r15
            r0 = -1249392198(0xffffffffb587c9ba, float:-1.0116994E-6)
            r14.Cvd(r0)
            r11 = r19
            r3 = r19 & 1
            r10 = r18
            if (r3 == 0) goto L_0x00e5
            r1 = r18 | 6
        L_0x0017:
            r0 = r18 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x002a
            r0 = r19 & 2
            if (r0 != 0) goto L_0x0027
            boolean r2 = r14.ACX(r12)
            r0 = 32
            if (r2 != 0) goto L_0x0029
        L_0x0027:
            r0 = 16
        L_0x0029:
            r1 = r1 | r0
        L_0x002a:
            r6 = r19 & 4
            if (r6 == 0) goto L_0x00d6
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0030:
            r5 = r19 & 8
            if (r5 == 0) goto L_0x00cb
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0036:
            r1 = r1 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x0054
            boolean r0 = r14.BCM()
            if (r0 == 0) goto L_0x0054
            r14.CuJ()
        L_0x0045:
            X.8nW r0 = r14.AKE()
            if (r0 == 0) goto L_0x0053
            X.8RU r6 = new X.8RU
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AnonymousClass7WO.A00(r0, r6)
        L_0x0053:
            return
        L_0x0054:
            r14.CvD()
            r0 = r18 & 1
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r14.Acj()
            if (r0 != 0) goto L_0x00ab
            r14.CuJ()
        L_0x0066:
            r14.AKA()
            r3 = 0
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            if (r1 == 0) goto L_0x0075
            float r1 = (float) r2
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7K4.A05(r0, r9, r1, r1, r1)
        L_0x0075:
            r1 = 1228914189(0x493fbe0d, float:785376.8)
            r14.Cvb(r1)
            int r1 = java.lang.Float.compare(r8, r3)
            boolean r1 = X.C18180wK.A1W(r1)
            if (r1 == 0) goto L_0x00a9
            r3 = 1065353216(0x3f800000, float:1.0)
            X.8nV r1 = X.C147188nY.A0j(r14)
            float r1 = X.C147168nV.A00(r1, r3)
        L_0x008f:
            X.AnonymousClass7W3.A0z(r14, r2)
            androidx.compose.ui.Modifier r0 = r7.Cx6(r0)
            X.C04220Ms.A0B(r0, r2)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.Modifier.A04(r0)
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7Kq.A08(r0, r1)
            androidx.compose.ui.Modifier r0 = X.C115656vh.A00(r0, r12)
            X.C120767Cj.A01(r14, r0, r2)
            goto L_0x0045
        L_0x00a9:
            r1 = r8
            goto L_0x008f
        L_0x00ab:
            if (r3 == 0) goto L_0x00af
            X.7Wm r7 = androidx.compose.ui.Modifier.A00
        L_0x00af:
            r0 = r19 & 2
            if (r0 == 0) goto L_0x00c4
            X.78O r0 = X.C147188nY.A0X(r14)
            X.8pE r0 = r0.A07
            long r0 = X.C86114wI.A0A(r0)
            r3 = 1039516303(0x3df5c28f, float:0.12)
            long r12 = X.C121657He.A04(X.C86154wM.A0G(r0), X.AnonymousClass7KE.A03(r0), X.AnonymousClass7KE.A02(r0), X.AnonymousClass7KE.A01(r0), r3)
        L_0x00c4:
            if (r6 == 0) goto L_0x00c7
            float r8 = (float) r4
        L_0x00c7:
            if (r5 == 0) goto L_0x0066
            float r9 = (float) r2
            goto L_0x0066
        L_0x00cb:
            r0 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0036
            int r0 = X.C147188nY.A02(r14, r9)
            r1 = r1 | r0
            goto L_0x0036
        L_0x00d6:
            r0 = r10 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0030
            boolean r0 = r14.ACV(r8)
            int r0 = X.C86124wJ.A06(r0)
            r1 = r1 | r0
            goto L_0x0030
        L_0x00e5:
            r0 = r18 & 14
            if (r0 != 0) goto L_0x00f1
            int r1 = X.C147188nY.A0F(r14, r15)
            r1 = r1 | r18
            goto L_0x0017
        L_0x00f1:
            r1 = r10
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ED.A00(X.8nY, androidx.compose.ui.Modifier, float, float, int, int, long):void");
    }
}
