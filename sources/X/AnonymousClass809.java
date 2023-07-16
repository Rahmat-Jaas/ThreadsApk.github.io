package X;

import java.util.HashMap;

/* renamed from: X.809  reason: invalid class name */
public final class AnonymousClass809 implements Runnable {
    public final /* synthetic */ C1203279s A00;

    public AnonymousClass809(C1203279s r1) {
        this.A00 = r1;
    }

    public final void run() {
        C144858jP r2 = this.A00.A01;
        if (r2 != null) {
            r2.onPredictionResult("Failed to get prediction results", (HashMap) null);
        }
    }
}
