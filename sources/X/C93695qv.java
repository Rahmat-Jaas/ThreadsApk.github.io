package X;

/* renamed from: X.5qv  reason: invalid class name and case insensitive filesystem */
public final class C93695qv extends AnonymousClass6JC {
    public final String A00;

    public /* synthetic */ C93695qv(String str) {
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnonymousClass6JC) {
            return this.A00.equals(((C93695qv) ((AnonymousClass6JC) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AnonymousClass00U.A0V("IntegrityTokenResponse{token=", this.A00, "}");
    }
}
