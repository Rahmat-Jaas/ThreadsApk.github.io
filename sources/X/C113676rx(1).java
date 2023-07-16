package X;

/* renamed from: X.6rx  reason: invalid class name and case insensitive filesystem */
public final class C113676rx {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public C113676rx(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113676rx) {
                C113676rx r5 = (C113676rx) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return AnonymousClass3ZT.A00(AnonymousClass3ZT.A00(i + 31, this.A01), this.A02);
    }
}
