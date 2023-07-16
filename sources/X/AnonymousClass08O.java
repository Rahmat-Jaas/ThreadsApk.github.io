package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08O  reason: invalid class name */
public final class AnonymousClass08O implements Runnable {
    public final /* synthetic */ AnonymousClass0UP A00;

    public AnonymousClass08O(AnonymousClass0UP r1) {
        this.A00 = r1;
    }

    public final void run() {
        C017108d r0;
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        multiSignalANRDetector.A0I = false;
        if (multiSignalANRDetector.A0J) {
            AnonymousClass0LU.A0C(multiSignalANRDetector.A0C, "Resuming error state checks");
            C017408g r2 = multiSignalANRDetector.A0A;
            synchronized (r2) {
                if (!(r2.A02 == AnonymousClass006.A00 || (r0 = r2.A01) == null)) {
                    Object obj = r0.A05;
                    synchronized (obj) {
                        r0.A01 = false;
                        obj.notifyAll();
                    }
                }
            }
            multiSignalANRDetector.A0J = false;
        }
    }
}
