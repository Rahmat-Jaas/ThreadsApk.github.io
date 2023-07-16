package androidx.lifecycle;

import X.AnonymousClass060;
import X.C04220Ms;
import X.C123907Zw;
import X.C86234wi;
import X.C98356Fe;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public final class ProcessLifecycleOwner$attach$1 extends EmptyActivityLifecycleCallbacks {
    public final /* synthetic */ C123907Zw this$0;

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C04220Ms.A0B(activity, 0);
        if (Build.VERSION.SDK_INT < 29) {
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C04220Ms.A0C(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((C86234wi) findFragmentByTag).A00 = this.this$0.A06;
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C04220Ms.A0B(activity, 0);
        C98356Fe.A00(activity, new ProcessLifecycleOwner$attach$1$onActivityPreCreated$1(this.this$0));
    }

    public ProcessLifecycleOwner$attach$1(C123907Zw r1) {
        this.this$0 = r1;
    }

    public void onActivityPaused(Activity activity) {
        C123907Zw r1 = this.this$0;
        int i = r1.A00 - 1;
        r1.A00 = i;
        if (i == 0) {
            Handler handler = r1.A02;
            C04220Ms.A0A(handler);
            handler.postDelayed(r1.A07, 700);
        }
    }

    public void onActivityStopped(Activity activity) {
        C123907Zw r2 = this.this$0;
        int i = r2.A01 - 1;
        r2.A01 = i;
        if (i == 0 && r2.A03) {
            r2.A05.A09(AnonymousClass060.ON_STOP);
            r2.A04 = true;
        }
    }
}
