package X;

/* renamed from: X.16e  reason: invalid class name and case insensitive filesystem */
public final class C208016e extends AnonymousClass0Sf {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C208016e) {
                C208016e r8 = (C208016e) obj;
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

    public C208016e(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
