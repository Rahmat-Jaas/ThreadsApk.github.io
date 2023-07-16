package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape27S0200000_I2_11;
import kotlin.jvm.internal.KtLambdaShape31S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape5S1301000_I2;

/* renamed from: X.70p  reason: invalid class name and case insensitive filesystem */
public final class C1183570p {
    public static final void A00(C147188nY r21, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, AnonymousClass0YY r23, int i) {
        int i2;
        C147188nY r7 = r21;
        r7.Cvd(-1120194374);
        int i3 = i;
        KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I22 = ktCSuperShape0S3100000_I2;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r7, ktCSuperShape0S3100000_I22) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0YY r3 = r23;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r7, r3);
        }
        if ((i2 & 91) != 18 || !r7.BCM()) {
            ImageUrl imageUrl = (ImageUrl) ktCSuperShape0S3100000_I22.A00;
            String str = ktCSuperShape0S3100000_I22.A01;
            String str2 = ktCSuperShape0S3100000_I22.A02;
            Modifier A00 = C115656vh.A00(Modifier.A00, C120537Bh.A00(r7).A07);
            boolean A10 = C147188nY.A10(r7, r3, ktCSuperShape0S3100000_I22, 511388516);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r7;
            Object A13 = r5.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape27S0200000_I2_11(5, ktCSuperShape0S3100000_I22, r3);
                r5.A14(A13);
            }
            C121747Hv.A00(r7, A00, imageUrl, (C146798ms) null, (AnonymousClass5I7) null, str, str2, (String) null, AnonymousClass7W3.A08(r5, A13, false), (AnonymousClass0YY) null, (AnonymousClass0YM) null, 0, 0, 14320, false, false, false, false);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, ktCSuperShape0S3100000_I22, r3, i3, 24);
        }
    }

    public static final void A01(C147188nY r23, String str, List list, AnonymousClass0ZU r26, AnonymousClass0YY r27, int i) {
        C147188nY r11 = r23;
        r11.Cvd(1435656190);
        float f = (float) 0;
        float f2 = f;
        String str2 = str;
        if (str == null) {
            f = (float) 16;
        }
        C123327Wm A00 = Modifier.A00(r11);
        C146288ly A04 = AnonymousClass7KV.A04(r11);
        Object A0p = C147188nY.A0p(r11);
        Object A0n = C147188nY.A0n(r11);
        Object A0m = C147188nY.A0m(r11);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A00);
        AnonymousClass7W3 r5 = (AnonymousClass7W3) r11;
        C147188nY.A0w(r11, r5, r1);
        AnonymousClass7W3.A0a(r11, r5, A04, A0p);
        AnonymousClass7KP.A07(r11, A0n, A0m, A002);
        AnonymousClass7V5 r12 = AnonymousClass7V5.A00;
        r11.Cvb(-371969336);
        AnonymousClass7V9 r8 = new AnonymousClass7V9(f2, (float) 4, f2, f);
        Modifier DB5 = r12.DB5(A00, 1.0f, false);
        List list2 = list;
        AnonymousClass0YY r3 = r27;
        int i2 = i;
        C115696vl.A01((C142708fS) null, (C145058jl) null, r8, (LazyListState) null, r11, (C142878fk) null, DB5, new KtLambdaShape31S0201000_I2(i2, 6, r3, list2), 12582912, 122, false, true);
        AnonymousClass0ZU r16 = r26;
        if (str2 != null) {
            AnonymousClass6QT.A00(r11, (Modifier) null, str2, (String) null, (String) null, r16, (AnonymousClass0ZU) null, ((i >> 3) & 14) | ((i >> 6) & 112), 0, 2044, false, false, false, false, false);
        }
        AnonymousClass7W3.A0v(r5, true);
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new KtLambdaShape5S1301000_I2(str2, list2, r16, r3, i2));
        }
    }
}
