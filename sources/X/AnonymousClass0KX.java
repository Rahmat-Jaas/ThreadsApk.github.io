package X;

/* renamed from: X.0KX  reason: invalid class name */
public final class AnonymousClass0KX {
    public static final AnonymousClass0KX A01 = new AnonymousClass0KX("");
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00.equals(((AnonymousClass0KX) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass0KX(String str) {
        if (str == null || str.contains(":")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
