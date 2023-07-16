package X;

/* renamed from: X.1hC  reason: invalid class name */
public final class AnonymousClass1hC extends C63873iU {
    public final /* synthetic */ C61273So A00;

    public AnonymousClass1hC(C61273So r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(-65513684);
        super.onFail(r4);
        int i = C61273So.A03;
        C61273So.A03 = i - 1;
        if (i > 0) {
            C61273So.A00(this.A00);
        }
        C14030oh.A0A(-343493581, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(2069655902);
        C22071Tg r11 = (C22071Tg) obj;
        int A032 = C14030oh.A03(108377186);
        super.onSuccess(r11);
        C61273So r0 = this.A00;
        r0.A00 = new C25271mo(r11.A04, r11.A01, r11.A03, r11.A02, r11.A00);
        AnonymousClass0gN.A00().AKp(r0.A00);
        C14030oh.A0A(1811792520, A032);
        C14030oh.A0A(227020634, A03);
    }
}
