package X;

import java.util.Date;

/* renamed from: X.3Fx  reason: invalid class name and case insensitive filesystem */
public abstract class C58503Fx {
    public int A00;
    public int A01;
    public String A02;
    public Date A03;
    public Date A04;
    public String[] A05;

    public final Boolean A00() {
        if (this instanceof C212319o) {
            return C63803iN.A05(AnonymousClass0TJ.A06, ((C212319o) this).A00, 36317844023021593L);
        } else if (this instanceof C212419p) {
            return Boolean.valueOf(((C212419p) this).A00);
        } else {
            if (this instanceof C212119m) {
                return C18180wK.A0X();
            }
            return C63803iN.A05(AnonymousClass0TJ.A06, ((C212219n) this).A00, 36316658612112652L);
        }
    }

    public C58503Fx(C29851zP r2) {
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A03 = r2.A03;
    }
}
