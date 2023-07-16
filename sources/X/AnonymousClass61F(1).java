package X;

import java.io.IOException;

/* renamed from: X.61F  reason: invalid class name */
public final class AnonymousClass61F extends AnonymousClass0gG {
    public final /* synthetic */ C113776s7 A00;
    public final /* synthetic */ C132687uL A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61F(C113776s7 r2, C132687uL r3) {
        super(321);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void run() {
        C132687uL r1 = this.A01;
        try {
            C18180wK.A0v(C28161tl.A04(r1.A03).edit(), "seen_state", AnonymousClass71F.A00(this.A00));
        } catch (IOException e) {
            AnonymousClass0LU.A03(C132687uL.class, "failed to save LocalReelSeenState json", e);
        }
    }
}
