package X;

/* renamed from: X.5r9  reason: invalid class name */
public final class AnonymousClass5r9 extends AnonymousClass6JF {
    public final long A00;

    public AnonymousClass5r9(long j) {
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof AnonymousClass6JF) && this.A00 == ((AnonymousClass5r9) ((AnonymousClass6JF) obj)).A00);
    }

    public final int hashCode() {
        return -724379968 ^ C18190wL.A02(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0T("EventRecord{eventType=3, eventTimestamp=", "}", this.A00);
    }
}
