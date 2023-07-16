package X;

/* renamed from: X.8bh  reason: invalid class name and case insensitive filesystem */
public final class C141488bh extends C111626o2 {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C141488bh) || !C04220Ms.A0I(this.A00, ((C141488bh) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18230wP.A05(this.A00);
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("Closed("));
    }

    public C141488bh(Throwable th) {
        this.A00 = th;
    }
}
