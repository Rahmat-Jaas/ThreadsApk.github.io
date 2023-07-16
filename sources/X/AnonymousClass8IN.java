package X;

/* renamed from: X.8IN  reason: invalid class name */
public final class AnonymousClass8IN extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ AnonymousClass88C A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8IN(AnonymousClass88C r2) {
        super(1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0ZU r0;
        C04220Ms.A0B(obj, 0);
        AnonymousClass88C r02 = this.A00;
        synchronized (r02.A01) {
            r0 = (AnonymousClass0ZU) r02.A02.BEe().invoke(obj);
        }
        return r0;
    }
}
