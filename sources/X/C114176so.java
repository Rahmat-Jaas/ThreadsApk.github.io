package X;

/* renamed from: X.6so  reason: invalid class name and case insensitive filesystem */
public final class C114176so {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114176so) || i != ((C114176so) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return "Miter";
        }
        if (i == 1) {
            return "Round";
        }
        if (i == 2) {
            return "Bevel";
        }
        return "Unknown";
    }

    public /* synthetic */ C114176so(int i) {
        this.A00 = i;
    }
}
