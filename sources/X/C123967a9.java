package X;

import android.os.Bundle;

/* renamed from: X.7a9  reason: invalid class name and case insensitive filesystem */
public final class C123967a9 implements C143158gC {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ M5J A01;
    public final /* synthetic */ AnonymousClass583 A02;
    public final /* synthetic */ C120967Dk A03;
    public final /* synthetic */ String A04;

    public C123967a9(Bundle bundle, M5J m5j, AnonymousClass583 r3, C120967Dk r4, String str) {
        this.A02 = r3;
        this.A01 = m5j;
        this.A04 = str;
        this.A03 = r4;
        this.A00 = bundle;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass7Kx r5 = (AnonymousClass7Kx) obj;
        Throwable th = r5.A02;
        boolean z = th instanceof C1373588g;
        if (z) {
            int i = ((C1373588g) th).A00;
            if (i == 7 || i == 9 || i == 13) {
                AnonymousClass583 r3 = this.A02;
                r3.A03.A0J(this.A01);
                AnonymousClass7JD r0 = (AnonymousClass7JD) r3.A05.A08();
                if (r0 != null) {
                    ((C113936sP) r0.A01).A00();
                }
                r3.A03(this.A04, this.A03.A06, this.A00);
                return;
            } else if (z && i == 104) {
                return;
            }
        }
        this.A02.A03.A0G(AnonymousClass7Kx.A05(r5, Boolean.valueOf(AnonymousClass7Kx.A0R(r5))));
    }
}
