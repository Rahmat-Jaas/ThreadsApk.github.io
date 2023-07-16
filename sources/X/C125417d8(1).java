package X;

/* renamed from: X.7d8  reason: invalid class name and case insensitive filesystem */
public final class C125417d8 implements C02930Dl {
    public C15730rn A00 = null;
    public volatile C11660kZ A01;

    public final void A57(String str, String str2) {
        this.A00 = C15730rn.A01("mobile_power_stats", (String) null);
    }

    public final void A5Q(String str, double d) {
        C15730rn r1 = this.A00;
        if (r1 != null) {
            r1.A0A(str, Double.valueOf(d));
        }
    }

    public final void A5R(String str, int i) {
        C15730rn r1 = this.A00;
        if (r1 != null) {
            r1.A08(Integer.valueOf(i), str);
        }
    }

    public final void A5S(String str, long j) {
        C15730rn r1 = this.A00;
        if (r1 != null) {
            r1.A0C(str, Long.valueOf(j));
        }
    }

    public final void A5T(String str, String str2) {
        C15730rn r0 = this.A00;
        if (r0 != null) {
            r0.A0D(str, str2);
        }
    }

    public final void BbM() {
        if (this.A00 != null) {
            this.A01.Cd7(this.A00);
            this.A00 = null;
        }
    }

    public final boolean isSampled() {
        return AnonymousClass0wJ.A1W(this.A00);
    }

    public C125417d8(C11660kZ r2) {
        this.A01 = r2;
    }
}
