package X;

/* renamed from: X.6Mq  reason: invalid class name and case insensitive filesystem */
public final class C100266Mq {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r2 == X.C970267q.REPOST_PREVIEW) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r26, androidx.compose.ui.Modifier r27, com.instagram.api.schemas.LineType r28, X.C970267q r29, java.lang.String r30, int r31, int r32) {
        /*
            r4 = r27
            r10 = 0
            r2 = r29
            r1 = r30
            boolean r30 = X.AnonymousClass0wJ.A1Z(r1, r2)
            r0 = 2
            r3 = r28
            X.C04220Ms.A0B(r3, r0)
            r0 = -1207592522(0xffffffffb80599b6, float:-3.1852825E-5)
            r11 = r26
            r11.Cvd(r0)
            r29 = r32
            r5 = r32 & 1
            r0 = r31
            if (r5 == 0) goto L_0x00d3
            r5 = r31 | 6
        L_0x0023:
            r7 = r32 & 2
            r6 = 16
            if (r7 == 0) goto L_0x00c8
            r5 = r5 | 48
        L_0x002b:
            r7 = r32 & 4
            if (r7 == 0) goto L_0x00bd
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0031:
            r8 = r32 & 8
            if (r8 == 0) goto L_0x00b2
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0037:
            r7 = r5 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r7 != r5) goto L_0x0062
            boolean r5 = r11.BCM()
            if (r5 == 0) goto L_0x0062
            r11.CuJ()
        L_0x0046:
            X.8nW r6 = r11.AKE()
            if (r6 == 0) goto L_0x0061
            kotlin.jvm.internal.KtLambdaShape1S1302000_I2 r5 = new kotlin.jvm.internal.KtLambdaShape1S1302000_I2
            r23 = r5
            r24 = r3
            r25 = r2
            r26 = r4
            r27 = r1
            r28 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            X.7WO r6 = (X.AnonymousClass7WO) r6
            r6.A06 = r5
        L_0x0061:
            return
        L_0x0062:
            if (r8 == 0) goto L_0x0066
            X.7Wm r4 = androidx.compose.ui.Modifier.A00
        L_0x0066:
            r5 = 2131822183(0x7f110667, float:1.927713E38)
            java.lang.String r17 = X.AnonymousClass7JS.A02(r11, r1, r5)
            long r24 = X.AnonymousClass7KB.A03(r11)
            X.687 r5 = X.AnonymousClass687.Start
            X.687 r8 = X.AnonymousClass6MK.A00(r3, r5)
            X.67q r5 = X.C970267q.POST
            if (r2 == r5) goto L_0x0080
            X.67q r5 = X.C970267q.REPOST_PREVIEW
            r7 = 0
            if (r2 != r5) goto L_0x0081
        L_0x0080:
            r7 = 1
        L_0x0081:
            r5 = 4
            androidx.compose.ui.Modifier r9 = X.AnonymousClass73T.A00(r11, r4, r8, r5, r7)
            X.6hH r5 = X.C103106Xv.A00
            float r8 = r5.A00
            float r7 = (float) r6
            X.67q r5 = X.C970267q.TARGET_POST
            float r6 = (float) r10
            if (r2 != r5) goto L_0x0092
            r5 = 5
            float r6 = (float) r5
        L_0x0092:
            r5 = 8
            float r5 = (float) r5
            androidx.compose.ui.Modifier r12 = X.AnonymousClass7K4.A05(r9, r8, r6, r7, r5)
            r26 = 0
            r13 = 0
            r23 = 4088(0xff8, float:5.729E-42)
            r14 = r13
            r15 = r13
            r16 = r13
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r28 = r10
            r18 = r10
            X.AnonymousClass7I9.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28)
            goto L_0x0046
        L_0x00b2:
            r7 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0037
            int r7 = X.C147188nY.A0I(r11, r4)
            r5 = r5 | r7
            goto L_0x0037
        L_0x00bd:
            r7 = r0 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0031
            int r7 = X.C147188nY.A0H(r11, r3)
            r5 = r5 | r7
            goto L_0x0031
        L_0x00c8:
            r7 = r31 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x002b
            int r7 = X.C147188nY.A0G(r11, r2)
            r5 = r5 | r7
            goto L_0x002b
        L_0x00d3:
            r5 = r31 & 14
            if (r5 != 0) goto L_0x00df
            int r5 = X.C147188nY.A0F(r11, r1)
            r5 = r5 | r31
            goto L_0x0023
        L_0x00df:
            r5 = r0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100266Mq.A00(X.8nY, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.67q, java.lang.String, int, int):void");
    }
}
