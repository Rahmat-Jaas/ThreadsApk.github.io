package X;

/* renamed from: X.1mP  reason: invalid class name */
public final class AnonymousClass1mP extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass390 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mP(AnonymousClass390 r2) {
        super(1411825408);
        this.A00 = r2;
    }

    public final void run() {
        String str = this.A00.A01;
        if (str == null) {
            str = "null";
        }
        C10450iM.A04(AnonymousClass00U.A0L("push_event_test_", str), "Fake push blocking event fired", 1);
    }
}
