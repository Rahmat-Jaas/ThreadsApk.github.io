package X;

/* renamed from: X.6sg  reason: invalid class name and case insensitive filesystem */
public final class C114096sg {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C114096sg) || j != ((C114096sg) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0G("GridItemSpan(packedValue=", ')', this.A00);
    }

    public /* synthetic */ C114096sg(long j) {
        this.A00 = j;
    }
}
