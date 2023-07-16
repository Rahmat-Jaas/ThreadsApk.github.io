package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.6zW  reason: invalid class name and case insensitive filesystem */
public final class C117956zW {
    public static C111236n0 A01(AnonymousClass3HX r18, C127397h3 r19, int i, int i2, int i3, int i4) {
        C127397h3 r2 = r19;
        List A0R = r2.A0R(35);
        float[] fArr = new float[A0R.size()];
        float[] fArr2 = new float[A0R.size()];
        String[] strArr = new String[A0R.size()];
        for (int i5 = 0; i5 < A0R.size(); i5++) {
            C127397h3 A0Q = C86154wM.A0Q(A0R, i5);
            fArr[i5] = A0Q.A0G(36, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            fArr2[i5] = A0Q.A0G(38, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            strArr[i5] = C86114wI.A0m(A0Q.A04, 35);
        }
        AnonymousClass3HX r3 = r18;
        return new C111236n0(fArr, fArr2, strArr, (float) i, (float) i2, (float) i3, (float) i4, C86144wL.A02(A00(r3, r2, 41)), C86144wL.A02(A00(r3, r2, 36)), C86144wL.A02(A00(r3, r2, 40)), C86144wL.A02(A00(r3, r2, 38)), C86114wI.A1T(C86144wL.A02(A00(r3, r2, 36)), -1));
    }

    public static int A00(AnonymousClass3HX r2, C127397h3 r3, int i) {
        C127397h3 A0K = r3.A0K(i);
        if (A0K == null) {
            return -1;
        }
        return C101086Pv.A00(r2, A0K, 0);
    }
}
