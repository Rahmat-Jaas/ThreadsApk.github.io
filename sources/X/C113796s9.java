package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6s9  reason: invalid class name and case insensitive filesystem */
public final class C113796s9 {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;

    public final void A00(float f, float f2, float f3, float f4) {
        this.A01 = Math.max(f, this.A01);
        this.A03 = Math.max(f2, this.A03);
        this.A02 = Math.min(f3, this.A02);
        this.A00 = Math.min(f4, this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("MutableRect(");
        C115856w1.A01(A0s, this.A01);
        A0s.append(", ");
        C115856w1.A01(A0s, this.A03);
        A0s.append(", ");
        C115856w1.A01(A0s, this.A02);
        A0s.append(", ");
        C115856w1.A01(A0s, this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
