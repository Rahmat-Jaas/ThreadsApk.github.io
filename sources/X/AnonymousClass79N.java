package X;

/* renamed from: X.79N  reason: invalid class name */
public final class AnonymousClass79N {
    public final AnonymousClass79A A00;
    public final C113216qw A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79N) {
                AnonymousClass79N r5 = (AnonymousClass79N) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A05 = C18230wP.A05(this.A01) * 31;
        AnonymousClass79A r0 = this.A00;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return A05 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PlatformTextStyle(spanStyle=");
        A0s.append(this.A01);
        A0s.append(", paragraphSyle=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public AnonymousClass79N(AnonymousClass79A r1, C113216qw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public AnonymousClass79N() {
        this(new AnonymousClass79A(false), (C113216qw) null);
    }
}
