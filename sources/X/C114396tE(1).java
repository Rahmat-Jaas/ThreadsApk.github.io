package X;

/* renamed from: X.6tE  reason: invalid class name and case insensitive filesystem */
public final class C114396tE {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114396tE) && C04220Ms.A0I(this.A00, ((C114396tE) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0M("ECPAvailabilityExtraData(availabilityReason=", this.A00, ')');
    }

    public C114396tE(String str) {
        this.A00 = str;
    }
}
