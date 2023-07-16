package X;

/* renamed from: X.0mO  reason: invalid class name and case insensitive filesystem */
public final class C12730mO extends C09740gb {
    public static final C12730mO A00 = new C12730mO();

    public final boolean A01() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 1502476572;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final Object A00() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
