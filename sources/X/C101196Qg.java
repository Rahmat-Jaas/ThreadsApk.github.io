package X;

import android.app.Activity;
import androidx.compose.foundation.lazy.LazyListState;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1;

/* renamed from: X.6Qg  reason: invalid class name and case insensitive filesystem */
public final class C101196Qg {
    public static final void A00(LazyListState lazyListState, C147188nY r11, int i, int i2) {
        int i3;
        C04220Ms.A0B(lazyListState, 0);
        r11.Cvd(-237543117);
        if ((i2 & 14) == 0) {
            i3 = C147188nY.A0F(r11, lazyListState) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= C147188nY.A04(r11, i);
        }
        if ((i3 & 91) != 18 || !r11.BCM()) {
            Activity A00 = C10040hd.A00(C147188nY.A0T(r11));
            UserSession A002 = AnonymousClass7CZ.A00(r11);
            C11630kW A003 = C1189973c.A00(r11);
            Object[] A13 = C147188nY.A13(r11, A00, A002, A003, Integer.valueOf(i));
            int i4 = 0;
            boolean z = false;
            do {
                z = C147188nY.A12(r11, A13[i4], z);
                i4++;
            } while (i4 < 4);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r11;
            Object A132 = r1.A13();
            if (z || A132 == AnonymousClass7GN.A00) {
                A132 = new C105956eG(A00, A003, A002, i);
                r1.A14(A132);
            }
            AnonymousClass7W3.A0w(r1, false);
            AnonymousClass7K5.A05(r11, lazyListState, new KtSLambdaShape1S0300000_I2(A132, (Object) lazyListState, (C146958n9) null, 26));
            AnonymousClass6QQ.A00(r11, (AnonymousClass066) null, new KtLambdaShape168S0100000_I2_1(A132, 32), 0, 1);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, lazyListState, i, i2, 8);
        }
    }
}
