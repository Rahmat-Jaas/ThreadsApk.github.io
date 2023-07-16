package X;

import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08T  reason: invalid class name */
public final class AnonymousClass08T implements Runnable {
    public final /* synthetic */ MultiSignalANRDetector A00;

    public AnonymousClass08T(MultiSignalANRDetector multiSignalANRDetector) {
        this.A00 = multiSignalANRDetector;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00;
        AnonymousClass0LU.A0C(multiSignalANRDetector.A0C, "Running on the main thread");
        multiSignalANRDetector.A0Q.post(new AnonymousClass08U(multiSignalANRDetector, SystemClock.uptimeMillis()));
    }
}
