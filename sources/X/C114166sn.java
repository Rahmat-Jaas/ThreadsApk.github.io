package X;

/* renamed from: X.6sn  reason: invalid class name and case insensitive filesystem */
public final class C114166sn {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114166sn) || i != ((C114166sn) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return "Butt";
        }
        if (i == 1) {
            return "Round";
        }
        if (i == 2) {
            return "Square";
        }
        return "Unknown";
    }

    public /* synthetic */ C114166sn(int i) {
        this.A00 = i;
    }
}
