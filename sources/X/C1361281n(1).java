package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.81n  reason: invalid class name and case insensitive filesystem */
public final class C1361281n implements Runnable {
    public final /* synthetic */ C1203279s A00;
    public final /* synthetic */ List A01;

    public C1361281n(C1203279s r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C144858jP r2 = this.A00.A01;
        if (r2 != null) {
            r2.onPredictionResult(C18200wM.A0m(this.A01, C18190wL.A0s("Prediction results: ")), (HashMap) null);
        }
    }
}
