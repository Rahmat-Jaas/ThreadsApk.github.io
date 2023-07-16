package X;

/* renamed from: X.5KM  reason: invalid class name */
public final class AnonymousClass5KM extends AnonymousClass0Sf implements C143508gr {
    public final String A00;

    public AnonymousClass5KM(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5KM) && C04220Ms.A0I(this.A00, ((AnonymousClass5KM) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final byte[] CxB() {
        String A0L = AnonymousClass00U.A0L("1:", this.A00);
        C04220Ms.A0B(A0L, 0);
        return AnonymousClass74V.A00(A0L);
    }
}
