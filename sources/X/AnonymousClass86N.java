package X;

import com.facebook.redex.IDxObserverShape3S1500000_2_I2;

/* renamed from: X.86N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass86N implements AnonymousClass0YY {
    public final /* synthetic */ C142618fJ A00;
    public final /* synthetic */ C142618fJ A01;
    public final /* synthetic */ C880856r A02;
    public final /* synthetic */ C107266gT A03;
    public final /* synthetic */ AnonymousClass7Ic A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ AnonymousClass86N(C142618fJ r1, C142618fJ r2, C880856r r3, C107266gT r4, AnonymousClass7Ic r5, Object obj, String str) {
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = str;
        this.A05 = obj;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final Object invoke(Object obj) {
        AnonymousClass7Ic r6 = this.A04;
        C142618fJ r1 = this.A00;
        C880856r r3 = this.A02;
        String str = this.A06;
        Object obj2 = this.A05;
        C107266gT r5 = this.A03;
        C142618fJ r4 = this.A01;
        AnonymousClass7Kx r11 = (AnonymousClass7Kx) obj;
        if (AnonymousClass7Kx.A0P(r11) || AnonymousClass7Kx.A0O(r11)) {
            return C880856r.A04(AnonymousClass7Kx.A05(r11, (Object) null));
        }
        Object apply = r1.apply(AnonymousClass7Kx.A0D(r11));
        apply.getClass();
        M5J m5j = (M5J) apply;
        AnonymousClass066 r0 = r6.A01;
        if (r0 == null) {
            r0 = r6.A02;
            r0.getClass();
        }
        AnonymousClass7Kx.A0F(r0, m5j, new IDxObserverShape3S1500000_2_I2(r3, r4, r5, r6, obj2, str, 1));
        return m5j;
    }
}
