package com.instagram.base.fragment.lifecycle;

import X.AnonymousClass060;
import X.AnonymousClass065;
import X.C142398en;
import androidx.lifecycle.OnLifecycleEvent;

public final class OnStartHideActionBarHandler implements AnonymousClass065, C142398en {
    @OnLifecycleEvent(AnonymousClass060.ON_START)
    public final void hideActionBar() {
    }

    @OnLifecycleEvent(AnonymousClass060.ON_DESTROY)
    public final void removeFragmentLifecycleObserver() {
    }

    @OnLifecycleEvent(AnonymousClass060.ON_STOP)
    public final void showActionBar() {
    }
}
