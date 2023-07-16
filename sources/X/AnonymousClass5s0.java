package X;

/* renamed from: X.5s0  reason: invalid class name */
public final class AnonymousClass5s0 extends AnonymousClass6JJ {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass6JJ)) {
                return false;
            }
            AnonymousClass5s0 r4 = (AnonymousClass5s0) ((AnonymousClass6JJ) obj);
            if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0h("LibraryVersion{libraryName=", this.A00, AnonymousClass000.A00(533), this.A01, "}");
    }

    public AnonymousClass5s0(String str, String str2) {
        if (str != null) {
            this.A00 = str;
            if (str2 != null) {
                this.A01 = str2;
                return;
            }
            throw C18210wN.A0W("Null version");
        }
        throw C18210wN.A0W("Null libraryName");
    }
}
