package X;

/* renamed from: X.1os  reason: invalid class name and case insensitive filesystem */
public final class C25761os extends C35142Mg {
    public final String A00;

    public C25761os(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25761os) && C04220Ms.A0I(this.A00, ((C25761os) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
