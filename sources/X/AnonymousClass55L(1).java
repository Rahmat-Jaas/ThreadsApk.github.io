package X;

/* renamed from: X.55L  reason: invalid class name */
public final class AnonymousClass55L extends AnonymousClass6FO {
    public final String A00;

    public AnonymousClass55L(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass55L) && C04220Ms.A0I(this.A00, ((AnonymousClass55L) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0M("VerbatimTtsAnnotation(verbatim=", this.A00, ')');
    }
}
