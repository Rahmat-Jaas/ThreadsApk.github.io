package X;

import java.io.IOException;

/* renamed from: X.61E  reason: invalid class name */
public final class AnonymousClass61E extends AnonymousClass0gG {
    public final /* synthetic */ C113766s6 A00;
    public final /* synthetic */ C132697uM A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61E(C113766s6 r2, C132697uM r3) {
        super(811);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void run() {
        C132697uM r3 = this.A01;
        C113766s6 r0 = this.A00;
        synchronized (r3) {
            try {
                C18180wK.A0v(C28161tl.A04(r3.A03).edit(), "per_media_seen_state", AnonymousClass71E.A00(r0));
            } catch (IOException e) {
                AnonymousClass0LU.A03(C132697uM.class, "failed to save LocalReelItemSeenState json", e);
            }
        }
        return;
    }
}
