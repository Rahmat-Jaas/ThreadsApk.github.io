package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08U  reason: invalid class name */
public final class AnonymousClass08U implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MultiSignalANRDetector A01;

    public AnonymousClass08U(MultiSignalANRDetector multiSignalANRDetector, long j) {
        this.A01 = multiSignalANRDetector;
        this.A00 = j;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A01;
        multiSignalANRDetector.A0O = false;
        multiSignalANRDetector.A02(AnonymousClass08X.MT_UNBLOCKED, false, false);
        if (multiSignalANRDetector.A0H) {
            C06870aW r2 = multiSignalANRDetector.A0V.A03;
            r2.A07 = this.A00;
            C06870aW.A00(r2);
        }
        if (multiSignalANRDetector.A0B == C16650tV.NO_ANR_DETECTED) {
            MultiSignalANRDetector.A01(multiSignalANRDetector);
        }
    }
}
