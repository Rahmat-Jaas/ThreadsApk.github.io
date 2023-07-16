package X;

import java.util.List;

/* renamed from: X.5LH  reason: invalid class name */
public final class AnonymousClass5LH extends AnonymousClass0Sf implements C144428iN {
    public final AnonymousClass5LG A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final AnonymousClass5LH D2l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LH) {
                AnonymousClass5LH r5 = (AnonymousClass5LH) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + C18200wM.A07(this.A06);
    }

    public AnonymousClass5LH(AnonymousClass5LG r1, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, String str, String str2, List list) {
        this.A01 = bool;
        this.A02 = bool2;
        this.A00 = r1;
        this.A03 = bool3;
        this.A07 = str;
        this.A04 = bool4;
        this.A08 = str2;
        this.A09 = list;
        this.A05 = num;
        this.A06 = num2;
    }
}
