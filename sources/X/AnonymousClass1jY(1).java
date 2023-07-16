package X;

/* renamed from: X.1jY  reason: invalid class name */
public final class AnonymousClass1jY extends C555933v {
    public final Throwable A00;
    public final AnonymousClass3SZ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1jY) {
                AnonymousClass1jY r5 = (AnonymousClass1jY) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A04(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Failure(exception=");
        A0s.append(this.A00);
        A0s.append(", fetchSummaryData=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass1jY(AnonymousClass3SZ r1, Throwable th) {
        super(r1);
        this.A00 = th;
        this.A01 = r1;
    }
}
