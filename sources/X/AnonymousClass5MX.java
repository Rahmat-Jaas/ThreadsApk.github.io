package X;

/* renamed from: X.5MX  reason: invalid class name */
public final class AnonymousClass5MX extends AnonymousClass0Sf implements C144678it {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public /* synthetic */ AnonymousClass5MX(String str, int i, int i2) {
        boolean z = (i2 & 4) != 0;
        C04220Ms.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MX) {
                AnonymousClass5MX r5 = (AnonymousClass5MX) obj;
                if (!(this.A00 == r5.A00 && C04220Ms.A0I(this.A01, r5.A01) && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean Afe() {
        return this.A02;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A07(this.A01, this.A00 * 31) + (C86164wN.A1S(this.A02) ? 1 : 0)) * 31;
    }
}
