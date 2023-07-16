package X;

import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4;

/* renamed from: X.6QQ  reason: invalid class name */
public final class AnonymousClass6QQ {
    public static final void A00(C147188nY r8, AnonymousClass066 r9, AnonymousClass0YP r10, int i, int i2) {
        Object obj = r9;
        AnonymousClass0YP r6 = r10;
        C04220Ms.A0B(r10, 1);
        r8.Cvd(164790624);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i;
        if (i4 != 0) {
            i6 = i | 2;
        }
        if ((i2 & 2) != 0) {
            i6 |= 48;
        } else if ((i & 112) == 0) {
            i6 |= C147188nY.A0A(r8, r10);
        }
        if (i4 == 1 && (i6 & 91) == 18 && r8.BCM()) {
            r8.CuJ();
        } else {
            r8.CvD();
            if ((i & 1) != 0 && !r8.Acj()) {
                r8.CuJ();
            } else if (i4 != 0) {
                obj = r8.AEA(AnonymousClass7DA.A03);
            }
            r8.AKA();
            AnonymousClass7K5.A04(r8, obj, new KtLambdaShape43S0200000_I2_4(45, C115806vw.A01(r8, r10), obj));
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(obj, i5, r6, i3, 24));
        }
    }
}
