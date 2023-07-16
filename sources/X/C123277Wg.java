package X;

/* renamed from: X.7Wg  reason: invalid class name and case insensitive filesystem */
public final class C123277Wg implements C142878fk {
    public final float A00;

    public final int A87(AnonymousClass69J r4, int i, int i2) {
        float f;
        C04220Ms.A0B(r4, 2);
        float A01 = C86134wK.A01(i2 - i);
        if (r4 == AnonymousClass69J.Ltr) {
            f = this.A00;
        } else {
            f = ((float) -1) * this.A00;
        }
        return AnonymousClass8bA.A03(A01, ((float) 1) + f);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C123277Wg) && Float.compare(this.A00, ((C123277Wg) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0C("Horizontal(bias=", ')', this.A00);
    }

    public C123277Wg(float f) {
        this.A00 = f;
    }
}
