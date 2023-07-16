package X;

/* renamed from: X.4LA  reason: invalid class name */
public final class AnonymousClass4LA implements C83004qd {
    public final /* synthetic */ AnonymousClass2AC A00;
    public final /* synthetic */ C67233zC A01;

    public AnonymousClass4LA(AnonymousClass2AC r1, C67233zC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void afterSelection(boolean z) {
        C67233zC r1;
        C67233zC r0;
        int ordinal = this.A00.ordinal();
        if (z) {
            if (ordinal == 53 && (r0 = this.A01) != null) {
                r0.A03();
            }
        } else if (ordinal == 53 && (r1 = this.A01) != null) {
            r1.A05 = true;
        }
    }
}
