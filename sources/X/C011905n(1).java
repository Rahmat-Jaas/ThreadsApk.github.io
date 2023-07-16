package X;

import android.util.Log;

/* renamed from: X.05n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C011905n implements Runnable {
    public final /* synthetic */ C012505u A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C011905n(C012505u r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public final void run() {
        String str = this.A01;
        C012505u r2 = this.A00;
        Log.e("FragmentStrictMode", AnonymousClass00U.A0L("Policy violation with PENALTY_DEATH in ", str), r2);
        throw r2;
    }
}
