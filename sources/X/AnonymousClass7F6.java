package X;

import android.graphics.Rect;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7F6  reason: invalid class name */
public final class AnonymousClass7F6 {
    public static final AnonymousClass7F6 A04 = new AnonymousClass7F6(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final AnonymousClass7F6 A04(AnonymousClass7F6 r6) {
        C04220Ms.A0B(r6, 0);
        return new AnonymousClass7F6(Math.max(this.A01, r6.A01), Math.max(this.A03, r6.A03), Math.min(this.A02, r6.A02), Math.min(this.A00, r6.A00));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7F6) {
                AnonymousClass7F6 r5 = (AnonymousClass7F6) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static Rect A00(AnonymousClass7F6 r5) {
        return new Rect(AnonymousClass8bA.A02(r5.A01), AnonymousClass8bA.A02(r5.A03), AnonymousClass8bA.A02(r5.A02), AnonymousClass8bA.A02(r5.A00));
    }

    public final long A01() {
        float f = this.A01;
        float f2 = this.A03;
        return C86104wH.A0C(f + ((this.A02 - f) / 2.0f), f2 + ((this.A00 - f2) / 2.0f));
    }

    public final AnonymousClass7F6 A02(float f, float f2) {
        return new AnonymousClass7F6(this.A01 + f, this.A03 + f2, this.A02 + f, this.A00 + f2);
    }

    public final AnonymousClass7F6 A03(long j) {
        return new AnonymousClass7F6(this.A01 + AnonymousClass7KC.A01(j), this.A03 + AnonymousClass7KC.A02(j), this.A02 + AnonymousClass7KC.A01(j), this.A00 + AnonymousClass7KC.A02(j));
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A01), this.A03), this.A02), this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Rect.fromLTRB(");
        C115856w1.A01(A0s, this.A01);
        A0s.append(", ");
        C115856w1.A01(A0s, this.A03);
        A0s.append(", ");
        C115856w1.A01(A0s, this.A02);
        A0s.append(", ");
        C115856w1.A01(A0s, this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass7F6(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }

    public final boolean A05(long j) {
        if (AnonymousClass7KC.A01(j) < this.A01 || AnonymousClass7KC.A01(j) >= this.A02 || AnonymousClass7KC.A02(j) < this.A03 || AnonymousClass7KC.A02(j) >= this.A00) {
            return false;
        }
        return true;
    }
}
