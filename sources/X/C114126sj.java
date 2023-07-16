package X;

/* renamed from: X.6sj  reason: invalid class name and case insensitive filesystem */
public final class C114126sj {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114126sj) || i != ((C114126sj) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        if (this.A00 == 0) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public /* synthetic */ C114126sj(int i) {
        this.A00 = i;
    }
}
