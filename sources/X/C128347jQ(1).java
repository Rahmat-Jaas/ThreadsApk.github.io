package X;

/* renamed from: X.7jQ  reason: invalid class name and case insensitive filesystem */
public final class C128347jQ implements AnonymousClass8e7 {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C128347jQ) && this.A00 == ((C128347jQ) obj).A00);
    }

    public final int hashCode() {
        int i = 1;
        if (!this.A00) {
            i = 0;
        }
        return i + 31;
    }

    public final String toString() {
        return AnonymousClass00U.A0n("PopContainerFragmentTransitionInfo(shouldPopContainerFragment=", ", forcePopBackStack=", true, this.A00);
    }

    public C128347jQ(boolean z) {
        this.A00 = z;
    }
}
