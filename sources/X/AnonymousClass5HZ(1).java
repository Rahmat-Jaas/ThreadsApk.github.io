package X;

/* renamed from: X.5HZ  reason: invalid class name */
public final class AnonymousClass5HZ extends AnonymousClass0Sf {
    public final C25803DsH A00;
    public final Double A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass8s2 A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HZ) {
                AnonymousClass5HZ r5 = (AnonymousClass5HZ) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AnonymousClass8s2 r0 = this.A05;
        return C18220wO.A06(this.A00, (((AnonymousClass0wJ.A05(r0, ((AnonymousClass0wJ.A06(this.A02) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + C18200wM.A07(this.A01)) * 31);
    }

    public AnonymousClass5HZ(C25803DsH dsH, Double d, String str, String str2, String str3, AnonymousClass8s2 r6) {
        this.A02 = str;
        this.A04 = str2;
        this.A05 = r6;
        this.A03 = str3;
        this.A01 = d;
        this.A00 = dsH;
    }
}
