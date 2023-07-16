package com.facebook.cameracore.mediapipeline.services.worldnavigationservice;

import X.AnonymousClass0wJ;
import X.AnonymousClass82F;
import X.C104426bl;
import android.os.Handler;

public class WorldNavigationServiceDelegateWrapper {
    public final C104426bl mDelegate;
    public final String mEffectId;
    public final Handler mHandler = AnonymousClass0wJ.A0F();

    public void openMapDirections(double d, double d2) {
        this.mHandler.post(new AnonymousClass82F(this, d, d2));
    }

    public WorldNavigationServiceDelegateWrapper(String str, C104426bl r3) {
        this.mEffectId = str;
        this.mDelegate = r3;
    }
}
