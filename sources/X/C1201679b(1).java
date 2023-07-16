package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.79b  reason: invalid class name and case insensitive filesystem */
public final class C1201679b {
    public static final C1201679b A03 = new C1201679b(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, C121657He.A02(4278190080L), AnonymousClass7KC.A03);
    public final float A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1201679b) {
                C1201679b r8 = (C1201679b) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A06(C86154wM.A04(this.A01), this.A02), this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Shadow(color=");
        C86154wM.A18(this.A01, A0s);
        A0s.append(", offset=");
        C86164wN.A14(this.A02, A0s);
        A0s.append(", blurRadius=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C1201679b(float f, long j, long j2) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
    }
}
