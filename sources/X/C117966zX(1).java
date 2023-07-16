package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.6zX  reason: invalid class name and case insensitive filesystem */
public final class C117966zX {
    public static int A00(AnonymousClass3HX r2, C127397h3 r3, int i) {
        C127397h3 A0K = r3.A0K(i);
        if (A0K == null) {
            return -1;
        }
        return C101086Pv.A00(r2, A0K, 0);
    }

    public static C111236n0 A01(AnonymousClass3HX r15, C127397h3 r16, int i, int i2, int i3) {
        C127397h3 r2 = r16;
        List A0R = r2.A0R(35);
        int size = A0R.size();
        float[] fArr = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            fArr[i4] = (float) C86154wM.A0Q(A0R, i4).A0H(35, 0);
        }
        AnonymousClass3HX r3 = r15;
        return new C111236n0((float[]) null, fArr, (String[]) null, (float) i, (float) i2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (i3 - 1), C86144wL.A02(A00(r15, r2, 41)), C86144wL.A02(A00(r15, r2, 36)), C86144wL.A02(A00(r15, r2, 40)), C86144wL.A02(A00(r3, r2, 38)), C86114wI.A1T(C86144wL.A02(A00(r3, r2, 36)), -1));
    }
}
