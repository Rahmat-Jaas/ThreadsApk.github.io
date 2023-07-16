package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape1S1001000_I2;

/* renamed from: X.6yy  reason: invalid class name and case insensitive filesystem */
public final class C117616yy {
    public static final void A00(Modifier modifier, C147188nY r10, int i, int i2) {
        int i3;
        r10.Cvd(-2146762444);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r10, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !r10.BCM()) {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            Modifier A08 = AnonymousClass7K4.A08(modifier, 16);
            Alignment alignment = AnonymousClass7KV.A09;
            r10.Cvb(733328855);
            C146288ly A00 = C120767Cj.A00(r10, alignment, false);
            Object A0p = C147188nY.A0p(r10);
            Object A0n = C147188nY.A0n(r10);
            Object A0m = C147188nY.A0m(r10);
            AnonymousClass0ZU r2 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A08);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r10;
            C147188nY.A0w(r10, r1, r2);
            AnonymousClass7W3.A0a(r10, r1, A00, A0p);
            AnonymousClass7KP.A07(r10, A0n, A0m, A002);
            r10.Cvb(1131652026);
            A01(AnonymousClass7JS.A01(r10, 2131821873), r10, 0);
            AnonymousClass7W3.A0f(r1);
        } else {
            r10.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, modifier, i2, i, 4);
        }
    }

    public static final void A01(String str, C147188nY r30, int i) {
        int i2;
        C147188nY r5 = r30;
        r5.Cvd(1341926217);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r5, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r5.BCM()) {
            AnonymousClass7I9.A02(r5, (Modifier) null, AnonymousClass7J9.A03(r5).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 262141, 0, AnonymousClass7Hi.A03(16), 0)), (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), str2, 0, 0, 0, i2 & 14, 0, 1978, AnonymousClass7KB.A03(r5), 0, false);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1001000_I2(str2, i3, 0));
        }
    }
}
