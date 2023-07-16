package X;

/* renamed from: X.18T  reason: invalid class name */
public final class AnonymousClass18T extends AnonymousClass0Sf implements C84524tI {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public AnonymousClass18T(Integer num, Integer num2, String str, String str2, boolean z) {
        C18190wL.A1S(str, 2, str2);
        this.A00 = num;
        this.A02 = str;
        this.A04 = z;
        this.A01 = num2;
        this.A03 = str2;
    }

    public final AnonymousClass18T CzE() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18T) {
                AnonymousClass18T r5 = (AnonymousClass18T) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || this.A04 != r5.A04 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer AhK() {
        return this.A00;
    }

    public final Integer AsB() {
        return this.A01;
    }

    public final boolean BMs() {
        return this.A04;
    }

    public final String getId() {
        return this.A02;
    }

    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A03(this.A00) * 31);
        boolean z = this.A04;
        if (z) {
            z = true;
        }
        return C18210wN.A05(this.A03, (((A07 + (z ? 1 : 0)) * 31) + C18200wM.A07(this.A01)) * 31);
    }
}
