package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import kotlin.jvm.internal.KtLambdaShape3S2102000_I2;

/* renamed from: X.6N8  reason: invalid class name */
public final class AnonymousClass6N8 {
    public static final void A00(C147188nY r18, String str, String str2, AnonymousClass0ZU r21, int i, int i2) {
        int i3;
        String str3;
        String str4;
        String str5 = str;
        AnonymousClass0ZU r15 = r21;
        C04220Ms.A0B(r15, 0);
        C147188nY r9 = r18;
        r9.Cvd(1756016215);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r9, r15) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r9, str5);
        }
        int i7 = i2 & 4;
        String str6 = str2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r9, str6);
        }
        if ((i3 & 731) != 146 || !r9.BCM()) {
            str2 = null;
            if (i6 != 0) {
                str5 = null;
            }
            if (i7 == 0) {
                str2 = str6;
            }
            if (str5 == null) {
                str3 = AnonymousClass7JS.A01(r9, 2131826851);
            } else {
                str3 = str5;
            }
            if (str2 == null) {
                str4 = AnonymousClass7JS.A01(r9, 2131827678);
            } else {
                str4 = str2;
            }
            AnonymousClass6QY.A00(r9, new KtCSuperShape0S2210000_I2(AnonymousClass006.A0C, AnonymousClass7JS.A01(r9, 2131831976), r15, 12), (KtCSuperShape0S2210000_I2) null, (KtCSuperShape0S2210000_I2) null, str3, str4, r15, (i3 & 14) | 1572864, 176, false, false);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S2102000_I2(r15, str5, str2, i4, i, 0));
        }
    }
}
