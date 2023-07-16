package X;

/* renamed from: X.0Ax  reason: invalid class name and case insensitive filesystem */
public final class C02370Ax {
    public static C02370Ax A05;
    public static final Object A06 = new Object();
    public int A00;
    public int A01;
    public C02370Ax A02;
    public boolean A03;
    public final AnonymousClass0KD[] A04;

    public final void A00() {
        for (int i = 0; i < this.A01; i++) {
            AnonymousClass0KD r0 = this.A04[i];
            if (r0 != null) {
                r0.A02();
            }
        }
        this.A01 = 0;
        this.A02 = null;
        this.A00 = 0;
        this.A03 = false;
        synchronized (A06) {
            C02370Ax r2 = A05;
            if (r2 == null || 15 > r2.A00) {
                this.A02 = r2;
                int i2 = 1;
                if (r2 != null) {
                    i2 = 1 + r2.A00;
                }
                this.A00 = i2;
                A05 = this;
            }
        }
    }

    public C02370Ax(int i) {
        if (i > 0) {
            this.A04 = new AnonymousClass0KD[i];
            this.A01 = 0;
            this.A03 = false;
            this.A00 = 0;
            this.A02 = null;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0S("Invalid batch Size of ", " was given.", i));
    }
}
