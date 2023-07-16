package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.72b  reason: invalid class name and case insensitive filesystem */
public abstract class C1187372b {
    public static final long A00 = C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);

    public static String A00(long j) {
        StringBuilder A0s;
        float A002 = C86104wH.A00(j);
        float intBitsToFloat = Float.intBitsToFloat(C86104wH.A08(j));
        if (C18180wK.A1W((A002 > intBitsToFloat ? 1 : (A002 == intBitsToFloat ? 0 : -1)))) {
            A0s = C18190wL.A0s("CornerRadius.circular(");
        } else {
            A0s = C18190wL.A0s("CornerRadius.elliptical(");
            C115856w1.A01(A0s, A002);
            C86144wL.A1T(A0s);
            A002 = intBitsToFloat;
        }
        C115856w1.A01(A0s, A002);
        return C86114wI.A0q(A0s, ')');
    }
}
