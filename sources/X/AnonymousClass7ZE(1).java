package X;

/* renamed from: X.7ZE  reason: invalid class name */
public final class AnonymousClass7ZE implements C147038nH {
    public final float A00;
    public final C876753r A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZE) {
                AnonymousClass7ZE r5 = (AnonymousClass7ZE) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || Float.compare(this.A00, r5.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float AQV() {
        return this.A00;
    }

    public final C111366nD AUS() {
        return this.A01;
    }

    public final long AYH() {
        return AnonymousClass7KE.A06;
    }

    public final int hashCode() {
        return C86144wL.A03(C18210wN.A04(this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("BrushStyle(value=");
        A0s.append(this.A01);
        A0s.append(", alpha=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass7ZE(C876753r r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }
}
