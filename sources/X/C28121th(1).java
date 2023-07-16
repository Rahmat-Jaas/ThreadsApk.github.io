package X;

/* renamed from: X.1th  reason: invalid class name and case insensitive filesystem */
public final class C28121th extends AnonymousClass2SB {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28121th) {
                C28121th r5 = (C28121th) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public C28121th(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
