package X;

/* renamed from: X.6sm  reason: invalid class name and case insensitive filesystem */
public final class C114156sm {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114156sm) || i != ((C114156sm) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return "NonZero";
        }
        if (i == 1) {
            return "EvenOdd";
        }
        return "Unknown";
    }

    public /* synthetic */ C114156sm(int i) {
        this.A00 = i;
    }
}
