package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Hg  reason: invalid class name and case insensitive filesystem */
public final class C121667Hg {
    public static final boolean A01(C121197Es r1) {
        C04220Ms.A0B(r1, 0);
        if (r1.A0B || !r1.A0A) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C121197Es r1) {
        C04220Ms.A0B(r1, 0);
        if (!r1.A0B || r1.A0A) {
            return false;
        }
        return true;
    }

    public static final boolean A04(C121197Es r6, long j, long j2) {
        C04220Ms.A0B(r6, 0);
        if (r6.A03 != 1) {
            return A03(r6, j);
        }
        long j3 = r6.A05;
        float A01 = AnonymousClass7KC.A01(j3);
        float A02 = AnonymousClass7KC.A02(j3);
        float f = -AnonymousClass7JK.A02(j2);
        float A07 = ((float) C86104wH.A07(j)) + AnonymousClass7JK.A02(j2);
        float f2 = -AnonymousClass7JK.A00(j2);
        float A08 = ((float) C86104wH.A08(j)) + AnonymousClass7JK.A00(j2);
        if (A01 < f || A01 > A07 || A02 < f2 || A02 > A08) {
            return true;
        }
        return false;
    }

    public static final long A00(C121197Es r4) {
        long A04 = AnonymousClass7KC.A04(r4.A05, r4.A06);
        if (r4.A02()) {
            return AnonymousClass7KC.A03;
        }
        return A04;
    }

    public static final boolean A03(C121197Es r5, long j) {
        long j2 = r5.A05;
        float A01 = AnonymousClass7KC.A01(j2);
        float A02 = AnonymousClass7KC.A02(j2);
        int A07 = C86104wH.A07(j);
        int A08 = C86104wH.A08(j);
        if (A01 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || A01 > ((float) A07) || A02 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || A02 > ((float) A08)) {
            return true;
        }
        return false;
    }
}
