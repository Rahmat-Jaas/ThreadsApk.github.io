package com.instagram.mainactivity.bouncebacktoast.ui;

import X.AnonymousClass060;
import X.AnonymousClass065;
import X.C18210wN;
import androidx.lifecycle.OnLifecycleEvent;

public final class BounceBackToast implements AnonymousClass065 {
    @OnLifecycleEvent(AnonymousClass060.ON_CREATE)
    public final void onCreate() {
        throw C18210wN.A0W("addListener");
    }

    @OnLifecycleEvent(AnonymousClass060.ON_DESTROY)
    public final void onDestroy() {
        throw C18210wN.A0W("removeListener");
    }
}
