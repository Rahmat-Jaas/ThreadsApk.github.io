package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.7Bf  reason: invalid class name and case insensitive filesystem */
public final class C120517Bf {
    public static int A00(List list, int i) {
        if (list == null || list.isEmpty()) {
            return i;
        }
        int i2 = 0;
        for (Object next : list) {
            String obj = next.toString();
            switch (obj.hashCode()) {
                case -1699597560:
                    if (!obj.equals(C28174Ezk.A00(468))) {
                        break;
                    } else {
                        i2 |= 4;
                        continue;
                    }
                case -966253391:
                    if (!obj.equals("top_left")) {
                        break;
                    } else {
                        i2 |= 1;
                        continue;
                    }
                case -609197669:
                    if (!obj.equals(C28174Ezk.A00(64))) {
                        break;
                    } else {
                        i2 |= 8;
                        continue;
                    }
                case 116576946:
                    if (!obj.equals("top_right")) {
                        break;
                    } else {
                        i2 |= 2;
                        continue;
                    }
            }
            throw new C29721zB(AnonymousClass0wJ.A0t("Can't parse corner: ", next));
        }
        return i2;
    }

    public static void A01(float[] fArr, float f, int i) {
        int i2 = i & 1;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (i2 != 0) {
            f2 = f;
        }
        int i3 = i & 2;
        float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (i3 != 0) {
            f3 = f;
        }
        int i4 = i & 4;
        float f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (i4 != 0) {
            f4 = f;
        }
        if ((i & 8) == 0) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f3;
        fArr[2] = f3;
        fArr[5] = f4;
        fArr[4] = f4;
        fArr[7] = f;
        fArr[6] = f;
    }

    public static boolean A02(int i) {
        if (i == 0) {
            return true;
        }
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0) {
            return false;
        }
        return true;
    }
}
