package X;

import android.animation.ValueAnimator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxAListenerShape371S0100000_2_I2;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.81i  reason: invalid class name and case insensitive filesystem */
public final class C1360781i implements Runnable {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ C25819Dsb A01;

    public C1360781i(IgTextView igTextView, C25819Dsb dsb) {
        this.A01 = dsb;
        this.A00 = igTextView;
    }

    public final void run() {
        C25819Dsb dsb = this.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
        IgTextView igTextView = this.A00;
        C86134wK.A0z(ofFloat, igTextView, 16);
        ofFloat.addListener(new IDxAListenerShape371S0100000_2_I2(igTextView, 2));
        ofFloat.setDuration(50);
        ofFloat.start();
        dsb.A02 = ofFloat;
    }
}
