package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08S  reason: invalid class name */
public final class AnonymousClass08S implements Runnable {
    public final /* synthetic */ MultiSignalANRDetector A00;

    public AnonymousClass08S(MultiSignalANRDetector multiSignalANRDetector) {
        this.A00 = multiSignalANRDetector;
    }

    public final void run() {
        this.A00.A0T.cleanupAppStateFile();
    }
}
