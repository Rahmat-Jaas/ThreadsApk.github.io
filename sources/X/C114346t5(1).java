package X;

/* renamed from: X.6t5  reason: invalid class name and case insensitive filesystem */
public final class C114346t5 {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C114346t5) || j != ((C114346t5) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        if (j == 0) {
            return "Unspecified";
        }
        if (j == 4294967296L) {
            return "Sp";
        }
        if (j == 8589934592L) {
            return "Em";
        }
        return "Invalid";
    }

    public /* synthetic */ C114346t5(long j) {
        this.A00 = j;
    }
}
