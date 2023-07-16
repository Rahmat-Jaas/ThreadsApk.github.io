package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.7Ag  reason: invalid class name */
public final class AnonymousClass7Ag {
    public static final long A02(C109656kM r7, boolean z) {
        long j;
        long j2 = AnonymousClass7KC.A03;
        List list = r7.A03;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C121197Es A0P = C86124wJ.A0P(list, i2);
            if (A0P.A0A && A0P.A0B) {
                if (z) {
                    j = A0P.A05;
                } else {
                    j = A0P.A06;
                }
                j2 = AnonymousClass7KC.A05(j2, j);
                i++;
            }
        }
        if (i == 0) {
            return AnonymousClass7KC.A02;
        }
        float f = (float) i;
        return C86104wH.A0C(AnonymousClass7KC.A01(j2) / f, AnonymousClass7KC.A02(j2) / f);
    }

    public static final float A00(long j) {
        if (AnonymousClass7KC.A01(j) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && AnonymousClass7KC.A02(j) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return ((-((float) Math.atan2((double) AnonymousClass7KC.A01(j), (double) AnonymousClass7KC.A02(j)))) * 180.0f) / 3.1415927f;
    }

    public static final float A01(C109656kM r9, boolean z) {
        long j;
        long A02 = A02(r9, z);
        boolean A1W = C18180wK.A1W((A02 > AnonymousClass7KC.A02 ? 1 : (A02 == AnonymousClass7KC.A02 ? 0 : -1)));
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (A1W) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        List list = r9.A03;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C121197Es A0P = C86124wJ.A0P(list, i2);
            if (A0P.A0A && A0P.A0B) {
                if (z) {
                    j = A0P.A05;
                } else {
                    j = A0P.A06;
                }
                f += AnonymousClass7KC.A00(AnonymousClass7KC.A04(j, A02));
                i++;
            }
        }
        return f / ((float) i);
    }
}
