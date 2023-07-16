package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08K  reason: invalid class name */
public final class AnonymousClass08K implements Runnable {
    public final /* synthetic */ C05010Qj A00;

    public AnonymousClass08K(C05010Qj r1) {
        this.A00 = r1;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        multiSignalANRDetector.A02(AnonymousClass08X.DIALOG_DISMISSED, false, false);
        MultiSignalANRDetector.A01(multiSignalANRDetector);
    }
}
