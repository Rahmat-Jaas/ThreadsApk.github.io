package X;

/* renamed from: X.6t1  reason: invalid class name and case insensitive filesystem */
public final class C114306t1 {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114306t1) || i != ((C114306t1) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 1) {
            return "WordBreak.None";
        }
        if (i == 2) {
            return "WordBreak.Phrase";
        }
        return "Invalid";
    }

    public /* synthetic */ C114306t1(int i) {
        this.A00 = i;
    }
}
