package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7JK  reason: invalid class name */
public final class AnonymousClass7JK {
    public static final long A01 = C86104wH.A0C(Float.NaN, Float.NaN);
    public static final long A02 = C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final long A00;

    public static final float A00(long j) {
        if (j != A01) {
            return Float.intBitsToFloat(C86104wH.A08(j));
        }
        throw C18180wK.A0a("Size is unspecified");
    }

    public static final float A02(long j) {
        if (j != A01) {
            return C86104wH.A00(j);
        }
        throw C18180wK.A0a("Size is unspecified");
    }

    public static String A03(long j) {
        if (j != A01) {
            return AnonymousClass00U.A0e("Size(", C115856w1.A00(A02(j)), ", ", C115856w1.A00(A00(j)), ')');
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass7JK) || j != ((AnonymousClass7JK) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return A03(this.A00);
    }

    public /* synthetic */ AnonymousClass7JK(long j) {
        this.A00 = j;
    }

    public static final float A01(long j) {
        return Math.min(Math.abs(A02(j)), Math.abs(A00(j)));
    }
}
