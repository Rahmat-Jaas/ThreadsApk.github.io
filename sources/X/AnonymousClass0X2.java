package X;

/* renamed from: X.0X2  reason: invalid class name */
public final class AnonymousClass0X2 {
    public int A00;
    public double[] A01;
    public long[] A02;
    public long[] A03;
    public String[] A04;
    public String[] A05;

    public AnonymousClass0X2(C05800Wc r11, AnonymousClass0X4 r12) {
        C11680kb[] r6 = r12.A03;
        int i = 0;
        int i2 = 0;
        for (C11680kb r1 : r6) {
            if (r1 instanceof C11730ki) {
                i++;
            } else if (r1 instanceof C03260Fd) {
                i2++;
            }
        }
        this.A02 = new long[i];
        this.A04 = new String[i2];
        int i3 = 0;
        int i4 = 0;
        for (C11680kb r7 : r6) {
            if (r7 instanceof C11730ki) {
                this.A02[i3] = ((C11730ki) r7).BKH(r11);
                i3++;
            } else if (r7 instanceof C03260Fd) {
                String[] strArr = this.A04;
                int i5 = i4 + 1;
                String AQn = r11.AQn(((C11580kR) r7).A00);
                strArr[i4] = AQn == null ? "" : AQn;
                i4 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (AnonymousClass0X8 A002 : r12.A02) {
            if (A002.A00().intValue() != 0) {
                i7++;
            } else {
                i6++;
            }
        }
        this.A03 = new long[i6];
        this.A01 = new double[i7];
        this.A05 = new String[0];
    }
}
