package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6Q2  reason: invalid class name */
public final class AnonymousClass6Q2 {
    public static final float A00(C127397h3 r3, int i) {
        String A0m = C86114wI.A0m(r3.A04, i);
        if (A0m == null) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        try {
            return AnonymousClass7Kk.A01(A0m);
        } catch (C29721zB unused) {
            C30967GcS.A02("BloksModelUtils", AnonymousClass00U.A0L("Error parsing pixel value ", A0m));
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
    }
}
