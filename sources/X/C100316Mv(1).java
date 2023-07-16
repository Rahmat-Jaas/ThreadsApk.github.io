package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import kotlin.jvm.internal.KtLambdaShape1S1211000_I2;

/* renamed from: X.6Mv  reason: invalid class name and case insensitive filesystem */
public final class C100316Mv {
    public static final void A00(C147188nY r19, String str, AnonymousClass0ZU r21, AnonymousClass0ZU r22, int i, boolean z) {
        int i2;
        String str2 = str;
        AnonymousClass0ZU r13 = r21;
        AnonymousClass0wJ.A1M(str2, 0, r13);
        AnonymousClass0ZU r8 = r22;
        C04220Ms.A0B(r8, 3);
        C147188nY r14 = r19;
        r14.Cvd(542288789);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r14, str2) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0M(r14, z2);
        }
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0B(r14, r13);
        }
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0C(r14, r8);
        }
        if ((i2 & 5851) != 1170 || !r14.BCM()) {
            int i4 = 2131822089;
            if (z2) {
                i4 = 2131822086;
            }
            String A02 = AnonymousClass7JS.A02(r14, str2, i4);
            int i5 = 2131822088;
            if (z2) {
                i5 = 2131822085;
            }
            String A01 = AnonymousClass7JS.A01(r14, i5);
            Integer num = AnonymousClass006.A01;
            boolean A0y = C147188nY.A0y(r14, r8);
            AnonymousClass7W3 r12 = (AnonymousClass7W3) r14;
            Object A13 = r12.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0H(r12, r8, 10);
            }
            KtCSuperShape0S2210000_I2 ktCSuperShape0S2210000_I2 = new KtCSuperShape0S2210000_I2(num, A01, AnonymousClass7W3.A08(r12, A13, false), 12);
            KtCSuperShape0S2210000_I2 ktCSuperShape0S2210000_I22 = new KtCSuperShape0S2210000_I2(AnonymousClass006.A00, AnonymousClass7JS.A01(r14, 2131822084), (AnonymousClass0ZU) null, 28);
            AnonymousClass6QY.A00(r14, ktCSuperShape0S2210000_I2, ktCSuperShape0S2210000_I22, (KtCSuperShape0S2210000_I2) null, A02, (String) null, r13, ((i2 >> 6) & 14) | 12582912, 100, false, true);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1211000_I2(r13, r8, str2, i3, 3, z2));
        }
    }
}
