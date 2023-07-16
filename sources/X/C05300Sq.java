package X;

/* renamed from: X.0Sq  reason: invalid class name and case insensitive filesystem */
public final class C05300Sq {
    public final long A00;
    public final long A01;
    public final AnonymousClass0Sw A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C05300Sq r7 = (C05300Sq) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00 && this.A02.equals(r7.A02))) {
                return false;
            }
        }
        return true;
    }

    public static C05300Sq A00(C05300Sq r7, C05300Sq r8) {
        AnonymousClass0Sw r1 = r7.A02;
        AnonymousClass0Sw r4 = r8.A02;
        if (r1.equals(r4)) {
            Integer num = r1.A00;
            Integer num2 = AnonymousClass006.A00;
            int i = (r7.A00 > r8.A00 ? 1 : (r7.A00 == r8.A00 ? 0 : -1));
            if (num == num2) {
                if (i >= 0) {
                    return r7;
                }
            } else if (i <= 0) {
                return r7;
            }
            return r8;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0d("Cannot compare datapoints from different metrics: ", r1.A01(), " vs. ", r4.A01()));
    }

    public final int hashCode() {
        return (int) (((long) this.A02.hashCode()) + (this.A01 * 31) + this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0V(this.A02.A00(), " ", String.valueOf(this.A00));
    }

    public C05300Sq(AnonymousClass0Sw r1, long j, long j2) {
        this.A02 = r1;
        this.A01 = j;
        this.A00 = j2;
    }
}
