package X;

import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape2S0212000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1201000_I2;

/* renamed from: X.7JX  reason: invalid class name */
public final class AnonymousClass7JX {
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r8 != 0) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r26, androidx.compose.ui.Modifier r27, X.AnonymousClass06E r28, X.AnonymousClass58B r29, java.lang.String r30, X.AnonymousClass0ZU r31, X.AnonymousClass0YY r32, int r33, int r34, boolean r35) {
        /*
            r9 = r29
            r16 = r27
            r1 = 0
            r5 = r30
            X.C04220Ms.A0B(r5, r1)
            r17 = 2
            r4 = r31
            r2 = r17
            r0 = r32
            X.C18180wK.A1P(r0, r2, r4)
            r2 = 6
            r20 = r28
            r0 = r20
            X.C04220Ms.A0B(r0, r2)
            r0 = -1772441613(0xffffffff965aaff3, float:-1.766542E-25)
            r6 = r26
            r6.Cvd(r0)
            r23 = r34
            r0 = r34 & 1
            r3 = r33
            if (r0 == 0) goto L_0x0242
            r2 = r33 | 6
        L_0x002f:
            r0 = r34 & 2
            r18 = r35
            if (r0 == 0) goto L_0x0235
            r2 = r2 | 48
        L_0x0037:
            r0 = r34 & 4
            if (r0 == 0) goto L_0x0228
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x003d:
            r0 = r34 & 8
            if (r0 == 0) goto L_0x021d
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0043:
            r11 = r34 & 16
            if (r11 == 0) goto L_0x020d
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0049:
            r8 = r34 & 32
            if (r8 == 0) goto L_0x0050
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
        L_0x0050:
            r7 = r34 & 96
            r0 = 96
            if (r7 != r0) goto L_0x0089
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r7 = r2 & r0
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r7 != r0) goto L_0x0089
            boolean r0 = r6.BCM()
            if (r0 == 0) goto L_0x0089
            r6.CuJ()
        L_0x0069:
            X.8nW r1 = r6.AKE()
            if (r1 == 0) goto L_0x0088
            kotlin.jvm.internal.KtLambdaShape0S1512000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S1512000_I2
            r25 = r18
            r18 = r16
            r19 = r4
            r21 = r5
            r22 = r3
            r24 = r17
            r15 = r0
            r16 = r9
            r17 = r32
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.D9d(r0)
        L_0x0088:
            return
        L_0x0089:
            r6.CvD()
            r0 = r33 & 1
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x01db
            boolean r0 = r6.Acj()
            if (r0 != 0) goto L_0x01db
            r6.CuJ()
            if (r8 == 0) goto L_0x009f
        L_0x009e:
            r2 = r2 & r10
        L_0x009f:
            r6.AKA()
            X.4wG r0 = r9.A07
            r31 = 0
            r15 = 1
            X.4oM r8 = X.AnonymousClass7Aj.A01(r6, r0)
            X.7W3 r13 = X.C147188nY.A0Y(r6)
            java.lang.Object r7 = r13.A13()
            java.lang.Object r11 = X.AnonymousClass7GN.A00
            if (r7 != r11) goto L_0x00bf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = X.AnonymousClass7WR.A00(r13, r0)
        L_0x00bf:
            X.AnonymousClass7W3.A0w(r13, r1)
            X.8pE r7 = (X.C147368pE) r7
            android.content.Context r14 = X.C147188nY.A0T(r6)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass7CZ.A00(r6)
            X.BKU r0 = X.C86114wI.A0W(r0, r5)
            if (r0 == 0) goto L_0x00dc
            X.BKN r0 = r0.A0f
            com.instagram.user.model.User r0 = r0.A1i
            if (r0 == 0) goto L_0x00dc
            java.lang.String r31 = r0.getId()
        L_0x00dc:
            r0 = -962837696(0xffffffffc69c4340, float:-20001.625)
            java.lang.Object r0 = X.C147188nY.A0u(r6, r8, r0)
            X.5IS r0 = (X.AnonymousClass5IS) r0
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x0109
            java.lang.Object r0 = r8.getValue()
            X.5IS r0 = (X.AnonymousClass5IS) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0109
            java.lang.Object r0 = r8.getValue()
            X.5IS r0 = (X.AnonymousClass5IS) r0
            X.67r r0 = r0.A01
            X.67r r10 = X.C970367r.Finished
            if (r0 == r10) goto L_0x0109
            java.lang.Object r0 = r8.getValue()
            X.5IS r0 = (X.AnonymousClass5IS) r0
            X.67r r0 = r0.A03
            if (r0 != r10) goto L_0x0120
        L_0x0109:
            kotlin.Unit r10 = kotlin.Unit.A00
            boolean r12 = X.C147188nY.A0y(r6, r4)
            java.lang.Object r0 = r13.A13()
            if (r12 != 0) goto L_0x0117
            if (r0 != r11) goto L_0x011d
        L_0x0117:
            r0 = 19
            kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1 r0 = X.AnonymousClass7W3.A07(r13, r4, r0)
        L_0x011d:
            X.AnonymousClass7W3.A0b(r6, r13, r0, r10, r1)
        L_0x0120:
            X.AnonymousClass7W3.A0w(r13, r1)
            r0 = -962837432(0xffffffffc69c4448, float:-20002.14)
            r6.Cvb(r0)
            boolean r0 = X.C86104wH.A1X(r7)
            if (r0 == 0) goto L_0x014f
            boolean r10 = X.C147188nY.A0y(r6, r7)
            java.lang.Object r0 = r13.A13()
            if (r10 != 0) goto L_0x013b
            if (r0 != r11) goto L_0x0141
        L_0x013b:
            r0 = 29
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r0 = X.AnonymousClass7W3.A0G(r13, r7, r0)
        L_0x0141:
            X.0ZU r11 = X.AnonymousClass7W3.A09(r13, r0, r1)
            r10 = 30
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r0 = new kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12
            r0.<init>(r9, r10)
            A06(r6, r11, r0, r1)
        L_0x014f:
            java.lang.Object r0 = X.AnonymousClass7W3.A06(r13, r8)
            X.5IS r0 = (X.AnonymousClass5IS) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r10 = r0.A00
            r0 = -962837246(0xffffffffc69c4502, float:-20002.504)
            r6.Cvb(r0)
            if (r10 == 0) goto L_0x0171
            java.lang.String r12 = r10.A00
            r0 = 31
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r11 = new kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12
            r11.<init>(r9, r0)
            r10 = 4
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r0 = new kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3
            r0.<init>(r10, r14, r9)
            A05(r6, r12, r11, r0, r1)
        L_0x0171:
            X.AnonymousClass7W3.A0w(r13, r1)
            r0 = 32
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r10 = new kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12
            r10.<init>(r9, r0)
            java.lang.Object r0 = r8.getValue()
            X.5IS r0 = (X.AnonymousClass5IS) r0
            X.67r r0 = r0.A01
            A03(r6, r0, r10, r1)
            r0 = 33
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r10 = new kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12
            r10.<init>(r9, r0)
            java.lang.Object r0 = r8.getValue()
            X.5IS r0 = (X.AnonymousClass5IS) r0
            X.67r r0 = r0.A02
            A02(r6, r0, r10, r1)
            r0 = 34
            kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12 r10 = new kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12
            r10.<init>(r9, r0)
            java.lang.Object r0 = r8.getValue()
            X.5IS r0 = (X.AnonymousClass5IS) r0
            X.67r r0 = r0.A03
            A04(r6, r0, r10, r1)
            X.534 r10 = X.AnonymousClass6WN.A00
            long r0 = X.AnonymousClass7KB.A02(r6)
            r11 = 1036831949(0x3dcccccd, float:0.1)
            long r0 = X.C121657He.A04(X.C86154wM.A0G(r0), X.AnonymousClass7KE.A03(r0), X.AnonymousClass7KE.A02(r0), X.AnonymousClass7KE.A01(r0), r11)
            X.7U8 r11 = new X.7U8
            r11.<init>(r0)
            X.7DS[] r10 = X.AnonymousClass7DS.A01(r10, r11, r15)
            r1 = -493128525(0xffffffffe29b74b3, float:-1.4338272E21)
            X.8Sd r0 = new X.8Sd
            r24 = r0
            r25 = r14
            r26 = r7
            r27 = r8
            r28 = r16
            r29 = r9
            r33 = r2
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.AnonymousClass7JR.A05(r6, r0, r10, r1)
            goto L_0x0069
        L_0x01db:
            if (r11 == 0) goto L_0x01df
            X.7Wm r16 = androidx.compose.ui.Modifier.A00
        L_0x01df:
            if (r8 == 0) goto L_0x009f
            com.instagram.service.session.UserSession r9 = X.AnonymousClass7CZ.A00(r6)
            X.0kW r8 = X.C1189973c.A00(r6)
            X.7bY r7 = new X.7bY
            r0 = r18
            r7.<init>(r8, r9, r5, r0)
            X.06C r26 = X.AnonymousClass7CD.A00(r6)
            if (r26 == 0) goto L_0x0251
            r29 = 0
            X.6o9 r27 = X.C86104wH.A0J(r26)
            java.lang.Class<X.58B> r28 = X.AnonymousClass58B.class
            r24 = r6
            r25 = r7
            X.3ak r9 = X.C98396Fj.A00(r24, r25, r26, r27, r28, r29)
            X.AnonymousClass7W3.A0z(r6, r1)
            X.58B r9 = (X.AnonymousClass58B) r9
            goto L_0x009e
        L_0x020d:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r33
            if (r0 != 0) goto L_0x0049
            r0 = r16
            int r0 = X.C147188nY.A0J(r6, r0)
            r2 = r2 | r0
            goto L_0x0049
        L_0x021d:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0043
            int r0 = X.C147188nY.A0C(r6, r4)
            r2 = r2 | r0
            goto L_0x0043
        L_0x0228:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x003d
            r0 = r32
            int r0 = X.C147188nY.A0B(r6, r0)
            r2 = r2 | r0
            goto L_0x003d
        L_0x0235:
            r0 = r33 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0037
            r0 = r18
            int r0 = X.C147188nY.A0M(r6, r0)
            r2 = r2 | r0
            goto L_0x0037
        L_0x0242:
            r0 = r33 & 14
            if (r0 != 0) goto L_0x024e
            int r2 = X.C147188nY.A0F(r6, r5)
            r2 = r2 | r33
            goto L_0x002f
        L_0x024e:
            r2 = r3
            goto L_0x002f
        L_0x0251:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JX.A00(X.8nY, androidx.compose.ui.Modifier, X.06E, X.58B, java.lang.String, X.0ZU, X.0YY, int, int, boolean):void");
    }

    public static final void A01(C147188nY r18, Modifier modifier, C23894D0g d0g, int i, int i2, boolean z) {
        int i3;
        C147178nW r0;
        int i4;
        Modifier modifier2 = modifier;
        C147188nY r9 = r18;
        r9.Cvd(1331484693);
        int i5 = i2;
        int i6 = 3;
        C23894D0g d0g2 = d0g;
        int i7 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r9, d0g2) | i;
        } else {
            i3 = i7;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r9, z2);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i7 & 896) == 0) {
            i3 |= C147188nY.A0H(r9, modifier2);
        }
        if ((i3 & 731) != 146 || !r9.BCM()) {
            if (i8 != 0) {
                modifier2 = Modifier.A00;
            }
            int ordinal = d0g2.ordinal();
            if (ordinal == 0) {
                r0 = r9.AKE();
                if (r0 != null) {
                    i6 = 4;
                } else {
                    return;
                }
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    i4 = 2131822064;
                    if (z) {
                        i4 = 2131822065;
                    }
                } else if (ordinal == 3) {
                    i4 = 2131822074;
                } else if (ordinal == 4) {
                    i4 = 2131822066;
                } else {
                    throw AnonymousClass4VZ.A00();
                }
                C117676z4.A00(r9, modifier2, (C115286uo) null, (C142318ef) null, (AnonymousClass67V) null, AnonymousClass7JS.A01(r9, i4), ((i3 >> 3) & 112) | 3072, 116, true, false);
            } else {
                r0 = r9.AKE();
                if (r0 != null) {
                    i6 = 5;
                } else {
                    return;
                }
            }
            ((AnonymousClass7WO) r0).A06 = new KtLambdaShape2S0212000_I2(modifier2, d0g2, i7, i5, i6, z2);
        }
        r9.CuJ();
        r0 = r9.AKE();
        if (r0 == null) {
            return;
        }
        ((AnonymousClass7WO) r0).A06 = new KtLambdaShape2S0212000_I2(modifier2, d0g2, i7, i5, i6, z2);
    }

    public static final void A02(C147188nY r6, C970367r r7, AnonymousClass0ZU r8, int i) {
        int i2;
        int i3;
        r6.Cvd(-970437393);
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r6, r8) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r6, r7);
        }
        if ((i2 & 91) != 18 || !r6.BCM()) {
            int ordinal = r7.ordinal();
            if (ordinal == 0) {
                i3 = -600550783;
                r6.Cvb(i3);
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    i3 = -600550335;
                    if (ordinal == 3) {
                        r6.Cvb(-600550546);
                        AnonymousClass7K5.A05(r6, Unit.A00, new KtSLambdaShape6S0200000_I2_1(C147188nY.A0o(r6), (Object) r8, (C146958n9) null, 15));
                    }
                } else {
                    i3 = -600550600;
                }
                r6.Cvb(i3);
            } else {
                r6.Cvb(-600550716);
                C101236Qk.A00(r6, AnonymousClass7JS.A01(r6, 2131832819), 0, 0);
            }
            AnonymousClass7W3.A0z(r6, false);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r7, r8, i, 38);
        }
    }

    public static final void A03(C147188nY r6, C970367r r7, AnonymousClass0ZU r8, int i) {
        int i2;
        int i3;
        r6.Cvd(-735285798);
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r6, r8) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r6, r7);
        }
        if ((i2 & 91) != 18 || !r6.BCM()) {
            int ordinal = r7.ordinal();
            if (ordinal == 0) {
                i3 = 371182927;
                r6.Cvb(i3);
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    i3 = 371183408;
                    if (ordinal == 3) {
                        r6.Cvb(371183168);
                        AnonymousClass7K5.A05(r6, Unit.A00, new KtSLambdaShape6S0200000_I2_1(C147188nY.A0o(r6), (Object) r8, (C146958n9) null, 16));
                    }
                } else {
                    i3 = 371183114;
                }
                r6.Cvb(i3);
            } else {
                r6.Cvb(371182994);
                C101236Qk.A00(r6, AnonymousClass7JS.A01(r6, 2131824937), 0, 0);
            }
            AnonymousClass7W3.A0z(r6, false);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r7, r8, i, 40);
        }
    }

    public static final void A04(C147188nY r5, C970367r r6, AnonymousClass0ZU r7, int i) {
        int i2;
        r5.Cvd(-1534840434);
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r5, r7) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r5, r6);
        }
        if ((i2 & 91) != 18 || !r5.BCM()) {
            int ordinal = r6.ordinal();
            if (ordinal == 1) {
                r5.Cvb(-1148058660);
                C101236Qk.A00(r5, AnonymousClass7JS.A01(r5, 2131822190), 0, 0);
            } else if (ordinal != 3) {
                r5.Cvb(-1148058283);
            } else {
                r5.Cvb(-1148058526);
                AnonymousClass7K5.A05(r5, Unit.A00, new KtSLambdaShape6S0200000_I2_1(C147188nY.A0o(r5), (Object) r7, (C146958n9) null, 17));
            }
            AnonymousClass7W3.A0y(r5);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r6, r7, i, 41);
        }
    }

    public static final void A05(C147188nY r13, String str, AnonymousClass0ZU r15, AnonymousClass0ZU r16, int i) {
        int i2;
        C147188nY r7 = r13;
        r13.Cvd(1878676546);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r13, str) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0ZU r132 = r15;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r7, r15);
        }
        AnonymousClass0ZU r3 = r16;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0B(r7, r3);
        }
        if ((i2 & 731) != 146 || !r7.BCM()) {
            AnonymousClass6QY.A00(r7, AnonymousClass6QW.A00(r7, AnonymousClass006.A0C, r3, 2131822074, 12), AnonymousClass6QW.A00(r7, (Integer) null, (AnonymousClass0ZU) null, 2131823054, 30), (KtCSuperShape0S2210000_I2) null, AnonymousClass7JS.A02(r7, str, 2131822075), (String) null, r132, (i2 >> 3) & 14, 228, false, false);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S1201000_I2(str2, r132, r3, i3, 7));
        }
    }

    public static final void A06(C147188nY r13, AnonymousClass0ZU r14, AnonymousClass0ZU r15, int i) {
        int i2;
        C147188nY r6 = r13;
        r13.Cvd(-1894276018);
        int i3 = i;
        AnonymousClass0ZU r12 = r14;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r13, r14) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0ZU r3 = r15;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r13, r15);
        }
        if ((i2 & 91) != 18 || !r13.BCM()) {
            AnonymousClass6QY.A00(r6, AnonymousClass6QW.A00(r13, AnonymousClass006.A0C, r3, 2131824898, 12), AnonymousClass6QW.A00(r13, (Integer) null, (AnonymousClass0ZU) null, 2131823054, 30), (KtCSuperShape0S2210000_I2) null, AnonymousClass7JS.A01(r13, 2131824928), (String) null, r12, i2 & 14, 228, false, false);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r12, r3, i3, 39);
        }
    }
}
