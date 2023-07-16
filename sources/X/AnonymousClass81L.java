package X;

import android.util.Log;
import android.util.SparseArray;

/* renamed from: X.81L  reason: invalid class name */
public final /* synthetic */ class AnonymousClass81L implements Runnable {
    public final AnonymousClass7M4 A00;
    public final C113836sE A01;

    public AnonymousClass81L(AnonymousClass7M4 r1, C113836sE r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass7M4 r6 = this.A00;
        int i = this.A01.A01;
        synchronized (r6) {
            SparseArray sparseArray = r6.A04;
            C113836sE r3 = (C113836sE) sparseArray.get(i);
            if (r3 != null) {
                Log.w("MessengerIpcClient", C86104wH.A10("Timing out request: ", C86114wI.A0s(31), i));
                sparseArray.remove(i);
                r3.A00(new AnonymousClass6CH(3, "Timed out waiting for response"));
                r6.A00();
            }
        }
    }
}
