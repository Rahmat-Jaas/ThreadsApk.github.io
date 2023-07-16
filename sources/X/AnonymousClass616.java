package X;

import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.616  reason: invalid class name */
public final class AnonymousClass616 extends AnonymousClass0gG {
    public final /* synthetic */ C32337HGt A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass616(C32337HGt hGt) {
        super(HttpStatus.SC_REQUEST_URI_TOO_LONG);
        this.A00 = hGt;
    }

    public final void run() {
        this.A00.A06.post(new C32619HSg(this));
    }
}
