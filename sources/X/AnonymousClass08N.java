package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08N  reason: invalid class name */
public final class AnonymousClass08N implements Runnable {
    public final /* synthetic */ C05010Qj A00;

    public AnonymousClass08N(C05010Qj r1) {
        this.A00 = r1;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        if (multiSignalANRDetector.A0I) {
            int i = multiSignalANRDetector.A00 + 1;
            multiSignalANRDetector.A00 = i;
            if (i % 5 == 0) {
                AnonymousClass0LU.A0C(multiSignalANRDetector.A0C, "Pausing error state checks");
                multiSignalANRDetector.A0A.A00();
                multiSignalANRDetector.A0J = true;
            }
        }
    }
}
