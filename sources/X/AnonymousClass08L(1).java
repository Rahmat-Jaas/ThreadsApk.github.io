package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08L  reason: invalid class name */
public final class AnonymousClass08L implements Runnable {
    public final /* synthetic */ C05010Qj A00;

    public AnonymousClass08L(C05010Qj r1) {
        this.A00 = r1;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        if (multiSignalANRDetector.A0H) {
            C06870aW r3 = multiSignalANRDetector.A0V.A03;
            r3.A09 = multiSignalANRDetector.A03;
            r3.A01 = 3;
            C06870aW.A00(r3);
        }
    }
}
