package X;

import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08I  reason: invalid class name */
public final class AnonymousClass08I implements Runnable {
    public final /* synthetic */ MultiSignalANRDetector A00;

    public AnonymousClass08I(MultiSignalANRDetector multiSignalANRDetector) {
        this.A00 = multiSignalANRDetector;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00;
        AnonymousClass0LU.A0C(multiSignalANRDetector.A0C, "On confirmation expired");
        if (multiSignalANRDetector.A0N) {
            multiSignalANRDetector.A02(AnonymousClass08X.AM_EXPIRED, false, false);
            multiSignalANRDetector.A0N = false;
            if (multiSignalANRDetector.A0H) {
                C06870aW r2 = multiSignalANRDetector.A0V.A03;
                r2.A03 = SystemClock.uptimeMillis();
                C06870aW.A00(r2);
            }
            if (multiSignalANRDetector.A0B == C16650tV.NO_ANR_DETECTED) {
                MultiSignalANRDetector.A01(multiSignalANRDetector);
            }
        }
    }
}
