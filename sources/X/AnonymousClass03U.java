package X;

/* renamed from: X.03U  reason: invalid class name */
public abstract class AnonymousClass03U {
    public AnonymousClass01T[] A00;
    public final AnonymousClass03Y A01;

    public abstract AnonymousClass03Y A00();

    public void A02(AnonymousClass01T r1) {
    }

    public void A03(AnonymousClass01T r1) {
    }

    public void A04(AnonymousClass01T r1) {
    }

    public abstract void A05(AnonymousClass01T r1);

    public abstract void A06(AnonymousClass01T r1);

    public final void A01() {
        AnonymousClass01T[] r1 = this.A00;
        if (r1 != null) {
            AnonymousClass01T r0 = r1[0];
            AnonymousClass01T r12 = r1[1];
            if (r12 == null) {
                r12 = this.A01.A00.A05(2);
            }
            if (r0 == null) {
                r0 = this.A01.A00.A05(1);
            }
            A06(AnonymousClass01T.A02(r0, r12));
            AnonymousClass01T r02 = this.A00[4];
            if (r02 != null) {
                A03(r02);
            }
            AnonymousClass01T r03 = this.A00[5];
            if (r03 != null) {
                A02(r03);
            }
            AnonymousClass01T r04 = this.A00[6];
            if (r04 != null) {
                A04(r04);
            }
        }
    }

    public void A07(AnonymousClass01T r6, int i) {
        char c;
        AnonymousClass01T[] r4 = this.A00;
        if (r4 == null) {
            r4 = new AnonymousClass01T[9];
            this.A00 = r4;
        }
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                char c2 = 1;
                if (i2 != 1) {
                    c = 2;
                    if (i2 != 2) {
                        c2 = 4;
                        if (i2 != 4) {
                            c = 8;
                            if (i2 == 8) {
                                c2 = 3;
                            } else if (i2 != 16) {
                                if (i2 == 32) {
                                    c2 = 5;
                                } else if (i2 == 64) {
                                    c2 = 6;
                                } else if (i2 == 128) {
                                    c2 = 7;
                                } else if (i2 != 256) {
                                    throw new IllegalArgumentException(AnonymousClass00U.A0J("type needs to be >= FIRST and <= LAST, type=", i2));
                                }
                            }
                        }
                        r4[c] = r6;
                    }
                } else {
                    c2 = 0;
                }
                c = c2;
                r4[c] = r6;
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    public AnonymousClass03U(AnonymousClass03Y r1) {
        this.A01 = r1;
    }

    public AnonymousClass03U() {
        this(new AnonymousClass03Y());
    }
}
