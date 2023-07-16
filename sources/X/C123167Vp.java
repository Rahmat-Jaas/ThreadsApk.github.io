package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Vp  reason: invalid class name and case insensitive filesystem */
public final class C123167Vp implements C142798fc, AnonymousClass8d3 {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C123167Vp) && Float.compare(this.A00, ((C123167Vp) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0Q("CornerSize(size = ", "%)", this.A00);
    }

    public C123167Vp(float f) {
        this.A00 = f;
        if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f > 100.0f) {
            throw C18190wL.A0a("The percent should be in the range of [0, 100]");
        }
    }

    public final float CxM(C147168nV r4, long j) {
        return AnonymousClass7JK.A01(j) * (this.A00 / 100.0f);
    }
}
