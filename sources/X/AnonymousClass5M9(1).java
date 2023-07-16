package X;

import java.util.List;

/* renamed from: X.5M9  reason: invalid class name */
public final class AnonymousClass5M9 extends AnonymousClass0Sf implements C21558BwN {
    public final long A00;
    public final AnonymousClass5KY A01;
    public final AnonymousClass5KZ A02;
    public final AnonymousClass5Ka A03;
    public final AnonymousClass5MA A04;
    public final Integer A05;
    public final List A06;
    public final List A07;

    public AnonymousClass5M9(AnonymousClass5KY r2, AnonymousClass5KZ r3, AnonymousClass5Ka r4, AnonymousClass5MA r5, Integer num, List list, List list2, long j) {
        C04220Ms.A0B(list, 4);
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = num;
        this.A06 = list;
        this.A01 = r2;
        this.A00 = j;
        this.A04 = r5;
        this.A07 = list2;
    }

    public final AnonymousClass5M9 D3O() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5M9) {
                AnonymousClass5M9 r8 = (AnonymousClass5M9) obj;
                if (!C04220Ms.A0I(this.A02, r8.A02) || !C04220Ms.A0I(this.A03, r8.A03) || !C04220Ms.A0I(this.A05, r8.A05) || !C04220Ms.A0I(this.A06, r8.A06) || !C04220Ms.A0I(this.A01, r8.A01) || this.A00 != r8.A00 || !C04220Ms.A0I(this.A04, r8.A04) || !C04220Ms.A0I(this.A07, r8.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List B9m() {
        return this.A06;
    }

    public final int hashCode() {
        return ((C86104wH.A06((AnonymousClass0wJ.A05(this.A06, ((((AnonymousClass0wJ.A03(this.A02) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31, this.A00) + AnonymousClass0wJ.A03(this.A04)) * 31) + C18200wM.A07(this.A07);
    }
}
