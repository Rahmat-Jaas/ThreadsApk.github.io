package X;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.KtLambdaShape10S0401000_I2;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;

/* renamed from: X.6z9  reason: invalid class name and case insensitive filesystem */
public final class C117726z9 {
    public static final void A00(C147188nY r19, C110696m7 r20, AnonymousClass0ZU r21, AnonymousClass0YY r22, int i) {
        AnonymousClass0ZU r3 = r21;
        AnonymousClass0YY r2 = r22;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r3);
        C110696m7 r4 = r20;
        C04220Ms.A0B(r4, 2);
        C147188nY r12 = r19;
        r12.Cvd(395755620);
        AnonymousClass7W3 r7 = (AnonymousClass7W3) r12;
        Object A13 = r7.A13();
        Object obj = AnonymousClass7GN.A00;
        MutableTransitionState mutableTransitionState = A13;
        if (A13 == obj) {
            MutableTransitionState mutableTransitionState2 = new MutableTransitionState(false);
            mutableTransitionState2.A02.CrC(Boolean.valueOf(A1Z));
            r7.A14(mutableTransitionState2);
            mutableTransitionState = mutableTransitionState2;
        }
        MutableTransitionState mutableTransitionState3 = (MutableTransitionState) mutableTransitionState;
        Unit unit = Unit.A00;
        AnonymousClass7K5.A05(r12, unit, new KtSLambdaShape9S0301000_I2_1(r4, r2, mutableTransitionState3, (C146958n9) null, 24));
        r12.Cvb(368868886);
        if (!AnonymousClass0wJ.A1X(mutableTransitionState3.A00.getValue()) && !AnonymousClass0wJ.A1X(mutableTransitionState3.A02.getValue())) {
            boolean A0y = C147188nY.A0y(r12, r3);
            Object A132 = r7.A13();
            if (A0y || A132 == obj) {
                A132 = AnonymousClass7W3.A07(r7, r3, 10);
            }
            AnonymousClass7W3.A0b(r12, r7, A132, unit, false);
        }
        AnonymousClass7W3.A0w(r7, false);
        C1203679w A01 = AnonymousClass7KU.A01((C147218oz) null, 3);
        C141758cu r72 = AnonymousClass7KV.A05;
        int i2 = i;
        AnonymousClass7JP.A02(A01.A00(AnonymousClass7KU.A02((C147218oz) null, r72, 9)), AnonymousClass7KU.A06((C147218oz) null, 3).A00(AnonymousClass7KU.A07((C147218oz) null, r72, 9)), mutableTransitionState3, r12, (Modifier) null, (String) null, AnonymousClass7JR.A00(r12, new KtLambdaShape10S0401000_I2(r3, mutableTransitionState3, r4, r2, i2, 2), 922067084), 200064, 18);
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i2, 15, r4, r22, r3));
        }
    }

    public static final void A01(AnonymousClass0ZU r20, String str, C147188nY r22, int i) {
        int i2;
        C147188nY r6 = r22;
        r6.Cvd(1737382226);
        int i3 = i;
        AnonymousClass0ZU r2 = r20;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r6, r2) | i;
        } else {
            i2 = i3;
        }
        String str2 = str;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r6, str2);
        }
        if ((i2 & 91) != 18 || !r6.BCM()) {
            Modifier A06 = AnonymousClass7K4.A06(Modifier.A00, (float) 20, 5);
            boolean A0y = C147188nY.A0y(r6, r2);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r6;
            Object A13 = r4.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0F(r4, r2, 39);
            }
            AnonymousClass7I9.A02(r6, C117646z1.A00(A06, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(r4, A13, false), 15, false), AnonymousClass7J9.A04(r6), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 0, 0, (i2 >> 3) & 14, 0, 2044, 0, 0, false);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A06(AKE, r2, str2, i3, 2);
        }
    }
}
