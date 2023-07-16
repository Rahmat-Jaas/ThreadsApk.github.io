package X;

/* renamed from: X.79L  reason: invalid class name */
public final class AnonymousClass79L {
    public final float A00;
    public final C111366nD A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79L) {
                AnonymousClass79L r5 = (AnonymousClass79L) obj;
                if (!C18180wK.A1W(Float.compare(this.A00, r5.A00)) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass79L A00(float f, long j) {
        return new AnonymousClass79L(new C876253m(j), f);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C86134wK.A03(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("BorderStroke(width=");
        C134847yT.A02(A0s, this.A00);
        A0s.append(", brush=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public AnonymousClass79L(C111366nD r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }
}
