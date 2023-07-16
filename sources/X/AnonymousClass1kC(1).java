package X;

import java.util.Arrays;

/* renamed from: X.1kC  reason: invalid class name */
public final class AnonymousClass1kC extends C57943Dd {
    public final int A00;
    public final Object[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C18190wL.A1Y(this, obj)) {
                AnonymousClass1kC r5 = (AnonymousClass1kC) obj;
                if (this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass1kC A00(Object[] objArr, int i) {
        return new AnonymousClass1kC(objArr, i);
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public AnonymousClass1kC(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }
}
