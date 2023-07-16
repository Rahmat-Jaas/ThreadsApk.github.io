package com.fbpay.common;

import X.AnonymousClass060;
import X.AnonymousClass065;
import X.AnonymousClass7IJ;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.IDxCListenerShape201S0200000_2_I2;

public class KeyboardHeightChangeDetector$3 implements AnonymousClass065 {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass7IJ A01;
    public final /* synthetic */ boolean A02;

    public KeyboardHeightChangeDetector$3(Fragment fragment, AnonymousClass7IJ r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = fragment;
    }

    @OnLifecycleEvent(AnonymousClass060.ON_PAUSE)
    public void onPause() {
        if (this.A02 || AnonymousClass7IJ.A03(this.A00.getActivity())) {
            AnonymousClass7IJ r1 = this.A01;
            AnonymousClass7IJ.A01(r1);
            r1.A05 = null;
        }
    }

    @OnLifecycleEvent(AnonymousClass060.ON_RESUME)
    public void onResume() {
        if (this.A02 || AnonymousClass7IJ.A03(this.A00.getActivity())) {
            AnonymousClass7IJ r3 = this.A01;
            FragmentActivity activity = this.A00.getActivity();
            if (activity != null && activity.getWindow() != null) {
                View decorView = activity.getWindow().getDecorView();
                r3.A05 = decorView;
                if (decorView.getWindowToken() != null) {
                    AnonymousClass7IJ.A00(activity, r3);
                } else if (r3.A03 == null) {
                    IDxCListenerShape201S0200000_2_I2 iDxCListenerShape201S0200000_2_I2 = new IDxCListenerShape201S0200000_2_I2(4, activity, r3);
                    r3.A03 = iDxCListenerShape201S0200000_2_I2;
                    r3.A05.addOnAttachStateChangeListener(iDxCListenerShape201S0200000_2_I2);
                }
            }
        }
    }
}
