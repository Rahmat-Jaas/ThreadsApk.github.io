package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import kotlin.jvm.internal.KtLambdaShape1S0502000_I2;
import kotlin.jvm.internal.KtLambdaShape20S0301000_I2;

/* renamed from: X.6MU  reason: invalid class name */
public final class AnonymousClass6MU {
    public static final void A00(C147188nY r26, Modifier modifier, AnonymousClass0ZU r28, AnonymousClass0YY r29, AnonymousClass0YP r30, AnonymousClass8s2 r31, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r7 = r28;
        AnonymousClass8s2 r6 = r31;
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r7);
        AnonymousClass0YY r14 = r29;
        AnonymousClass0YP r13 = r30;
        AnonymousClass0wJ.A1Q(r14, r13);
        C147188nY r15 = r26;
        r15.Cvd(-1500057891);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r15, r6) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r15, r7);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r15, r14);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0C(r15, r13);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0J(r15, modifier2);
        }
        if ((46811 & i3) != 9362 || !r15.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r15;
            Object A13 = r5.A13();
            Object obj = AnonymousClass7GN.A00;
            if (A13 == obj) {
                A13 = AnonymousClass7WR.A00(r5, (Object) null);
            }
            C970267q r17 = C970267q.POST;
            C139378Ns r19 = C139378Ns.A00;
            C139388Nt r20 = C139388Nt.A00;
            float f = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(AnonymousClass73T.A00(r15, modifier2, AnonymousClass687.Middle, 0, A1Z), f, f, f, (float) 16);
            boolean A0y = C147188nY.A0y(r15, r7);
            Object A132 = r5.A13();
            if (A0y || A132 == obj) {
                A132 = AnonymousClass7W3.A0G(r5, r7, A1Z ? 1 : 0);
            }
            Modifier A00 = C117646z1.A00(A05, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(r5, A132, false), 15, false);
            float f2 = (float) 50;
            boolean A10 = C147188nY.A10(r15, r6, A13, 511388516);
            Object A133 = r5.A13();
            if (A10 || A133 == obj) {
                A133 = AnonymousClass7W3.A0L(r5, r6, A13, 24);
            }
            C117756zC.A01(r15, A00, r17, (AnonymousClass0YY) null, r19, r20, AnonymousClass7W3.A0A(r5, A133, false), AnonymousClass7JR.A00(r15, new KtLambdaShape20S0301000_I2(i3, 0, A13, r13, r14), -361880945), r6, f2, ((i3 << 3) & 112) | 102264198, 0);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            ((AnonymousClass7WO) AKE).A06 = new KtLambdaShape1S0502000_I2(r14, r13, r6, r7, modifier2, i5, i4, A1Z ? 1 : 0);
        }
    }
}
