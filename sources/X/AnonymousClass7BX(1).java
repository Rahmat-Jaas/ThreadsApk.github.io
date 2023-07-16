package X;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.KtLambdaShape1S0602000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape9S0401000_I2;

/* renamed from: X.7BX  reason: invalid class name */
public final class AnonymousClass7BX {
    public static final int A00(Context context) {
        if (Build.VERSION.SDK_INT >= 33 && context.getApplicationInfo().targetSdkVersion >= 33) {
            return 2131827869;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return 2131827845;
        }
        return 2131827890;
    }

    public static final void A01(C147188nY r24, Modifier modifier, AnonymousClass06E r26, F6u f6u, List list, AnonymousClass0ZU r29, AnonymousClass0YY r30, int i, int i2) {
        int i3;
        F6u f6u2 = f6u;
        Modifier modifier2 = modifier;
        AnonymousClass06E r14 = r26;
        C04220Ms.A0B(r14, 0);
        AnonymousClass0ZU r15 = r29;
        AnonymousClass0YY r12 = r30;
        AnonymousClass0wJ.A1O(r15, r12);
        List list2 = list;
        C04220Ms.A0B(list2, 3);
        C147188nY r0 = r24;
        r0.Cvd(-1743502985);
        int i4 = i2;
        if ((i2 & 16) != 0) {
            modifier2 = Modifier.A00;
        }
        int i5 = i;
        if ((i2 & 32) != 0) {
            C124657bX r2 = new C124657bX(C147188nY.A0T(r0), r14, AnonymousClass7CZ.A00(r0), list2);
            AnonymousClass06C A00 = AnonymousClass7CD.A00(r0);
            if (A00 != null) {
                C62793ak A002 = C98396Fj.A00(r0, r2, A00, C86104wH.A0J(A00), F6u.class, (String) null);
                AnonymousClass7W3.A0z(r0, false);
                f6u2 = (F6u) A002;
                i3 = i & -458753;
            } else {
                throw C18180wK.A0a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            i3 = i5;
        }
        Object A0o = C147188nY.A0o(r0);
        C81784oM A01 = AnonymousClass7Aj.A01(r0, f6u2.A06);
        Object AEA = r0.AEA(AnonymousClass7DA.A03);
        Unit unit = Unit.A00;
        AnonymousClass7K5.A05(r0, unit, new KtSLambdaShape9S0301000_I2_1(A0o, AEA, f6u2, (C146958n9) null, 25));
        if (((KtCSuperShape0S0220000_I2) C147188nY.A0u(r0, A01, -838629022)).A01 instanceof C130177oq) {
            AnonymousClass7K5.A05(r0, unit, new KtSLambdaShape6S0200000_I2_1(A0o, (Object) f6u2, (C146958n9) null, 9));
        }
        AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r0, false);
        if (((KtCSuperShape0S0220000_I2) C147188nY.A0u(r0, A01, -838628503)).A03) {
            C101236Qk.A00(r0, AnonymousClass7JS.A01(r0, 2131832819), 0, 0);
        }
        Object obj = ((KtCSuperShape0S0220000_I2) AnonymousClass7W3.A06(A04, A01)).A00;
        r0.Cvb(-838628372);
        if (obj != null) {
            AnonymousClass7K5.A05(r0, unit, new KtSLambdaShape6S0200000_I2_1(obj, (Object) r12, (C146958n9) null, 10));
        }
        AnonymousClass7W3.A0w(A04, false);
        C117656z2.A00(r0, modifier2, (C142918fo) null, AnonymousClass7JR.A00(r0, new KtLambdaShape9S0401000_I2(f6u2, A0o, A01, r15, i3, 3), -2138553559), ((i3 >> 12) & 14) | 196608, 30, 0);
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AnonymousClass06E r18 = r14;
            AnonymousClass0YY r142 = r12;
            AKE.D9d(new KtLambdaShape1S0602000_I2(list2, r142, f6u2, modifier2, r15, r18, i5, i4, 3));
        }
    }

    public static final void A02(C147188nY r46, Modifier modifier, AnonymousClass0ZU r48, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r12 = r46;
        r12.Cvd(-1732340154);
        int i4 = i2;
        AnonymousClass0ZU r1 = r48;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r12, r1) | i;
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
            r12.Cvb(755001616);
            AnonymousClass7I9.A02(r12, (Modifier) null, C120537Bh.A02(r12).A05, (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), A02, 0, 0, 0, 0, 0, 1982, 0, 0, false);
            AnonymousClass7I9.A02(r12, (Modifier) null, AnonymousClass7J9.A03(r12), (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), AnonymousClass7JS.A01(r12, 2131827893), 0, 0, 0, 0, 0, 1982, 0, 0, false);
            String A01 = AnonymousClass7JS.A01(r12, 2131827892);
            C123327Wm r14 = Modifier.A00;
            boolean A0y = C147188nY.A0y(r12, r1);
            Object A13 = r0.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0F(r0, r1, 46);
            }
            C147188nY r27 = r12;
            AnonymousClass7I9.A02(r27, C117646z1.A00(r14, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A09(r0, A13, false), 15, false), AnonymousClass7J9.A03(r12), (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), A01, 0, 0, 0, 0, 0, 1976, AnonymousClass7KB.A04(r12), 0, false);
            AnonymousClass7W3.A0v(r0, true);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(modifier2, i5, r1, i4, 14));
        }
    }
}
