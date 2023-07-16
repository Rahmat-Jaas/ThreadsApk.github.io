package X;

/* renamed from: X.6sz  reason: invalid class name and case insensitive filesystem */
public final class C114286sz {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114286sz) || i != ((C114286sz) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 1) {
            return "Strategy.Simple";
        }
        if (i == 2) {
            return "Strategy.HighQuality";
        }
        if (i == 3) {
            return "Strategy.Balanced";
        }
        return "Invalid";
    }

    public /* synthetic */ C114286sz(int i) {
        this.A00 = i;
    }
}
