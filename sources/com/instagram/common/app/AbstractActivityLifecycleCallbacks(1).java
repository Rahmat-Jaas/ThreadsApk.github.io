package com.instagram.common.app;

import X.AnonymousClass22G;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener;

public abstract class AbstractActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (this instanceof IgTimeInAppActivityListener) {
            ((IgTimeInAppActivityListener) this).A03.A00(AnonymousClass22G.BACKGROUND);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this instanceof IgTimeInAppActivityListener) {
            ((IgTimeInAppActivityListener) this).A03.A00(AnonymousClass22G.FOREGROUND);
        }
    }
}
