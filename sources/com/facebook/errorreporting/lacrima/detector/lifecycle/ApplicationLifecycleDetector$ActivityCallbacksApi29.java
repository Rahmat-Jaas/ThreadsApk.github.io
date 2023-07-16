package com.facebook.errorreporting.lacrima.detector.lifecycle;

import X.AnonymousClass006;
import X.C07220b8;
import android.app.Activity;
import android.os.Bundle;

public final class ApplicationLifecycleDetector$ActivityCallbacksApi29 extends ApplicationLifecycleDetector$ActivityCallbacks {
    public final /* synthetic */ C07220b8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApplicationLifecycleDetector$ActivityCallbacksApi29(C07220b8 r1) {
        super(r1);
        this.A00 = r1;
    }

    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        A00(activity, AnonymousClass006.A0N);
    }

    public final void onActivityPostDestroyed(Activity activity) {
        A01(activity, AnonymousClass006.A0N);
    }

    public final void onActivityPostPaused(Activity activity) {
        A02(activity, AnonymousClass006.A0N);
    }

    public final void onActivityPostResumed(Activity activity) {
        A03(activity, AnonymousClass006.A0N);
    }

    public final void onActivityPostStarted(Activity activity) {
        A04(activity, AnonymousClass006.A0N);
    }

    public final void onActivityPostStopped(Activity activity) {
        A05(activity, AnonymousClass006.A0N);
    }

    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        A00(activity, AnonymousClass006.A01);
    }

    public final void onActivityPreDestroyed(Activity activity) {
        A01(activity, AnonymousClass006.A01);
    }

    public final void onActivityPrePaused(Activity activity) {
        A02(activity, AnonymousClass006.A01);
    }

    public final void onActivityPreResumed(Activity activity) {
        A03(activity, AnonymousClass006.A01);
    }

    public final void onActivityPreStarted(Activity activity) {
        A04(activity, AnonymousClass006.A01);
    }

    public final void onActivityPreStopped(Activity activity) {
        A05(activity, AnonymousClass006.A01);
    }
}
