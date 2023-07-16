package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.compose.core.SwipeableState;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape0S0222000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0100001_I2;

/* renamed from: X.6z7  reason: invalid class name and case insensitive filesystem */
public final class C117706z7 {
    public static final void A01(C147188nY r34, Modifier modifier, AnonymousClass0YY r36, int i, int i2, boolean z, boolean z2) {
        int i3;
        Alignment alignment;
        AnonymousClass0YY r2;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        AnonymousClass0YY r40 = r36;
        C04220Ms.A0B(r40, 1);
        C147188nY r5 = r34;
        r5.Cvd(-1524823173);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0L(r5, z) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r5, r40);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r5, modifier2);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0O(r5, z3);
        }
        if ((i3 & 5851) != 1170 || !r5.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = C86154wM.A1Z(i7, z3);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r5;
            Object A13 = r4.A13();
            Object obj = AnonymousClass7GN.A00;
            C147258p3 r19 = (C147258p3) C86144wL.A0f(r4, A13, obj);
            SwipeableState A01 = C120527Bg.A01(r5, Boolean.valueOf(z), r40);
            long j = C120537Bh.A00(r5).A0s;
            long A02 = AnonymousClass7KB.A02(r5);
            long A00 = AnonymousClass7KB.A00(r5);
            AnonymousClass534 r10 = AnonymousClass7DE.A02;
            C147168nV A0k = C147188nY.A0k(r5, r10);
            long A0C = C86104wH.A0C(A0k.CxL((float) 51), A0k.CxL((float) 31));
            float CxL = C147188nY.A0k(r5, r10).CxL((float) 14);
            Object A0r = C147188nY.A0r(r5, r4, -492369756);
            if (A0r == obj) {
                A0r = new C877453y(A0C, j);
                r4.A14(A0r);
            }
            AnonymousClass7W3.A0w(r4, false);
            C877453y r22 = (C877453y) A0r;
            Object A0r2 = C147188nY.A0r(r5, r4, -492369756);
            if (A0r2 == obj) {
                A0r2 = new C877453y(A0C, A02);
                r4.A14(A0r2);
            }
            AnonymousClass7W3.A0w(r4, false);
            C115286uo r7 = (C115286uo) A0r2;
            Object A0r3 = C147188nY.A0r(r5, r4, -492369756);
            if (A0r3 == obj) {
                A0r3 = new C877553z(A00, CxL);
                r4.A14(A0r3);
            }
            AnonymousClass7W3.A0w(r4, false);
            C877553z r0 = (C877553z) A0r3;
            Object A0r4 = C147188nY.A0r(r5, r4, -492369756);
            if (A0r4 == obj) {
                A0r4 = new C877553z(A00, CxL);
                r4.A14(A0r4);
            }
            AnonymousClass7W3.A0w(r4, false);
            C115286uo r1 = (C115286uo) A0r4;
            long j2 = r22.A01;
            float A022 = AnonymousClass7JK.A02(j2);
            long j3 = r0.A02;
            float A023 = AnonymousClass7JK.A02(j3);
            float A002 = AnonymousClass7JK.A00(j2) - AnonymousClass7JK.A00(j3);
            float f = (float) 2;
            float f2 = A002 / f;
            float f3 = (A022 - (f * f2)) - A023;
            Float valueOf = Float.valueOf(f3);
            boolean A0y = C147188nY.A0y(r5, valueOf);
            Object A132 = r4.A13();
            if (A0y || A132 == obj) {
                A132 = AnonymousClass4WJ.A0G(C18180wK.A0p(Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), false), C18180wK.A0p(valueOf, true));
                r4.A14(A132);
            }
            AnonymousClass7W3.A0w(r4, false);
            Map map = (Map) A132;
            boolean A11 = C147188nY.A11(r5, valueOf, C147188nY.A0z(r5, A01, 511388516));
            Object A133 = r4.A13();
            if (A11 || A133 == obj) {
                A133 = new KtLambdaShape3S0100001_I2(A01, f3, 2);
                r4.A14(A133);
            }
            C123267Wf A012 = C123267Wf.A01(AnonymousClass7W3.A09(r4, A133, false));
            float CxD = C147188nY.A0k(r5, r10).CxD(f2);
            C147258p3 r27 = r19;
            boolean z4 = z3;
            Modifier A003 = C120527Bg.A00(C967266l.Horizontal, r19, AnonymousClass6E2.A00((C142668fO) null, r27, AnonymousClass6EV.A00(modifier2, C18230wP.A00(z3 ? 1 : 0)), AnonymousClass799.A00(2), r40, z, z4), A01, map, z4);
            AnonymousClass534 r8 = AnonymousClass7DE.A07;
            if (r5.AEA(r8) == AnonymousClass69J.Ltr) {
                alignment = AnonymousClass7KV.A0E;
            } else {
                alignment = AnonymousClass7KV.A0D;
            }
            C146288ly A0h = C147188nY.A0h(r5, alignment);
            Object A0s = C147188nY.A0s(r5, r10);
            Object AEA = r5.AEA(r8);
            Object A0m = C147188nY.A0m(r5);
            AnonymousClass0ZU r9 = AnonymousClass74X.A00;
            AnonymousClass0YM A004 = C98236Es.A00(A003);
            C147188nY.A0w(r5, r4, r9);
            AnonymousClass7W3.A0a(r5, r4, A0h, A0s);
            AnonymousClass7KP.A07(r5, AEA, A0m, A004);
            AnonymousClass7V3 r82 = AnonymousClass7V3.A00;
            r5.Cvb(134268725);
            A00(r5, A012, (Modifier) null, r22, r7, 54, 8);
            Modifier A06 = AnonymousClass7K4.A06(r82.A86(AnonymousClass7KV.A0B, Modifier.A00), CxD, 0);
            boolean A0y2 = C147188nY.A0y(r5, A01);
            Object A134 = r4.A13();
            if (A0y2 || A134 == obj) {
                A134 = AnonymousClass7W3.A0C(r4, A01, 4);
            }
            AnonymousClass0YY A0B = AnonymousClass7W3.A0B(r4, A134, false);
            C04220Ms.A0B(A06, 0);
            if (C86164wN.A1Q(1, A0B)) {
                r2 = C86144wL.A16(A0B, 38);
            } else {
                r2 = InspectableValueKt.A00;
            }
            A00(r5, A012, A06.Cx6(new AnonymousClass557(A0B, r2, false)), r0, r1, 54, 0);
            AnonymousClass7W3.A0v(r4, true);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0222000_I2(r40, modifier2, i5, i4, 0, z3, z));
        }
    }

    public static final void A00(C147188nY r33, C81784oM r34, Modifier modifier, C115286uo r36, C115286uo r37, int i, int i2) {
        C147188nY r10 = r33;
        int i3 = i2;
        Modifier A0d = C147188nY.A0d(r10, modifier, 1963331021, i3);
        int i4 = i;
        int i5 = (i >> 9) & 14;
        C146288ly A00 = C120767Cj.A00(r10, AnonymousClass7KV.A00(r10), false);
        Object A0p = C147188nY.A0p(r10);
        Object A0n = C147188nY.A0n(r10);
        Object A0m = C147188nY.A0m(r10);
        AnonymousClass0ZU r4 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A0d);
        int A01 = C86114wI.A01((i5 << 3) & 112);
        AnonymousClass7W3 r3 = (AnonymousClass7W3) r10;
        C147188nY.A0w(r10, r3, r4);
        AnonymousClass7W3.A0a(r10, r3, A00, A0p);
        AnonymousClass7KP.A08(r10, A0n, A0m, A002, A01);
        int A05 = C86124wJ.A05(i5);
        r10.Cvb(1855572307);
        C81784oM r30 = r34;
        C115286uo r14 = r36;
        C115286uo r24 = r37;
        if ((A05 & 81) != 16 || !r10.BCM()) {
            C123327Wm r42 = Modifier.A00;
            C97846Dc.A00(r10, (Alignment) null, AnonymousClass6EV.A00(r42, 1.0f - C18240wQ.A00(r30.getValue())), (C104136bI) null, r14, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            C97846Dc.A00(r10, (Alignment) null, AnonymousClass6EV.A00(r42, C18240wQ.A00(r30.getValue())), (C104136bI) null, r24, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
        } else {
            r10.CuJ();
        }
        AnonymousClass7W3.A0f(r3);
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0402000_I2(r14, r30, r24, A0d, i4, i3, 7));
        }
    }
}
