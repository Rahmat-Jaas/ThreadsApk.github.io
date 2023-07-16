package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08P  reason: invalid class name */
public final class AnonymousClass08P implements Runnable {
    public final /* synthetic */ AnonymousClass0UP A00;

    public AnonymousClass08P(AnonymousClass0UP r1) {
        this.A00 = r1;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        AnonymousClass0LU.A0C(multiSignalANRDetector.A0C, "Moving to background");
        multiSignalANRDetector.A0I = true;
    }
}
