package X;

/* renamed from: X.0aq  reason: invalid class name and case insensitive filesystem */
public final class C07070aq implements AnonymousClass0PC {
    public final C04100Mg A00;
    public final AnonymousClass0Z2 A01;

    public final void start() {
        AnonymousClass0Z2 r0 = this.A01;
        if (r0 != null) {
            AnonymousClass0M4 r4 = r0.A01;
            this.A00.A07(new C04170Mn((Throwable) null), AnonymousClass0ND.CRITICAL_REPORT, this);
            synchronized (r4.A0A) {
                r4.A07 = this;
            }
        }
    }

    public C07070aq(C04100Mg r1, AnonymousClass0Z2 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.FOREGROUND_TRANSITION;
    }
}
