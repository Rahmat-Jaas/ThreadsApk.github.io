package X;

/* renamed from: X.16g  reason: invalid class name and case insensitive filesystem */
public final class C208216g extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C208216g) {
                C208216g r8 = (C208216g) obj;
                if (!(this.A00 == r8.A00 && this.A02 == r8.A02 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + C18190wL.A02(this.A02)) * 31) + this.A01;
    }

    public C208216g(int i, long j, int i2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = i2;
    }
}
