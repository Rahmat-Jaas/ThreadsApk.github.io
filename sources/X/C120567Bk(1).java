package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.compose.core.SwipeableState;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape0S0222000_I2;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0100001_I2;

/* renamed from: X.7Bk  reason: invalid class name and case insensitive filesystem */
public final class C120567Bk {
    public static final void A02(C147188nY r32, Modifier modifier, AnonymousClass0YY r34, int i, int i2, boolean z, boolean z2) {
        int i3;
        Alignment alignment;
        AnonymousClass0YY r5;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        AnonymousClass0YY r38 = r34;
        C04220Ms.A0B(r38, 1);
        C147188nY r1 = r32;
        r1.Cvd(2028966348);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0L(r1, z) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r1, r38);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r1, modifier2);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0O(r1, z3);
        }
        if ((i3 & 5851) != 1170 || !r1.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = C86154wM.A1Z(i7, z3);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r1;
            Object A13 = r0.A13();
            Object obj = AnonymousClass7GN.A00;
            C147258p3 r11 = (C147258p3) C86144wL.A0f(r0, A13, obj);
            SwipeableState A01 = C120527Bg.A01(r1, Boolean.valueOf(z), r38);
            C115286uo A00 = A00(r1, R.drawable.new_toggle);
            C115286uo A002 = A00(r1, R.drawable.new_toggle_active);
            C115286uo A003 = A00(r1, R.drawable.new_toggle_nub);
            C115286uo A004 = A00(r1, R.drawable.new_toggle_nub_active);
            float A02 = AnonymousClass7JK.A02(A00.A01());
            float A022 = AnonymousClass7JK.A02(A003.A01());
            float f = A022 / ((float) 5);
            float f2 = (A02 + (((float) 2) * f)) - A022;
            Float valueOf = Float.valueOf(f2);
            boolean A0y = C147188nY.A0y(r1, valueOf);
            Object A132 = r0.A13();
            if (A0y || A132 == obj) {
                A132 = AnonymousClass4WJ.A0G(C18180wK.A0p(Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), false), C18180wK.A0p(valueOf, true));
                r0.A14(A132);
            }
            AnonymousClass7W3.A0w(r0, false);
            Map map = (Map) A132;
            boolean A11 = C147188nY.A11(r1, valueOf, C147188nY.A0z(r1, A01, 511388516));
            Object A133 = r0.A13();
            if (A11 || A133 == obj) {
                A133 = new KtLambdaShape3S0100001_I2(A01, f2, 3);
                r0.A14(A133);
            }
            C123267Wf A012 = C123267Wf.A01(AnonymousClass7W3.A09(r0, A133, false));
            AnonymousClass534 r7 = AnonymousClass7DE.A02;
            float CxD = C147188nY.A0k(r1, r7).CxD(f);
            C147258p3 r19 = r11;
            Modifier A005 = C120527Bg.A00(C967266l.Horizontal, r19, AnonymousClass6E2.A00((C142668fO) null, r19, AnonymousClass6EV.A00(modifier2, C18230wP.A00(z3 ? 1 : 0)), AnonymousClass799.A00(2), r38, z, z3), A01, map, z3);
            AnonymousClass534 r4 = AnonymousClass7DE.A07;
            if (r1.AEA(r4) == AnonymousClass69J.Ltr) {
                alignment = AnonymousClass7KV.A0E;
            } else {
                alignment = AnonymousClass7KV.A0D;
            }
            C146288ly A0h = C147188nY.A0h(r1, alignment);
            Object A0s = C147188nY.A0s(r1, r7);
            Object AEA = r1.AEA(r4);
            Object A0m = C147188nY.A0m(r1);
            AnonymousClass0ZU r72 = AnonymousClass74X.A00;
            AnonymousClass0YM A006 = C98236Es.A00(A005);
            C147188nY.A0w(r1, r0, r72);
            AnonymousClass7W3.A0a(r1, r0, A0h, A0s);
            AnonymousClass7KP.A07(r1, AEA, A0m, A006);
            AnonymousClass7V3 r8 = AnonymousClass7V3.A00;
            C123327Wm A023 = Modifier.A02(r1, -2111694330);
            A01(r1, A012, AnonymousClass7K4.A06(r8.A86(AnonymousClass7KV.A0B, A023), CxD, 0), A00, A002, 72, 0);
            boolean A0y2 = C147188nY.A0y(r1, A01);
            Object A134 = r0.A13();
            if (A0y2 || A134 == obj) {
                A134 = new KtLambdaShape156S0100000_I2_11(A01, 28);
                r0.A14(A134);
            }
            AnonymousClass0YY A0B = AnonymousClass7W3.A0B(r0, A134, false);
            C04220Ms.A0B(A023, 0);
            if (C86164wN.A1Q(1, A0B)) {
                r5 = C86144wL.A16(A0B, 38);
            } else {
                r5 = InspectableValueKt.A00;
            }
            A01(r1, A012, A023.Cx6(new AnonymousClass557(A0B, r5, false)), A003, A004, 72, 0);
            AnonymousClass7W3.A0v(r0, true);
        } else {
            r1.CuJ();
        }
        C147178nW AKE = r1.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0222000_I2(r38, modifier2, i5, i4, 3, z3, z));
        }
    }

    public static final C115286uo A00(C147188nY r1, int i) {
        r1.Cvb(-308413187);
        C115286uo A00 = AnonymousClass73J.A00(C147188nY.A0T(r1).getDrawable(i), r1);
        AnonymousClass7W3.A0y(r1);
        return A00;
    }

    public static final void A01(C147188nY r33, C81784oM r34, Modifier modifier, C115286uo r36, C115286uo r37, int i, int i2) {
        C147188nY r10 = r33;
        int i3 = i2;
        Modifier A0d = C147188nY.A0d(r10, modifier, 1561960418, i3);
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
        r10.Cvb(1716267036);
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
            AKE.D9d(new KtLambdaShape2S0402000_I2(r14, r30, r24, A0d, i4, i3, 21));
        }
    }
}
