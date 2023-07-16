package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.79Y  reason: invalid class name */
public final class AnonymousClass79Y {
    public float A00;
    public AnonymousClass745 A01;
    public boolean A02;

    public AnonymousClass79Y() {
        this((AnonymousClass745) null, (DefaultConstructorMarker) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 7, false);
    }

    public /* synthetic */ AnonymousClass79Y(AnonymousClass745 r4, DefaultConstructorMarker defaultConstructorMarker, float f, int i, boolean z) {
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A02 = true;
        this.A01 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79Y) {
                AnonymousClass79Y r5 = (AnonymousClass79Y) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && C04220Ms.A0I(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A03 = C86134wK.A03(this.A00);
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return ((A03 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RowColumnParentData(weight=");
        A0s.append(this.A00);
        A0s.append(", fill=");
        A0s.append(this.A02);
        A0s.append(", crossAxisAlignment=");
        return C86104wH.A0y(this.A01, A0s);
    }
}
