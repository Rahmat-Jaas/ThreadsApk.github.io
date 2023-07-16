package X;

import java.util.List;

/* renamed from: X.18h  reason: invalid class name */
public final class AnonymousClass18h extends AnonymousClass0Sf implements C27997Ewl {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public final AnonymousClass18h D0e(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18h) {
                AnonymousClass18h r5 = (AnonymousClass18h) obj;
                if (!C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AZj() {
        return this.A02;
    }

    public final List Ah5() {
        return this.A07;
    }

    public final String Al5() {
        return this.A03;
    }

    public final Boolean BBn() {
        return this.A00;
    }

    public final String BEm() {
        return this.A04;
    }

    public final String BH2() {
        return this.A05;
    }

    public final String getCategory() {
        return this.A01;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A07, AnonymousClass0wJ.A07(this.A02, ((AnonymousClass0wJ.A03(this.A06) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31));
        return C18210wN.A05(this.A05, (((AnonymousClass0wJ.A07(this.A03, A052) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A09(this.A04)) * 31);
    }

    public AnonymousClass18h(Boolean bool, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        AnonymousClass0wJ.A1R(str2, list2);
        C18210wN.A1M(str3, 5, str5);
        this.A06 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A07 = list2;
        this.A03 = str3;
        this.A00 = bool;
        this.A04 = str4;
        this.A05 = str5;
    }
}
