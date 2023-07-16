package X;

/* renamed from: X.6sr  reason: invalid class name and case insensitive filesystem */
public final class C114206sr {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C114206sr) || j != ((C114206sr) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0G("PointerId(value=", ')', this.A00);
    }

    public /* synthetic */ C114206sr(long j) {
        this.A00 = j;
    }
}
