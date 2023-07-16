package X;

import kotlin.Unit;

/* renamed from: X.8E4  reason: invalid class name */
public final class AnonymousClass8E4 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C113976sU A02;
    public final /* synthetic */ AnonymousClass0YY A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8E4(C113976sU r2, AnonymousClass0YY r3, float f, long j) {
        super(0);
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = j;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass0YY r6 = this.A03;
        C113976sU r0 = this.A02;
        long j = this.A01;
        float f = this.A00;
        AnonymousClass54T r2 = r0.A07.A0a.A04;
        if (r6 == null) {
            C122067Jz.A01(r2, f, j);
        } else {
            C04220Ms.A0B(r2, 0);
            r2.A0E(r6, f, AnonymousClass7Hh.A01(j, C123657Xy.A08(r2)));
        }
        return Unit.A00;
    }
}
