package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.69D  reason: invalid class name */
public enum AnonymousClass69D {
    ;

    public final int A00(AnonymousClass7F6 r4, long j) {
        if (r4.A05(j)) {
            return 0;
        }
        if (AnonymousClass7KC.A02(j) >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return (AnonymousClass7KC.A01(j) >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || AnonymousClass7KC.A02(j) >= r4.A00) ? 1 : -1;
        }
        return -1;
    }
}
