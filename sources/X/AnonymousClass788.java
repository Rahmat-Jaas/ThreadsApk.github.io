package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.788  reason: invalid class name */
public final class AnonymousClass788 {
    public int A00;
    public C106756fY A01;
    public C106756fY A02;
    public Long A03;
    public boolean A04;

    public final void A00(AnonymousClass7HD r6) {
        AnonymousClass7HD r0;
        String str;
        this.A04 = false;
        C106756fY r02 = this.A02;
        if (r02 != null) {
            r0 = r02.A01;
        } else {
            r0 = null;
        }
        if (!r6.equals(r0)) {
            String str2 = r6.A01.A00;
            C106756fY r03 = this.A02;
            if (r03 != null) {
                str = r03.A01.A01.A00;
            } else {
                str = null;
            }
            boolean A0I = C04220Ms.A0I(str2, str);
            C106756fY r04 = this.A02;
            if (!A0I) {
                C106756fY r2 = new C106756fY(r04, r6);
                this.A02 = r2;
                this.A01 = null;
                int A06 = C86154wM.A06(str2, this.A00);
                this.A00 = A06;
                if (A06 > 100000 && r2.A00 != null) {
                    do {
                        C106756fY r05 = r2.A00;
                        if (r05 == null || r05.A00 == null) {
                            r2.A00 = null;
                            return;
                        }
                        r2 = r2.A00;
                    } while (r2 != null);
                }
            } else if (r04 != null) {
                r04.A01 = r6;
            }
        }
    }

    public /* synthetic */ AnonymousClass788(DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
    }

    public AnonymousClass788() {
    }
}
