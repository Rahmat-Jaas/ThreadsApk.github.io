package X;

import java.util.List;

/* renamed from: X.18a  reason: invalid class name */
public final class AnonymousClass18a extends AnonymousClass0Sf implements C84444t9 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public final AnonymousClass18a D0F() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18a) {
                AnonymousClass18a r5 = (AnonymousClass18a) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List AcG() {
        return this.A03;
    }

    public final Integer Afm() {
        return this.A00;
    }

    public final String Aqv() {
        return this.A02;
    }

    public final Integer BDN() {
        return this.A01;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A03(this.A03) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A07(this.A01);
    }

    public AnonymousClass18a(Integer num, Integer num2, String str, List list) {
        this.A03 = list;
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}
