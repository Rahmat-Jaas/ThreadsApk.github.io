package androidx.lifecycle;

import X.AnonymousClass060;
import X.C04220Ms;
import X.C116046wK;
import X.C116056wL;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class ReportFragment$LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static final C116056wL Companion = new C116056wL();

    public static final void registerIn(Activity activity) {
        C116056wL.A00(activity);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        C04220Ms.A0B(activity, 0);
        C116046wK.A01(activity, AnonymousClass060.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        C04220Ms.A0B(activity, 0);
        C116046wK.A01(activity, AnonymousClass060.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        C04220Ms.A0B(activity, 0);
        C116046wK.A01(activity, AnonymousClass060.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        C04220Ms.A0B(activity, 0);
        C116046wK.A01(activity, AnonymousClass060.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        C04220Ms.A0B(activity, 0);
        C116046wK.A01(activity, AnonymousClass060.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        C04220Ms.A0B(activity, 0);
        C116046wK.A01(activity, AnonymousClass060.ON_STOP);
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
