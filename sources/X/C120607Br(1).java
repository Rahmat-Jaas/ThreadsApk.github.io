package X;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape10S0200000_I2_5;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0102000_I2;
import kotlin.jvm.internal.KtLambdaShape7S0300000_I2_2;

/* renamed from: X.7Br  reason: invalid class name and case insensitive filesystem */
public final class C120607Br {
    public static final void A02(C147188nY r17, F6t f6t, int i) {
        F6t f6t2 = f6t;
        C04220Ms.A0B(f6t2, 0);
        C147188nY r9 = r17;
        r9.Cvd(1033350377);
        Object A0o = C147188nY.A0o(r9);
        C81784oM A01 = AnonymousClass7Aj.A01(r9, f6t2.A04);
        Object AEA = r9.AEA(AnonymousClass7DA.A03);
        Unit unit = Unit.A00;
        AnonymousClass7K5.A05(r9, unit, new KtSLambdaShape12S0301000_I2_4(AEA, A0o, f6t2, (C146958n9) null, 13));
        if (((KtCSuperShape0S0210000_I2) C147188nY.A0u(r9, A01, 410107446)).A00 instanceof BNL) {
            AnonymousClass7K5.A05(r9, unit, new KtSLambdaShape10S0200000_I2_5(A0o, f6t2, (C146958n9) null, 26));
        }
        AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r9, false);
        AnonymousClass534 r6 = AnonymousClass7DE.A02;
        int CfL = C147188nY.A0k(r9, r6).CfL((float) 1);
        int CfL2 = C147188nY.A0k(r9, r6).CfL((float) 350);
        if (C04220Ms.A0I(((KtCSuperShape0S0210000_I2) A01.getValue()).A00, EHE.A00) || (((KtCSuperShape0S0210000_I2) A01.getValue()).A00 instanceof BNM)) {
            r9.Cvb(410108346);
            A01(r9, Modifier.A04(Modifier.A00), new KtLambdaShape7S0300000_I2_2(42, A0o, f6t2, A01), 48, 0);
        } else {
            AnonymousClass70T.A01((AnonymousClass79L) null, r9, Modifier.A05(Modifier.A02(r9, 410108841)), (C142918fo) null, AnonymousClass7JR.A00(r9, new KtLambdaShape3S0102000_I2(f6t2, CfL, CfL2, 12), 2048234223), 196614, 30, 0, 0);
        }
        AnonymousClass7W3.A0w(A04, false);
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, f6t2, i, 6);
        }
    }

    public static final int A00(Context context) {
        if (Build.VERSION.SDK_INT >= 33 && context.getApplicationInfo().targetSdkVersion >= 33) {
            return 2131827869;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return 2131827845;
        }
        return 2131827890;
    }

    public static final void A01(C147188nY r33, Modifier modifier, AnonymousClass0ZU r35, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r12 = r33;
        r12.Cvd(1069186098);
        int i4 = i2;
        AnonymousClass0ZU r2 = r35;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r12, r2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r12, modifier2);
        }
        if ((i3 & 91) != 18 || !r12.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            String A02 = AnonymousClass7JS.A02(r12, AnonymousClass7JS.A01(r12, A00(C147188nY.A0T(r12))), 2131827891);
            float f = (float) 16;
            Modifier A03 = AnonymousClass7K4.A03(modifier2, f);
            C146288ly A0f = C147188nY.A0f(AnonymousClass7J3.A02(AnonymousClass7KV.A04, f), r12, AnonymousClass7KV.A00);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r6 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A03);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r0, r6);
            AnonymousClass7W3.A0a(r12, r0, A0f, A0p);
            AnonymousClass7KP.A07(r12, A0n, A0m, A00);
            r12.Cvb(691302396);
            AnonymousClass7I9.A02(r12, (Modifier) null, C120537Bh.A02(r12).A05, (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), A02, 0, 0, 0, 0, 0, 1982, 0, 0, false);
            AnonymousClass7I9.A02(r12, (Modifier) null, AnonymousClass7J9.A03(r12), (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), AnonymousClass7JS.A01(r12, 2131827893), 0, 0, 0, 0, 0, 1982, 0, 0, false);
            String A01 = AnonymousClass7JS.A01(r12, 2131827892);
            C123327Wm r7 = Modifier.A00;
            boolean A0y = C147188nY.A0y(r12, r2);
            Object A13 = r0.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0P(r0, r2, 46);
            }
            C147188nY r14 = r12;
            AnonymousClass7I9.A02(r14, AnonymousClass7HZ.A03(r7, AnonymousClass7W3.A09(r0, A13, false), false), AnonymousClass7J9.A03(r12), (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), A01, 0, 0, 0, 0, 0, 1976, AnonymousClass7KB.A04(r12), 0, false);
            AnonymousClass7W3.A0v(r0, true);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(modifier2, i5, r2, i4, 28));
        }
    }
}
