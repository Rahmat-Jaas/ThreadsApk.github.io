package X;

/* renamed from: X.6s5  reason: invalid class name and case insensitive filesystem */
public final class C113756s5 {
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C113756s5 r5 = (C113756s5) obj;
            if (this.A02 != r5.A02 || !C32572Cj.A00(this.A00, r5.A00) || !C32572Cj.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0I(this.A00, Boolean.valueOf(this.A02), this.A01);
    }

    public C113756s5(Object obj, String str, boolean z) {
        this.A00 = obj;
        this.A02 = z;
        this.A01 = str;
    }
}
