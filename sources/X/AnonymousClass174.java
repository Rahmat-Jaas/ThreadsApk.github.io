package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.174  reason: invalid class name */
public final class AnonymousClass174 extends AnonymousClass0Sf {
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass174) && Float.compare(1.0f, 1.0f) == 0 && Float.compare(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) == 0);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(1.0f);
        int floatToIntBits2 = Float.floatToIntBits(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        return ((((((floatToIntBits * 31) + floatToIntBits) * 31) + floatToIntBits2) * 31) + floatToIntBits2) * 31 * 31 * 31 * 31 * 31;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RtcCallParticipantsGridDimensions(controlsStateScaleX=");
        A0s.append(1.0f);
        A0s.append(", controlsStateScaleY=");
        A0s.append(1.0f);
        A0s.append(", pivotX=");
        A0s.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0s.append(", pivotY=");
        A0s.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0s.append(", cleanStateWidth=");
        A0s.append(0);
        A0s.append(", cleanStateHeight=");
        A0s.append(0);
        A0s.append(", cleanStateTopMargin=");
        A0s.append(0);
        A0s.append(", sideMargin=");
        A0s.append(0);
        A0s.append(", verticalMargin=");
        A0s.append(0);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
