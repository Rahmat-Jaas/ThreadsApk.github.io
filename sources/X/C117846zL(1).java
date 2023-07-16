package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.6zL  reason: invalid class name and case insensitive filesystem */
public final class C117846zL {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r37, androidx.compose.ui.Modifier r38, X.C19450zt r39, java.lang.String r40, int r41, int r42) {
        /*
            r8 = r39
            r7 = 0
            r11 = r40
            r12 = r38
            boolean r6 = X.AnonymousClass0wJ.A1Z(r11, r12)
            r1 = -129688789(0xfffffffff8451b2b, float:-1.5991149E34)
            r0 = r37
            r0.Cvd(r1)
            r40 = r42
            r1 = r42 & 1
            r2 = 4
            if (r1 == 0) goto L_0x0212
            r4 = r41 | 6
        L_0x001c:
            r1 = r42 & 2
            r19 = 16
            if (r1 == 0) goto L_0x0207
            r4 = r4 | 48
        L_0x0024:
            r3 = r42 & 4
            if (r3 == 0) goto L_0x0054
            r1 = r4 | 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x0054
            r2 = r1 & 731(0x2db, float:1.024E-42)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x0054
            boolean r1 = r0.BCM()
            if (r1 == 0) goto L_0x0054
            r0.CuJ()
        L_0x003b:
            X.8nW r1 = r0.AKE()
            if (r1 == 0) goto L_0x0053
            kotlin.jvm.internal.KtLambdaShape0S1202000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S1202000_I2
            r36 = r0
            r37 = r12
            r38 = r8
            r39 = r11
            r42 = r7
            r36.<init>(r37, r38, r39, r40, r41, r42)
            r1.D9d(r0)
        L_0x0053:
            return
        L_0x0054:
            r0.CvD()
            r1 = r41 & 1
            if (r1 == 0) goto L_0x0165
            boolean r1 = r0.Acj()
            if (r1 != 0) goto L_0x0165
            r0.CuJ()
        L_0x0064:
            r0.AKA()
            X.7Ub r18 = X.AnonymousClass7Ad.A00(r0)
            X.4wG r1 = r8.A00
            r17 = 0
            X.4oM r16 = X.AnonymousClass7Aj.A01(r0, r1)
            java.lang.Object r1 = r16.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) r1
            boolean r1 = r1.A02
            r2 = 2131821923(0x7f110563, float:1.9276603E38)
            if (r1 == 0) goto L_0x0083
            r2 = 2131821924(0x7f110564, float:1.9276605E38)
        L_0x0083:
            java.lang.Object r1 = r16.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) r1
            java.lang.String r1 = r1.A01
            java.lang.String r4 = X.AnonymousClass7JS.A02(r0, r1, r2)
            boolean r3 = X.C147188nY.A0y(r0, r4)
            r1 = r0
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            java.lang.Object r2 = r1.A13()
            if (r3 != 0) goto L_0x00a0
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            if (r2 != r3) goto L_0x018f
        L_0x00a0:
            r2 = 63
            android.text.Spanned r5 = android.text.Html.fromHtml(r4, r2)
            X.C04220Ms.A06(r5)
            r2 = 0
            X.7yF r4 = new X.7yF
            r3 = r17
            r4.<init>(r3, r7, r6)
            java.lang.String r3 = r5.toString()
            r4.A07(r3)
            int r9 = r5.length()
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Object[] r9 = r5.getSpans(r7, r9, r3)
            X.C04220Ms.A06(r9)
            int r15 = r9.length
        L_0x00c6:
            if (r2 >= r15) goto L_0x0188
            r10 = r9[r2]
            int r14 = r5.getSpanStart(r10)
            int r13 = r5.getSpanEnd(r10)
            boolean r3 = r10 instanceof android.text.style.StyleSpan
            if (r3 == 0) goto L_0x0111
            android.text.style.StyleSpan r10 = (android.text.style.StyleSpan) r10
            int r10 = r10.getStyle()
            if (r10 == r6) goto L_0x013f
            r3 = 2
            if (r10 == r3) goto L_0x0114
            r3 = 3
            if (r10 != r3) goto L_0x0111
            r32 = 0
            X.7yQ r25 = X.C134817yQ.A01
            X.6su r10 = new X.6su
            r10.<init>(r6)
            r31 = 16371(0x3ff3, float:2.294E-41)
            X.7F0 r3 = new X.7F0
            r22 = r17
            r23 = r10
            r24 = r17
            r26 = r17
            r27 = r17
            r28 = r17
            r29 = r17
            r30 = r17
            r34 = r32
            r36 = r32
            r38 = r32
            r20 = r3
            r21 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38)
        L_0x010e:
            r4.A05(r3, r14, r13)
        L_0x0111:
            int r2 = r2 + 1
            goto L_0x00c6
        L_0x0114:
            r32 = 0
            X.6su r10 = new X.6su
            r10.<init>(r6)
            r31 = 16375(0x3ff7, float:2.2946E-41)
            X.7F0 r3 = new X.7F0
            r20 = r3
            r21 = r17
            r22 = r17
            r23 = r10
            r24 = r17
            r25 = r17
            r26 = r17
            r27 = r17
            r28 = r17
            r29 = r17
            r30 = r17
            r34 = r32
            r36 = r32
            r38 = r32
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38)
            goto L_0x010e
        L_0x013f:
            r32 = 0
            X.7yQ r25 = X.C134817yQ.A01
            r31 = 16379(0x3ffb, float:2.2952E-41)
            X.7F0 r3 = new X.7F0
            r22 = r17
            r23 = r17
            r24 = r17
            r26 = r17
            r27 = r17
            r28 = r17
            r29 = r17
            r30 = r17
            r34 = r32
            r36 = r32
            r38 = r32
            r20 = r3
            r21 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38)
            goto L_0x010e
        L_0x0165:
            if (r3 == 0) goto L_0x0064
            com.instagram.service.session.UserSession r2 = X.AnonymousClass7CZ.A00(r0)
            X.3xD r1 = new X.3xD
            r1.<init>(r11, r2)
            X.06C r2 = X.AnonymousClass7CD.A00(r0)
            if (r2 == 0) goto L_0x0222
            r5 = 0
            X.6o9 r3 = X.C86104wH.A0J(r2)
            java.lang.Class<X.0zt> r4 = X.C19450zt.class
            X.3ak r8 = X.C98396Fj.A00(r0, r1, r2, r3, r4, r5)
            X.AnonymousClass7W3.A0z(r0, r7)
            X.0zt r8 = (X.C19450zt) r8
            goto L_0x0064
        L_0x0188:
            X.7yH r2 = r4.A01()
            r1.A14(r2)
        L_0x018f:
            X.AnonymousClass7W3.A0w(r1, r7)
            X.7yH r2 = (X.C134747yH) r2
            androidx.compose.ui.Modifier r4 = X.AnonymousClass73S.A00(r0, r12)
            r3 = r18
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7Ad.A01(r3, r4)
            X.8ly r13 = X.AnonymousClass7KV.A05(r0)
            java.lang.Object r10 = X.C147188nY.A0p(r0)
            java.lang.Object r9 = X.C147188nY.A0n(r0)
            java.lang.Object r5 = X.C147188nY.A0m(r0)
            X.0ZU r4 = X.AnonymousClass74X.A00
            X.0YM r3 = X.C98236Es.A00(r3)
            X.C147188nY.A0w(r0, r1, r4)
            X.AnonymousClass7W3.A0a(r0, r1, r13, r10)
            X.AnonymousClass7KP.A07(r0, r9, r5, r3)
            X.7V5 r5 = X.AnonymousClass7V5.A00
            r4 = 347993505(0x14bdf5a1, float:1.9181007E-26)
            r3 = r16
            java.lang.Object r3 = X.C147188nY.A0u(r0, r3, r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) r3
            java.lang.String r10 = r3.A00
            X.7Wm r9 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A04(r9)
            r3 = 48
            A01(r0, r4, r10, r3)
            r3 = r19
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7K4.A08(r9, r3)
            X.8fk r3 = X.AnonymousClass7KV.A00
            androidx.compose.ui.Modifier r14 = r5.A00(r3, r4)
            long r26 = X.AnonymousClass7KB.A03(r0)
            r28 = 0
            r25 = 4088(0xff8, float:5.729E-42)
            r13 = r0
            r15 = r2
            r16 = r17
            r18 = r17
            r19 = r17
            r20 = r7
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r7
            r30 = r7
            X.AnonymousClass7I9.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30)
            X.AnonymousClass7W3.A0v(r1, r6)
            goto L_0x003b
        L_0x0207:
            r1 = r41 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0024
            int r1 = X.C147188nY.A0G(r0, r12)
            r4 = r4 | r1
            goto L_0x0024
        L_0x0212:
            r1 = r41 & 14
            if (r1 != 0) goto L_0x021e
            int r1 = X.C147188nY.A0F(r0, r11)
            r4 = r41 | r1
            goto L_0x001c
        L_0x021e:
            r4 = r41
            goto L_0x001c
        L_0x0222:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117846zL.A00(X.8nY, androidx.compose.ui.Modifier, X.0zt, java.lang.String, int, int):void");
    }

    public static final void A01(C147188nY r26, Modifier modifier, String str, int i) {
        int i2;
        C147188nY r12 = r26;
        r12.Cvd(-187024180);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r12, str2) | i;
        } else {
            i2 = i3;
        }
        Modifier modifier2 = modifier;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r12, modifier2);
        }
        if ((i2 & 91) != 18 || !r12.BCM()) {
            Modifier A08 = AnonymousClass7K4.A08(modifier2, 16);
            C146288ly A00 = AnonymousClass72N.A00(C147188nY.A0U(r12), r12, AnonymousClass7KV.A05);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r3 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A08);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r0, r3);
            AnonymousClass7W3.A0a(r12, r0, A00, A0p);
            AnonymousClass7KP.A07(r12, A0n, A0m, A002);
            AnonymousClass7VA r8 = AnonymousClass7VA.A00;
            C123327Wm A02 = Modifier.A02(r12, 735189736);
            String str3 = str2;
            AnonymousClass7I9.A02(r12, r8.A00(AnonymousClass7KV.A04, r8.DB5(A02, 1.0f, true)), (C121807If) null, (C114236su) null, C134817yQ.A01, (C121117Ee) null, str3, 0, 0, 0, (i2 & 14) | 199680, 0, 4052, 0, AnonymousClass7Hi.A03(24), false);
            C147188nY r13 = r12;
            C97846Dc.A00(r13, (Alignment) null, AnonymousClass7Kq.A0F(A02, 64), (C104136bI) null, AnonymousClass6QP.A00(r12, R.drawable.barcelona_circle_64), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 440, 120);
            AnonymousClass7W3.A0v(r0, true);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            C147178nW.A06(AKE, modifier2, str2, i3, 4);
        }
    }
}
