package X;

/* renamed from: X.6Pz  reason: invalid class name and case insensitive filesystem */
public final class C101126Pz {
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0344, code lost:
        if (r4 != null) goto L_0x0346;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C41822MeD A00(X.C112976qV r41, X.M5L r42, X.C127397h3 r43, int r44, int r45) {
        /*
            r29 = 0
            r10 = 1
            X.77H r2 = X.AnonymousClass77H.A00
            r0 = r41
            android.content.Context r0 = r0.A04
            r31 = r0
            X.C04220Ms.A06(r31)
            r40 = r43
            r1 = r0
            r0 = r40
            X.6mC r0 = r2.A00(r1, r0)
            int r9 = r0.A01
            int r8 = r0.A02
            android.graphics.Rect r7 = r0.A04
            int r4 = r0.A00
            int r0 = r0.A03
            r13 = r0
            boolean r28 = X.AnonymousClass6Q3.A00(r31)
            java.util.List r0 = r40.A0P()
            java.util.ArrayList r27 = X.C18200wM.A0t(r0)
            r0 = r40
            int r2 = r0.A02
            java.util.List r0 = r40.A0P()
            int r1 = r0.size()
            android.util.LongSparseArray r26 = new android.util.LongSparseArray
            r0 = r26
            r0.<init>(r1)
            X.Lyh r3 = r41.A00()
            long r0 = (long) r2
            r2 = r26
            r3.A01(r0, r2)
            X.Lyh r2 = r41.A00()
            java.lang.Object r25 = r2.A00(r0)
            r0 = r25
            android.util.LongSparseArray r0 = (android.util.LongSparseArray) r0
            r25 = r0
            r38 = r44
            int r5 = android.view.View.MeasureSpec.getSize(r38)
            int r0 = r7.left
            int r5 = r5 - r0
            int r0 = r7.right
            int r5 = r5 - r0
            r39 = r45
            int r1 = android.view.View.MeasureSpec.getSize(r39)
            int r0 = r7.top
            int r1 = r1 - r0
            int r0 = r7.bottom
            int r1 = r1 - r0
            if (r9 == r10) goto L_0x0074
            r5 = r1
        L_0x0074:
            int[] r0 = new int[r8]
            r24 = r0
            int r3 = r5 / r8
            int r5 = r5 % r8
            r2 = 0
            r1 = 0
        L_0x007d:
            if (r2 >= r8) goto L_0x0090
            int r1 = r1 + r5
            if (r1 <= 0) goto L_0x008e
            int r0 = r8 - r1
            if (r0 >= r5) goto L_0x008e
            int r0 = r3 + 1
            int r1 = r1 - r8
        L_0x0089:
            r24[r2] = r0
            int r2 = r2 + 1
            goto L_0x007d
        L_0x008e:
            r0 = r3
            goto L_0x0089
        L_0x0090:
            r5 = r13
            if (r9 != r10) goto L_0x0094
            r5 = r4
        L_0x0094:
            android.graphics.Rect[] r0 = new android.graphics.Rect[r8]
            r23 = r0
            r6 = 0
            r1 = 0
        L_0x009a:
            if (r1 >= r8) goto L_0x00a5
            android.graphics.Rect r0 = X.C86134wK.A0D()
            r23[r1] = r0
            int r1 = r1 + 1
            goto L_0x009a
        L_0x00a5:
            if (r5 == 0) goto L_0x00d2
            double r2 = (double) r5
            double r0 = (double) r8
            double r2 = r2 / r0
        L_0x00aa:
            if (r6 >= r8) goto L_0x00d2
            double r0 = (double) r6
            double r0 = r0 * r2
            int r12 = X.AnonymousClass8bA.A00(r0)
            int r11 = r6 + 1
            double r0 = (double) r11
            double r0 = r0 * r2
            int r0 = X.AnonymousClass8bA.A00(r0)
            int r1 = r5 - r0
            r0 = r23[r6]
            if (r9 != r10) goto L_0x00cd
            if (r28 != 0) goto L_0x00c8
            r0.left = r12
            r0.right = r1
        L_0x00c6:
            r6 = r11
            goto L_0x00aa
        L_0x00c8:
            r0.left = r1
            r0.right = r12
            goto L_0x00c6
        L_0x00cd:
            r0.top = r12
            r0.bottom = r1
            goto L_0x00c6
        L_0x00d2:
            int r11 = r4 >> 1
            if (r9 != r10) goto L_0x00d8
            int r11 = r13 >> 1
        L_0x00d8:
            X.6hp[] r6 = new X.C108106hp[r8]
            r1 = 0
        L_0x00db:
            if (r1 >= r8) goto L_0x00e7
            X.6hp r0 = new X.6hp
            r0.<init>()
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x00db
        L_0x00e7:
            java.util.List r0 = r40.A0P()
            java.util.ArrayList r5 = X.C18200wM.A0t(r0)
            java.util.List r0 = r40.A0P()
            java.util.Iterator r22 = X.C86134wK.A0t(r0)
            r4 = 0
        L_0x00f8:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x030d
            java.lang.Object r12 = r22.next()
            int r21 = r4 + 1
            if (r4 >= 0) goto L_0x010b
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x010b:
            X.7h3 r12 = (X.C127397h3) r12
            X.C04220Ms.A04(r12)
            r1 = 132(0x84, float:1.85E-43)
            X.7h3 r3 = r12.A0K(r1)
            r20 = 0
            if (r3 == 0) goto L_0x012c
            int r2 = r3.A03
            r0 = 16482(0x4062, float:2.3096E-41)
            if (r2 != r0) goto L_0x012c
            r0 = 36
            java.lang.Object r2 = X.C127397h3.A0A(r3, r0)
            r0 = r29
            boolean r20 = X.AnonymousClass2LL.A00(r2, r0)
        L_0x012c:
            r0 = 3
            kotlin.jvm.internal.KtLambdaShape144S0100000_I2_124 r2 = new kotlin.jvm.internal.KtLambdaShape144S0100000_I2_124
            r2.<init>(r6, r0)
            X.4O5 r0 = new X.4O5
            r0.<init>(r2)
            java.util.Iterator r14 = r0.iterator()
            boolean r0 = r14.hasNext()
            if (r20 == 0) goto L_0x01bd
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r3 = r14.next()
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x016d
            r0 = r3
            X.3I2 r0 = (X.AnonymousClass3I2) r0
            java.lang.Object r0 = r0.A01
            X.6hp r0 = (X.C108106hp) r0
            int r2 = r0.A00
        L_0x0156:
            java.lang.Object r13 = r14.next()
            r0 = r13
            X.3I2 r0 = (X.AnonymousClass3I2) r0
            java.lang.Object r0 = r0.A01
            X.6hp r0 = (X.C108106hp) r0
            int r0 = r0.A00
            if (r2 >= r0) goto L_0x0167
            r2 = r0
            r3 = r13
        L_0x0167:
            boolean r0 = r14.hasNext()
            if (r0 != 0) goto L_0x0156
        L_0x016d:
            X.3I2 r3 = (X.AnonymousClass3I2) r3
            if (r3 == 0) goto L_0x0307
            int r0 = r3.A00
            r19 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            if (r0 == 0) goto L_0x0307
            if (r20 == 0) goto L_0x01b5
            android.graphics.Rect r2 = X.C86134wK.A0D()
        L_0x0181:
            r5.add(r2)
            X.7h3 r3 = r12.A0K(r1)
            r13 = 0
            if (r3 == 0) goto L_0x01a9
            int r1 = r3.A03
            r0 = 16482(0x4062, float:2.3096E-41)
            if (r1 != r0) goto L_0x01a9
            r0 = 35
            java.lang.Object r1 = X.C127397h3.A0A(r3, r0)
            if (r1 == 0) goto L_0x01a9
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L_0x01a9
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x01a9
            float r0 = r1.floatValue()
            java.lang.Float r13 = java.lang.Float.valueOf(r0)
        L_0x01a9:
            if (r20 == 0) goto L_0x01ec
            r1 = 0
            r3 = 0
        L_0x01ad:
            if (r1 >= r8) goto L_0x01ee
            r0 = r24[r1]
            int r3 = r3 + r0
            int r1 = r1 + 1
            goto L_0x01ad
        L_0x01b5:
            r0 = r23[r19]
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r0)
            goto L_0x0181
        L_0x01bd:
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r3 = r14.next()
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x016d
            r0 = r3
            X.3I2 r0 = (X.AnonymousClass3I2) r0
            java.lang.Object r0 = r0.A01
            X.6hp r0 = (X.C108106hp) r0
            int r2 = r0.A00
        L_0x01d2:
            java.lang.Object r13 = r14.next()
            r0 = r13
            X.3I2 r0 = (X.AnonymousClass3I2) r0
            java.lang.Object r0 = r0.A01
            X.6hp r0 = (X.C108106hp) r0
            int r0 = r0.A00
            if (r2 <= r0) goto L_0x01e3
            r2 = r0
            r3 = r13
        L_0x01e3:
            boolean r0 = r14.hasNext()
            if (r0 != 0) goto L_0x01d2
            goto L_0x016d
        L_0x01ea:
            r3 = 0
            goto L_0x016d
        L_0x01ec:
            r3 = r24[r19]
        L_0x01ee:
            if (r9 != r10) goto L_0x02d3
            int r0 = r2.left
            int r3 = r3 - r0
            int r0 = r2.right
        L_0x01f5:
            int r3 = r3 - r0
            if (r13 == 0) goto L_0x02cf
            if (r20 != 0) goto L_0x02cf
            float r1 = (float) r3
            float r0 = r13.floatValue()
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = X.C86134wK.A04(r0)
        L_0x0205:
            int r0 = X.C86134wK.A04(r3)
            r1 = r0
            if (r9 != 0) goto L_0x020e
            r1 = r2
            r2 = r0
        L_0x020e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r0)
            java.lang.Object r0 = r1.A00
            int r14 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r1.A01
            int r18 = X.AnonymousClass0wJ.A04(r0)
            int r0 = r12.A02
            long r1 = (long) r0
            r0 = r26
            java.lang.Object r0 = r0.get(r1)
            X.6hm r0 = (X.C108076hm) r0
            r17 = 0
            if (r0 != 0) goto L_0x0241
            if (r25 == 0) goto L_0x0249
            r0 = r25
            java.lang.Object r0 = r0.get(r1)
            X.6hm r0 = (X.C108076hm) r0
            if (r0 == 0) goto L_0x0249
        L_0x0241:
            X.5fU r0 = r0.A00
            if (r0 == 0) goto L_0x0249
            X.7J7 r17 = r0.A01()
        L_0x0249:
            r3 = 0
            X.7h5 r13 = new X.7h5
            r13.<init>(r12, r3)
            r0 = r41
            java.lang.Object r3 = r0.A05
            r0 = r3
            X.3HX r0 = (X.AnonymousClass3HX) r0
            X.AnonymousClass2LE.A00(r0)
            r0 = r41
            int r0 = r0.A03
            r15 = r0
            X.84n r0 = new X.84n
            r30 = r0
            r32 = r17
            r33 = r13
            r34 = r3
            r35 = r15
            r36 = r14
            r37 = r18
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            X.5fU r16 = new X.5fU
            r15 = r0
            r13 = r18
            r3 = r16
            r0 = r17
            r3.<init>(r0, r15, r14, r13)
            X.6hm r3 = new X.6hm
            r0 = r16
            r3.<init>(r0, r12)
            r0 = r26
            r0.put(r1, r3)
            r0 = r27
            r0.add(r3)
            X.5fU r0 = r3.A00
            java.lang.Object r0 = r0.A00()
            X.7J7 r0 = (X.AnonymousClass7J7) r0
            X.7Di r0 = r0.A02
            if (r9 != r10) goto L_0x02ca
            int r0 = X.AnonymousClass7Di.A00(r0)
        L_0x029e:
            r1 = r6[r19]
            int r3 = r1.A00
            int r3 = r3 + r0
            X.6e7 r0 = r1.A01
            if (r0 == 0) goto L_0x02e4
            int r0 = r11 << 1
            int r3 = r3 + r0
            r2 = 0
        L_0x02ab:
            if (r2 >= r8) goto L_0x02da
            r0 = r6[r2]
            X.6e7 r0 = r0.A01
            if (r0 == 0) goto L_0x02bf
            int r0 = r0.A00
            java.lang.Object r0 = r5.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r9 != r10) goto L_0x02c2
            r0.bottom = r11
        L_0x02bf:
            int r2 = r2 + 1
            goto L_0x02ab
        L_0x02c2:
            if (r28 != 0) goto L_0x02c7
            r0.right = r11
            goto L_0x02bf
        L_0x02c7:
            r0.left = r11
            goto L_0x02bf
        L_0x02ca:
            int r0 = X.AnonymousClass7Di.A01(r0)
            goto L_0x029e
        L_0x02cf:
            int r2 = X.AnonymousClass7I7.A00
            goto L_0x0205
        L_0x02d3:
            int r0 = r2.top
            int r3 = r3 - r0
            int r0 = r2.bottom
            goto L_0x01f5
        L_0x02da:
            java.lang.Object r0 = r5.get(r4)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r9 != r10) goto L_0x02f7
            r0.top = r11
        L_0x02e4:
            X.6e7 r2 = new X.6e7
            r2.<init>(r4)
            if (r20 == 0) goto L_0x02ff
            r1 = 0
        L_0x02ec:
            if (r1 >= r8) goto L_0x0303
            r0 = r6[r1]
            r0.A01 = r2
            r0.A00 = r3
            int r1 = r1 + 1
            goto L_0x02ec
        L_0x02f7:
            if (r28 != 0) goto L_0x02fc
            r0.left = r11
            goto L_0x02e4
        L_0x02fc:
            r0.right = r11
            goto L_0x02e4
        L_0x02ff:
            r1.A01 = r2
            r1.A00 = r3
        L_0x0303:
            r4 = r21
            goto L_0x00f8
        L_0x0307:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x030d:
            r0 = r41
            java.lang.Object r1 = r0.A05
            X.3HX r1 = (X.AnonymousClass3HX) r1
            if (r1 == 0) goto L_0x031f
            r0 = r40
            java.lang.Object r0 = X.AnonymousClass7K7.A03(r1, r0)
            X.7qj r0 = (X.C130767qj) r0
            r0.A08 = r5
        L_0x031f:
            int r11 = android.view.View.MeasureSpec.getMode(r38)
            int r5 = android.view.View.MeasureSpec.getMode(r39)
            if (r9 != r10) goto L_0x0332
            if (r11 != 0) goto L_0x033b
            java.lang.String r0 = "StaggeredGridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0332:
            if (r5 != 0) goto L_0x033b
            java.lang.String r0 = "StaggeredGridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x033b:
            r3 = 0
            if (r8 == 0) goto L_0x0348
            r4 = r6[r29]
            int r0 = r8 + -1
            if (r0 != 0) goto L_0x03a6
            if (r4 == 0) goto L_0x0348
        L_0x0346:
            int r3 = r4.A00
        L_0x0348:
            if (r9 != r10) goto L_0x03a1
            int r1 = r7.top
            int r0 = r7.bottom
        L_0x034e:
            int r1 = r1 + r0
            int r3 = r3 + r1
            int r1 = android.view.View.MeasureSpec.getSize(r38)
            if (r9 != 0) goto L_0x0360
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 == r0) goto L_0x0360
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 != r0) goto L_0x039f
            if (r3 < r1) goto L_0x039f
        L_0x0360:
            int r2 = android.view.View.MeasureSpec.getSize(r39)
            if (r9 != r10) goto L_0x0370
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == r0) goto L_0x0370
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r0) goto L_0x039d
            if (r3 < r2) goto L_0x039d
        L_0x0370:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r0)
            java.lang.Object r0 = r1.A00
            int r3 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r1.A01
            int r2 = X.AnonymousClass0wJ.A04(r0)
            X.6ix r1 = new X.6ix
            r0 = r27
            r1.<init>(r0, r3, r2)
            X.7h1 r35 = new X.7h1
            r36 = r42
            r37 = r1
            r40 = r3
            r41 = r2
            r35.<init>(r36, r37, r38, r39, r40, r41)
            return r35
        L_0x039d:
            r2 = r3
            goto L_0x0370
        L_0x039f:
            r1 = r3
            goto L_0x0360
        L_0x03a1:
            int r1 = r7.left
            int r0 = r7.right
            goto L_0x034e
        L_0x03a6:
            int r3 = r4.A00
            X.83z r2 = X.AnonymousClass8bH.A01(r10, r0)
        L_0x03ac:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0346
            int r0 = r2.A00()
            r1 = r6[r0]
            int r0 = r1.A00
            if (r3 >= r0) goto L_0x03ac
            r4 = r1
            r3 = r0
            goto L_0x03ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101126Pz.A00(X.6qV, X.M5L, X.7h3, int, int):X.MeD");
    }
}
