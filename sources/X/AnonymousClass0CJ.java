package X;

/* renamed from: X.0CJ  reason: invalid class name */
public final class AnonymousClass0CJ {
    public final long A00;
    public final long A01;
    public final String A02;

    public AnonymousClass0CJ(long j, long j2, String str) {
        long j3 = j;
        if (j >= 0) {
            long j4 = j2;
            if (j2 < 0) {
                throw new IllegalArgumentException("maxDelayMs < 0");
            } else if (j <= j2) {
                this.A01 = j;
                this.A00 = j2;
                this.A02 = str;
            } else {
                throw new IllegalArgumentException(AnonymousClass00U.A0U("minDelay=", "; maxDelay=", j3, j4));
            }
        } else {
            throw new IllegalArgumentException("minDelayMs < 0");
        }
    }
}
