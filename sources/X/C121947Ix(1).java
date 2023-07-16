package X;

import android.content.res.Resources;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape0S1202000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0212000_I2;

/* renamed from: X.7Ix  reason: invalid class name and case insensitive filesystem */
public final class C121947Ix {
    public static final float A00 = ((float) 64);

    public static final void A00(C147188nY r28, Modifier modifier, ImageUrl imageUrl, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r0 = r28;
        r0.Cvd(-2035730784);
        int i4 = i2;
        int i5 = i;
        ImageUrl imageUrl2 = imageUrl;
        if ((i2 & 1) != 0) {
            i3 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i3 = C147188nY.A0F(r0, imageUrl2) | i5;
        } else {
            i3 = i5;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i5 & 112) == 0) {
            i3 |= C147188nY.A0M(r0, z2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r0, modifier2);
        }
        if ((i3 & 731) != 146 || !r0.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            Modifier A09 = AnonymousClass7Kq.A09(modifier2, A00);
            C146288ly A002 = C120767Cj.A00(r0, AnonymousClass7KV.A00(r0), false);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r8 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r8);
            AnonymousClass534 r7 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r7);
            AnonymousClass0ZU r6 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A09);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r1, r6);
            r1.A0T = false;
            AnonymousClass0YP r5 = AnonymousClass74X.A03;
            AnonymousClass0YP A004 = AnonymousClass7Ak.A00(r0, A002, AEA, r5);
            AnonymousClass0YP r4 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r4);
            Integer A05 = AnonymousClass7KP.A05(r0, AEA3, A01, A003);
            r0.Cvb(2058660585);
            AnonymousClass7V3 r14 = AnonymousClass7V3.A00;
            r0.Cvb(-1052721626);
            C115286uo A012 = C120577Bm.A01(r0, imageUrl2);
            C123327Wm r13 = Modifier.A00;
            C147188nY r19 = r0;
            C97846Dc.A00(r19, (Alignment) null, C115826vy.A01(Modifier.A05(r13), AnonymousClass7G5.A00), (C104136bI) null, A012, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            if (z) {
                Modifier A86 = r14.A86(AnonymousClass7KV.A08, r13);
                C146288ly A0h = C147188nY.A0h(r0, AnonymousClass7KV.A09);
                Object A0s = C147188nY.A0s(r0, A0a);
                Object AEA4 = r0.AEA(r8);
                Object AEA5 = r0.AEA(r7);
                AnonymousClass0YM A005 = C98236Es.A00(A86);
                C147188nY.A0w(r0, r1, r6);
                r1.A0T = false;
                AnonymousClass7Ak.A02(r0, A0h, r5);
                AnonymousClass7Ak.A02(r0, A0s, A004);
                AnonymousClass7Ak.A02(r0, AEA4, r4);
                AnonymousClass7KP.A06(r0, AEA5, A05, A01, A005);
                r0.Cvb(-1259812217);
                C1190173e.A00(r19, (Modifier) null, AnonymousClass6QP.A00(r0, R.drawable.barcelona_verifiedborder_filled_20), "", 56, 4, AnonymousClass7KB.A00(r0));
                C147188nY r42 = r0;
                C1190173e.A00(r42, AnonymousClass7Kq.A0F(r13, 16), AnonymousClass6QP.A00(r0, R.drawable.instagram_verified_pano_filled_24), "", 440, 0, C120537Bh.A00(r0).A0D);
                AnonymousClass7W3.A0f(r1);
            }
            AnonymousClass7W3.A0f(r1);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0212000_I2(imageUrl2, modifier2, i5, i4, 8, z2));
        }
    }

    public static final void A02(C147188nY r36, Modifier modifier, String str, AnonymousClass0ZU r39, float f, int i, int i2) {
        int i3;
        String str2;
        String A002;
        Modifier modifier2 = modifier;
        C147188nY r2 = r36;
        r2.Cvd(-1396252412);
        AnonymousClass0ZU r10 = r39;
        int i4 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r2, r10) | i;
        } else {
            i3 = i4;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r2, str3);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i4 & 896) == 0) {
            i3 |= C147188nY.A0H(r2, modifier2);
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i3 |= C147188nY.A02(r2, f2);
        }
        if ((i3 & 5851) != 1170 || !r2.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            float f3 = (float) 4;
            float f4 = (float) 8;
            int A0G = AnonymousClass8bP.A0G(str3, '@', 0, 6);
            if (A0G != -1) {
                str2 = C18230wP.A0s(str3, 0, A0G);
                if (A0G != -1) {
                    A002 = C86134wK.A0q(str3, A0G + 1);
                }
                A002 = AnonymousClass000.A00(1152);
            } else {
                str2 = str3;
                A002 = AnonymousClass000.A00(1152);
            }
            C121807If A04 = AnonymousClass7J9.A04(r2);
            C121807If A01 = AnonymousClass7J9.A02(r2).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 262141, 0, AnonymousClass7Hi.A03(11), 0));
            r2.Cvb(1538166871);
            C143078g4 r11 = (C143078g4) r2.AEA(AnonymousClass7DE.A04);
            C147168nV A0j = C147188nY.A0j(r2);
            AnonymousClass69J r5 = (AnonymousClass69J) C147188nY.A0n(r2);
            int i6 = 0;
            Object[] A13 = C147188nY.A13(r2, r11, A0j, r5, 8);
            boolean z = false;
            do {
                z = C147188nY.A12(r2, A13[i6], z);
                i6++;
            } while (i6 < 4);
            AnonymousClass7W3 r8 = (AnonymousClass7W3) r2;
            Object A132 = r8.A13();
            if (z || A132 == AnonymousClass7GN.A00) {
                A132 = new AnonymousClass76H(r11, A0j, r5);
                r8.A14(A132);
            }
            AnonymousClass7W3.A0w(r8, false);
            AnonymousClass76H r9 = (AnonymousClass76H) A132;
            AnonymousClass7W3.A0w(r8, false);
            boolean A10 = C147188nY.A10(r2, str3, r9, 511388516);
            Object A133 = r8.A13();
            if (A10 || A133 == AnonymousClass7GN.A00) {
                A133 = Integer.valueOf(C86104wH.A07(AnonymousClass76H.A00(r9, A04, str2).A02));
                r8.A14(A133);
            }
            AnonymousClass7W3.A0w(r8, false);
            int A042 = AnonymousClass0wJ.A04(A133);
            boolean A102 = C147188nY.A10(r2, str3, r9, 511388516);
            Object A134 = r8.A13();
            if (A102 || A134 == AnonymousClass7GN.A00) {
                A134 = Integer.valueOf(C86104wH.A07(AnonymousClass76H.A00(r9, A01, A002).A02));
                r8.A14(A134);
            }
            AnonymousClass7W3.A0w(r8, false);
            int A043 = AnonymousClass0wJ.A04(A134);
            r2.Cvb(-356909162);
            boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, (C10300i6) AnonymousClass7CZ.A01(r2), 36328529901726139L);
            Modifier modifier3 = Modifier.A00;
            if (A0E) {
                boolean A0y = C147188nY.A0y(r2, r10);
                Object A135 = r8.A13();
                if (A0y || A135 == AnonymousClass7GN.A00) {
                    A135 = AnonymousClass7W3.A0K(r8, r10, 15);
                }
                modifier3 = C117646z1.A00(modifier3, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(r8, A135, false), 15, false);
            }
            AnonymousClass7W3.A0w(r8, false);
            C147188nY r112 = r2;
            Modifier modifier4 = modifier2;
            C97886Di.A00(r112, (Alignment) null, modifier4, AnonymousClass7JR.A00(r2, new AnonymousClass8ZA(modifier2, modifier3, A04, A01, str3, str2, A002, f2, f3, f4, A043, A042), -485996838), ((i3 >> 6) & 14) | 3072, 6, false);
        } else {
            r2.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8Ra(modifier2, str3, r10, f2, i4, i2));
        }
    }

    public static final void A03(C147188nY r30, Modifier modifier, String str, AnonymousClass0ZU r33, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r13 = r30;
        r13.Cvd(-2002138052);
        int i4 = i2;
        String str2 = str;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r13, str2) | i;
        } else {
            i3 = i5;
        }
        AnonymousClass0ZU r5 = r33;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r13, r5);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r13, modifier2);
        }
        if ((i3 & 731) != 146 || !r13.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            boolean A1T = AnonymousClass0wJ.A1T(i3 & 14, 4);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r13;
            Object A13 = r1.A13();
            if (A1T || A13 == AnonymousClass7GN.A00) {
                C04220Ms.A0B(str2, 0);
                String replaceFirst = C18250wR.A0h("^(https://www\\.|http://www\\.|http://|https://|www\\.)").A00.matcher(str2).replaceFirst("");
                C04220Ms.A06(replaceFirst);
                boolean endsWith = replaceFirst.endsWith("/");
                String str3 = replaceFirst;
                if (endsWith) {
                    str3 = AnonymousClass8bN.A0D(replaceFirst, 1);
                }
                r1.A14(str3);
                A13 = str3;
            }
            String str4 = (String) A13;
            AnonymousClass799 A002 = AnonymousClass799.A00(0);
            boolean A0y = C147188nY.A0y(r13, r5);
            Object A132 = r1.A13();
            if (A0y || A132 == AnonymousClass7GN.A00) {
                A132 = AnonymousClass7W3.A0K(r1, r5, 13);
            }
            Modifier A01 = C117646z1.A01(modifier2, A002, AnonymousClass7W3.A08(r1, A132, false));
            C146288ly A07 = AnonymousClass7KV.A07(r13, false);
            Object A0p = C147188nY.A0p(r13);
            Object A0n = C147188nY.A0n(r13);
            Object A0m = C147188nY.A0m(r13);
            AnonymousClass0ZU r8 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A01);
            C147188nY.A0w(r13, r1, r8);
            AnonymousClass7W3.A0a(r13, r1, A07, A0p);
            AnonymousClass7KP.A07(r13, A0n, A0m, A003);
            r13.Cvb(460656502);
            AnonymousClass7I9.A02(r13, (Modifier) null, AnonymousClass7J9.A02(r13), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str4, 0, 1, 2, 805306368, 6, 506, AnonymousClass7KB.A03(r13), 0, false);
            AnonymousClass7W3.A0v(r1, true);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1202000_I2(modifier2, r5, str2, i4, i5, 1));
        }
    }

    public static final void A04(C147188nY r28, Modifier modifier, List list, AnonymousClass0ZU r31, int i, int i2, int i3) {
        C147188nY r15 = r28;
        int i4 = i3;
        Modifier A0d = C147188nY.A0d(r15, modifier, -251841290, i4);
        Resources resources = C147188nY.A0T(r15).getResources();
        int i5 = i;
        Integer valueOf = Integer.valueOf(i5);
        boolean A0z = C147188nY.A0z(r15, valueOf, 1157296644);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r15;
        Object A13 = r2.A13();
        if (A0z || A13 == AnonymousClass7GN.A00) {
            A13 = C120737Cg.A01(resources, valueOf, true);
            r2.A14(A13);
        }
        AnonymousClass7W3.A0w(r2, false);
        C04220Ms.A09(A13);
        AnonymousClass0ZU r4 = r31;
        boolean A0z2 = C147188nY.A0z(r15, r4, 1157296644);
        Object A132 = r2.A13();
        if (A0z2 || A132 == AnonymousClass7GN.A00) {
            A132 = AnonymousClass7W3.A0K(r2, r4, 14);
        }
        Modifier A002 = AnonymousClass6FI.A00(AnonymousClass7HZ.A03(A0d, AnonymousClass7W3.A08(r2, A132, false), false), AnonymousClass8PD.A00, true);
        C146288ly A0e = C147188nY.A0e(AnonymousClass7J3.A01((float) 4), r15, AnonymousClass7KV.A04);
        Object A0p = C147188nY.A0p(r15);
        Object A0n = C147188nY.A0n(r15);
        Object A0m = C147188nY.A0m(r15);
        AnonymousClass0ZU r9 = AnonymousClass74X.A00;
        AnonymousClass0YM A003 = C98236Es.A00(A002);
        C147188nY.A0w(r15, r2, r9);
        AnonymousClass7W3.A0a(r15, r2, A0e, A0p);
        AnonymousClass7KP.A07(r15, A0n, A0m, A003);
        r15.Cvb(-793561326);
        r15.Cvb(-783923542);
        List list2 = list;
        if (list != null) {
            AnonymousClass6MC.A00(r15, (Modifier) null, AnonymousClass00J.A0Q(list2, 2), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 8, 6);
        }
        AnonymousClass7W3.A0w(r2, false);
        AnonymousClass7I9.A02(r15, (Modifier) null, AnonymousClass7J9.A02(r15), (C114236su) null, (C134817yQ) null, (C121117Ee) null, AnonymousClass7JS.A04(r15, new Object[]{A13}, R.plurals.barcelona_profile_follower_count, i5), 0, 0, 0, 0, 0, 2042, AnonymousClass7KB.A03(r15), 0, false);
        AnonymousClass7W3.A0v(r2, true);
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8RZ(A0d, list2, r4, i5, i2, i4));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0252, code lost:
        if (X.AnonymousClass8bQ.A0n(r11) != false) goto L_0x0254;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C147188nY r67, androidx.compose.ui.Modifier r68, com.instagram.common.typedurl.ImageUrl r69, java.lang.Integer r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.util.List r76, X.AnonymousClass0ZU r77, X.AnonymousClass0ZU r78, X.AnonymousClass0YY r79, X.AnonymousClass0YY r80, int r81, int r82, int r83, boolean r84) {
        /*
            r28 = r68
            r3 = 0
            r64 = r79
            r66 = r77
            r63 = r80
            r2 = r66
            r1 = r64
            r0 = r63
            X.C86104wH.A1Q(r2, r1, r0)
            r17 = 12
            r65 = r78
            r1 = r17
            r0 = r65
            X.C04220Ms.A0B(r0, r1)
            r1 = 1419343628(0x5499770c, float:5.2730182E12)
            r0 = r67
            r0.Cvd(r1)
            r43 = r83
            r1 = r43
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x002f
            X.7Wm r28 = androidx.compose.ui.Modifier.A00
        L_0x002f:
            r2 = r0
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r4 = r2.A13()
            java.lang.Object r27 = X.AnonymousClass7GN.A00
            r1 = r27
            if (r4 != r1) goto L_0x0044
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = X.AnonymousClass7WR.A00(r2, r1)
        L_0x0044:
            X.4oM r4 = (X.C81784oM) r4
            r1 = 16
            float r1 = (float) r1
            r29 = r1
            float r1 = (float) r3
            r6 = r29
            r5 = r28
            androidx.compose.ui.Modifier r6 = X.AnonymousClass7K4.A04(r5, r6, r1)
            r11 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r0.Cvb(r11)
            X.8jl r5 = X.AnonymousClass7J3.A07
            X.8fk r10 = X.AnonymousClass7KV.A02
            X.8ly r14 = X.AnonymousClass72M.A00(r5, r0, r10)
            X.534 r9 = X.C147188nY.A0a(r0)
            java.lang.Object r13 = r0.AEA(r9)
            X.534 r7 = X.AnonymousClass7DE.A07
            java.lang.Object r12 = r0.AEA(r7)
            X.534 r26 = X.AnonymousClass7DE.A0B
            r5 = r26
            java.lang.Object r8 = r0.AEA(r5)
            X.0ZU r25 = X.AnonymousClass74X.A00
            X.0YM r6 = X.C98236Es.A00(r6)
            r5 = r25
            X.C147188nY.A0w(r0, r2, r5)
            r2.A0T = r3
            X.0YP r24 = X.AnonymousClass74X.A03
            r5 = r24
            X.0YP r23 = X.AnonymousClass7Ak.A00(r0, r14, r13, r5)
            X.0YP r22 = X.AnonymousClass74X.A02
            r5 = r22
            X.0YP r21 = X.AnonymousClass7Ak.A01(r0, r12, r5)
            r5 = r21
            java.lang.Integer r20 = X.AnonymousClass7KP.A05(r0, r8, r5, r6)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.Cvb(r5)
            r5 = -1980599550(0xffffffff89f27302, float:-5.8367534E-33)
            r0.Cvb(r5)
            r5 = 693286680(0x2952b718, float:4.6788176E-14)
            X.7Wm r5 = androidx.compose.ui.Modifier.A02(r0, r5)
            X.8jk r19 = X.AnonymousClass7J3.A01
            X.8cu r18 = X.AnonymousClass7KV.A05
            r8 = r19
            r6 = r18
            X.8ly r15 = X.AnonymousClass72N.A00(r8, r0, r6)
            java.lang.Object r14 = X.C147188nY.A0s(r0, r9)
            java.lang.Object r8 = r0.AEA(r7)
            r6 = r26
            java.lang.Object r13 = r0.AEA(r6)
            X.0YM r12 = X.C98236Es.A00(r5)
            r6 = r25
            X.C147188nY.A0w(r0, r2, r6)
            r2.A0T = r3
            r6 = r24
            X.AnonymousClass7Ak.A02(r0, r15, r6)
            r6 = r23
            X.AnonymousClass7Ak.A02(r0, r14, r6)
            r6 = r22
            X.AnonymousClass7Ak.A02(r0, r8, r6)
            r8 = r20
            r6 = r21
            X.AnonymousClass7KP.A06(r0, r13, r8, r6, r12)
            X.7VA r12 = X.AnonymousClass7VA.A00
            r6 = -985917338(0xffffffffc53c1866, float:-3009.525)
            r0.Cvb(r6)
            r48 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            androidx.compose.ui.Modifier r12 = r12.DB5(r5, r6, r8)
            float r6 = A00
            androidx.compose.ui.Modifier r16 = X.AnonymousClass7Kq.A07(r12, r6)
            X.8jl r6 = X.AnonymousClass7J3.A06
            r0.Cvb(r11)
            r15 = 6
            X.8ly r14 = X.AnonymousClass72M.A00(r6, r0, r10)
            java.lang.Object r13 = X.C147188nY.A0s(r0, r9)
            java.lang.Object r12 = r0.AEA(r7)
            r6 = r26
            java.lang.Object r11 = r0.AEA(r6)
            X.0YM r10 = X.C98236Es.A00(r16)
            r6 = r25
            X.C147188nY.A0w(r0, r2, r6)
            r2.A0T = r3
            r6 = r24
            X.AnonymousClass7Ak.A02(r0, r14, r6)
            r6 = r23
            X.AnonymousClass7Ak.A02(r0, r13, r6)
            r6 = r22
            X.AnonymousClass7Ak.A02(r0, r12, r6)
            r12 = r20
            r6 = r21
            X.AnonymousClass7KP.A06(r0, r11, r12, r6, r10)
            r6 = 3139292(0x2fe6dc, float:4.399085E-39)
            r0.Cvb(r6)
            r14 = r71
            r32 = r72
            if (r72 == 0) goto L_0x035b
            int r6 = r32.length()
            if (r6 == 0) goto L_0x035b
            r12 = r32
        L_0x014d:
            X.7J9 r6 = X.C120537Bh.A02(r0)
            X.7If r10 = r6.A04
            r60 = 0
            r6 = 24
            long r39 = X.AnonymousClass7Hi.A03(r6)
            r6 = 30
            long r41 = X.AnonymousClass7Hi.A03(r6)
            r36 = 196605(0x2fffd, float:2.75502E-40)
            X.7If r6 = new X.7If
            r33 = r6
            r34 = r48
            r35 = r48
            r37 = r60
            r33.<init>(r34, r35, r36, r37, r39, r41)
            X.7If r11 = r10.A01(r6)
            r10 = -368366542(0xffffffffea0b2c32, float:-4.206235E25)
            kotlin.jvm.internal.KtLambdaShape6S1200000_I2 r6 = new kotlin.jvm.internal.KtLambdaShape6S1200000_I2
            r6.<init>(r11, r4, r12, r8)
            X.8sI r36 = X.AnonymousClass7JR.A00(r0, r6, r10)
            r37 = 3072(0xc00, float:4.305E-42)
            r38 = 7
            r33 = r0
            r39 = r3
            X.C97886Di.A00(r33, r34, r35, r36, r37, r38, r39)
            r6 = -1372609794(0xffffffffae2fa2fe, float:-3.993516E-11)
            r0.Cvb(r6)
            boolean r6 = X.C86104wH.A1X(r4)
            r42 = r82
            r41 = r81
            if (r6 != 0) goto L_0x01b9
            r6 = 4
            float r6 = (float) r6
            androidx.compose.ui.Modifier r34 = X.AnonymousClass7K4.A05(r5, r1, r6, r1, r1)
            r37 = 1060320051(0x3f333333, float:0.7)
            int r6 = r82 >> 6
            r6 = r6 & 14
            r6 = r6 | 3456(0xd80, float:4.843E-42)
            int r10 = r81 << 3
            r10 = r10 & 112(0x70, float:1.57E-43)
            r6 = r6 | r10
            r35 = r14
            r36 = r65
            r38 = r6
            A02(r33, r34, r35, r36, r37, r38, r39)
        L_0x01b9:
            X.AnonymousClass7W3.A0w(r2, r3)
            X.AnonymousClass7W3.A0v(r2, r8)
            r6 = r29
            androidx.compose.ui.Modifier r34 = X.AnonymousClass7K4.A05(r5, r6, r1, r1, r1)
            int r6 = r81 >> 3
            r6 = r6 & 14
            r6 = r6 | 384(0x180, float:5.38E-43)
            int r10 = r81 >> 6
            r10 = r10 & 112(0x70, float:1.57E-43)
            r6 = r6 | r10
            r44 = r84
            r29 = r69
            r35 = r29
            r36 = r6
            r37 = r3
            r38 = r44
            A00(r33, r34, r35, r36, r37, r38)
            X.AnonymousClass7W3.A0v(r2, r8)
            r6 = 1509093387(0x59f2f00b, float:8.5476093E15)
            r0.Cvb(r6)
            boolean r4 = X.C86104wH.A1X(r4)
            if (r4 == 0) goto L_0x020c
            r4 = r17
            float r4 = (float) r4
            androidx.compose.ui.Modifier r34 = X.AnonymousClass7K4.A05(r5, r1, r4, r1, r1)
            r37 = 1061997773(0x3f4ccccd, float:0.8)
            int r4 = r82 >> 6
            r4 = r4 & 14
            r4 = r4 | 3456(0xd80, float:4.843E-42)
            int r6 = r81 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            r35 = r14
            r36 = r65
            r38 = r4
            A02(r33, r34, r35, r36, r37, r38, r39)
        L_0x020c:
            X.AnonymousClass7W3.A0w(r2, r3)
            r4 = 1509093615(0x59f2f0ef, float:8.5477317E15)
            r0.Cvb(r4)
            r33 = r73
            if (r73 == 0) goto L_0x023b
            boolean r4 = X.AnonymousClass8bQ.A0n(r33)
            if (r4 != 0) goto L_0x023b
            r4 = r17
            float r4 = (float) r4
            androidx.compose.ui.Modifier r35 = X.AnonymousClass7K4.A05(r5, r1, r4, r1, r1)
            int r4 = r81 >> 12
            r4 = r4 & 14
            r38 = r4 | 48
            int r4 = r82 << 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r38 = r38 | r4
            r34 = r0
            r36 = r33
            r37 = r63
            X.C100376Nb.A00(r34, r35, r36, r37, r38, r39)
        L_0x023b:
            X.AnonymousClass7W3.A0w(r2, r3)
            r11 = r75
            r34 = r74
            if (r74 == 0) goto L_0x0254
            boolean r4 = X.AnonymousClass8bQ.A0n(r34)
            if (r4 != 0) goto L_0x0254
            if (r75 == 0) goto L_0x0254
            boolean r4 = X.AnonymousClass8bQ.A0n(r11)
            r17 = 1
            if (r4 == 0) goto L_0x0256
        L_0x0254:
            r17 = 0
        L_0x0256:
            r36 = r76
            r30 = r70
            if (r70 != 0) goto L_0x025e
            if (r17 == 0) goto L_0x033b
        L_0x025e:
            r13 = 8
            float r4 = (float) r13
            androidx.compose.ui.Modifier r16 = X.AnonymousClass7K4.A05(r5, r1, r4, r1, r1)
            r6 = r19
            r4 = r18
            X.8ly r10 = X.C147188nY.A0e(r6, r0, r4)
            java.lang.Object r9 = X.C147188nY.A0s(r0, r9)
            java.lang.Object r6 = r0.AEA(r7)
            r4 = r26
            java.lang.Object r12 = r0.AEA(r4)
            X.0YM r7 = X.C98236Es.A00(r16)
            r4 = r25
            X.C147188nY.A0w(r0, r2, r4)
            r2.A0T = r3
            r4 = r24
            X.AnonymousClass7Ak.A02(r0, r10, r4)
            r4 = r23
            X.AnonymousClass7Ak.A02(r0, r9, r4)
            r4 = r22
            X.AnonymousClass7Ak.A02(r0, r6, r4)
            r6 = r20
            r4 = r21
            X.AnonymousClass7KP.A06(r0, r12, r6, r4, r7)
            r4 = 1272063929(0x4bd227b9, float:2.7545458E7)
            r0.Cvb(r4)
            r4 = -1372608754(0xffffffffae2fa70e, float:-3.9938768E-11)
            r0.Cvb(r4)
            if (r70 == 0) goto L_0x02c5
            int r22 = r30.intValue()
            int r4 = r81 >> 21
            r6 = r4 & 14
            r23 = r6 | 64
            r4 = r4 & 896(0x380, float:1.256E-42)
            r23 = r23 | r4
            r18 = r0
            r19 = r48
            r20 = r36
            r21 = r66
            r24 = r13
            A04(r18, r19, r20, r21, r22, r23, r24)
        L_0x02c5:
            X.AnonymousClass7W3.A0w(r2, r3)
            r4 = -1372608485(0xffffffffae2fa81b, float:-3.99397E-11)
            r0.Cvb(r4)
            if (r70 == 0) goto L_0x02f8
            if (r17 == 0) goto L_0x02f8
            float r4 = (float) r15
            androidx.compose.ui.Modifier r46 = X.AnonymousClass7K4.A04(r5, r4, r1)
            long r58 = X.AnonymousClass7KB.A03(r0)
            X.7If r47 = X.AnonymousClass7J9.A02(r0)
            r55 = 54
            r57 = 2040(0x7f8, float:2.859E-42)
            java.lang.String r51 = "·"
            r45 = r0
            r49 = r48
            r50 = r48
            r52 = r3
            r53 = r3
            r54 = r3
            r56 = r3
            r62 = r3
            X.AnonymousClass7I9.A02(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r60, r62)
        L_0x02f8:
            X.AnonymousClass7W3.A0w(r2, r3)
            if (r74 == 0) goto L_0x0338
            boolean r1 = X.AnonymousClass8bQ.A0n(r34)
            if (r1 != 0) goto L_0x0338
            if (r75 == 0) goto L_0x0338
            boolean r1 = X.AnonymousClass8bQ.A0n(r11)
            if (r1 != 0) goto L_0x0338
            int r5 = r81 >> 15
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1 = r64
            boolean r1 = X.C147188nY.A10(r0, r1, r11, r4)
            java.lang.Object r4 = r2.A13()
            if (r1 != 0) goto L_0x0320
            r1 = r27
            if (r4 != r1) goto L_0x0328
        L_0x0320:
            r4 = 20
            r1 = r64
            kotlin.jvm.internal.KtLambdaShape4S1100000_I2 r4 = X.AnonymousClass7W3.A0N(r2, r1, r11, r4)
        L_0x0328:
            X.0ZU r18 = X.AnonymousClass7W3.A08(r2, r4, r3)
            r19 = r5 & 14
            r20 = 4
            r15 = r0
            r16 = r48
            r17 = r34
            A03(r15, r16, r17, r18, r19, r20)
        L_0x0338:
            X.AnonymousClass7W3.A0v(r2, r8)
        L_0x033b:
            X.AnonymousClass7W3.A0v(r2, r8)
            X.8nW r1 = r0.AKE()
            if (r1 == 0) goto L_0x035a
            X.8UE r0 = new X.8UE
            r27 = r0
            r31 = r14
            r35 = r11
            r37 = r66
            r38 = r65
            r39 = r64
            r40 = r63
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x035a:
            return
        L_0x035b:
            r6 = 64
            java.lang.String r12 = X.AnonymousClass8bP.A0V(r14, r6)
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121947Ix.A01(X.8nY, androidx.compose.ui.Modifier, com.instagram.common.typedurl.ImageUrl, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.0ZU, X.0ZU, X.0YY, X.0YY, int, int, int, boolean):void");
    }
}
