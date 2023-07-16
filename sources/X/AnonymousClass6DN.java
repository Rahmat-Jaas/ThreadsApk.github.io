package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.Arrays;

/* renamed from: X.6DN  reason: invalid class name */
public final class AnonymousClass6DN {
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DN) && Float.compare(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) == 0);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) + 31) * 31 * 31 * 31;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RoundingOptions(isCircular=");
        A0s.append(true);
        A0s.append(", cornerRadius=");
        A0s.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0s.append(", cornerRadii=");
        A0s.append(Arrays.toString((float[]) null));
        A0s.append(", isAntiAliased=");
        A0s.append(false);
        C86134wK.A1U(A0s, ", isForceRoundAtDecode=");
        return AnonymousClass0wJ.A0u(A0s);
    }
}
