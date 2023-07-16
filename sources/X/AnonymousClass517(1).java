package X;

import android.content.Context;
import android.widget.EdgeEffect;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.517  reason: invalid class name */
public final class AnonymousClass517 extends EdgeEffect {
    public float A00;
    public final float A01;

    public AnonymousClass517(Context context) {
        super(context);
        this.A01 = new AnonymousClass7ZI(C18230wP.A0E(context).density, C86114wI.A0B(context).fontScale).CxL((float) 1);
    }

    public final void onAbsorb(int i) {
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        super.onAbsorb(i);
    }

    public final void onPull(float f, float f2) {
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        super.onPull(f, f2);
    }

    public final void onRelease() {
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        super.onRelease();
    }

    public final void onPull(float f) {
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        super.onPull(f);
    }
}
