package X;

/* renamed from: X.6st  reason: invalid class name and case insensitive filesystem */
public final class C114226st {
    public final String A00;

    public C114226st(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114226st) && C04220Ms.A0I(this.A00, ((C114226st) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0M("UrlAnnotation(url=", this.A00, ')');
    }
}
