package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass54T;
import X.AnonymousClass6F1;
import X.AnonymousClass84G;
import X.C02220Ah;
import X.C146108le;
import X.C147778pt;
import kotlin.Unit;

public class KtLambdaShape0S0420101_I2 extends C02220Ah implements AnonymousClass0ZU {
    public float A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0420101_I2(C147778pt r2, AnonymousClass84G r3, C146108le r4, AnonymousClass54T r5, float f, long j, boolean z, boolean z2) {
        super(0);
        this.A05 = r5;
        this.A04 = r2;
        this.A03 = r4;
        this.A01 = j;
        this.A02 = r3;
        this.A07 = z;
        this.A06 = z2;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass54T r6 = (AnonymousClass54T) this.A05;
        C146108le r5 = (C146108le) this.A03;
        C147778pt r3 = (C147778pt) AnonymousClass6F1.A00((C147778pt) this.A04, r5.AKQ());
        long j = this.A01;
        AnonymousClass84G r4 = (AnonymousClass84G) this.A02;
        boolean z = this.A07;
        boolean z2 = this.A06;
        float f = this.A00;
        if (r3 == null) {
            r6.A0V(r4, r5, j, z, z2);
        } else {
            r4.A01(r3, new KtLambdaShape0S0420101_I2(r3, r4, r5, r6, f, j, z, z2), f, z2);
        }
        return Unit.A00;
    }
}
