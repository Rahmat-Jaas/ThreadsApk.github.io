package X;

/* renamed from: X.0BT  reason: invalid class name */
public final class AnonymousClass0BT {
    public static AnonymousClass0BT A0A;
    public static final Object A0B = new Object();
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass0BT A03;
    public boolean A04;
    public boolean A05;
    public final long[] A06;
    public final long[] A07;
    public final AnonymousClass0KD[] A08;
    public final AnonymousClass0KD[] A09;

    public final void A00() {
        for (int i = 0; i < this.A02; i++) {
            AnonymousClass0KD r0 = this.A08[i];
            if (r0 != null) {
                r0.A02();
                this.A07[i] = -3;
            }
        }
        for (int i2 = 0; i2 < this.A01; i2++) {
            AnonymousClass0KD r02 = this.A09[i2];
            if (r02 != null) {
                r02.A02();
                this.A06[i2] = -3;
            }
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A00 = 0;
        this.A05 = false;
        this.A04 = false;
        synchronized (A0B) {
            AnonymousClass0BT r2 = A0A;
            if (r2 == null || 15 > r2.A00) {
                this.A03 = r2;
                int i3 = 1;
                if (r2 != null) {
                    i3 = 1 + r2.A00;
                }
                this.A00 = i3;
                A0A = this;
            }
        }
    }

    public AnonymousClass0BT(int i) {
        if (i > 0) {
            this.A08 = new AnonymousClass0KD[i];
            this.A09 = new AnonymousClass0KD[i];
            this.A07 = new long[i];
            this.A06 = new long[i];
            this.A02 = 0;
            this.A01 = 0;
            this.A05 = false;
            this.A04 = false;
            this.A00 = 0;
            this.A03 = null;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0S("Invalid batch Size of ", " was given.", i));
    }
}
