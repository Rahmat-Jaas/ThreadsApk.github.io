package X;

/* renamed from: X.3Hu  reason: invalid class name and case insensitive filesystem */
public final class C58863Hu {
    public final boolean A00;

    public final boolean equals(Object obj) {
        boolean z = this.A00;
        if (!(obj instanceof C58863Hu) || z != ((C58863Hu) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A00;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return AnonymousClass00U.A0H("LoadingState(loading=", ')', this.A00);
    }

    public /* synthetic */ C58863Hu(boolean z) {
        this.A00 = z;
    }
}
