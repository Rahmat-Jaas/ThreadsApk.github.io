package X;

/* renamed from: X.3Hk  reason: invalid class name and case insensitive filesystem */
public final class C58823Hk {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C58823Hk) && C04220Ms.A0I(this.A00, ((C58823Hk) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0M("OpaqueKey(key=", this.A00, ')');
    }

    public C58823Hk(String str) {
        this.A00 = str;
    }
}
