package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7FN  reason: invalid class name */
public final class AnonymousClass7FN {
    public static long A02(Object obj, long j) {
        AndroidComposeView androidComposeView = (AndroidComposeView) obj;
        AndroidComposeView.A08(androidComposeView);
        float A01 = AnonymousClass7KC.A01(j);
        long j2 = androidComposeView.A02;
        return AnonymousClass7Hf.A00(androidComposeView.A0n, A00(A01 - AnonymousClass7KC.A01(j2), AnonymousClass7KC.A02(j) - AnonymousClass7KC.A02(j2)));
    }

    public static final long A00(float f, float f2) {
        return C86104wH.A0C(f, f2);
    }

    public static long A01(C145688kv r1, float f, float f2, float f3, float f4) {
        long Biq = r1.Biq(f, f2);
        return AnonymousClass7KC.A04(Biq, AnonymousClass7KC.A03(f4, A00(AnonymousClass7KC.A01(Biq) / f3, AnonymousClass7KC.A02(Biq) / f3)));
    }

    public static final boolean A03(long j) {
        float A01 = AnonymousClass7KC.A01(j);
        if (Float.isInfinite(A01) || Float.isNaN(A01)) {
            return false;
        }
        float A02 = AnonymousClass7KC.A02(j);
        if (Float.isInfinite(A02) || Float.isNaN(A02)) {
            return false;
        }
        return true;
    }
}
