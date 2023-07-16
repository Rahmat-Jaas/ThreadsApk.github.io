package X;

/* renamed from: X.6FU  reason: invalid class name */
public final class AnonymousClass6FU {
    public static final long A00(long j, long j2) {
        int i;
        int A01 = C121767Ia.A01(j);
        int A00 = C121767Ia.A00(j);
        int A012 = C121767Ia.A01(j2);
        if (A012 < A00 && A01 < (i = C121767Ia.A00(j2))) {
            if (A012 > A01 || A00 > i) {
                if (A01 > A012 || i > A00) {
                    if (A01 < i && A012 <= A01) {
                        A01 = A012;
                    }
                }
                A00 -= i - A012;
            } else {
                A01 = A012;
            }
            A00 = A012;
        } else if (A00 > A012) {
            i = C121767Ia.A00(j2);
            A01 -= i - A012;
            A00 -= i - A012;
        }
        return AnonymousClass6FM.A00(A01, A00);
    }
}
