package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1201000_I2;

/* renamed from: X.6Sj  reason: invalid class name and case insensitive filesystem */
public final class C101726Sj {
    public static final void A00(C147188nY r16, String str, AnonymousClass0ZU r18, AnonymousClass0ZU r19, int i) {
        int i2;
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        AnonymousClass0ZU r3 = r18;
        AnonymousClass0ZU r2 = r19;
        AnonymousClass0wJ.A1O(r3, r2);
        C147188nY r8 = r16;
        r8.Cvd(1210262893);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r8, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r8, r3);
        }
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0B(r8, r2);
        }
        if ((i2 & 731) != 146 || !r8.BCM()) {
            boolean A0z = C147188nY.A0z(r8, r3, 1157296644);
            AnonymousClass7W3 r6 = (AnonymousClass7W3) r8;
            Object A13 = r6.A13();
            if (A0z || A13 == AnonymousClass7GN.A00) {
                A13 = C86164wN.A12(r3, 4);
                r6.A14(A13);
            }
            AnonymousClass0ZU A08 = AnonymousClass7W3.A08(r6, A13, false);
            String A02 = AnonymousClass7JS.A02(r8, str2, 2131828073);
            String A01 = AnonymousClass7JS.A01(r8, 2131828072);
            Integer num = AnonymousClass006.A0C;
            boolean A0z2 = C147188nY.A0z(r8, r2, 1157296644);
            Object A132 = r6.A13();
            if (A0z2 || A132 == AnonymousClass7GN.A00) {
                A132 = C86164wN.A12(r2, 5);
                r6.A14(A132);
            }
            AnonymousClass6QY.A00(r8, AnonymousClass6QW.A00(r8, num, AnonymousClass7W3.A08(r6, A132, false), 2131828071, 12), AnonymousClass6QW.A00(r8, (Integer) null, (AnonymousClass0ZU) null, 2131823054, 30), (KtCSuperShape0S2210000_I2) null, A02, A01, A08, 0, 224, false, false);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S1201000_I2(str2, r3, r2, i3, 13));
        }
    }
}
