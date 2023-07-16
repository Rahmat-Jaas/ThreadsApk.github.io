package X;

/* renamed from: X.5M8  reason: invalid class name */
public final class AnonymousClass5M8 extends AnonymousClass0Sf implements C21212Bqg {
    public final int A00;
    public final long A01;

    public final AnonymousClass5M8 D3N() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5M8) {
                AnonymousClass5M8 r8 = (AnonymousClass5M8) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + C18190wL.A02(this.A01);
    }

    public AnonymousClass5M8(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
