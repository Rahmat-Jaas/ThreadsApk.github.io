package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.0PG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0PG implements Runnable {
    public final /* synthetic */ MultiSignalANRDetector A00;

    public /* synthetic */ AnonymousClass0PG(MultiSignalANRDetector multiSignalANRDetector) {
        this.A00 = multiSignalANRDetector;
    }

    public final void run() {
        boolean z;
        MultiSignalANRDetector multiSignalANRDetector = this.A00;
        try {
            synchronized (C06930ac.A04) {
                C15020qa.A0A("sigquit");
            }
            C017908l r2 = multiSignalANRDetector.A0T;
            AnonymousClass0NG r1 = multiSignalANRDetector.A0V;
            AnonymousClass08D r0 = multiSignalANRDetector.A09;
            if (r0 != null) {
                z = ((C06920ab) r0).A00.A03;
            } else {
                z = true;
            }
            r2.init(r1, z);
            r2.installSignalHandler(multiSignalANRDetector.A0Q, true);
            multiSignalANRDetector.A0Y.set(true);
            multiSignalANRDetector.A0P.open();
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0LU.A0H("lacrima", "Failed to load sigquit", e);
            C04790Pd.A00();
        }
    }
}
