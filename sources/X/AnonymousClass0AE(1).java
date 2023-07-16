package X;

/* renamed from: X.0AE  reason: invalid class name */
public final class AnonymousClass0AE implements AnonymousClass0XL {
    public final Class A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0AE) || !C04220Ms.A0I(this.A00, ((AnonymousClass0AE) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0L(this.A00.toString(), " (Kotlin reflection is not available)");
    }

    public AnonymousClass0AE(Class cls) {
        this.A00 = cls;
    }

    public final Class AqX() {
        return this.A00;
    }
}
