package X;

import com.facebook.redex.IDxCFactoryShape495S0100000_I2;
import java.util.List;

/* renamed from: X.0OC  reason: invalid class name */
public final class AnonymousClass0OC {
    public AnonymousClass0OB A00 = new IDxCFactoryShape495S0100000_I2((Object) this, 0);
    public AnonymousClass0OB A01;
    public Integer A02 = AnonymousClass006.A00;
    public boolean A03 = true;
    public boolean A04 = true;
    public final AnonymousClass0OA A05 = new AnonymousClass0OA();
    public final Integer A06;

    public final AnonymousClass0YB A00() {
        AnonymousClass0OB r2 = this.A00;
        Integer num = this.A02;
        boolean z = this.A04;
        return new AnonymousClass0YB(this.A05, r2, this.A01, num, z);
    }

    public final void A01(AnonymousClass0ND r3, AnonymousClass0OB r4) {
        List list;
        if (r4 != null) {
            AnonymousClass0OA r1 = this.A05;
            if (r3 == AnonymousClass0ND.CRITICAL_REPORT) {
                list = r1.A02;
            } else if (r3 == AnonymousClass0ND.LARGE_REPORT) {
                list = r1.A07;
            } else {
                throw new IllegalStateException("Unknown ReportCategory");
            }
            list.add(r4);
        }
    }

    public final void A02(AnonymousClass0ND r3, AnonymousClass0OB r4) {
        List list;
        if (r4 != null) {
            AnonymousClass0OA r1 = this.A05;
            if (r3 == AnonymousClass0ND.CRITICAL_REPORT) {
                list = r1.A04;
            } else if (r3 == AnonymousClass0ND.LARGE_REPORT) {
                list = r1.A09;
            } else {
                throw new IllegalStateException("Unknown ReportCategory");
            }
            list.add(r4);
        }
    }

    public AnonymousClass0OC(Integer num) {
        this.A06 = num;
    }
}
