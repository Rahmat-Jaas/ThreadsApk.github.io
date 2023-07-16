package X;

import android.content.Context;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7hf  reason: invalid class name and case insensitive filesystem */
public final class C127757hf implements Mcm {
    public final C127397h3 A00;

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C127397h3 r3 = this.A00;
        view.setScaleX(r3.A0G(136, 1.0f));
        view.setScaleY(r3.A0G(137, 1.0f));
        view.setTranslationX(r3.A0G(144, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setTranslationY(r3.A0G(145, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setRotation(r3.A0G(138, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setAlpha(r3.A0G(141, 1.0f));
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setAlpha(1.0f);
    }

    public C127757hf(C127397h3 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
