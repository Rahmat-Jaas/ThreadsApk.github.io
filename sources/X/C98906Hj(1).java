package X;

/* renamed from: X.6Hj  reason: invalid class name and case insensitive filesystem */
public final class C98906Hj {
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A00(java.util.List r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        /*
            r1 = 1
            r9 = 0
            r22 = 0
            r21 = 1
            if (r29 != 0) goto L_0x000c
            r22 = 1
            r21 = 0
        L_0x000c:
            int r10 = android.view.View.MeasureSpec.getMode(r24)
            int r8 = android.view.View.MeasureSpec.getMode(r25)
            r0 = 2
            int[] r6 = new int[r0]
            r6 = {-1, -1} // fill-array
            int r7 = android.view.View.MeasureSpec.getSize(r24)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x0024
            r6[r9] = r7
        L_0x0024:
            int r5 = android.view.View.MeasureSpec.getSize(r25)
            if (r8 != r0) goto L_0x002c
            r6[r1] = r5
        L_0x002c:
            if (r10 != r0) goto L_0x0031
            if (r8 != r0) goto L_0x0031
        L_0x0030:
            return r6
        L_0x0031:
            r20 = 0
            r19 = 0
            r18 = 0
            if (r22 == 0) goto L_0x003f
            r20 = r26
            r19 = r27
            r18 = r28
        L_0x003f:
            r17 = 0
            r16 = 0
            r15 = 0
            if (r21 == 0) goto L_0x004c
            r17 = r26
            r16 = r27
            r15 = r28
        L_0x004c:
            r11 = 0
            r4 = 0
            r2 = 0
            r3 = 0
        L_0x0050:
            r1 = r23
            int r0 = r1.size()
            if (r11 >= r0) goto L_0x00bd
            java.lang.Object r0 = r1.get(r11)
            X.6hm r0 = (X.C108076hm) r0
            X.5fU r0 = r0.A00
            java.lang.Object r0 = r0.A00()
            X.7J7 r0 = (X.AnonymousClass7J7) r0
            X.7Di r13 = r0.A02
            boolean r14 = X.C18180wK.A1W(r11)
            int r0 = X.C86104wH.A0B(r1)
            boolean r12 = X.C86114wI.A1T(r11, r0)
            int r0 = X.AnonymousClass7Di.A01(r13)
            if (r12 == 0) goto L_0x00e9
            if (r14 == 0) goto L_0x007e
            int r0 = r20 + r0
        L_0x007e:
            int r0 = r0 + r19
        L_0x0080:
            int r9 = java.lang.Math.max(r9, r0)
            int r4 = r4 + r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r1) goto L_0x0094
            if (r22 == 0) goto L_0x008d
            if (r4 >= r7) goto L_0x0091
        L_0x008d:
            if (r21 == 0) goto L_0x0094
            if (r9 < r7) goto L_0x0094
        L_0x0091:
            r0 = 0
            r6[r0] = r7
        L_0x0094:
            int r0 = X.AnonymousClass7Di.A00(r13)
            if (r12 == 0) goto L_0x00e3
            if (r14 == 0) goto L_0x009e
            int r0 = r0 + r17
        L_0x009e:
            int r0 = r0 + r16
        L_0x00a0:
            int r2 = java.lang.Math.max(r2, r0)
            int r3 = r3 + r0
            if (r8 != r1) goto L_0x00b2
            if (r21 == 0) goto L_0x00ab
            if (r3 >= r5) goto L_0x00af
        L_0x00ab:
            if (r22 == 0) goto L_0x00b2
            if (r2 < r5) goto L_0x00b2
        L_0x00af:
            r0 = 1
            r6[r0] = r5
        L_0x00b2:
            r0 = 0
            r0 = r6[r0]
            r1 = -1
            if (r0 <= r1) goto L_0x00df
            r0 = 1
            r0 = r6[r0]
            if (r0 <= r1) goto L_0x00df
        L_0x00bd:
            if (r10 != 0) goto L_0x00ce
            if (r22 == 0) goto L_0x00c2
            r9 = r4
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            r6[r1] = r9
        L_0x00c5:
            if (r8 != 0) goto L_0x00f0
            if (r21 == 0) goto L_0x00ca
            r2 = r3
        L_0x00ca:
            r0 = 1
            r6[r0] = r2
            return r6
        L_0x00ce:
            r1 = 0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r0) goto L_0x00c5
            if (r22 == 0) goto L_0x00da
            int r9 = java.lang.Math.min(r4, r7)
            goto L_0x00c3
        L_0x00da:
            int r9 = java.lang.Math.min(r9, r7)
            goto L_0x00c3
        L_0x00df:
            int r11 = r11 + 1
            goto L_0x0050
        L_0x00e3:
            if (r14 == 0) goto L_0x00e7
            int r0 = r0 + r17
        L_0x00e7:
            int r0 = r0 + r15
            goto L_0x00a0
        L_0x00e9:
            if (r14 == 0) goto L_0x00ed
            int r0 = r20 + r0
        L_0x00ed:
            int r0 = r0 + r18
            goto L_0x0080
        L_0x00f0:
            r1 = 1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r0) goto L_0x0030
            if (r21 == 0) goto L_0x00fe
            int r0 = java.lang.Math.min(r3, r5)
        L_0x00fb:
            r6[r1] = r0
            return r6
        L_0x00fe:
            int r0 = java.lang.Math.min(r2, r5)
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98906Hj.A00(java.util.List, int, int, int, int, int, int):int[]");
    }
}
