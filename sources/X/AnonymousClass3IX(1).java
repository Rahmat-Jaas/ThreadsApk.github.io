package X;

/* renamed from: X.3IX  reason: invalid class name */
public abstract class AnonymousClass3IX {
    public final C81604o4 A00;
    public final String A01;

    public abstract boolean A00();

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((AnonymousClass3IX) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return ((Enum) this.A00).name();
    }

    public AnonymousClass3IX(C81604o4 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
