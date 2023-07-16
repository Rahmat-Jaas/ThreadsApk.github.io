package X;

/* renamed from: X.6q0  reason: invalid class name and case insensitive filesystem */
public class C112676q0 {
    public final double A00;
    public final double A01;
    public final long A02;
    public final String A03;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FrameRateData{small=");
        A0s.append(this.A01);
        A0s.append(", large=");
        A0s.append(this.A00);
        A0s.append(", timeSpent=");
        A0s.append(this.A02);
        return C18190wL.A0o(A0s);
    }

    public C112676q0(long j, double d, double d2, String str) {
        this.A01 = d;
        this.A00 = d2;
        this.A02 = j;
        this.A03 = str;
    }
}
