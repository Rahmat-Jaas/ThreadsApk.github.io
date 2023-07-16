package X;

/* renamed from: X.3Ud  reason: invalid class name */
public final class AnonymousClass3Ud {
    public String A00;
    public String A01;
    public String A02;

    public final String toString() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        String A0V = AnonymousClass00U.A0V(this.A00, ": ", this.A01);
        this.A02 = A0V;
        return A0V;
    }

    public AnonymousClass3Ud(String str, String str2) {
        this.A00 = str;
        this.A01 = str2 == null ? "" : str2;
    }

    public AnonymousClass3Ud() {
    }
}
