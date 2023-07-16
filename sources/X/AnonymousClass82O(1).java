package X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.82O  reason: invalid class name */
public final class AnonymousClass82O implements Runnable {
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ C86244wj A01;
    public final /* synthetic */ String A02;

    public AnonymousClass82O(LifecycleCallback lifecycleCallback, C86244wj r2, String str) {
        this.A01 = r2;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    public final void run() {
        Bundle bundle;
        C86244wj r3 = this.A01;
        if (r3.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle2 = r3.A01;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.A02);
            } else {
                bundle = null;
            }
            lifecycleCallback.A06(bundle);
        }
        if (r3.A00 >= 2) {
            this.A00.A03();
        }
        if (r3.A00 >= 3) {
            this.A00.A02();
        }
        if (r3.A00 >= 4) {
            this.A00.A04();
        }
    }
}
