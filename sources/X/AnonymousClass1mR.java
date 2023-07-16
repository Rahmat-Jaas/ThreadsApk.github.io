package X;

import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.1mR  reason: invalid class name */
public final class AnonymousClass1mR extends AnonymousClass0gG {
    public final /* synthetic */ C692647p A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mR(C692647p r4) {
        super(HttpStatus.SC_REQUEST_TIMEOUT, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        C692647p r1 = this.A00;
        AnonymousClass36M r4 = new AnonymousClass36M();
        AnonymousClass3UL r3 = C692647p.A03;
        r4.A00 = r3;
        synchronized (r3) {
            if (!C692647p.A03.A00.isEmpty()) {
                C692647p.A02.getUserId();
                r1.A00.A04(AnonymousClass00U.A0L("pending_reel_tray_seen_state_", C692647p.A02.getUserId()), r4);
            }
        }
    }
}
