package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7KC  reason: invalid class name */
public final class AnonymousClass7KC {
    public static final long A01 = C86104wH.A0C(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long A02 = C86104wH.A0C(Float.NaN, Float.NaN);
    public static final long A03 = C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final long A00;

    public static final float A01(long j) {
        if (j != A02) {
            return C86104wH.A00(j);
        }
        throw C18180wK.A0a("Offset is unspecified");
    }

    public static final float A02(long j) {
        if (j != A02) {
            return Float.intBitsToFloat(C86104wH.A08(j));
        }
        throw C18180wK.A0a("Offset is unspecified");
    }

    public static String A06(long j) {
        if (j != A02) {
            return AnonymousClass00U.A0e("Offset(", C115856w1.A00(A01(j)), ", ", C115856w1.A00(A02(j)), ')');
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass7KC) || j != ((AnonymousClass7KC) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return A06(this.A00);
    }

    public /* synthetic */ AnonymousClass7KC(long j) {
        this.A00 = j;
    }

    public static final float A00(long j) {
        return (float) Math.sqrt((double) ((A01(j) * A01(j)) + (A02(j) * A02(j))));
    }

    public static final long A03(float f, long j) {
        return C86104wH.A0C(A01(j) * f, A02(j) * f);
    }

    public static final long A04(long j, long j2) {
        return C86104wH.A0C(A01(j) - A01(j2), A02(j) - A02(j2));
    }

    public static final long A05(long j, long j2) {
        return C86104wH.A0C(A01(j) + A01(j2), A02(j) + A02(j2));
    }
}
