package X;

import android.graphics.Path;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7X5  reason: invalid class name */
public final class AnonymousClass7X5 implements C142918fo {
    public final boolean A00;

    public final C98106Ef AG2(C147168nV r6, AnonymousClass69J r7, long j) {
        boolean z = this.A00;
        AnonymousClass7X1 r4 = new AnonymousClass7X1(C86144wL.A0G());
        float A02 = AnonymousClass7JK.A02(j) / 2.0f;
        if (z) {
            Path path = r4.A01;
            path.moveTo(A02, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            path.lineTo(AnonymousClass7JK.A02(j), AnonymousClass7JK.A00(j));
            path.lineTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, AnonymousClass7JK.A00(j));
        } else {
            float A002 = AnonymousClass7JK.A00(j);
            Path path2 = r4.A01;
            path2.moveTo(A02, A002);
            path2.lineTo(AnonymousClass7JK.A02(j), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            path2.lineTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        return new C876353n(r4);
    }

    public AnonymousClass7X5(boolean z) {
        this.A00 = z;
    }
}
