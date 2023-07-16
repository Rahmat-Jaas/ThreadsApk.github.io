package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Ei  reason: invalid class name and case insensitive filesystem */
public final class C121147Ei {
    public static final C121147Ei A02 = new C121147Ei(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121147Ei) {
                C121147Ei r5 = (C121147Ei) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C86134wK.A03(this.A00), this.A01);
    }

    public final String toString() {
        return AnonymousClass00U.A0O("TextGeometricTransform(scaleX=", ", skewX=", ')', this.A00, this.A01);
    }

    public C121147Ei(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public C121147Ei() {
        this(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }
}
