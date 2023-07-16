package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7HA  reason: invalid class name */
public final class AnonymousClass7HA {
    public static final long A01 = C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass7HA) || j != ((AnonymousClass7HA) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        StringBuilder A0s = C18190wL.A0s("(");
        A0s.append(C86104wH.A00(j));
        C86144wL.A1T(A0s);
        A0s.append(Float.intBitsToFloat(C86104wH.A08(j)));
        return C18180wK.A0i(") px/sec", A0s);
    }

    public /* synthetic */ AnonymousClass7HA(long j) {
        this.A00 = j;
    }

    public static final long A00(long j, long j2) {
        return C86104wH.A0C(C86124wJ.A02(j) - C86124wJ.A02(j2), Float.intBitsToFloat(C86104wH.A08(j)) - Float.intBitsToFloat(C86104wH.A08(j2)));
    }

    public static final long A01(long j, long j2) {
        return C86104wH.A0C(C86124wJ.A02(j) + C86124wJ.A02(j2), Float.intBitsToFloat(C86104wH.A08(j)) + Float.intBitsToFloat(C86104wH.A08(j2)));
    }
}
