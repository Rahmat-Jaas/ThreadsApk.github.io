package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import kotlin.jvm.internal.KtLambdaShape1S0211000_I2;

/* renamed from: X.6Nw  reason: invalid class name and case insensitive filesystem */
public final class C100586Nw {
    public static final void A00(C147188nY r13, AnonymousClass0ZU r14, AnonymousClass0ZU r15, int i, boolean z) {
        int i2;
        String A01;
        AnonymousClass0ZU r12 = r14;
        AnonymousClass0ZU r3 = r15;
        AnonymousClass0wJ.A1O(r14, r15);
        C147188nY r6 = r13;
        r13.Cvd(1952830590);
        int i3 = i;
        boolean z2 = z;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0L(r13, z2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r13, r14);
        }
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0B(r13, r15);
        }
        if ((i2 & 731) != 146 || !r13.BCM()) {
            int i4 = 2131822203;
            if (z) {
                i4 = 2131822205;
            }
            String A012 = AnonymousClass7JS.A01(r13, i4);
            if (z) {
                A01 = AnonymousClass7JS.A02(r13, AnonymousClass7JS.A00(r13), 2131822204);
            } else {
                A01 = AnonymousClass7JS.A01(r13, 2131822202);
            }
            AnonymousClass6QY.A00(r6, AnonymousClass6QW.A00(r13, (Integer) null, r3, 2131831976, 14), AnonymousClass6QW.A00(r13, (Integer) null, (AnonymousClass0ZU) null, 2131823054, 30), (KtCSuperShape0S2210000_I2) null, A012, A01, r12, (i2 >> 3) & 14, 224, false, false);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass0ZU r5 = r3;
            AKE.D9d(new KtLambdaShape1S0211000_I2(r5, r12, i3, 5, z2));
        }
    }
}
