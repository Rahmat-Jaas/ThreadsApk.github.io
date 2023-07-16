package androidx.lifecycle;

import X.AnonymousClass060;
import X.C123907Zw;
import android.app.Activity;

public final class ProcessLifecycleOwner$attach$1$onActivityPreCreated$1 extends EmptyActivityLifecycleCallbacks {
    public final /* synthetic */ C123907Zw this$0;

    public ProcessLifecycleOwner$attach$1$onActivityPreCreated$1(C123907Zw r1) {
        this.this$0 = r1;
    }

    public void onActivityPostResumed(Activity activity) {
        this.this$0.A01();
    }

    public void onActivityPostStarted(Activity activity) {
        C123907Zw r2 = this.this$0;
        int i = r2.A01 + 1;
        r2.A01 = i;
        if (i == 1 && r2.A04) {
            r2.A05.A09(AnonymousClass060.ON_START);
            r2.A04 = false;
        }
    }
}
