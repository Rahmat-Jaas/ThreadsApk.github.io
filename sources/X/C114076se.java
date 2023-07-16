package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6se  reason: invalid class name and case insensitive filesystem */
public final class C114076se {
    public final C147218oz A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114076se) {
                C114076se r5 = (C114076se) obj;
                if (Float.compare(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) != 0 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C86134wK.A03(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Fade(alpha=");
        A0s.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0s.append(", animationSpec=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C114076se(C147218oz r1) {
        this.A00 = r1;
    }
}
