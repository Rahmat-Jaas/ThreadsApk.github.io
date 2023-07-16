package X;

import android.util.Log;

/* renamed from: X.0Ks  reason: invalid class name and case insensitive filesystem */
public final class C03780Ks implements Runnable {
    public final /* synthetic */ String A00;

    public C03780Ks(String str) {
        this.A00 = str;
    }

    public final void run() {
        if (!AnonymousClass0MI.A08()) {
            Log.e("AppExitUtil", "Killing process in background.");
            C03790Kt.A01(this.A00);
        }
    }
}
