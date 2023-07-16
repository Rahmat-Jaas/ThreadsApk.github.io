package X;

import java.util.HashMap;

/* renamed from: X.81o  reason: invalid class name and case insensitive filesystem */
public final class C1361381o implements Runnable {
    public final /* synthetic */ AnonymousClass6CN A00;
    public final /* synthetic */ C1203279s A01;

    public C1361381o(AnonymousClass6CN r1, C1203279s r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C144858jP r2 = this.A01.A01;
        if (r2 != null) {
            r2.onPredictionResult(String.valueOf(this.A00.getMessage()), (HashMap) null);
        }
    }
}
