package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.internal.KtLambdaShape2S0002000_I2;

/* renamed from: X.6Do  reason: invalid class name and case insensitive filesystem */
public final class C97946Do {
    public static final LazyListState A00(C147188nY r6, int i, int i2) {
        r6.Cvb(1470655220);
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        C141738cs r3 = LazyListState.A0L;
        boolean A10 = C147188nY.A10(r6, Integer.valueOf(i), 0, 511388516);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r6;
        Object A13 = r2.A13();
        if (A10 || A13 == AnonymousClass7GN.A00) {
            A13 = new KtLambdaShape2S0002000_I2(i, 0);
            r2.A14(A13);
        }
        LazyListState lazyListState = (LazyListState) AnonymousClass6EN.A00(r6, r3, AnonymousClass7W3.A08(r2, A13, false), objArr, 4);
        AnonymousClass7W3.A0w(r2, false);
        return lazyListState;
    }
}
