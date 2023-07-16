package X;

import java.util.HashSet;

/* renamed from: X.0MA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0MA implements Runnable {
    public final /* synthetic */ HashSet A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass0MA(HashSet hashSet, boolean z) {
        this.A00 = hashSet;
        this.A01 = z;
    }

    public final void run() {
        HashSet<AnonymousClass0MF> hashSet = this.A00;
        boolean z = this.A01;
        for (AnonymousClass0MF r0 : hashSet) {
            if (z) {
                r0.Bkt();
            } else {
                r0.Bkw();
            }
        }
    }
}
