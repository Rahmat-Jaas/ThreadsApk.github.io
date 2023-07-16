package X;

/* renamed from: X.6u3  reason: invalid class name and case insensitive filesystem */
public final class C114886u3 {
    public final C114876u2 A00;
    public final C114876u2 A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114886u3) {
                C114886u3 r5 = (C114886u3) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05 = AnonymousClass0wJ.A05(this.A00, C18210wN.A04(this.A01));
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return A05 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Selection(start=");
        A0s.append(this.A01);
        A0s.append(", end=");
        A0s.append(this.A00);
        A0s.append(", handlesCrossed=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C114886u3(C114876u2 r1, C114876u2 r2, boolean z) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = z;
    }
}
