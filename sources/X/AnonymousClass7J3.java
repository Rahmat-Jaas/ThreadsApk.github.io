package X;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxObjectShape1S0000001_2_I2;

/* renamed from: X.7J3  reason: invalid class name */
public final class AnonymousClass7J3 {
    public static final C145048jk A00 = new C123007Ux();
    public static final C145048jk A01 = new C123017Uy();
    public static final C147268p4 A02 = new IDxObjectShape1S0000001_2_I2(0);
    public static final C147268p4 A03 = new IDxObjectShape1S0000001_2_I2(1);
    public static final C147268p4 A04 = new IDxObjectShape1S0000001_2_I2(2);
    public static final C147268p4 A05 = new IDxObjectShape1S0000001_2_I2(3);
    public static final C145058jl A06 = new AnonymousClass7V1();
    public static final C145058jl A07 = new AnonymousClass7V2();

    public static final C145058jl A02(C141758cu r2, float f) {
        C04220Ms.A0B(r2, 1);
        return new AnonymousClass7V0(C86164wN.A0u(r2, 2), f, false);
    }

    public static final void A03(int[] iArr, int[] iArr2, int i, boolean z) {
        float f;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        if (r6 == 0) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            f = ((float) (i - i3)) / ((float) r6);
        }
        float f2 = f / ((float) 2);
        if (!z) {
            int i5 = 0;
            while (i2 < r6) {
                f2 = A00(iArr2, f2, f, i5, iArr[i2]);
                i2++;
                i5++;
            }
            return;
        }
        for (int i6 = r6 - 1; -1 < i6; i6--) {
            f2 = A00(iArr2, f2, f, i6, iArr[i6]);
        }
    }

    public static final void A04(int[] iArr, int[] iArr2, int i, boolean z) {
        float f;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (r6 > 1) {
            f = ((float) (i - i3)) / ((float) (r6 - 1));
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        if (!z) {
            int i5 = 0;
            while (i2 < r6) {
                f2 = A00(iArr2, f2, f, i5, iArr[i2]);
                i2++;
                i5++;
            }
            return;
        }
        for (int i6 = r6 - 1; -1 < i6; i6--) {
            f2 = A00(iArr2, f2, f, i6, iArr[i6]);
        }
    }

    public static final C147268p4 A01(float f) {
        return new AnonymousClass7V0(AnonymousClass8Vp.A00, f, true);
    }

    public static float A00(int[] iArr, float f, float f2, int i, int i2) {
        iArr[i] = AnonymousClass8bA.A02(f);
        return f + ((float) i2) + f2;
    }
}
