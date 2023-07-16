package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.5I6  reason: invalid class name */
public final class AnonymousClass5I6 extends AnonymousClass0Sf {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;

    public AnonymousClass5I6(Integer num, float f, int i, int i2) {
        C04220Ms.A0B(num, 4);
        this.A01 = i;
        this.A02 = i2;
        this.A00 = f;
        this.A03 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5I6) {
                AnonymousClass5I6 r5 = (AnonymousClass5I6) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && Float.compare(this.A00, r5.A00) == 0 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A05 = C86104wH.A05(((this.A01 * 31) + this.A02) * 31, this.A00);
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "RIGHT";
                break;
            case 2:
                str = "END_NEXT";
                break;
            case 3:
                str = "END_CURRENT";
                break;
            default:
                str = "LEFT";
                break;
        }
        return A05 + C86144wL.A0B(str, intValue);
    }

    public AnonymousClass5I6() {
        this(AnonymousClass006.A0N, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 0);
    }
}
