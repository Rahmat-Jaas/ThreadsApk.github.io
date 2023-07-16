package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7He  reason: invalid class name and case insensitive filesystem */
public final class C121657He {
    public static final int A01(long j) {
        return (int) (AnonymousClass7KE.A05(GQI.A0G, j) >>> 32);
    }

    public static final long A03(long j, long j2) {
        float f;
        float f2;
        int i = (int) (j2 & 63);
        C115606vY[] r13 = GQI.A0K;
        long A05 = AnonymousClass7KE.A05(r13[i], j);
        float A00 = AnonymousClass7KE.A00(j2);
        float A002 = AnonymousClass7KE.A00(A05);
        float f3 = 1.0f - A002;
        float f4 = (A00 * f3) + A002;
        float A03 = AnonymousClass7KE.A03(A05);
        float A032 = AnonymousClass7KE.A03(j2);
        float f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (f4 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            f = ((A03 * A002) + ((A032 * A00) * f3)) / f4;
        }
        float A02 = AnonymousClass7KE.A02(A05);
        float A022 = AnonymousClass7KE.A02(j2);
        if (f4 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            f2 = ((A02 * A002) + ((A022 * A00) * f3)) / f4;
        }
        float A01 = AnonymousClass7KE.A01(A05);
        float A012 = AnonymousClass7KE.A01(j2);
        if (f4 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f5 = ((A01 * A002) + ((A012 * A00) * f3)) / f4;
        }
        return A04(r13[i], f, f2, f5, f4);
    }

    public static final long A04(C115606vY r13, float f, float f2, float f3, float f4) {
        float f5 = f3;
        float f6 = f4;
        C04220Ms.A0B(r13, 4);
        float A02 = r13.A02(0);
        if (f <= r13.A01(0) && A02 <= f) {
            float A022 = r13.A02(1);
            if (f2 <= r13.A01(1) && A022 <= f2) {
                float A023 = r13.A02(2);
                if (f3 <= r13.A01(2) && A023 <= f3 && BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER <= f4 && f4 <= 1.0f) {
                    if (r13.A05()) {
                        return (((long) ((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f)))) & 4294967295L) << 32;
                    } else if (((int) (r13.A01 >> 32)) == 3) {
                        int i = r13.A00;
                        if (i != -1) {
                            short A01 = C134837yS.A01(f);
                            short A012 = C134837yS.A01(f2);
                            return ((((long) A012) & 65535) << 32) | ((((long) A01) & 65535) << 48) | ((((long) C134837yS.A01(f5)) & 65535) << 16) | ((((long) ((int) ((Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i) & 63);
                        }
                        throw C18190wL.A0a("Unknown color space, please use a color space in ColorSpaces");
                    } else {
                        throw C18190wL.A0a("Color only works with ColorSpaces with 3 components");
                    }
                }
            }
        }
        StringBuilder A0s = C18190wL.A0s("red = ");
        A0s.append(f);
        A0s.append(", green = ");
        A0s.append(f2);
        A0s.append(", blue = ");
        A0s.append(f5);
        A0s.append(", alpha = ");
        A0s.append(f6);
        throw C18190wL.A0a(C86104wH.A0x(r13, " outside the range for ", A0s));
    }

    public static final float A00(long j) {
        C115606vY A0G = C86154wM.A0G(j);
        long j2 = A0G.A01;
        if (j2 == AnonymousClass74K.A01) {
            C142928fp r2 = ((C39928L8m) A0G).A02;
            float BQo = (float) ((r2.BQo((double) AnonymousClass7KE.A03(j)) * 0.2126d) + (r2.BQo((double) AnonymousClass7KE.A02(j)) * 0.7152d) + (r2.BQo((double) AnonymousClass7KE.A01(j)) * 0.0722d));
            if (BQo <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            if (BQo >= 1.0f) {
                return 1.0f;
            }
            return BQo;
        }
        throw C18190wL.A0a(C18200wM.A0m(AnonymousClass74K.A00(j2), C18190wL.A0s("The specified color must be encoded in an RGB color space. The supplied color space is ")));
    }

    public static final long A02(long j) {
        return (j & 4294967295L) << 32;
    }
}
