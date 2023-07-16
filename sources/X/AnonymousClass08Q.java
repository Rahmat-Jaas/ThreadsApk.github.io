package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;
import java.util.List;

/* renamed from: X.08Q  reason: invalid class name */
public final class AnonymousClass08Q implements Runnable {
    public final /* synthetic */ MultiSignalANRDetector A00;
    public final /* synthetic */ C06890aY A01;

    public AnonymousClass08Q(MultiSignalANRDetector multiSignalANRDetector, C06890aY r2) {
        this.A00 = multiSignalANRDetector;
        this.A01 = r2;
    }

    public final void run() {
        C06890aY r2 = this.A01;
        if (!AnonymousClass0MI.A08() && (AnonymousClass0MI.A04 == null || !AnonymousClass0MI.A04.A05)) {
            this.A00.A0I = true;
        }
        AnonymousClass0UP r0 = this.A00.A0S;
        List list = r2.A00;
        synchronized (list) {
            list.add(r0);
        }
    }
}
