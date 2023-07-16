package com.facebook.errorreporting.lacrima.detector.lifecycle;

import X.AnonymousClass006;
import X.C04220Ms;
import X.C06150Xw;
import X.C07220b8;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

public class ApplicationLifecycleDetector$ActivityCallbacks implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C07220b8 A00;

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public ApplicationLifecycleDetector$ActivityCallbacks(C07220b8 r1) {
        this.A00 = r1;
    }

    public final void A00(Activity activity, Integer num) {
        C07220b8 r3 = this.A00;
        synchronized (r3.A0M) {
            if (Build.VERSION.SDK_INT < 29 || num.equals(AnonymousClass006.A01)) {
                C06150Xw r1 = r3.A0D;
                if (r1 != null) {
                    r1.A04(activity, AnonymousClass006.A0N);
                }
                C07220b8.A02(r3);
                r3.A08.A03(activity, AnonymousClass006.A0N);
            }
            C07220b8.A03(r3, num, false);
        }
        C07220b8.A00();
    }

    public final void A01(Activity activity, Integer num) {
        C07220b8 r3 = this.A00;
        synchronized (r3.A0M) {
            if (Build.VERSION.SDK_INT < 29 || num.equals(AnonymousClass006.A01)) {
                C06150Xw r1 = r3.A0D;
                if (r1 != null) {
                    r1.A04(activity, AnonymousClass006.A0u);
                }
                C07220b8.A02(r3);
                r3.A08.A03(activity, AnonymousClass006.A0u);
            }
            C07220b8.A03(r3, num, true);
        }
        if (r3.A09 != null) {
            C04220Ms.A0B(activity, 0);
            C07220b8.A00();
        }
    }

    public final void A02(Activity activity, Integer num) {
        C07220b8 r3 = this.A00;
        synchronized (r3.A0M) {
            if (Build.VERSION.SDK_INT < 29 || num.equals(AnonymousClass006.A01)) {
                C06150Xw r1 = r3.A0D;
                if (r1 != null) {
                    r1.A04(activity, AnonymousClass006.A0Y);
                }
                C07220b8.A02(r3);
                r3.A08.A03(activity, AnonymousClass006.A0Y);
            }
            C07220b8.A03(r3, num, activity.isFinishing());
        }
    }

    public final void A03(Activity activity, Integer num) {
        C07220b8 r3 = this.A00;
        synchronized (r3.A0M) {
            if (Build.VERSION.SDK_INT < 29 || num.equals(AnonymousClass006.A01)) {
                C06150Xw r1 = r3.A0D;
                if (r1 != null) {
                    r1.A04(activity, AnonymousClass006.A00);
                }
                C07220b8.A02(r3);
                r3.A08.A03(activity, AnonymousClass006.A00);
            }
            C07220b8.A03(r3, num, false);
        }
    }

    public final void A04(Activity activity, Integer num) {
        C07220b8 r3 = this.A00;
        synchronized (r3.A0M) {
            if (Build.VERSION.SDK_INT < 29 || num.equals(AnonymousClass006.A01)) {
                C06150Xw r1 = r3.A0D;
                if (r1 != null) {
                    r1.A04(activity, AnonymousClass006.A0C);
                }
                C07220b8.A02(r3);
                r3.A08.A03(activity, AnonymousClass006.A0C);
            }
            C07220b8.A03(r3, num, false);
        }
    }

    public final void A05(Activity activity, Integer num) {
        C07220b8 r3 = this.A00;
        synchronized (r3.A0M) {
            if (Build.VERSION.SDK_INT < 29 || num.equals(AnonymousClass006.A01)) {
                C06150Xw r1 = r3.A0D;
                if (r1 != null) {
                    r1.A04(activity, AnonymousClass006.A0j);
                }
                C07220b8.A02(r3);
                r3.A08.A03(activity, AnonymousClass006.A0j);
            }
            C07220b8.A03(r3, num, activity.isFinishing());
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A00(activity, AnonymousClass006.A0C);
    }

    public final void onActivityDestroyed(Activity activity) {
        A01(activity, AnonymousClass006.A0C);
    }

    public final void onActivityPaused(Activity activity) {
        A02(activity, AnonymousClass006.A0C);
    }

    public final void onActivityResumed(Activity activity) {
        A03(activity, AnonymousClass006.A0C);
    }

    public final void onActivityStarted(Activity activity) {
        A04(activity, AnonymousClass006.A0C);
    }

    public final void onActivityStopped(Activity activity) {
        A05(activity, AnonymousClass006.A0C);
    }
}
