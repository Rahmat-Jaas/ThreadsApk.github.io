package X;

/* renamed from: X.5Ma  reason: invalid class name and case insensitive filesystem */
public final class C90445Ma extends AnonymousClass0Sf implements C146188ln {
    public final C90455Mb A00;
    public final C90465Mc A01;
    public final boolean A02;

    public final C90445Ma D3Z() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90445Ma) {
                C90445Ma r5 = (C90445Ma) obj;
                if (this.A02 != r5.A02 || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean AW9() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C145948lN AYP() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C145558kh Az4() {
        return this.A01;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A05(this.A00, (C86164wN.A1S(this.A02) ? 1 : 0) * true));
    }

    public C90445Ma(C90455Mb r1, C90465Mc r2, boolean z) {
        AnonymousClass0wJ.A1Q(r1, r2);
        this.A02 = z;
        this.A00 = r1;
        this.A01 = r2;
    }
}
