package X;

/* renamed from: X.1kB  reason: invalid class name */
public final class AnonymousClass1kB extends C57943Dd {
    public final CharSequence A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1kB) && C04220Ms.A0I(this.A00, ((AnonymousClass1kB) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("StringLiteral(text=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass1kB(CharSequence charSequence) {
        this.A00 = charSequence;
    }
}
