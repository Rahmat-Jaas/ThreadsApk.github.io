package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.53w  reason: invalid class name and case insensitive filesystem */
public final class C877253w extends C98126Eh {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C877253w) {
                C877253w r5 = (C877253w) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C877253w(float f, float f2, int i, int i2, int i3) {
        f = (i3 & 1) != 0 ? BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        int A002 = C18220wO.A00(i3, i);
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.A01 = f;
        this.A00 = f2;
        this.A02 = A002;
        this.A03 = i2;
    }

    public final int hashCode() {
        return (((C86104wH.A05(C86134wK.A03(this.A01), this.A00) + this.A02) * 31) + this.A03) * 31;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A0s = C18190wL.A0s("Stroke(width=");
        A0s.append(this.A01);
        A0s.append(", miter=");
        A0s.append(this.A00);
        A0s.append(", cap=");
        int i = this.A02;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else if (i == 2) {
            str = "Square";
        } else {
            str = "Unknown";
        }
        A0s.append(str);
        A0s.append(", join=");
        int i2 = this.A03;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        } else {
            str2 = "Unknown";
        }
        A0s.append(str2);
        A0s.append(", pathEffect=");
        return C86104wH.A0y((Object) null, A0s);
    }
}
