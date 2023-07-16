package X;

import com.instagram.api.schemas.ClipsMashupType;

/* renamed from: X.5M7  reason: invalid class name */
public final class AnonymousClass5M7 extends AnonymousClass0Sf implements C21796C0v {
    public final ClipsMashupType A00;
    public final AnonymousClass5MC A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final AnonymousClass5M7 D3J(C112176p7 r1) {
        return this;
    }

    public final AnonymousClass5M7 D3K(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5M7) {
                AnonymousClass5M7 r5 = (AnonymousClass5M7) obj;
                if (this.A06 != r5.A06 || !C04220Ms.A0I(this.A05, r5.A05) || this.A07 != r5.A07 || !C04220Ms.A0I(this.A02, r5.A02) || this.A08 != r5.A08 || this.A00 != r5.A00 || this.A09 != r5.A09 || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean AW1() {
        return this.A06;
    }

    public final String Ajb() {
        return this.A05;
    }

    public final boolean AlV() {
        return this.A07;
    }

    public final Boolean Am2() {
        return this.A02;
    }

    public final ClipsMashupType AtW() {
        return this.A00;
    }

    public final boolean AtX() {
        return this.A09;
    }

    public final Integer Axg() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C144518id Az3() {
        return this.A01;
    }

    public final Integer B3S() {
        return this.A04;
    }

    public final boolean BSh() {
        return this.A08;
    }

    public final int hashCode() {
        boolean z = this.A06;
        int i = 1;
        if (z) {
            z = true;
        }
        int A062 = (((((((((((z ? 1 : 0) * true) + AnonymousClass0wJ.A06(this.A05)) * 31) + (C86164wN.A1S(this.A07) ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + (C86164wN.A1S(this.A08) ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31;
        if (!this.A09) {
            i = 0;
        }
        return ((((((A062 + i) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A04);
    }

    public AnonymousClass5M7(ClipsMashupType clipsMashupType, AnonymousClass5MC r2, Boolean bool, Integer num, Integer num2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = z;
        this.A05 = str;
        this.A07 = z2;
        this.A02 = bool;
        this.A08 = z3;
        this.A00 = clipsMashupType;
        this.A09 = z4;
        this.A03 = num;
        this.A01 = r2;
        this.A04 = num2;
    }
}
