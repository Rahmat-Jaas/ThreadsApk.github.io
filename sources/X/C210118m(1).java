package X;

import java.util.List;

/* renamed from: X.18m  reason: invalid class name and case insensitive filesystem */
public final class C210118m extends AnonymousClass0Sf implements C84674tf {
    public final C210318o A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;

    public final C210118m D2g() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C210118m) {
                C210118m r5 = (C210118m) obj;
                if (!C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A0A, r5.A0A) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A0C, r5.A0C) || !C04220Ms.A0I(this.A0B, r5.A0B) || !C04220Ms.A0I(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer Ac1() {
        return this.A08;
    }

    public final String Ahm() {
        return this.A0A;
    }

    public final Boolean AmO() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C84454tA ArU() {
        return this.A00;
    }

    public final List B5a() {
        return this.A0C;
    }

    public final String B93() {
        return this.A0B;
    }

    public final Integer B94() {
        return this.A09;
    }

    public final Boolean BTI() {
        return this.A02;
    }

    public final Boolean BUb() {
        return this.A03;
    }

    public final Boolean BUc() {
        return this.A04;
    }

    public final Boolean BXf() {
        return this.A05;
    }

    public final Boolean BYv() {
        return this.A06;
    }

    public final Boolean BYw() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((AnonymousClass0wJ.A03(this.A08) * 31) + AnonymousClass0wJ.A06(this.A0A)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A0C)) * 31) + AnonymousClass0wJ.A06(this.A0B)) * 31) + C18200wM.A07(this.A09);
    }

    public C210118m(C210318o r1, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Integer num2, String str, String str2, List list) {
        this.A08 = num;
        this.A0A = str;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A04 = bool4;
        this.A05 = bool5;
        this.A06 = bool6;
        this.A07 = bool7;
        this.A00 = r1;
        this.A0C = list;
        this.A0B = str2;
        this.A09 = num2;
    }
}
