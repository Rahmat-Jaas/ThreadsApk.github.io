package X;

import android.util.Log;

/* renamed from: X.81N  reason: invalid class name */
public final class AnonymousClass81N implements Runnable {
    public final /* synthetic */ C112726q5 A00;
    public final /* synthetic */ AnonymousClass4yW A01;

    public AnonymousClass81N(C112726q5 r1, AnonymousClass4yW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        Log.isLoggable("EnhancedIntentService", 3);
        C86254wp r2 = this.A01.A00;
        C112726q5 r1 = this.A00;
        r2.A01(r1.A01);
        r1.A00();
    }
}
