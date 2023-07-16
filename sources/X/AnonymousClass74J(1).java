package X;

import androidx.compose.foundation.pager.PagerState;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.74J  reason: invalid class name */
public final class AnonymousClass74J {
    public static final float A00 = ((float) 56);
    public static final AnonymousClass7VI A01 = new AnonymousClass7VI();
    public static final AnonymousClass7ZG A02 = new AnonymousClass7ZG();
    public static final AnonymousClass0YM A03 = AnonymousClass8ZZ.A00;

    public static final PagerState A00(C147188nY r6, int i, int i2) {
        r6.Cvb(144687223);
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        C141738cs r3 = PagerState.A0C;
        boolean A10 = C147188nY.A10(r6, Integer.valueOf(i), Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), 511388516);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r6;
        Object A13 = r2.A13();
        if (A10 || A13 == AnonymousClass7GN.A00) {
            A13 = new AnonymousClass8DZ(i);
            r2.A14(A13);
        }
        PagerState pagerState = (PagerState) AnonymousClass6EN.A00(r6, r3, AnonymousClass7W3.A08(r2, A13, false), objArr, 4);
        AnonymousClass7W3.A0w(r2, false);
        return pagerState;
    }
}
