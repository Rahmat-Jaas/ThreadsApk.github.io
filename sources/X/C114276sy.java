package X;

/* renamed from: X.6sy  reason: invalid class name and case insensitive filesystem */
public final class C114276sy {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114276sy) || i != ((C114276sy) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        return "Invalid";
    }

    public /* synthetic */ C114276sy(int i) {
        this.A00 = i;
    }
}
