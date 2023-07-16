package X;

/* renamed from: X.0MR  reason: invalid class name */
public final class AnonymousClass0MR extends AnonymousClass0AV {
    public boolean A00 = false;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public final String A01() {
        return "InProcessBatchLock";
    }

    public final void A04() {
    }

    public final synchronized void A05() {
        this.A00 = true;
    }

    public final void A06() {
    }

    public final synchronized boolean A09() {
        return this.A00;
    }

    public final boolean A0A() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0MR(AnonymousClass0M3 r2, Object obj) {
        super(r2, obj);
        this.A01 = r2;
    }
}
