package com.instagram.video.player.common;

import X.AnonymousClass000;
import X.AnonymousClass7D9;
import X.C04220Ms;
import X.C09120et;
import X.C28174Ezk;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PhujiClientDebugDialog$lifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle bundle) {
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
        View view = AnonymousClass7D9.A01;
        if (view != null) {
            WindowManager windowManager = AnonymousClass7D9.A02;
            if (windowManager != null) {
                windowManager.removeView(view);
            }
            AnonymousClass7D9.A04.set(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = AnonymousClass7D9.A04;
        if (!atomicBoolean.get() && C09120et.A3D.A00().A0U()) {
            Context context = AnonymousClass7D9.A00;
            if (context != null) {
                Object systemService = context.getSystemService("window");
                C04220Ms.A0C(systemService, C28174Ezk.A00(14));
                AnonymousClass7D9.A02 = (WindowManager) systemService;
                Object systemService2 = context.getSystemService("layout_inflater");
                C04220Ms.A0C(systemService2, AnonymousClass000.A00(HttpStatus.SC_REQUEST_TIMEOUT));
                AnonymousClass7D9.A01 = ((LayoutInflater) systemService2).inflate(R.layout.watch_time_debug_view, (ViewGroup) null);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1000);
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.type = 2038;
                layoutParams.flags = 16777240;
                layoutParams.format = -3;
                layoutParams.alpha = 0.8f;
                WindowManager windowManager = AnonymousClass7D9.A02;
                if (windowManager != null) {
                    windowManager.addView(AnonymousClass7D9.A01, layoutParams);
                }
            }
            AnonymousClass7D9.A00();
            atomicBoolean.set(true);
        }
    }
}
