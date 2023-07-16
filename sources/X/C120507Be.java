package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.7Be  reason: invalid class name and case insensitive filesystem */
public final class C120507Be {
    public static int A00(AnonymousClass3HX r4, C127397h3 r5) {
        C127397h3 A0K = r5.A0K(38);
        if (A0K != null) {
            return C101086Pv.A00(r4, A0K, 0);
        }
        try {
            String A0m = C86114wI.A0m(r5.A04, 36);
            if (A0m != null) {
                return AnonymousClass7Kk.A04(A0m);
            }
            return -16777216;
        } catch (C29721zB e) {
            C30967GcS.A01(r4, "ColorDrawableUtils", "Error parsing border color in BoxDecoration", e, 0);
            return 0;
        }
    }

    public static C86434xf A01(AnonymousClass3HX r7, C127397h3 r8, int i) {
        float A00;
        int A002;
        int A003;
        float A004;
        float[] A02;
        float A005;
        C86434xf r3 = new C86434xf();
        if (r8 == null) {
            A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            A002 = 0;
            A003 = 0;
            A004 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            A02 = null;
            A005 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            A00 = C127397h3.A00(r8, 46);
            A002 = C120517Bf.A00(r8.A0R(56), 0);
            A003 = A00(r7, r8);
            A004 = C127397h3.A00(r8, 40);
            A02 = A02(r8.A0R(62));
            A005 = C127397h3.A00(r8, 63);
        }
        r3.A05.setColor(i);
        Paint paint = r3.A04;
        paint.setColor(A003);
        paint.setStrokeWidth(A004);
        if (A004 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A02 != null) {
            paint.setPathEffect(new DashPathEffect(A02, A005));
        }
        r3.A02 = A00;
        r3.A03 = A002;
        float f = A004 / 2.0f;
        r3.A00 = f;
        r3.A01 = A00 - f;
        return r3;
    }

    public static float[] A02(List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String A0p = C18190wL.A0p(list, i);
            float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (A0p != null) {
                f = AnonymousClass7Kk.A01(A0p);
            }
            fArr[i] = f;
        }
        return fArr;
    }
}
