package X;

/* renamed from: X.0X6  reason: invalid class name */
public final class AnonymousClass0X6 {
    public final int A00;
    public final double[] A01;
    public final long[] A02;
    public final long[] A03;
    public final String[] A04;
    public final String[] A05;
    public final String[] A06;
    public final String[] A07;
    public final String[] A08;
    public final String[] A09;
    public final String[] A0A;

    public AnonymousClass0X6(double[] dArr, long[] jArr, long[] jArr2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7, int i) {
        if (strArr.length != jArr.length) {
            throw new IllegalArgumentException("Different number of integer dimensions and values");
        } else if (strArr2.length != strArr3.length) {
            throw new IllegalArgumentException("Different number of string dimensions and values");
        } else if (strArr4.length != jArr2.length) {
            throw new IllegalArgumentException("Different number of integer aggregations and results");
        } else if (strArr5.length != dArr.length) {
            throw new IllegalArgumentException("Different number of double aggregations and results");
        } else if (strArr6.length == strArr7.length) {
            this.A06 = strArr;
            this.A02 = jArr;
            this.A09 = strArr2;
            this.A08 = strArr3;
            this.A05 = strArr4;
            this.A03 = jArr2;
            this.A04 = strArr5;
            this.A01 = dArr;
            this.A07 = strArr6;
            this.A0A = strArr7;
            this.A00 = i;
        } else {
            throw new IllegalArgumentException("Different number of string aggregations and results");
        }
    }
}
