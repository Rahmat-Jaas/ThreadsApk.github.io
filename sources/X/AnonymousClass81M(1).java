package X;

import android.content.Intent;
import android.util.Log;

/* renamed from: X.81M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass81M implements Runnable {
    public final Intent A00;
    public final C112726q5 A01;

    public AnonymousClass81M(Intent intent, C112726q5 r2) {
        this.A01 = r2;
        this.A00 = intent;
    }

    public final void run() {
        C112726q5 r3 = this.A01;
        String action = this.A00.getAction();
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(action) + 61);
        A0s.append("Service took too long to process intent: ");
        A0s.append(action);
        Log.w("EnhancedIntentService", C18180wK.A0i(" App may get closed.", A0s));
        r3.A00();
    }
}
