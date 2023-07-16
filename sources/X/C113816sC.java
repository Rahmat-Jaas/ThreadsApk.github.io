package X;

/* renamed from: X.6sC  reason: invalid class name and case insensitive filesystem */
public final class C113816sC {
    public final C108946jD A00;
    public final int A01;
    public final C146788mr A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof C113816sC) {
                    C113816sC r5 = (C113816sC) obj;
                    if (!C117046y2.A01(this.A00, r5.A00) || !C117046y2.A01(this.A02, r5.A02) || !C117046y2.A01(this.A03, r5.A03)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }

    public C113816sC(C146788mr r2, C108946jD r3, String str) {
        this.A00 = r3;
        this.A02 = r2;
        this.A03 = str;
        this.A01 = C86124wJ.A0I(r3, r2, str);
    }
}
