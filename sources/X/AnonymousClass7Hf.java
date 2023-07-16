package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Hf  reason: invalid class name */
public abstract class AnonymousClass7Hf {
    public static final void A02(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (i == i2) {
                    f = 1.0f;
                }
                fArr[(i2 << 2) + i] = f;
                i2++;
            } while (i2 < 4);
        }
    }

    public static /* synthetic */ void A03(float[] fArr, float f, float f2) {
        float f3 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) + fArr[12];
        float f4 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) + fArr[13];
        float f5 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) + fArr[14];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) + fArr[15];
    }

    public static final void A01(C113796s9 r11, float[] fArr) {
        float f = r11.A01;
        float f2 = r11.A03;
        long A00 = A00(fArr, C86104wH.A0C(f, f2));
        float f3 = r11.A00;
        long A002 = A00(fArr, C86104wH.A0C(f, f3));
        float f4 = r11.A02;
        long A003 = A00(fArr, C86104wH.A0C(f4, f2));
        long A004 = A00(fArr, C86104wH.A0C(f4, f3));
        r11.A01 = Math.min(Math.min(AnonymousClass7KC.A01(A00), AnonymousClass7KC.A01(A002)), Math.min(AnonymousClass7KC.A01(A003), AnonymousClass7KC.A01(A004)));
        r11.A03 = Math.min(Math.min(AnonymousClass7KC.A02(A00), AnonymousClass7KC.A02(A002)), Math.min(AnonymousClass7KC.A02(A003), AnonymousClass7KC.A02(A004)));
        r11.A02 = Math.max(Math.max(AnonymousClass7KC.A01(A00), AnonymousClass7KC.A01(A002)), Math.max(AnonymousClass7KC.A01(A003), AnonymousClass7KC.A01(A004)));
        r11.A00 = Math.max(Math.max(AnonymousClass7KC.A02(A00), AnonymousClass7KC.A02(A002)), Math.max(AnonymousClass7KC.A02(A003), AnonymousClass7KC.A02(A004)));
    }

    public static /* synthetic */ float[] A04() {
        return new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f};
    }

    public static final long A00(float[] fArr, long j) {
        float A01 = AnonymousClass7KC.A01(j);
        float A02 = AnonymousClass7KC.A02(j);
        float f = ((float) 1) / (((fArr[3] * A01) + (fArr[7] * A02)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return C86104wH.A0C(((fArr[0] * A01) + (fArr[4] * A02) + fArr[12]) * f, f * ((fArr[1] * A01) + (fArr[5] * A02) + fArr[13]));
    }
}
