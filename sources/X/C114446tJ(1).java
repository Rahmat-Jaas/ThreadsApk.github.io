package X;

/* renamed from: X.6tJ  reason: invalid class name and case insensitive filesystem */
public final class C114446tJ {
    public final C147218oz A00;
    public final AnonymousClass0YY A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114446tJ) {
                C114446tJ r5 = (C114446tJ) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18210wN.A04(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Slide(slideOffset=");
        A0s.append(this.A01);
        A0s.append(", animationSpec=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C114446tJ(C147218oz r1, AnonymousClass0YY r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
