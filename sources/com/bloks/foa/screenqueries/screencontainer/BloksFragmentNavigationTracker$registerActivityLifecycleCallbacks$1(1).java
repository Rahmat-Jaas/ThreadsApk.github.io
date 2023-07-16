package com.bloks.foa.screenqueries.screencontainer;

import X.AnonymousClass006;
import X.AnonymousClass3T2;
import X.C04220Ms;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class BloksFragmentNavigationTracker$registerActivityLifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ AnonymousClass3T2 A00;

    public final void onActivityDestroyed(Activity activity) {
        C04220Ms.A0B(activity, 0);
        AnonymousClass3T2 r1 = this.A00;
        if (C04220Ms.A0I(r1.A02, activity)) {
            AnonymousClass3T2.A00(r1);
            ScreenContainerDelegate screenContainerDelegate = r1.A04;
            if (screenContainerDelegate != null) {
                screenContainerDelegate.A01(AnonymousClass006.A0C);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public BloksFragmentNavigationTracker$registerActivityLifecycleCallbacks$1(AnonymousClass3T2 r1) {
        this.A00 = r1;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ScreenContainerDelegate screenContainerDelegate = this.A00.A04;
        if (screenContainerDelegate != null) {
            screenContainerDelegate.A01(AnonymousClass006.A01);
        }
    }
}
