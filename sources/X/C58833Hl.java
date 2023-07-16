package X;

/* renamed from: X.3Hl  reason: invalid class name and case insensitive filesystem */
public final class C58833Hl {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C58833Hl) && this.A00 == ((C58833Hl) obj).A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0G("RenderSummary(createdAt=", ')', this.A00);
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public C58833Hl(long j) {
        this.A00 = j;
    }
}
