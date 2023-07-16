package X;

import kotlin.Unit;

/* renamed from: X.8EN  reason: invalid class name */
public final class AnonymousClass8EN extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C147778pt A01;
    public final /* synthetic */ AnonymousClass84G A02;
    public final /* synthetic */ C146108le A03;
    public final /* synthetic */ AnonymousClass54T A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8EN(C147778pt r2, AnonymousClass84G r3, C146108le r4, AnonymousClass54T r5, long j, boolean z, boolean z2) {
        super(0);
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = j;
        this.A02 = r3;
        this.A06 = z;
        this.A05 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass54T r6 = this.A04;
        C147778pt r1 = this.A01;
        C146108le r5 = this.A03;
        C147778pt r3 = (C147778pt) AnonymousClass6F1.A00(r1, r5.AKQ());
        long j = this.A00;
        AnonymousClass84G r4 = this.A02;
        boolean z = this.A06;
        boolean z2 = this.A05;
        if (r3 == null) {
            r6.A0V(r4, r5, j, z, z2);
        } else {
            r4.A01(r3, new AnonymousClass8EN(r3, r4, r5, r6, j, z, z2), -1.0f, z2);
        }
        return Unit.A00;
    }
}
