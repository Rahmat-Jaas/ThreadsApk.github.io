package X;

/* renamed from: X.6ui  reason: invalid class name and case insensitive filesystem */
public final class C115226ui {
    public final C104236bS A00;
    public final C104236bS A01;
    public final C1201779c A02;
    public final C104236bS A03;
    public final C1201779c A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C04220Ms.A0I(getClass(), C86144wL.A0a(obj))) {
                C04220Ms.A0C(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
                C115226ui r5 = (C115226ui) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A03, C18210wN.A04(this.A01)))) + C18230wP.A05(this.A04);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CombinedLoadStates(refresh=");
        A0s.append(this.A01);
        A0s.append(", prepend=");
        A0s.append(this.A03);
        A0s.append(", append=");
        A0s.append(this.A00);
        A0s.append(AnonymousClass000.A00(236));
        A0s.append(this.A02);
        A0s.append(", mediator=");
        return C86104wH.A0y(this.A04, A0s);
    }

    public C115226ui(C104236bS r2, C104236bS r3, C104236bS r4, C1201779c r5, C1201779c r6) {
        AnonymousClass0wJ.A1O(r2, r3);
        C04220Ms.A0B(r4, 3);
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = r5;
        this.A04 = r6;
    }
}
