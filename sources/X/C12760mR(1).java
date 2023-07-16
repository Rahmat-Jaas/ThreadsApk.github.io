package X;

/* renamed from: X.0mR  reason: invalid class name and case insensitive filesystem */
public final class C12760mR extends C09740gb {
    public final Object A00;

    public final boolean A01() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12760mR) {
            return this.A00.equals(((C12760mR) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public C12760mR(Object obj) {
        this.A00 = obj;
    }

    public final Object A00() {
        return this.A00;
    }
}
