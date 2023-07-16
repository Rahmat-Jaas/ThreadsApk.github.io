package X;

/* renamed from: X.6t0  reason: invalid class name and case insensitive filesystem */
public final class C114296t0 {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114296t0) || i != ((C114296t0) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 1) {
            return "Strictness.None";
        }
        if (i == 2) {
            return "Strictness.Loose";
        }
        if (i == 3) {
            return "Strictness.Normal";
        }
        if (i == 4) {
            return "Strictness.Strict";
        }
        return "Invalid";
    }

    public /* synthetic */ C114296t0(int i) {
        this.A00 = i;
    }
}
