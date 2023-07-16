package X;

import java.util.Arrays;

/* renamed from: X.1k9  reason: invalid class name */
public final class AnonymousClass1k9 extends C57943Dd {
    public final int A00;
    public final int A01;
    public final Object[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C18190wL.A1Y(this, obj)) {
                AnonymousClass1k9 r5 = (AnonymousClass1k9) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && Arrays.equals(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + Arrays.hashCode(this.A02);
    }

    public AnonymousClass1k9(Object[] objArr, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = objArr;
    }
}
